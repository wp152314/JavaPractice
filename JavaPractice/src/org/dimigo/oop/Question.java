/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *  |_ Question
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 *
 * @author : amara
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String singer = "One direction";
		String actor = "Hue Dancy";
		String study = "Mathematics";
		System.out.println("1.가장 좋아하는 가수는?");
		String answer = scanner.nextLine();
		
		if (singer.equals(answer))
		{
			System.out.println("정답입니다!");
		}
		else
		{
			System.out.println("틀렸습니다!");
		}
		
		System.out.println("2.가장 좋아하는 배우는?");
		String answer2 = scanner.nextLine();
		
		if (actor.equals(answer2))
		{
			System.out.println("정답입니다!");
		}
		else
		{
			System.out.println("틀렸습니다!");
		}
		
		System.out.println("3.가장 좋아하는 과목은?");
		String answer3 = scanner.nextLine();
		
		if (study.equals(answer3))
		{
			System.out.println("정답입니다!");
		}
		else
		{
			System.out.println("틀렸습니다!");
		}
		
		StringBuilder sb = new StringBuilder("<<결과 출력>>\n");
		sb.append("가장 좋아하는 가수는? ").append(singer).append("입니다.").append("\n");
		sb.append("가장 좋아하는 배우는? ").append(actor).append("입니다.").append("\n");
		sb.append("가장 좋아하는 과목은? ").append(study).append("입니다.").append("\n");
		
		System.out.println(sb.toString());

	}

}
