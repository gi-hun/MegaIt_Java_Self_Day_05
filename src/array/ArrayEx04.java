/*
 * # �л��������� ���α׷�[1�ܰ�] : �л�����
 */

// ����1) arr�迭�� 1~100�� ������ ������ 5�� ����
		// ��   1) 87, 11, 92, 14, 47
		
		// ����2) �������� ������ ��� ���
		// ��   2) ����(251) ���(50.2)
		
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// ��   3) 2��

package array;

import java.util.Scanner;

public class ArrayEx04 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int[] score = new int[5];
		
		for(int i=0; i<5; i++)
		{
			System.out.println("�л����� ������ �Է����ּ���");
			score[i] = sc.nextInt();
		}
		
		int sum = 0;
		double avg = 0.0;
		
		for(int i=0; i<5; i++)
		{
			sum = sum+score[i];
		}
		avg = sum/5.0;
		System.out.println("�������� ����:" + sum);
		System.out.println("�������� ���" + avg);
		
		int count = 0;
		for(int i=0; i<5; i++)
		{
			if(score[i] >= 60)
			{
				count++;
			}
		}
		System.out.println("�հݻ��� ��" + count);
	}
}
