package com.tns.azlansami;

public class Square extends Shape {
	int side = 14;
	public Square(int s) {
		this.side=s;
	}
	public void calArea(){
		super.area = side*side;
	}
}

