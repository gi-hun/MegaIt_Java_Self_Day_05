/*
 * # �迭 �⺻����
 */

// ����1) 10���� 50���� arr �迭�� ����
		// ����1) 10 20 30 40 50
		
		// ����2) 4�� ����� ���
		// ����2) 20 40
		
		// ����3) 4�� ����� �� ���
		// ����3) 60
		
		// ����4) 4�� ����� ���� ���
		// ����4) 2
		
		// ����5) ¦���� ���� ���
		// ����5) 5

package array;

public class ArrayEx03 {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		//����1) 10���� 50���� arr �迭�� ����
		
		for(int i=0; i<5; i++)
		{
			arr[i] = 10*(i+1);
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
		
		//����2) 4�� ����� ���
		for(int i=0; i<5; i++)
		{
			if(arr[i]%4 == 0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
		System.out.println();
		
		// ����3) 4�� ����� �� ���
		
		int sum = 0;
		
		for(int i=0; i<5; i++)
		{
			if(arr[i]%4 == 0)
			{
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);
		
		// ����4) 4�� ����� ���� ���
		
		int count = 0;
		
		for(int i=0; i<5; i++)
		{
			if(arr[i]%4 == 0)
			{
				count++;
			}
		}
		System.out.println(count);
		
		// ����5) ¦���� ���� ���
		count = 0;
		for(int i=0; i<5; i++)
		{
			if(arr[i]%2 == 0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
