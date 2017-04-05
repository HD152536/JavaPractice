/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   └ ArrayBasic
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 4.
 * </pre>
 *
 * @author JMyeong
 * @version : 1.0
 *
 */
public class ArrayBasic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] intArr = null;

		intArr = new int[5];

		ArrayBasic obj = new ArrayBasic();
		obj.printArray(intArr);

		// int[] intArr2 = { 1, 2, 3, 4, 5 };
		// int[] intArr2 = new int[] { 1, 2, 3, 4, 5 };
		int[] intArr2 = null;
		intArr2 = new int[] { 1, 2, 3, 4, 5 };
		obj.printArray(intArr2);
		
		String[] strArr = new String[3];
		strArr[0] = "EXO";
		strArr[1] = "트와이스";
		obj.printArray(strArr);
		
//		String[] strApp2 = {"EXO", ""
//				+ "ㅋ
		
		
	}

	/**
	 * @param strArr
	 */
	private void printArray(String[] strArr) {
		for (String value : strArr) {
			System.out.print(value + " | ");
		}
		System.out.println();
		
		
	}

	/**
	 * @param intArr
	 */
	private void printArray(int[] intArr) {
		for (int value : intArr) {
			System.out.print(value + " | ");
		}
		System.out.println();
	}

}
