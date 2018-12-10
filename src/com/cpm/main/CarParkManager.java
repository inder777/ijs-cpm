package com.cpm.main;

import java.util.Scanner;

import com.cpm.pojo.InputSeparator;

public class CarParkManager {

	public static void main(String s[]) {
		String carDetails = "";
		String finalDetails = "";
		System.out.println(
				"#####################################################################################################################################\n\n");

		System.out.println(
				"\t\t\t#############################################################################################");
		System.out.println(
				"\t\t\t#                                                                                           #");
		System.out.println(
				"\t\t\t#\t|| W e l c o m e _ T o _ P o l e S t a r _ C a r _ P a r k _ S y s t e m ||         #");
		System.out.println(
				"\t\t\t#                                                                                           #");
		System.out.println(
				"\t\t\t#############################################################################################");
		System.out.println(
				"\n\n#####################################################################################################################################\n\n");

		System.out.println("ADD THE CAR DETAILS");
		Scanner sc = new Scanner(System.in);
		carDetails = sc.next();
		InputSeparator inputSeparator = new InputSeparator();
		finalDetails = inputSeparator.parseCarInputDetails(carDetails);
		System.out.println(finalDetails);
	}

}