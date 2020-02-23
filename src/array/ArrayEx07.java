/*
 * # 학생성적관리 프로그램[4단계] : 1등학생
 */
// 문제) 1등학생의 학번과 성적 출력
// 정답) 1004번(98점)

package array;

public class ArrayEx07 {
	public static void main(String[] args) {
		
		int[] id = {1001, 1002, 1003, 1004, 1005};
		int[] score = {  87,   11,   45,   98,   23};
		
		int maxId = 0;
		int maxScore = 0;
		
		for(int i=0; i<5; i++)
		{	
			if(maxScore<score[i])
			{
				maxScore = score[i];
				maxId = i;
			}
		}
		
		System.out.println("1등 학생은 "+id[maxId]+"번 점수는 "+maxScore+"이다.");
	}
}
