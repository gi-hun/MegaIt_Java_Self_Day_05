/*
 * # �л��������� ���α׷�[3�ܰ�] : ����ó��
 */
// ����) �й��� �Է¹޾� ���� ���
		// 		��, �����й� �Է� �� ����ó��
		// ��)
		// �й� �Է� : 1002		���� : 11��
		// �й� �Է� : 1000		�ش��й��� �������� �ʽ��ϴ�.

package array;

import java.util.Scanner;

public class ArrayEx06_question_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] id = {1001, 1002, 1003, 1004, 1005};
		//�й�
		int[] score = {  87,   11,   45,   98,   23};
		//�л� ����
		
		int count = -1;
		
		while(true)
		{
			System.out.println("�й��� �Է����ּ���");
			int num = sc.nextInt();
			
			for(int i=0; i<5; i++)
			{
				if(num == id[i])
				{
					count = i;
				}
				else 
				{
					count = -1;
				}
			}
			
			if(count == -1)
			{
				System.out.println("������ �������� �ʽ��ϴ�.");
				break;
			}
			
			else
			{
				System.out.println("����:" + score[count]);
			}
		}
		
	}
}
