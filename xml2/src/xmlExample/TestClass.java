package xmlExample;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class TestClass {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		loginPage lp = new loginPage();
		lp.login("admin");

	}

}
