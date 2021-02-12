package xml;

import  java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XMLToJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			JAXBContext jc = JAXBContext.newInstance(Product.class);
			Unmarshaller u =jc.createUnmarshaller();
			
			File f = new File("product.xml");
			Product product = (Product) u.unmarshal(f);
			
			System.out.println(product.getCode());
			System.out.println(product.getName());
			System.out.println(product.getPrice());
		}
		catch(JAXBException e){
			e.printStackTrace();
		}
	}

}
