package com.builder.www;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {
	private BenzModel benz=new BenzModel();
	@Override
	public void setSequeuence(ArrayList<String> sequeuence) {
		// TODO Auto-generated method stub
		this.benz.setSequeuen(sequeuence);
	}

	@Override
	public CarModel getCarModel() {
		// TODO Auto-generated method stub
		return this.benz;
	}

}
