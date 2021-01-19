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

public class LoopEx07_복습1 {

	public static void main(String[] args) { // 2020.12.16  1:23 - 1:27
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int rNum = ran.nextInt(100) +1;
		
		boolean isRun = true;
		int cnt = 0;
		
		while(isRun) {
			System.out.println("rNum = " +  rNum);
			System.out.println("난수를 맞춰보세요 : ");
			int answer = scan.nextInt();
			
			if(answer == rNum) {
				System.out.println("정답!");
				isRun = false;
			}
			else {
				System.out.println("땡!");
				cnt++;
			}
			
			
		}
		
		int score = 100 - cnt*5;
		
		System.out.println("최종 점수 : " + score);
		scan.close();
		
		
		
	}

}
