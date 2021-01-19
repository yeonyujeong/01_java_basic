package step1_02.variable;

// 산술 연산자 하고 와서 진행
public class VarEx02_내정답 {

	public static void main(String[] args) {
		
		//예) 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력 
		
		int cash = 1000;
		int snack = 200;
		int change = cash - snack;
		System.out.println("잔돈 = " + change + "원");
		
		//문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		
		int pay = 100;
		int year = 12;
		double tax = 0.9;
		System.out.println("연봉 =" + pay * year * tax + "원");
		
		//문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
		
		int scoreA = 30;
		int scoreB = 50;
		int scoreC = 4;
	    int numberPeople = 3;
	    int average = (scoreA + scoreB + scoreC) /numberPeople;
	    System.out.println("평균 = " + average + "점");
		
		//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		
	    int length = 6;
	    int width = 3;
	    int area = length * width / 2;
	    System.out.println("넓이 = " + area );
	    
		//문제4) 100초를 1분 40초로 출력
		
	    int min = 100 / 60;
	    int sec = 100 % 60;
	    
	    System.out.println("100초 = " + min + "분" + sec + "초");
	    
	    
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		//정답5) 500원(1개), 100원(3개) 

	    int coin500 = 800 / 500;
	    int coin100 = 800 % 500 / 100;
	    
	    System.out.println("500원짜리 = " + coin500 + "개, " + "100원짜리 =" + coin100 + "개");
	}

}
