package org.dimigo.basic;

public class Condition {
	public static void main(String[] args) {
		
		String carsType = "경차";
		int kilometer = 10;
		int fare;
		
		switch(carsType) {
		case "고속버스":
			fare = 850;
			break;
		case "경차":
			fare = 300;
			break;
		default:
			fare = 600;
		}
		
		if(kilometer > 10) {
			switch(carsType) {
			case "고속버스":
				fare += (kilometer / 10) * 300;
				break;
			default:
				fare += (kilometer / 10) * 200;
			}
		}
		
		System.out.println("<< 고속도로 주행 비용 >>");
		System.out.println("주행 거리 : " + kilometer + "km");
		System.out.println("차 종류 : " + carsType);
		System.out.println("주행 비용 : " + fare + "원");
		
	}
}
