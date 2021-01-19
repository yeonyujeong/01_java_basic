package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 연산자 기호 맞추기 게임
 * 
 * 1) 1~10 사이의 랜덤 숫자 2개를 저장한다.
 * 2) 1~4 사이의 랜덤 숫자 1개를 저장한다.
 * 3) 위 숫자는 연산자 기호에 해당된다.
 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
 * 4) 사용자는 연산자 기호를 맞추는 게임이다.
 * 예) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    정답 : 2번
 */

public class IfEx24_내정답 {

	public static void main(String[] args) { // 2020.12.14  2:28 - 2:34
		
		Random ran = new Random ();
		Scanner scan =  new Scanner (System.in);
		
		int x = ran.nextInt(10) + 1;
		int y = ran.nextInt(10) + 1;
		
		int z = ran.nextInt(4) + 1;
		
		int answer = 0;
		
		if(z == 1) {
			answer = x+y;
		}
		else if(z == 2) {
			answer = x-y;
		}
		else if(z == 3) {
			answer = x*y;
		}
		else if(z == 2) {
			answer = x%y;
		}
		
		
		System.out.println(x + " ? " + y + " = " + answer);
		System.out.println("1) +  2) -  3) *  4) % ");
		System.out.print("정답을 입력하세요 : ");
		int getAnswer = scan.nextInt();
		
		if(getAnswer == z) {
			System.out.println("정답!");
		}
		else {
			System.out.println("땡!");
		}
		
		
	
		
		scan.close();
		
		
	}

}
