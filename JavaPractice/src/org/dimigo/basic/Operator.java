/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   └ Operator
 *
 * 1. 개요 : 디미베네
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 *
 * @author JMyeong
 * @version : 1.0
 *
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		long money = 1700000;
		int people = 3;
		int market = 1500;
		long result = money * 12 * people * market;
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", money) + "원");
		System.out.println("점포 내 직원 수 : " + people + "명");
		System.out.println("점포 수 : " + String.format("%,d", market) + "개\n\n");
		System.out.println("연간 인건비 : " + String.format("%,d", result) + "원");
		
	}

}
