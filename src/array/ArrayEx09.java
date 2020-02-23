/*
 * # ��ȭ�� �¼�����
 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
 * 4. �� �¼��� ���� ������ 12000���̴�.
 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� ������� ����Ѵ�.
 * ��)
 * seat = 0 0 0 0 0 0 0
 * 
 * �¼����� : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
 * ----------------------
 * ����� : 24000��
 */

package array;

import java.util.Scanner;

public class ArrayEx09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] seat = new int[7];
		
		int count = 0;

		while (true) {
			System.out.print("seat = ");
			for (int i = 0; i < 7; i++) {
				System.out.print(seat[i] + " ");
			}

			System.out.println("");
			System.out.println("");
			System.out.println("�Ե��ó׸� ��ȭ��");
			System.out.println("1. �¼� ����");
			System.out.println("2. ����");
		
			System.out.println("�޴� ����: ");
			int menu = sc.nextInt();
			
			if(menu == 1)
			{
				System.out.println("�¼�����");
				int select = sc.nextInt();

				for (int i = 0; i < 7; i++) {
					if (select == i) {
						if(seat[i] == 0)
						{
							seat[i] = 1;
							count++;
						}
						else
						{
							System.out.println("�̹� ���� �Ϸ�� �ڸ��Դϴ�.");
							System.out.println("�ٸ� �ڸ��� �������ּ���");
							break;
						}
					}
				}
			}
			
			else if(menu == 2)
			{
				int sum = count*1200;
				System.out.println("�����" + sum + "��");
				break;
			}

			System.out.println("");
			System.out.println("");
		}

	}
}
