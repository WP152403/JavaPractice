/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_CarTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author soonb
 * @version : 1.0
 */
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("<<자동차 목록>>");
		Car car = new Car();
		System.out.println("제조사명:"+car.getCompany());
		System.out.println("모델명:"+car.getModel());
		System.out.println("색상:"+car.getColor());
		System.out.println("최대속도:"+car.getMaxspeed()+"km");
		System.out.println("가격:"+String.format("%,d",car.getPrice())+"원");
		System.out.println();
		Car car2 = new Car();
		car2.setCompany("기아자동차");
		car2.setModel("K7");
		car2.setColor("흰색");
		car2.setMaxspeed(246);
		car2.setPrice(40000000);
		System.out.println("제조사명:"+car.getCompany());
		System.out.println("모델명:"+car.getModel());
		System.out.println("색상:"+car.getColor());
		System.out.println("최대속도:"+car.getMaxspeed()+"km");
		System.out.println("가격:"+String.format("%,d",car.getPrice())+"원");
		System.out.println();
		Car car3 = new Car();
		car3.setCompany("삼성자동차");
		car3.setModel("SM7");
		car3.setColor("회색");
		car3.setMaxspeed(200);
		car3.setPrice(38000000);
		System.out.println("제조사명:"+car.getCompany());
		System.out.println("모델명:"+car.getModel());
		System.out.println("색상:"+car.getColor());
		System.out.println("최대속도:"+car.getMaxspeed()+"km");
		System.out.println("가격:"+String.format("%,d",car.getPrice())+"원");

	}

}
