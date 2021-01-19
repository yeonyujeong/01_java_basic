package step1_03.operator;

public class OpEx04_내정답 {

	public static void main(String[] args) {
		
		//예) 점수가 60점 이상이면 true 출력
        int score = 30;
        System.out.println(score >= 60);
        
        
        //문제1) 15가 3의 배수이면 true 출력
        //힌트) 숫자를 3으로 나눈 나머지가 0이면 3의 배수
        
        int number = 15;
        int divisionNum = 3;
        int rest = number % divisionNum;
        System.out.println(rest == 0);
        
        
        //문제2) 100이 짝수이면 true 출력
        //힌트) 숫자를 2로 나눈 나머지가 0이면 짝수
        //      숫자를 2로 나눈 나머지가 1이면 홀수

        number = 100;
        divisionNum = 2;
        rest = number % divisionNum;
        System.out.println(rest == 0);

      //문제3)아래돈중 1000원짜리 이상화폐를 제외한 1000원짜리가 3장 이상이면 true 출력
        int money = 178600;
        
        int fivemanWon = 50000;
        int manWon = 10000;
        int fivecheonWon = 5000;
        int cheonWon = 1000;
        
        int numCheonwon = money % fivemanWon % manWon % fivecheonWon / cheonWon;
        
        System.out.println(numCheonwon >= 3);

        
	}

}
