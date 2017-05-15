/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 15.
 * </pre>
 *
 * @author soonb
 * @version : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SmartPhone[] s = {
				new IPhone("iPhone 7", "애플", 900000),
				new Galaxy("갤럭시 S8", "삼성", 800000)
		};
		
		for (SmartPhone smart : s) {
			System.out.println(smart);
			smart.turnOn();
			smart.pay();
			smart.useSpecialFuction(smart);
			smart.turnOff();
			System.out.println();
		}

	}

}
