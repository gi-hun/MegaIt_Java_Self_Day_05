/*
 * # �Ｎ����
 * 1. ���� 7�� �������� 3�� �����ϸ�, ��÷�����̴�.
 * 2. �Ʒ� 3������ ������ ��÷���θ� ����Ѵ�.
 */

package array;

import java.util.Scanner;

public class ArrayEx10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] lotto1 = { 0, 0, 7, 7, 7, 0, 0, 0 }; // int[7]
		int[] lotto2 = { 7, 0, 7, 7, 0, 0, 0, 0 };
		int[] lotto3 = { 7, 0, 7, 7, 7, 0, 7, 0 };

		int count = 0;

		while (true) {
			System.out.println("[1]������ ���Ȯ��");
			System.out.println("[2]������ ���Ȯ��");
			System.out.println("[3]������ ���Ȯ��");
			System.out.println("4[]����");

			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();

			if (sel == 1) {
				for (int i = 2; i < 9; i++) {
					if ((lotto1[i - 2] == 7) && (lotto1[i - 1] == 7)) {
						count++;
						if ((lotto1[i - 1] == 7) && (lotto1[i] == 7)) {
							count++;
						}
					}
				}
				if (count == 3) {
					System.out.println("��÷");
				} else {
					System.out.println("��!");
				}
			} else if (sel == 2) {
				count = 0;
				for (int i = 2; i < 9; i++) {
					if ((lotto2[i - 2] == 7) && (lotto2[i - 1] == 7)) {
						count++;
						if ((lotto2[i - 1] == 7) && (lotto2[i] == 7)) {
							count++;
						}
					}
				}
				if (count == 3) {
					System.out.println("��÷");
				} else {
					System.out.println("��!");
				}
			} else if (sel == 3) {
				count = 0;
				for (int i = 2; i < 9; i++) {
					if ((lotto3[i - 2] == 7) && (lotto3[i - 1] == 7)) {
						count++;
						if ((lotto3[i - 1] == 7) && (lotto3[i] == 7)) {
							count++;
						}
					}
				}
				if (count == 3) {
					System.out.println("��÷");
				} else {
					System.out.println("��!");
				}
			} else if (sel == 4) {
				System.out.println("����");
				break;
			}

		}
	}
}
