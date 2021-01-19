package step1_05.controlStatement;

import java.util.Random;

/*
 * # 369게임[1단계]
 * 
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가
 * 	1) 2개이면, 짝짝을 출력
 *  2) 1개이면, 짝을 출력
 *  3) 0개이면, 해당 숫자를 출력
 * 예)
 * 		33	 : 짝짝
 * 		16	 : 짝
 * 		 7	 : 7
 */

public class IfEx22_내정답 {

	public static void main(String[] args) { //2020.12.14 2:13 - 2:18
		
		Random ran = new Random();
		
		int ranNum = ran.nextInt(50) +1;
		
		int num1 = ranNum % 100 % 10;
		int num10 = ranNum % 100 / 10;
		int num100 = ranNum /100;
		
		int cnt = 0;
		
		if(num1 == 3) {
			cnt++;
		}
		else if (num1 == 6) {
			cnt++;
		}
		else if (num1 == 9) {
			cnt++;
		}
		
		
		if(num10 == 3) {
			cnt++;
		}
		else if (num10 == 6) {
			cnt++;
		}
		else if (num10 == 9) {
			cnt++;
		}
		
	
		if(num100 == 3) {
			cnt++;
		}
		else if (num100 == 6) {
			cnt++;
		}
		else if (num100 == 9) {
			cnt++;
		}
		
		System.out.println("ranNum : " + ranNum);
		
		if(cnt == 2) {
			System.out.println("짝짝!");
		}
		else if(cnt == 1) {
			System.out.println("짝!");
		}
		else {
			System.out.println(ranNum);
		}

		
		
}
}
