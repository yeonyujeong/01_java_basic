package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 지하철 요금 계산
 * 
 * 1. 이용할 정거장 수를 입력받는다.
 * 2. 다음과 같이 정거장 수에 따라 요금이 정산된다.
 * 3. 요금표
 * 1) 1~5	: 500원
 * 2) 6~10	: 600원
 * 3) 11,12 : 650원 (10정거장이후는 2정거장마다 50원추가)  ! 여기서부터는 일일이 지정이 아닌 계산식으로 필요함.
 * 4) 13,14 : 700원 (10정거장이후는 2정거장마다 50원추가)
 * 5) 15,16 : 750원 (10정거장이후는 2정거장마다 50원추가)
 * ... 
 */

public class IfEx23_내정답 {

	public static void main(String[] args) { // 2020.12.14  2:20 - 2:27
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("이용할 정거장 수를 입력하세요 : ");
		int getNum = scan.nextInt();
		
		int fee = 0;
		
		if(getNum >=1 && getNum <=5) {
			fee = 500;
		}
		else if(getNum >= 6 && getNum <= 10) {
			fee = 600;
		}
		else if(getNum > 10) {
			int overNum = ( getNum - 9 ) / 2;
			fee = 600 + ( 50 * overNum );
		}
		
		System.out.println("요금 : " + fee + "원");
		
		
		
		scan.close();
	}

}
