
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlReader {

	public static void main(String argv[]) throws SAXException, IOException, ParserConfigurationException, XPathExpressionException   
	{  
	    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	    DocumentBuilder db = dbf.newDocumentBuilder();
	    Document doc = db.parse("/home/nova/GeographyofBliss_oneChapter.epub_FILES/META-INF/container.xml");
	   doc.getDocumentElement().normalize();
	  //  System.out.println("Root element " + doc.getDocumentElement().getNodeName());

	    NodeList nodeList=doc.getElementsByTagName("*");
	    for (int i=0; i<nodeList.getLength(); i++) 
	    {
	        Element element = (Element)nodeList.item(i);
	     //   System.out.println(element.getNodeName());
	        
	        if (element.getNodeType() == element.ELEMENT_NODE)   
	    	{  
	    	Element eElement = (Element) element;  
	    	System.out.println("rootfile full path: "+eElement.getAttribute("full-path")); 
	    }
}

	}
}
