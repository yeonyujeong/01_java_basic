package step1_06.loop;

import java.util.Scanner;

/*
 * # 베스킨라빈스31
 * 
 * 1. p1과 p2가 번갈아가면서 1~3을 입력한다.
 * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
 * 3. br이 31을 넘으면 게임은 종료된다.
 * 4. 승리자를 출력한다.
 * 
 * 예) 
 * 1턴 : p1(2)	br(2)
 * 2턴 : p2(1)	br(3)
 * 3턴 : p1(3)	br(6)
 * ...
 */


public class LoopEx11_내정답 { //2020.12.16 12:10 - 12:16

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean isRun = true;
		
		int p1 = 0;
		int p2 = 0;
		
		int br = 0;
		int turn = 0;

		while(isRun) {
		
		if(turn == 0) {	
			System.out.println("==== p1차례 ====");
			System.out.println("1~3 사이의 숫자를 입력하세요 : ");
			int getNum1 = scan.nextInt();
			br = br + getNum1;
			System.out.println("p1(" + getNum1 + ")" + " br(" + br + ")");
			turn++;
		}
		
		else if(turn == 1) {	
				System.out.println("==== p2차례 ====");
				System.out.println("1~3 사이의 숫자를 입력하세요 : ");
				int getNum2 = scan.nextInt();
				br = br + getNum2;
				System.out.println("p2(" + getNum2 + ")" + " br(" + br + ")");
				turn--;
		}
		
		if(br > 31) {
			isRun = false;
			System.out.println("게임 종료");
			if(turn == 0) {
				System.out.println("p1승리!");
			}
			else if(turn == 1) {
					System.out.println("p2승리!");
			}
		}
		
		System.out.println();
		
		scan.close();
		}
		
	}

}
