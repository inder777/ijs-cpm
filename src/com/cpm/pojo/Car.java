package com.cpm.pojo;

public class Car {

	private String licenseNumber;
	private static int assignTicket = 5000;

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public int getassignTicket() {
		return assignTicket;
	}

	public void assignNewTicket() {
		assignTicket += 1;
		if(assignTicket == 5010)
		{
			System.out.println("Sorry!!!! All slots are full!!!!");
			System.exit(0);
		}
	}

}
