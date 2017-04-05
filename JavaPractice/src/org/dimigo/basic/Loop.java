/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *   └ Loop
 *
 * 1. 개요 : 초간단 게임프로그램
 * 2. 작성일 : 2017. 3. 16.
 * </pre>
 *
 * @author JMyeong
 * @version : 1.0
 *
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int strong = 100;
		int random;
		do {

			random = new Random().nextInt(4);
			System.out.println("----------------");
			System.out.println("<< 게임메뉴 >>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("----------------");
			System.out.print("메뉴 입력 => ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 :
				strong += 10;
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : " + strong);
				break;
			case 2 :
				strong -= 10;
				System.out.println("공격력이 감소되었습니다. 현재 공격력 : " + strong);
				break;
			case 3 :
				if(random == 0) System.out.println("마법사(으)로 설정되었습니다.");
				else if (random == 1) System.out.println("영주(으)로 설정되었습니다.");
				else if (random == 2) System.out.println("기사(으)로 설정되었습니다.");
				else if (random == 3) System.out.println("농민(으)로 설정되었습니다.");
				break;
			default :
				System.out.println("없는 메뉴입니다!!");
				break;
			case 9 :
				System.out.println("이제 공부하세요!");
				break;
			}
		} while(choice != 9);
		
		 sc.close();
	}

}
