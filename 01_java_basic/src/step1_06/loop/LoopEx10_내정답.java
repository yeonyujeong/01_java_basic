package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[3단계]
 * 
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 * 3. 입금
 * . 로그인 후 이용가능
 * 4. 출금
 * . 로그인 후 이용가능
 * 5. 이체
 * . 로그인 후 이용가능
 * 6. 조회
 * . 로그인 후 이용가능
 * 7. 종료
 * 
 */

public class LoopEx10_내정답 { //2020.12.15   2:29 - 2:50

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int identifier = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				if(identifier == 1) {
					System.out.println("dbAcc1님, 로그인되어있습니다.");
				}
				else if(identifier == 2) {
					System.out.println("dbAcc2님, 로그인되어있습니다.");
				}
				else if(identifier == -1) {
					System.out.println("==== 로그인 ====");
					System.out.println("계좌를 입력해주세요 : ");
					int loginAcc = scan.nextInt();
					System.out.println("비밀번호를 입력해주세요 : ");
					int loginPw = scan.nextInt();
					if(loginAcc == dbAcc1 && loginPw == dbPw1) {
						System.out.println("dbAcc1님, 로그인되었습니다.");
						identifier = 1;
					}
					else if(loginAcc == dbAcc2 && loginPw == dbPw2) {
						System.out.println("dbAcc2님, 로그인되었습니다.");
						identifier = 2;
					}
					else {
						System.out.println("계좌와 비밀번호를 확인해주세요.");
					}
				}
			}
			else if (sel == 2) {
				if(identifier == -1) {
					System.out.println("이미 로그아웃되어있습니다.");
				}
				else if(identifier == 1) {
					identifier = -1;
					System.out.println("dbAcc1님, 로그아웃되었습니다.");
				}
				else if(identifier == 2) {
					identifier = -1;
					System.out.println("dbAcc2님, 로그아웃되었습니다.");
				}
			}
			else if (sel == 3) {
				if(identifier == -1) {
					System.out.println("로그인 후 이용해주세요.");		
				}
				else {
					System.out.println("입금할 금액을 입력해주세요 : ");
					int deposit = scan.nextInt();
					if(identifier == 1) {
						dbMoney1 = dbMoney1 + deposit;
					}
					else if(identifier == 2) {
						dbMoney2 = dbMoney2 + deposit;
					}
					System.out.println("입금이 완료되었습니다.");
				}
			}
			else if (sel == 4) {
				if(identifier == -1) {
					System.out.println("로그인 후 이용해주세요.");
				}
				else {
					System.out.println("출금할 금액을 입력해주세요 : ");
					int withdraw = scan.nextInt();
					if(identifier == 1) {
						if(dbMoney1 >= withdraw) {
							dbMoney1 = dbMoney1 - withdraw;
							System.out.println("출금이 완료되었습니다.");
						}
						else {
							System.out.println("출금할 금액이 부족합니다.");
						}
					}
					else if(identifier == 2) {
						 if(dbMoney2 >= withdraw) {
							 dbMoney2 = dbMoney2 - withdraw;
							 System.out.println("출금이 완료되었습니다.");
						 }
						 else {
						 	System.out.println("출금할 금액이 부족합니다.");
						 }
					}
				}
			}
			else if (sel == 5) {
				if(identifier == -1) {
					System.out.println("로그인 후 이용해주세요.");
				}
				else if(identifier == 1) {
					System.out.println("이체할 계좌번호를 입력해주세요 : ");
					int transAcc = scan.nextInt();
					if(transAcc == dbAcc2) {
						System.out.println("이체할 금액을 입력해주세요 : ");
						int transMoney = scan.nextInt();
						if(dbMoney1 >= transMoney) {
							dbMoney1 = dbMoney1 - transMoney;
							dbMoney2 = dbMoney2 + transMoney;
							System.out.println("이체가 완료되었습니다.");						
						}
						else {
							System.out.println("이체할 금액이 부족합니다.");
						}
					}
					else {
						System.out.println("이체할 계좌를 확인해주세요.");
					}			
				}
				else if(identifier == 2) {
					System.out.println("이체할 계좌번호를 입력해주세요 : ");
					int transAcc = scan.nextInt();
					if(transAcc == dbAcc1) {
						System.out.println("이체할 금액을 입력해주세요 : ");
						int transMoney = scan.nextInt();
						if(dbMoney2 >= transMoney) {
							dbMoney2 = dbMoney2 - transMoney;
							dbMoney1 = dbMoney1 + transMoney;
							System.out.println("이체가 완료되었습니다.");						
						}
						else {
							System.out.println("이체할 금액이 부족합니다.");
						}
					}
					else {
						System.out.println("이체할 계좌를 확인해주세요.");
					}			
				}
				
			}
			else if (sel == 6) {
				if(identifier == -1) {
					System.out.println("로그인 후에 이용해주세요.");
				}
				else if(identifier == 1) {
					System.out.println("dbAcc1님 현재 잔액 : " + dbMoney1 +  " 원 ") ;
				}
				else if(identifier == 2) {
					System.out.println("dbAcc2님 현재 잔액 : " + dbMoney2 +  " 원 ") ;
				}
			}
			else if (sel == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}
	
		scan.close();
		
	}

}
