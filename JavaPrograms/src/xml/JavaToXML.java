package xml;

import java.io.File;
import java.math.BigDecimal;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JavaToXML {

	public static void main(String[] args) throws JAXBException 
	{
		JAXBContext context = JAXBContext.newInstance(Product.class);
		
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		Product object = new Product();
		object.setCode("WI1");
		object.setName("Widget Number One");
		object.setPrice(BigDecimal.valueOf(300.00));
		
		
		File f = new File("XMLFiles/product.xml");
		m.marshal(object, System.out);
		m.marshal(object, f);
	}

}
