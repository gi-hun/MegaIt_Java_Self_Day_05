/*
 * # �л��������� ���α׷�[4�ܰ�] : 1���л�
 */
// ����) 1���л��� �й��� ���� ���
// ����) 1004��(98��)

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
		
		System.out.println("1�� �л��� "+id[maxId]+"�� ������ "+maxScore+"�̴�.");
	}
}
