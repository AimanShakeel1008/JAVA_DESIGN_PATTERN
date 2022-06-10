package com.aiman.creationalDesignPattern.factoryDesignPattern;

public class FactoryMain {

	public static void main(String[] args) {
		OperatingSystemFactory osFactory= new OperatingSystemFactory();
		OS operatingSystem=osFactory.getInstance("Open");
		operatingSystem.spec();
	}

}
