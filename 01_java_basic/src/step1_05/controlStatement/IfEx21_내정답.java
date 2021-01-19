package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가운데 숫자 맞추기 게임
 * 
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 예)
 * 		249	: 4
 * 	    123 : 2
 * 		771 : 7
 */

public class IfEx21_내정답 { //2020.12.14   1:26 - 1:30

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner (System.in);
		
		int ranNum = ran.nextInt(101) + 150;
		System.out.println("ranNum : " + ranNum);
		
		int middleNum = (ranNum / 10) % 10;
		
		System.out.println("가운데 숫자를 맞춰보세요 :");
		int getNum = scan.nextInt();
		
		if(getNum == middleNum) {
			System.out.println("정답!");
		}
		else {
			System.out.println("땡!");
		}
		
		
		
		scan.close();
	}

}
