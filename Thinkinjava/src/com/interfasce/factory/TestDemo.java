package com.interfasce.factory;

public class TestDemo {
	public static void createCycle(cycleFactoy c){
		trafficTools cyc=c.getTrafficTools();
		cyc.move();
	}
	public static void main(String[] args){
		createCycle(new cycleFactoy());	
	}
}
