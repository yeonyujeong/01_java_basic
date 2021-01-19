package step1_06.loop;

import java.util.Random;

/*
 * # 랜덤학생
 * 
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 * 
 */

public class LoopEx15_내정답 { // 2020.12.16  1:39 - 1:48

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int i  = 1;
		int totalScore = 0;
		int cnt = 0;
		int maxScore = 0;
		int maxNum = 0;
		
		
		while(i<=10) {
			
			int score = ran.nextInt(100) +1;
			System.out.println(i + "번 학생 점수 : " + score + "점");
			if(score >= 60) {
				cnt++;
				System.out.println("합격!");
			}
			else {
				System.out.println("불합격!");
			}
			if(score > maxScore) {
				maxScore = score;
				maxNum = i;
			}
			
			totalScore = totalScore + score;	
			i++;
			System.out.println();
		}
		
		double average = totalScore / 10.0;
		
		System.out.println("합격자 수 :" + cnt + "명");
		System.out.println("총점 : " +  totalScore + "점");
		System.out.println("평균 : " + average + "점");
		System.out.println("1등학생의 번호 : " + maxNum + "번");
		System.out.println("1등학생의 점수 : " + maxScore + "점");
		
		
	}

}
