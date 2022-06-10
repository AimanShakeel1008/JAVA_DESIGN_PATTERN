package com.aiman.creationalDesignPattern.builderDesignPattern;

public class BuilderMain {

	public static void main(String[] args) {
		
		Phone phone=new PhoneBuilder().setOs("Android").setRam(8).setProcessor("Qualcomm").getPhone();
		
		System.out.println(phone);

	}

}
