package utilities;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XmlParserUtility {

    DocumentBuilderFactory factory=null;
    DocumentBuilder builder=null;
    Document doc=null;

 /*   public static void main(String args[]) throws Exception {
        //to ignore DTD reference errors
         String fileName="src/test/resources/xmlValidate.xml";
        String tagName="OrgnlTxId";
        String tagName1="BICFI";
        String parentTagName="TxInf";

        XmlParserUtility xmlParserUtility=new XmlParserUtility();
        String valueFromNode=xmlParserUtility.getValueFromXML(fileName,tagName);
        System.out.println("valueFromNode=="+valueFromNode);
        Node ParentNode= xmlParserUtility.getNodeFromXML(fileName,parentTagName,"180217100120000001231");
        Node childNode=xmlParserUtility.getChildNodesFromParentNodeWithoutSearchValue(ParentNode,tagName1);
        String childValue=xmlParserUtility.getChildNodesFromParentNode(childNode,tagName1);
        System.out.println("childValue=="+childValue);
    }*/

    public static void main(String args[]) throws Exception {
        //to ignore DTD reference errors
        String fileName="src/test/resources/xmlValidate.xml";
        String tagName="OrgnlTxId";
        String tagName1="BICFI";
        String parentTagName="TxInf";

        XmlParserUtility xmlParserUtility=new XmlParserUtility();
        String valueFromNode=xmlParserUtility.getValueFromXML(fileName,tagName);
        System.out.println("valueFromNode=="+valueFromNode);
        //Multiple child
        Node ParentNode= xmlParserUtility.getNodeFromXML(fileName,parentTagName,"180217100120000001231");
        Node childNode=xmlParserUtility.getChildNodesFromParentNodeWithoutSearchValue(ParentNode,"InstgAgt");
         Node childNode1=xmlParserUtility.getChildNodesFromParentNodeWithoutSearchValue(childNode,"FinInstnId");

        String childValue=xmlParserUtility.getChildNodesFromParentNode(childNode1,tagName1);
        System.out.println("childValue=="+childValue);
    }

    //To Get Value from Specific XML Tag
    public String getValueFromXML(String fileName, String tagName) throws Exception
    {
        String xmlValue=null;
        try
        {
            //to ignore DTD reference errors
            factory =DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            factory.setValidating(false);
            factory.setFeature("http://xml.org/sax/features/namespaces", false);
            factory.setFeature("http://xml.org/sax/features/validation", false);
            factory.setFeature("http://apache.org/xml/features/nonvalidating/load-dtd-grammar", false);
            factory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);

            builder=factory.newDocumentBuilder();
            doc=builder.parse(fileName);
//Travelling via Node to check the available tags
            NodeList nList=doc.getElementsByTagName(tagName);
            System.out.println("Lenght"+nList.getLength());
            for(int temp=0;temp<nList.getLength();temp++)
            {
                Element element=(Element) nList.item(temp);
                if(element.getNodeName().equalsIgnoreCase(tagName)) {
                    System.out.println(element.getNodeName());
                    System.out.println("Tag Value=="+element.getTextContent());
                    return element.getTextContent();
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("No Tag Found");
            e.printStackTrace();
            return "";
        }
        return "";
    }

    //To Get Node based on search value
    //This is used when multiple records are present in the file
    public Node getNodeFromXML(String fileName,String tagName,String valueToSearch) throws Exception
    {
        try
        {
            factory =DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            factory.setValidating(false);
            builder=factory.newDocumentBuilder();
            doc=builder.parse(fileName);
            doc.getDocumentElement().normalize();//To remove whitespaces
            NodeList nodeList=doc.getElementsByTagName(tagName);
            Node actualNode=null;

            for(int i=0;i<nodeList.getLength();i++)
            {
                Node node=nodeList.item(i);
                if(node.getNodeType()==Node.ELEMENT_NODE)
                {
                    Element element=(Element) node;
                    System.out.println(element.getTextContent());
                    if(element.getTextContent().contains(valueToSearch))
                        return node;
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }

        return null;
    }

    public Node getChildNodesFromParentNodeWithoutSearchValue(Node node,String tagName)
    {
        try {
            NodeList nodeList = node.getChildNodes();

            Node actualNode = null;

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node nod = nodeList.item(i);
                if (nod.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nod;
                    if (element.getNodeName().equalsIgnoreCase(tagName)) {
                        System.out.println("NodeName===="+element.getNodeName());
                        System.out.println("Tag Value==" + element.getTextContent());
                        return nod;
                    }
                }

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;

        }
        return null;
    }

    //this method will return child nodes values from parent node
    public String getChildNodesFromParentNode(Node node,String tagName)
    {
        try {
            NodeList nodeList = node.getChildNodes();

            Node actualNode = null;

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node nod = nodeList.item(i);
                if (nod.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nod;
                    if (element.getNodeName().equalsIgnoreCase(tagName)) {
                        System.out.println(element.getNodeName());
                        System.out.println("Tag Value==" + element.getTextContent());
                        return element.getTextContent();
                    }
                }

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return "";

        }
        return "";
    }

}
