/*
 * # �л��������� ���α׷�[2�ܰ�] : �л��˻�
 */
// �ε���            0   1   2   3   4	
// ����1) �ε����� �Է¹޾� ���� ���
// ����1) �ε��� �Է� : 1	���� : 11��
		
// ����2) ������ �Է¹޾� �ε��� ���
// ����2) ���� �Է� : 11		�ε��� : 1
		
// ����3) �й��� �Է¹޾� ���� ���
// ����3) �й� �Է� : 1003	���� : 45��

package array;

import java.util.Scanner;

public class ArrayEx05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {87, 11, 45, 98, 23};
		
		System.out.println("�ε����� �Է��ϼ���");
		int index = sc.nextInt();
		
		for(int i=0; i<5; i++)
		{
			if(index == i)
			{
				System.out.println(arr[i]);
			}
		}
		
		int count = 0;
		System.out.println("������ �Է��ϼ���");
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

		System.out.println("�й��� �Է����ּ���");
		int input = sc.nextInt();
		
		for(int i=0; i<5; i++)
		{
			if(num[i] == input)
			{
				System.out.println("����:"+arr[i]+"��");
			}
		}
	}
}
