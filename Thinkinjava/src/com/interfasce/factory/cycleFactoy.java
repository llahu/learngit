package com.interfasce.factory;

public class cycleFactoy implements trifficToolsFactory {

	@Override
	public trafficTools getTrafficTools() {
		// TODO Auto-generated method stub
		return new Cycle();
	}

}
