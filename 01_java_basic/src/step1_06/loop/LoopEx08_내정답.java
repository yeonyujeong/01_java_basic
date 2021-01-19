package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 * 
 */

public class LoopEx08_내정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int identifier = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		boolean isRun = true;
		
		
		while (isRun) { //2020.12.15   2:05 - 2:10
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				if(identifier == -1) {
				System.out.println("Acc를 입력해주세요 : ");
				int getAcc = scan.nextInt();
				System.out.println("Pw를 입력해주세요 : ");
				int getPw = scan.nextInt();
					if(getAcc == dbAcc1 && getPw == dbPw1 ) {
						System.out.println("dbAcc1  로그인 성공");
						identifier = 1;
					}
					else if(getAcc == dbAcc2 && getPw == dbPw2 ) {
						System.out.println("dbAcc2  로그인 성공");
						identifier = 2;
					}
					else {
						System.out.println("계좌와 비밀번호를 확인해주세요");
					}
				}
				else if (identifier == 1) {
					System.out.println("현재 dbAcc1 님 로그인중..");
				}
				else if (identifier == 2) {
					System.out.println("현재 dbAcc2 님 로그인중..");
				}
			}
			
			else if (selectMenu == 2) {
				if(identifier != -1) {
					System.out.println("로그아웃 성공");
					identifier = -1;
				}
				else {
					System.out.println("로그인 후에 이용해주세요");
				}
			}
			
			else if (selectMenu == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}

		scan.close();
	}

}
