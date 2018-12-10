package com.cpm.impl;

import java.util.HashMap;

import com.cpm.pojo.Car;
import com.cpm.vehicle.Vehicle;

public class CarImpl implements Vehicle {

	private int assignTicket;
	public Car car = new Car();

	@Override
	public HashMap<Integer, String> park(String licenseNumber, HashMap<Integer, String> carDetails) {
		HashMap<Integer, String> result;
		if (carDetails.size() == 0) {
			carDetails.put(car.getassignTicket(), licenseNumber);
		} else {
			car.assignNewTicket();
			assignTicket = car.getassignTicket();
			carDetails.put(assignTicket, licenseNumber);
		}
		result = carDetails;
		return result;
	}

	@Override
	public HashMap<Integer, String> unPark(int ticketNumber, HashMap<Integer, String> finalResult) {
		//String removedCar = "";

		if (!finalResult.containsKey(ticketNumber)) {
			System.out.println("INVALID TIKCET DETAILS");
			System.exit(0);
		} else {

			finalResult.put(ticketNumber, "");
		}

		return finalResult;
	}

	@Override
	public HashMap<Integer, String> compact(HashMap<Integer, String> result) {
		if(result.size()==0)
		{
			System.out.println("No Cars Parked.....All Slots are Empty");
			System.exit(0);
		}
		int j = 5000;
		String licenseTmp = "";
		int assignTicketLimit = car.getassignTicket();
		for (int k = 5000; k <= assignTicketLimit; k++) {
			if (result.get(k) != "") {
				licenseTmp = result.get(k);
				result.put(k, result.get(j));
				result.put(j, licenseTmp);
				j++;
			}

		}
		return result;
	}

}
