/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 * 		|_ PrimitiveDataType
 * 
 * 1. 개요 : 아이유 프로필
 * 2. 작성일 : 2017. 3. 10.
 * </pre>
 * 
 * 
 * @author think
 * @version : 1.0
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<< 아이유 프로필 >>\n");
		String name = "아이유";
		boolean isMale = false; // 지역변수는 초기화를 해 줘야함!
		int age = 25;
		double height = 161.8;
		float weight = 44.3f;
		char bloodType = 'A';
		System.out.printf("이름 : %s\n",name);
		System.out.println( isMale? "성별 : 남자" : "성별 : 여자");
		System.out.printf("나이 : %d세\n ",age);
		System.out.printf("키 : %.1f\n",height);
		System.out.printf("몸무게 : %.1f\n",weight);
		System.out.printf("혈액형 : %c\n",bloodType);

	}

}
