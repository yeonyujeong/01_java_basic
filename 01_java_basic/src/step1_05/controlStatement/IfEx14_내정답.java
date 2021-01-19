package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 코인 게임
 * 
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */

public class IfEx14_내정답 { //2020.12.15  12:09 - 12:12

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int coin = ran.nextInt(2);

		Scanner scan = new Scanner (System.in);
		
		System.out.println("동전의 앞면 : 0   /   동의 뒷면 : 1 ");
		System.out.println(" 입력해주세요 : ");
		int my = scan.nextInt();
		
		if(my == coin) {
			System.out.println("일치!");
		}
		if(my != coin) {
			System.out.println("불일치!");
		}
		
		scan.close();
	}

}
