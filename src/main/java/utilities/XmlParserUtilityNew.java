package utilities;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;

public class XmlParserUtilityNew {

    DocumentBuilderFactory factory=null;
    DocumentBuilder builder=null;
    Document doc=null;
    InputSource is= new InputSource();

    //Get Value From XML based on configuration in excel sheet

    public String getValuefromXML(String xml,String path) throws Exception
    {
        Node n=null;

        try {

            if (path.split("/").length == 1)
                return getValueFromXML(xml, path, "String");
            if (path.split("/").length == 2)
                return getValueFromXML_ChildTag(xml, path.split("/")[0], path.split("/")[1], "String");
            if (path.split("/").length == 3) {
                n = getNode(xml, path.split("/")[0], "String");
                n = getNodeListFromNode(n, path.split("/")[1]);
                return getValueNodeListFromNode(n, path.split("/")[2]);
            }
            if (path.split("/").length == 4) {
                n = getNode(xml, path.split("/")[0], "String");
                n = getNodeListFromNode(n, path.split("/")[1]);
                n = getNodeListFromNode(n, path.split("/")[2]);
                return getValueNodeListFromNode(n, path.split("/")[3]);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return"";

    }

//utility code

    public String getValueFromXML(String fileName,String tagName, String type)
    {
        String xmlValue=null;
        try
        {
            //to ignore DTD reference errors
            factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            factory.setValidating(false);
            factory.setFeature("http://xml.org/sax/features/namespaces", false);
            factory.setFeature("http://xml.org/sax/features/validation", false);
            factory.setFeature("http://apache.org/xml/features/nonvalidating/load-dtd-grammar", false);
            factory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);

            builder=factory.newDocumentBuilder();

            is.setCharacterStream(new StringReader(fileName));
            if(type.equalsIgnoreCase("String"))
                doc=builder.parse(is);
            else
                doc=builder.parse(fileName);
            xmlValue=doc.getElementsByTagName(tagName).item(0).getTextContent();
            return xmlValue;

        }
        catch (Exception e)
        {
        return "";
        }
    }

    public String getValueFromXML_ChildTag(String fileName,String parentTag,String tagName, String type)
    {
        String xmlValue=null;
        try
        {
            //to ignore DTD reference errors
            factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            factory.setValidating(false);
            factory.setFeature("http://xml.org/sax/features/namespaces", false);
            factory.setFeature("http://xml.org/sax/features/validation", false);
            factory.setFeature("http://apache.org/xml/features/nonvalidating/load-dtd-grammar", false);
            factory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);

            builder=factory.newDocumentBuilder();

            is.setCharacterStream(new StringReader(fileName));
            if(type.equalsIgnoreCase("String"))
                doc=builder.parse(is);
            else
                doc=builder.parse(fileName);
            NodeList nodeList=doc.getElementsByTagName(parentTag);
            Node node=nodeList.item(0);
            Element element=(Element)node;
            xmlValue=element.getElementsByTagName(tagName).item(0).getTextContent();
            return xmlValue;

        }
        catch (Exception e)
        {
            return "";
        }
    }

    public Node getNode(String fileName, String tagName, String type) throws Exception {
        builder=factory.newDocumentBuilder();
        is.setCharacterStream(new StringReader(fileName));
        if(type.equalsIgnoreCase("String"))
            doc=builder.parse(is);
        else
            doc=builder.parse(fileName);
        return doc.getElementsByTagName(tagName).item(0);

    }
    public Node getNodeListFromNode(Node nod, String tagName) throws Exception {
      Element element=(Element) nod;
      return element.getElementsByTagName(tagName).item(0);

    }
    public String getValueNodeListFromNode(Node nod, String tagName) throws Exception {
        Element element=(Element) nod;
        return element.getElementsByTagName(tagName).item(0).getTextContent();

    }
}
