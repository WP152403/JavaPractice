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
public class CarTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("<<자동차 목록>>");
		Car3 car31 = new Car3("현대자동차","제네시스","검정색",225,50000000);
		System.out.println("제조사명:"+car31.getCompany());
		System.out.println("모델명:"+car31.getModel());
		System.out.println("색상:"+car31.getColor());
		System.out.println("최대속도:"+car31.getMaxspeed()+"km");
		System.out.println("가격:"+String.format("%,d",car31.getPrice())+"원");
		System.out.println();
		//
		Car3 car32 = new Car3("기아자동차","K7","흰색",246);
//		car2.setCompany("기아자동차");
//		car2.setModel("K7");
//		car2.setColor("흰색");
//		car2.setMaxspeed(246);
//		car2.setPrice(40000000);
		System.out.println("제조사명:"+car32.getCompany());
		System.out.println("모델명:"+car32.getModel());
		System.out.println("색상:"+car32.getColor());
		System.out.println("최대속도:"+car32.getMaxspeed()+"km");
		System.out.println("가격:"+String.format("%,d",car32.getPrice())+"원");
		System.out.println();
		//
		Car3 car33 = new Car3("삼성자동차","SM7","회색");
//		car3.setCompany("삼성자동차");
//		car3.setModel("SM7");
//		car3.setColor("회색");
//		car3.setMaxspeed(200);
//		car3.setPrice(38000000);
		System.out.println("제조사명:"+car33.getCompany());
		System.out.println("모델명:"+car33.getModel());
		System.out.println("색상:"+car33.getColor());
		System.out.println("최대속도:"+car33.getMaxspeed()+"km");
		System.out.println("가격:"+String.format("%,d",car33.getPrice())+"원");

	}

}
