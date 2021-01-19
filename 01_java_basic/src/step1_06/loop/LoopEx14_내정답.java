package step1_06.loop;

import java.util.Scanner;

/*
 * # 최대값 구하기[2단계]
 * 
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 * 
 */

public class LoopEx14_내정답 {

	public static void main(String[] args) { // 2020.12.16 1:34 - 1:37
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수1 입력 :  ");
		int x = scan.nextInt();
		
		System.out.println("정수2 입력 :  ");
		int y = scan.nextInt();
		
		System.out.println("정수3 입력 :  ");
		int z = scan.nextInt();
		
		int maxNum = 0;
		
		if(x >= maxNum) {
			maxNum = x;
		}
		if(y >= maxNum) {
			maxNum = y;
		}
		if(z >= maxNum) {
			maxNum = z;
		}
		
		System.out.println("maxNum = " + maxNum);
		
		scan.close();

	}

}

