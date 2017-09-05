package com.builder.www;

import java.util.ArrayList;

//抽象汽车组装者
public abstract class CarBuilder {
	//建造一个模型，你要给我什么样的顺序，我就按照这样的顺序来组装
	public abstract void setSequeuence(ArrayList<String> sequeuence);
	//设置完毕了之后，就可以直接拿到车辆模型了
	public abstract CarModel getCarModel();
}
