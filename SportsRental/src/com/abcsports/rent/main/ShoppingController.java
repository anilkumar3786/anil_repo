package com.abcsports.rent.main;

import java.util.Scanner;

import com.abcsports.rent.bo.SportEquipment;
import com.abcsports.rent.service.RentUnit;

public class ShoppingController {

	public static void main(String args[]) {

		SportEquipment equipment1 = new SportEquipment();
		SportEquipment equipment2 = new SportEquipment();
		SportEquipment equipment3 = new SportEquipment();

		equipment1.setCategory("Ball");
		equipment1.setPrice(100);
		equipment1.setTitle("FootBall");

		equipment2.setCategory("Ball");
		equipment2.setPrice(150);
		equipment2.setTitle("Cricket Ball");

		equipment3.setCategory("Ball");
		equipment3.setPrice(200);
		equipment3.setTitle("Tennis Ball");

		SportEquipment[] units = new SportEquipment[3];
		units[0] = equipment1;
		units[1] = equipment2;
		units[2] = equipment3;

		RentUnit sportsUnits = new RentUnit();
		sportsUnits.setUnits(units);

		System.out.println("Welcome to ABC Sports");
		System.out.println(" Available Sports Equipment");
		for (SportEquipment s : units) {

			System.out.println(s.listAvailableEquipments());
		}
    
    
    
	}
}