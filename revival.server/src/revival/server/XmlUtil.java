package revival.server;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XmlUtil {
    
	public static Document parse(File filename) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(filename);
        
        return document;
    }
	
	public static Integer getIntAttribute(Element element, String attribute) {
		try {
			return Integer.parseInt(element.attributeValue(attribute));
		} catch (NumberFormatException e) {
			throw new RuntimeException("Invalid int value: " + attribute);
		}
	}
	
	public static Integer intValue(String value) {
		if (value == null) return null;
		
		Integer result;
		
		try {
			result = Integer.valueOf(value);
		} catch (NumberFormatException e) {
			result = null;
		}
		
		return result;
	}
	
	public static Integer hexValue(String value) {
		if (value == null) return null;
		
		Integer result;
		
		try {
			result = Integer.valueOf(value.replace("0x", ""), 16);
		} catch (NumberFormatException e) {
			result = null;
		}
		
		return result;

	}
	
	public static boolean boolValue(String value) {
		return value != null && value.equalsIgnoreCase("true");
	}

}
