package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 * 
 */


public class LoopEx04_내정답 {

	public static void main(String[] args) { //2020.12.15  12:38 - 12:43
		
		Random ran = new Random();
		Scanner scan =  new Scanner (System.in);
		
		
		int i = 0;
		int cnt = 0;
		
		while(i < 5) {
			
		int x = ran.nextInt(9) + 1;
		int y = ran.nextInt(9) + 1;
		int answer = x*y;
		
		System.out.println(x + " * " + y + " = ?");
		int getAnswer = scan.nextInt();
		
		if(getAnswer == answer) {
			cnt++;
		}
		i++;
		}
		
		int score = cnt * 20;
		
		System.out.println("정답수 : " + cnt + "번");
		System.out.println("점수 : " + score + "점");
		
		
		scan.close();
		
		
		
	

	}

}
