/*
 * # 학생성적관리 프로그램[3단계] : 예외처리
 */
// 문제) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.

package array;

import java.util.Scanner;

public class ArrayEx06_question {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] id = {1001, 1002, 1003, 1004, 1005};
		//학번
		int[] score = {  87,   11,   45,   98,   23};
		//학생 점수
		
		while(true)
		{
			System.out.println("학번을 입력해주세요");
			int num = sc.nextInt();
			
			for(int i=0; i<5; i++)
			{
				if(num == id[i])
				{
					System.out.println(score[i]);
				}
				
				else if(num != id[i])
				{
					System.out.println("해당 학번이 존재하지 않습니다");
					break;
				}
			}
		}
	}
}
