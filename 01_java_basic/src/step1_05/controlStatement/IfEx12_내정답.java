package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 최대값 구하기[1단계]
 * 
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */


public class IfEx12_내정답 { // 2020.12.11 2:16-2:19

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("첫번째 숫자를 입력해주세요");
		int number1 = scan.nextInt();

		System.out.println("두번째 숫자를 입력해주세요");
		int number2 = scan.nextInt();
		
		System.out.println("세번째 숫자를 입력해주세요");
		int number3 = scan.nextInt();
		
		if(number1 > number2) {
			if(number1>number3) {
				System.out.println("MAX = " + number1);
			}		
		}
		if(number2 > number3) {
			if(number2>number1) {
				System.out.println("MAX = " + number2);
			}		
		}
		if(number3 > number2) {
			if(number3>number1) {
				System.out.println("MAX = " + number3);
			}		
		}
		
		scan.close();
	}

}
