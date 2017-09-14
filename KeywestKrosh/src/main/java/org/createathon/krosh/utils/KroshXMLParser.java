/**
 * 
 */
package org.createathon.krosh.utils;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.createathon.krosh.IRAD;


/**
 * @author K25176
 *
 */
public class KroshXMLParser {

	@SuppressWarnings("restriction")
	public static void parser() {
		  
			 try {

					File file = new File("C:\\file.xml");
					JAXBContext jaxbContext = JAXBContext.newInstance(IRAD.class);

					Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
					IRAD irad = (IRAD) jaxbUnmarshaller.unmarshal(file);
					System.out.println(irad);

				  } catch (JAXBException e) {
					e.printStackTrace();
				  }

				

	}	}