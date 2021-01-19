package step1_05.controlStatement;

import java.util.Random;

/*
 * # 랜덤 라이브러리 (if와 관련)
 * 
 * - 임의의 난수 (랜덤숫자)를 생성할 수 없다.
 * 
 * */

public class IfEx13 {

	public static void main(String[] args) {
		
		
		Random ran = new Random();
		// 0~9 까지의 랜덤값
		int rNum1 = ran.nextInt(10);
		System.out.println(rNum1);
		
		//100부터 200 사이의 랜덤값
		int rNum2 = ran.nextInt(101) + 100;  // [0~100] +100
		System.out.println(rNum2);
		
		//-3부터 3사이의 랜덤값
		int rNum3 = ran.nextInt(7) -3 ;
		System.out.println(rNum3);

		
		    
	}

}
