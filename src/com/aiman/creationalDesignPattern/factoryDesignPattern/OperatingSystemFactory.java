package com.aiman.creationalDesignPattern.factoryDesignPattern;

public class OperatingSystemFactory {

	OS getInstance(String str) {
		if (str.equals("Open")) {
			return new Android();
		} else if (str.equals("Closed")) {
			return new IOS();
		} else {
			return new Windows();
		}
	}

}
