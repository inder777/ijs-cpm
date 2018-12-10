package com.cpm.pojo;

import java.util.HashMap;
import java.util.LinkedList;

import com.cpm.impl.CarImpl;

public class InputSeparator {

	CarImpl carImpl = new CarImpl();
	Car car = new Car();
	// private LinkedList<String> finalResult = new LinkedList<String>();
	private String parkingDetails = "";
	private String temp = "";
	// private String removedCar = "";
	private HashMap<Integer, String> result = new HashMap<Integer, String>();

	public String parseCarInputDetails(String carDetails) {
		String[] operations = carDetails.split(",");
		for (int i = 0; i < operations.length; i++) {
			temp = operations[i];
			if (temp.charAt(0) == 'p') {
				result = carImpl.park(temp.substring(1, temp.length()), result);

			} else if (temp.charAt(0) == 'u') {

				int ticketNumber = Integer.parseInt(temp.substring(1, temp.length()));
				result = carImpl.unPark(ticketNumber, result);
			} else if (temp.charAt(0) == 'c') {

				result = carImpl.compact(result);
			}
		}

		for (Integer s : result.keySet()) {
			parkingDetails += result.get(s);
			parkingDetails += ',';
		}
		return parkingDetails;
	}

}
