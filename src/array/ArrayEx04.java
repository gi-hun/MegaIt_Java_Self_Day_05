/*
 * # 학생성적관리 프로그램[1단계] : 학생점수
 */

// 문제1) arr배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명

package array;

import java.util.Scanner;

public class ArrayEx04 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int[] score = new int[5];
		
		for(int i=0; i<5; i++)
		{
			System.out.println("학생들의 점수를 입력해주세요");
			score[i] = sc.nextInt();
		}
		
		int sum = 0;
		double avg = 0.0;
		
		for(int i=0; i<5; i++)
		{
			sum = sum+score[i];
		}
		avg = sum/5.0;
		System.out.println("전교생의 총점:" + sum);
		System.out.println("전교생의 평균" + avg);
		
		int count = 0;
		for(int i=0; i<5; i++)
		{
			if(score[i] >= 60)
			{
				count++;
			}
		}
		System.out.println("합격생의 수" + count);
	}
}
