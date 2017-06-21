package com.epam.applicances;

import java.util.ArrayList;
import java.util.List;

import com.epam.applicances.domain.Kettle;

public class KettleTest {
	
	public static void main(String args[]){
		
		//KettleXMLRepository kettleRepository = new KettleXMLRepository(); 
		KettleXMLRepository kettleRepository = new KettleXMLRepository();
		
		/*System.out.println("Appliance ID : " + kettle.getId());
		System.out.println("Power Consumation : " + kettle.getPower());
		System.out.println("Appliance Capacity : " + kettle.getCapacity());
		System.out.println("Material Type : " + kettle.getMaterial());
		System.out.println("Water level Indicator: " + kettle.getWaterLevelIndicator());
		System.out.println("Temperature Control : " + kettle.getTemperatureControl());*/
		
		List<Kettle> kettleList = new ArrayList<Kettle>();
		kettleList = kettleRepository.getKettleList();
		
		for(Kettle kettle : kettleList){
			
			
			System.out.println("Appliance ID : " + kettle.getId());
			System.out.println("Power Consumation : " + kettle.getPower());
			System.out.println("Appliance Capacity : " + kettle.getCapacity());
			System.out.println("Material Type : " + kettle.getMaterial());
			System.out.println("Water level Indicator: " + kettle.getWaterLevelIndicator());
			System.out.println("Temperature Control : " + kettle.getTemperatureControl());
		}
	}

}
