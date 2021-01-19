package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 영수증 출력[1단계]
 * 
 * 1. 메뉴판을 출력한다.
 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
 * 3. 현금을 입력받는다.
 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
 */

// 2020.12.11   2:09-2:15
public class IfEx11_내정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우   버거 : " + price2 + "원");
		System.out.println("3.콜       라 : " + price3 + "원");

		System.out.print("주문할 메뉴의 번호를 입력하세요 : ");
		int menu = scan.nextInt();
		
		System.out.print("현금을 입력해주세요 : ");
		int money = scan.nextInt();
		
		if(menu == 1) {
			if(money >= price1) {
				System.out.println("==== 영수증 ====");
				System.out.println("입력하신 현금 : " +  money + "원");
				System.out.println("메뉴 가격 : " + price1 + "원");
				System.out.println("거스름 돈 : " + (money - price1) + "원");
			}
			if(money < price1) {
				System.out.println("현금이 부족합니다.");
			}
		}
	
		
		if(menu == 2) {
			if(money >= price2) {
				System.out.println("==== 영수증 ====");
				System.out.println("입력하신 현금 : " +  money + "원");
				System.out.println("메뉴 가격 : " + price2 + "원");
				System.out.println("거스름 돈 : " + (money - price2) + "원");
			}
			if(money < price2) {
				System.out.println("현금이 부족합니다.");
			}
		}
		if(menu == 3) {
			if(money >= price3) {
				System.out.println("==== 영수증 ====");
				System.out.println("입력하신 현금 : " +  money + "원");
				System.out.println("메뉴 가격 : " + price3 + "원");
				System.out.println("거스름 돈 : " + (money - price3) + "원");
			}
			if(money < price3) {
				System.out.println("현금이 부족합니다.");
			}
		}
		
		scan.close();
	}

}
