package com.cpm.vehicle;

import java.util.HashMap;

public interface Vehicle {

	HashMap<Integer, String> park(String licenseNumber, HashMap<Integer, String> carDetails);

	HashMap<Integer, String> unPark(int ticketNumber, HashMap<Integer, String> finalResult);

	HashMap<Integer, String> compact(HashMap<Integer, String> result);

}
