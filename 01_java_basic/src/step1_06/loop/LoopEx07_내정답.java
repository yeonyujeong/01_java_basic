package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 1 ~ 100까지의 난수를 생성한다.
 * 2. 스캐너를 이용해 정답을 맞추기를 시도하고 정답을 맞출경우 게임은 종료된다.
 * 3. 점수는 100점부터 시작해서 오답을 입력할 때마다 5점씩 차감된다.
 * 4. 게임 종료 후, 점수를 출력한다.
 * 
 */

public class LoopEx07_내정답 {

	public static void main(String[] args) { // 2020.12.15  1:31 - 1:36
		
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int rNum = ran.nextInt(100) +1;
		System.out.println("rNum : " + rNum);
		int score = 100;
		int i = 0;
		
		while (i != rNum) {
			System.out.print("정답 맞추기 : ");
			i = scan.nextInt();
			
			if(i == rNum) {
				System.out.println("게임 종료");
				System.out.println("점수 : " + score + "점");
			}
			else {
				score = score - 5;
			}
		}
		
		scan.close();
	}

}
