package ����Ǯ��;

import java.util.Random;

public class Ȯ�ι���2 {

	public static void main(String[] args) {
	// ��������
		//������ ���ڸ� 2�� �߻����Ѽ�
		//ù��° ������ ���ڰ� �� ũ�� ù��°�� �� Ŀ��!
		//�ι�° ������ ���ڰ� �� ũ�� �ι�°�� �� Ŀ��!
		
Random r = new Random(); // �������� r ���� ����(����,�Ǽ�)	


int x1 = r.nextInt(100); // 0~99������ �������� r ���� �����Ͽ� ���� x1 ���� RAM�� ����
int x2 = r.nextInt(100); // 0~99������ �������� r ���� �����Ͽ� ���� x2 ���� RAM�� ����

if (x1 > x2) {
	System.out.println("ù��° ���ڰ� �� Ŀ��"); // x1�� x2���� Ŭ ��� ���
} else {
	System.out.println("�ι�° ���ڰ� �� Ŀ��"); // x2�� x1���� Ŭ ��� ���
}
		
	
	}

}
