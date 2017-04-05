/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   └ Question
 *
 * 1. 개요 : 실습과제5
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 *
 * @author JMyeong
 * @version : 1.0
 *
 */
public class Question {
	
	public static void main(String[] args) {
		String[] answer = {"빅뱅", "공유", "응용프로그래밍"};
		String[] question = {"가장 좋아하는 가수는? ", "가장 좋아하는 배우는? ", "가장 좋아하는 과목은? "}; 
		String in;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			System.out.println((i+1) + ". " + question[i]);
			in = sc.nextLine();
			if (in.equals(answer[i])) System.out.println("정답입니다!");
			else System.out.println("틀렸습니다!");
		}
		sc.close();
		System.out.print("<< 결과출력 >>");
		StringBuilder sb;
		for(int i = 0; i < 3; i++) {
			System.out.println();
			sb = new StringBuilder(question[i]);
			sb.append(answer[i]).append("입니다.");
			System.out.print(sb.toString());
		}
		
	}

}
