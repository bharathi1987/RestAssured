package utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class DataBaseUtility {
    public Connection con;
    Statement st;
    DataBaseUtility dataBaseUtility=new DataBaseUtility();

    //Connection class
    public Connection getCon() {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String dburl = null,userName = null,password=null; //give the DB properties here
            
            con= DriverManager.getConnection(dburl,userName,password);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }

  // To retrive all data from that table



  public TreeMap<String, List<String>> ExecuteQuery(String strQuery) throws SQLException {

      TreeMap<String, List<String>> columnsToValueMap = null;

      try {
          st = getCon().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
          ResultSet rs = st.executeQuery(strQuery);

          ResultSetMetaData rsmd = rs.getMetaData();
          int columnsNumber = rsmd.getColumnCount();

          List<String> colunNameList = new ArrayList<>();
          columnsToValueMap = new TreeMap<String, List<String>>();

          for (int i = 0; i <= columnsNumber; i++) {
              String strColumnName = rsmd.getColumnLabel(i);
              colunNameList.add(strColumnName);
              columnsToValueMap.put(strColumnName, new ArrayList<>());
          }

          while (rs.next()) {
              for (String columnName : colunNameList) {
                  List<String> columnDataList = columnsToValueMap.get(columnName);

                  columnDataList.add(rs.getString(columnName));

                  columnsToValueMap.put(columnName, columnDataList);

              }
          }


      } catch (Exception e) {
          e.printStackTrace();
      } finally {

          try {
              if (con != null && !con.isClosed()) {
                  con.close();
              }
          } catch (SQLException e) {
              e.printStackTrace();
          }

      }
      return columnsToValueMap;

  }

  public void getData() throws SQLException {
      TreeMap<String, List<String>> getData = dataBaseUtility.ExecuteQuery("select * from tableName");

      String value= getData.get("Request_ID").get(0);
  }
}
