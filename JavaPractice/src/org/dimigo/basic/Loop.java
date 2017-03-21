/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 * 		|_ Loop 11
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 16.
 * </pre>
 * 
 * 
 * @author think
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num;
		int dk = 100;
		String[] career= {"마법사","영주","기사","농민"};
		Scanner scanner = new Scanner(System.in);
		int choice;
		do
		{
			num =  new Random().nextInt(4);
			System.out.println("-----------");
			System.out.println("<< 게임 메뉴 >>");
			System.out.println(" 1. 공격력 증가");
			System.out.println(" 2. 공격력 감소");
			System.out.println(" 3. 캐릭터 설정");
			System.out.println(" 9. 종료");
			System.out.println("-----------");
			System.out.println("메뉴 입력 =>");
//			입력
			choice = scanner.nextInt();
			switch (choice)
			{
			case 1 : 
				dk+=10;
				System.out.printf("공격력이 증가되었습니다. 현재 공격력 : %d\n",dk);
				break;
			case 2 :
				dk-=10;
				System.out.printf("공격력이 감소되었습니다. 현재 공격력 : %d\n",dk);
				break;
			case 3 :
				System.out.printf("%s(으)로 설정되었습니다.\n",career[num]);
				break;
			case 9 :
				System.out.println("이제 공부하세요!\n");
				break;
			default:
				System.out.println("없는 메뉴입니다!");
				break;
			}
			
			
		}while(choice!=9);
		scanner.close();

	}

}
