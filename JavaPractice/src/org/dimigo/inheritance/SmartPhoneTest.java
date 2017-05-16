/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *         |_ SmartPhoneTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 12.
 * <pre>
 *
 * @author				: 최동준
 * @version			: 1.0
 */
public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone[] a = {
				new IPhone("IPhone7","애플",900000),
				new Galaxy("갤럭시 S8","삼성",800000)
		};

		for(SmartPhone sp : a){
			System.out.println(sp);
			sp.turnOn();
			sp.pay();
			sp.useSpecialFunction(sp);
			sp.turnOff();
			System.out.println();
		}
	}

}
