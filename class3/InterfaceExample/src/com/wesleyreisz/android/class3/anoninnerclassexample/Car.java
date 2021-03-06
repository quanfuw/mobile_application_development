package com.wesleyreisz.android.class3.anoninnerclassexample;

import java.io.IOException;

public class Car {
	private static int BASE_MOVE = 2;
	IEngine engine;
	public void setEngine(IEngine engine){
		this.engine = engine;
	}
	public double move(){
		return engine.move(BASE_MOVE);
	}
	public static void main(String[] args) throws IOException{
		Car car = new Car();
		//This is an example of an anonymous inner class.
		//Key discussion point in Java for Android.
		car.setEngine(new IEngine() {
			
			@Override
			public double move(double speed) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		System.out.println("Car 1 is moving: " + car.move());
	}
}
