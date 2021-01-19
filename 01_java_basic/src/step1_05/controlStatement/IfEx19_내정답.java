package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # ATM[1단계] : 이체하기
 * 
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 			myMoney   - 이체할 금액
 * 			yourMoney + 이체할 금액
 *    이체할 금액  > myMoney 	: 이체불가
 */

public class IfEx19_내정답 { //2020.12.14  1:20 - 1:25
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");
	
		System.out.println("이체할 계좌번호를 입력해주세요 : ");
		int getAcc = scan.nextInt();
		
		if(getAcc ==  yourAcc) {
			System.out.println("이체할 금액을 입력하세요 : ");
			int sendMoney = scan.nextInt();
			if(myMoney >= sendMoney) {
				myMoney = myMoney - sendMoney;
				yourMoney = yourMoney + sendMoney;
				System.out.println("이체 완료");
				System.out.println("myMoney : " + myMoney);
				System.out.println("yourMoney : " + yourMoney);
			}
			else {
				System.out.println("이체가 불가합니다.");
			}
			
		}
		else {
			System.out.println("계좌번호를 확인해주세요");
		}
		
		
		scan.close();
		
	}

}
