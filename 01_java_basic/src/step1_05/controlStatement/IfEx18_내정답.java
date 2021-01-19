package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가위바위보 게임
 * 
 *   if - else if , else 등 구문을 활용하여 자율적으로 작성해보자.
 *   
 *   0 : 가위 , 1 : 바위 , 2 : 보
 */

public class IfEx18_내정답 { // 2020.12.14   1:11 - 1:19

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner (System.in);
		
		
		int com = 0;	// 랜덤으로 저장
		int me = 0;		// 키보드로 입력받아 저장
	
		com = ran.nextInt(3);
		
		System.out.println("가위(0), 바위(1), 보(2)");
		System.out.println("입력하세요 : ");
		me =  scan.nextInt();
		
		System.out.println("com : " + com);
		System.out.println("me : " + me);
	
		if(me == 1) {
			if(com == 0 ) {
				System.out.println("이겼다!");
			}
			else if(com == 2) {
				System.out.println("졌다!");
			}
			else {
				System.out.println("비겼다!");
			}
		}
		
		
		else if(me == 2) {
				if(com == 1 ) {
				System.out.println("이겼다!");
				}
				else if(com == 0) {
					System.out.println("졌다!");
				}
				else {
					System.out.println("비겼다!");
			}
		}
	
	
		else if(me == 0) {
			if(com == 2 ) {
				System.out.println("이겼다!");
			}
			else if(com == 1) {
				System.out.println("졌다!");
			}
			else {
				System.out.println("비겼다!");
			}
		}
	
		scan.close();
	}
	

}
