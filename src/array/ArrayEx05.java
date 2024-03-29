/*
 * # 학생성적관리 프로그램[2단계] : 학생검색
 */
// 인덱스            0   1   2   3   4	
// 문제1) 인덱스를 입력받아 성적 출력
// 정답1) 인덱스 입력 : 1	성적 : 11점
		
// 문제2) 성적을 입력받아 인덱스 출력
// 정답2) 성적 입력 : 11		인덱스 : 1
		
// 문제3) 학번을 입력받아 성적 출력
// 정답3) 학번 입력 : 1003	성적 : 45점

package array;

import java.util.Scanner;

public class ArrayEx05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {87, 11, 45, 98, 23};
		
		System.out.println("인덱스를 입력하세요");
		int index = sc.nextInt();
		
		for(int i=0; i<5; i++)
		{
			if(index == i)
			{
				System.out.println(arr[i]);
			}
		}
		
		int count = 0;
		System.out.println("성적을 입력하세요");
		int score = sc.nextInt();
		
		for(int i=0; i<5; i++)
		{
			if(score == arr[i])
			{
				System.out.println(count);
			}
			count++;
		}
		
		int[] num = {1001, 1002, 1003, 1004, 1005};

		System.out.println("학번을 입력해주세요");
		int input = sc.nextInt();
		
		for(int i=0; i<5; i++)
		{
			if(num[i] == input)
			{
				System.out.println("성적:"+arr[i]+"점");
			}
		}
	}
}
