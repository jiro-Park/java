package javaad;

import java.util.Scanner;

public class Wontodollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("��ȭ �Է� : ");
    int wonInput = sc.nextInt();
    double chgRate = 1134.30;
    double resultUSD = wonInput/chgRate;
    
//    System.out.println(Math.round(result*100)/100.0);
    System.out.println("ȯ�� ��� : " + (int)resultUSD + "�޷�");
//    System.out.println("�Ž����� : " + (won - Math.round((int)result*changerate)));
    
    int dol100 = (int)(resultUSD/100);
    int dol50 = (int)(resultUSD%100/50);
    int dol20 = (int)(resultUSD%100%50/20);
    int dol10 = (int)(resultUSD%100%50%20/10);
    int dol5 = (int)(resultUSD%100%50%20%10/5);
    int dol2 = (int)(resultUSD%100%50%20%10%5/2);
    int dol1 = (int)(resultUSD%100%50%20%10%5%2);
    
    System.out.println( "100�޷� " + dol100 + "��");	
    System.out.println( "50�޷� " + dol50 + "��");	
    System.out.println( "20�޷� " + dol20 + "��");	
    System.out.println( "10�޷� " + dol10 + "��");	
    System.out.println( "5�޷� " + dol5 + "��");	
    System.out.println( "2�޷� " + dol2 + "��");	
    System.out.println( "1�޷� " + dol1 + "��");	
    // �޷� ���� ��� ��
    
    double chgWon = wonInput - Math.round((int)resultUSD*chgRate);
    System.out.println("\n�Ž����� : " + ((int)chgWon/10)*10 + "��");
       
    System.out.println( "1000�� " + (int)(((int)chgWon/10)*10/1000) + "��");	
    System.out.println( "500�� " + (int)(((int)chgWon/10)*10%1000/500) + "��");	
    System.out.println( "100�� " + (int)(((int)chgWon/10)*10%1000%500/100) + "��");	
    System.out.println( "50�� " + (int)(((int)chgWon/10)*10%1000%500%100/50) + "��");	
    System.out.println( "10�� " + (int)(((int)chgWon/10)*10%1000%500%100%50/10) + "��");	
	// �� ���� ��� �� (���� ������ ���� �ʾ� ��)
	}

}
