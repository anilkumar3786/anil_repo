package com.epam.applicances;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.epam.applicances.domain.Kettle;

public class KettleXMLRepository {

	private List<Kettle> kettleList = new ArrayList<Kettle>();

	File file = new File("C:/Users/anil_aleti/workspace/Applicances/src/Kettle.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

	public List<Kettle> getKettleList() {

		try {

			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(file);
			doc.getDocumentElement().normalize();

			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

			NodeList nList = doc.getElementsByTagName("kettle");

			System.out.println("----------------------------");

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);

				

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

				

					Kettle kettle = new Kettle();
					kettle.setId(Integer.parseInt(eElement.getAttribute("id")));
					kettle.setPower(Integer.parseInt(eElement.getElementsByTagName("power").item(0).getTextContent()));
					kettle.setCapacity(
							Integer.parseInt(eElement.getElementsByTagName("capacity").item(0).getTextContent()));
					kettle.setMaterial(eElement.getElementsByTagName("material").item(0).getTextContent());
					kettle.setWaterLevelIndicator(
							eElement.getElementsByTagName("water_level_indicator").item(0).getTextContent());
					kettle.setTemperatureControl(
							eElement.getElementsByTagName("temperature_control").item(0).getTextContent());

					/*System.out.println("Appliance ID : " + kettle.getId());
					System.out.println("Power Consumation : " + kettle.getPower());
					System.out.println("Appliance Capacity : " + kettle.getCapacity());
					System.out.println("Material Type : " + kettle.getMaterial());
					System.out.println("Water level Indicator: " + kettle.getWaterLevelIndicator());
					System.out.println("Temperature Control : " + kettle.getTemperatureControl());*/

					kettleList.add(kettle);

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return kettleList;
	}

	
	/*public String getXMLElement(String element){
		
		
		return eElement.getElementsByTagName("power").item(0).getTextContent();
	}*/
}
