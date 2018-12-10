package com.cpm.main;

import java.util.Scanner;

import com.cpm.pojo.InputSeparator;

public class CarParkManager {

	public static void main(String s[]) {
		String carDetails = "";
		String finalDetails = "";
		System.out.println("ADD THE CAR DETAILS");
		Scanner sc = new Scanner(System.in);
		carDetails = sc.next();
		InputSeparator inputSeparator = new InputSeparator();
		finalDetails = inputSeparator.parseCarInputDetails(carDetails);
		System.out.println(finalDetails);
	}

}