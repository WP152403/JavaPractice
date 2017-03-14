/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_Operator
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 *
 * @author soonb
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int salary = 1700000;
		int employee = 3;
		int chain = 1500;
		long yearcost = (long)salary*12*employee*chain;
		System.out.printf("연간 인건비 : ");
		System.out.printf("%,d원", yearcost);
	}

}
