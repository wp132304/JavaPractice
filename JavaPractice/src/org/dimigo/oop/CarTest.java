/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ CarTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 14.
 * </pre>
 *
 * @author		: 2304 김동현
 * @version		: 1.0
 */
public class CarTest {
	public static void main(String[] args) {
//		Car car;
//		car = new Car();
		
/*		Car2 car1 = new Car2("현대자동차","제네시스","검정색",225,50000000);
		Car2 car2 = new Car2("기아자동차","K7","흰색",246,40000000);
		Car2 car3 = new Car2("삼성자동차","SM7","회색",200,38000000);
*/		
		Car3 car1 = new Car3("현대자동차","제네시스","검정색",225,50000000);
		Car3 car2 = new Car3("기아자동차","K7","흰색",246);
		Car3 car3 = new Car3("삼성자동차","SM7","회색");
		System.out.println("<< 자동차 목록 >>");
		
/*		car.setCompany("현대자동차");
		car.setModel("제네시스");
		car.setColor("검정색");
		car.setMaxSpeed(225);
		car.setPrice(50000000);
*/		System.out.println("제조사명 : " + car1.getCompany());
		System.out.println("모델명 : " + car1.getModel());
		System.out.println("색상 : " + car1.getColor());
		System.out.println("최대속도 : " + car1.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d원",car1.getPrice()));
		System.out.println();
		
/*		car.setCompany("기아자동차");
		car.setModel("K7");
		car.setColor("흰색");
		car.setMaxSpeed(246);
		car.setPrice(40000000);
*/		System.out.println("제조사명 : " + car2.getCompany());
		System.out.println("모델명 : " + car2.getModel());
		System.out.println("색상 : " + car2.getColor());
		System.out.println("최대속도 : " + car2.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d원",car2.getPrice()));
		System.out.println();
		
/*		car.setCompany("삼성자동차");
		car.setModel("SM7");
		car.setColor("회색");
		car.setMaxSpeed(200);
		car.setPrice(38000000);
*/		System.out.println("제조사명 : " + car3.getCompany());
		System.out.println("모델명 : " + car3.getModel());
		System.out.println("색상 : " + car3.getColor());
		System.out.println("최대속도 : " + car3.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d원",car3.getPrice()));
		System.out.println();
	}
}
