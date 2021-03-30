package javaad;

import java.util.Scanner;

public class Wontodollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("원화 입력 : ");
    int wonInput = sc.nextInt();
    double chgRate = 1134.30;
    double resultUSD = wonInput/chgRate;
    
//    System.out.println(Math.round(result*100)/100.0);
    System.out.println("환전 결과 : " + (int)resultUSD + "달러");
//    System.out.println("거스름돈 : " + (won - Math.round((int)result*changerate)));
    
    int dol100 = (int)(resultUSD/100);
    int dol50 = (int)(resultUSD%100/50);
    int dol20 = (int)(resultUSD%100%50/20);
    int dol10 = (int)(resultUSD%100%50%20/10);
    int dol5 = (int)(resultUSD%100%50%20%10/5);
    int dol2 = (int)(resultUSD%100%50%20%10%5/2);
    int dol1 = (int)(resultUSD%100%50%20%10%5%2);
    
    System.out.println( "100달러 " + dol100 + "개");	
    System.out.println( "50달러 " + dol50 + "개");	
    System.out.println( "20달러 " + dol20 + "개");	
    System.out.println( "10달러 " + dol10 + "개");	
    System.out.println( "5달러 " + dol5 + "개");	
    System.out.println( "2달러 " + dol2 + "개");	
    System.out.println( "1달러 " + dol1 + "개");	
    // 달러 관련 계산 끝
    
    double chgWon = wonInput - Math.round((int)resultUSD*chgRate);
    System.out.println("\n거스름돈 : " + ((int)chgWon/10)*10 + "원");
       
    System.out.println( "1000원 " + (int)(((int)chgWon/10)*10/1000) + "개");	
    System.out.println( "500원 " + (int)(((int)chgWon/10)*10%1000/500) + "개");	
    System.out.println( "100원 " + (int)(((int)chgWon/10)*10%1000%500/100) + "개");	
    System.out.println( "50원 " + (int)(((int)chgWon/10)*10%1000%500%100/50) + "개");	
    System.out.println( "10원 " + (int)(((int)chgWon/10)*10%1000%500%100%50/10) + "개");	
	// 원 관련 계산 끝 (따로 선언을 하지 않아 봄)
	}

}
