package com.builder.www;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {
	private BMWModel bmw=new BMWModel(); 
	@Override
	public void setSequeuence(ArrayList<String> sequeuence) {
		// TODO Auto-generated method stub
		this.bmw.setSequeuen(sequeuence);
	}

	@Override
	public CarModel getCarModel() {
		// TODO Auto-generated method stub
		return this.bmw;
	}

}
