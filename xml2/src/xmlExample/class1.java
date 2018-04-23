package xmlExample;


import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;



public class class1 {

	//public static String getData(String a) throws ParserConfigurationException, SAXException, IOException {
	
		public static String  getData(String a) throws ParserConfigurationException, SAXException, IOException {
		//Get Document Builder
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		String result = null;
		 
		//Build Document
		Document document = builder.parse(new File("data.xml"));
		 
		//Normalize the XML Structure; It's just too important !!
		document.getDocumentElement().normalize();//it will point to the first node of xml
		 
		//Here comes the root node
		Element root = document.getDocumentElement();
		System.out.println(root.getNodeName());
		 
		//Get all employees
		NodeList nList = document.getElementsByTagName("santhan");
		
		//NodeList nList1 = document.getElementsByTagName("venkat");
		
		System.out.println(nList.item(0).getNodeName());
		System.out.println("============================");
		 
		for (int temp = 0; temp < nList.getLength(); temp++)
		{
		 Node node = nList.item(temp);
		 System.out.println("");    //Just a separator
		 if (node.getNodeType() == Node.ELEMENT_NODE)
		 {
		    //Print each employee's detail
		    Element eElement = (Element) node;
		    
		    System.out.println(eElement);
		    
		    result= eElement.getElementsByTagName("userName").item(0).getTextContent();
		    System.out.println(result);
		    
		    /*System.out.println("Employee id : "    + eElement.getAttribute("id"));
		    System.out.println("First Name : "  + eElement.getElementsByTagName("firstName").item(0).getTextContent());
		    System.out.println("Last Name : "   + eElement.getElementsByTagName("lastName").item(0).getTextContent());
		    System.out.println("Location : "    + eElement.getElementsByTagName("location").item(0).getTextContent());*/
		    
		    //return eElement.getElementsByTagName(a).item(0).getTextContent();
		 }
		 
		 
		
		
		  
		}
		
		return result;
		}
	
	

}
