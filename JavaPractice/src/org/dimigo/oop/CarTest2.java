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
public class CarTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("<<자동차 목록>>");
		Car2 car21 = new Car2("현대자동차","제네시스","검정색",225,50000000);
		System.out.println("제조사명:"+car21.getCompany());
		System.out.println("모델명:"+car21.getModel());
		System.out.println("색상:"+car21.getColor());
		System.out.println("최대속도:"+car21.getMaxspeed()+"km");
		System.out.println("가격:"+String.format("%,d",car21.getPrice())+"원");
		System.out.println();
		//
		Car2 car22 = new Car2("기아자동차","K7","흰색",246,40000000);
//		car2.setCompany("기아자동차");
//		car2.setModel("K7");
//		car2.setColor("흰색");
//		car2.setMaxspeed(246);
//		car2.setPrice(40000000);
		System.out.println("제조사명:"+car22.getCompany());
		System.out.println("모델명:"+car22.getModel());
		System.out.println("색상:"+car22.getColor());
		System.out.println("최대속도:"+car22.getMaxspeed()+"km");
		System.out.println("가격:"+String.format("%,d",car22.getPrice())+"원");
		System.out.println();
		//
		Car2 car23 = new Car2("삼성자동차","SM7","회색",200,38000000);
//		car3.setCompany("삼성자동차");
//		car3.setModel("SM7");
//		car3.setColor("회색");
//		car3.setMaxspeed(200);
//		car3.setPrice(38000000);
		System.out.println("제조사명:"+car23.getCompany());
		System.out.println("모델명:"+car23.getModel());
		System.out.println("색상:"+car23.getColor());
		System.out.println("최대속도:"+car23.getMaxspeed()+"km");
		System.out.println("가격:"+String.format("%,d",car23.getPrice())+"원");

	}

}
