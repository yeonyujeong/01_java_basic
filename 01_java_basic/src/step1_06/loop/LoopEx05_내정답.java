package step1_06.loop;

import java.util.Scanner;

/*
 * # 영수증 출력[2단계]
 * 1. 5번 주문을 받는다.
 * 2. 주문이 끝난 후, 돈을 입력받는다.
 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
 * 
 * 예)
 * 메뉴 선택 : 1
 * 메뉴 선택 : 1
 * 메뉴 선택 : 2
 * 메뉴 선택 : 2
 * 메뉴 선택 : 3
 * 총 금액 = 31300원
 * 현금 입력 : 32000
 * === 롯데리아 영수증 ===
 * 1. 불고기 버거 : 2개
 * 2. 새우    버거 : 2개
 * 3. 콜         라 : 1개
 * 4. 총   금   액 : 31300원
 * 5. 잔         돈 : 700원
 */


public class LoopEx05_내정답 {

	public static void main(String[] args) { //2020.12.15  1:16 - 1:26
		
		Scanner scan = new Scanner (System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");

		int i = 0;
		int menu1 = 0;
		int menu2 = 0;
		int menu3 = 0;
		
		System.out.println("==== 주문 ====");
		
		while (i < 5) {
			System.out.print("메뉴 선택 : ");
			int getMenu = scan.nextInt();
			if(getMenu == 1) {
				menu1++;
			}
			
			else if(getMenu == 2) {
				menu2++;
			}
			
			else if(getMenu == 3) {
				menu3++;
			}
			i++;			
		}
		
		System.out.println("현금을 입력해주세요 : ");
		int getMoney = scan.nextInt();
		
		int totalPrice = price1*menu1 + price2*menu2 +price3*menu3;
		int change = getMoney - totalPrice;
		
		if(change >= 0 ) {
		System.out.println("==== 롯데리아 영수증 ====");
		System.out.println("1. 불고기 버거 : " + menu1 + "개");
		System.out.println("2. 새우   버거 : " + menu2 + "개");
		System.out.println("3. 콜       라 : " + menu3 + "개");
		System.out.println("4. 총   금  액 : " + totalPrice + "원");
		System.out.println("5. 잔       돈 : " + change + "원");
		}
		
		else {
			System.out.println("현금이 부족합니다.");
		}
		
		
		scan.close();
		
	}

}
