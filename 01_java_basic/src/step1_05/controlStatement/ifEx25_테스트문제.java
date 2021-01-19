package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
	==== 가위 바위 보 (하나빼기) ====
	
 	0 : 가위 , 1 : 바위 , 2 : 보
 	
	1) 가위바위보 2개씩 저장
	meLeft 에 가위바위보 입력
	meRight 에 가위바위보 입력
	
	comLeft에 가위바위보 입력  (랜덤)
	comRight에 가위바위보 입력 (랜덤)
	
	2) 둘중 하나만 저장 
	meFinal에  meLeft 또는 meRight 저장   (직접)
	comFinal에 comLeft 또는 comRight 저장 (랜덤)
	
	3) 최종판정
*/
public class ifEx25_테스트문제 { //megaitteacherahn@gmail.com  

	public static void main(String[] args) {  //2020.12.15  3:16 - 3:34
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		
		System.out.println("가위(0) , 바위(1) , 보(2)");
		System.out.print("왼손 입력 : ");
		int meLeft = scan.nextInt();
		
		System.out.print("오른손 입력 : ");
		int meRight = scan.nextInt();
		
		int comLeft = ran.nextInt(3);
		int comRight = ran.nextInt(3);
		
	
		System.out.print("나의 왼손 : ");
		if(meLeft == 0){
			System.out.println("가위(0)");
		}
		else if(meLeft == 1){
			System.out.println("바위(1)");
		}
		else if(meLeft == 2){
			System.out.println("보(2)");
		}
		
		System.out.print("나의 오른손 : ");
		if(meRight == 0){
			System.out.println("가위(0)");
		}
		else if(meRight == 1){
			System.out.println("바위(1)");
		}
		else if(meRight == 2){
			System.out.println("보(2)");
		}
		
		
		System.out.print("상대방 왼손 : ");
		if(comLeft == 0){
			System.out.println("가위(0)");
		}
		else if(comLeft == 1){
			System.out.println("바위(1)");
		}
		else if(comLeft == 2){
			System.out.println("보(2)");
		}
		
		System.out.print("상대방 오른손 : ");
		if(comRight == 0){
			System.out.println("가위(0)");
		}
		else if(comRight == 1){
			System.out.println("바위(1)");
		}
		else if(comRight == 2){
			System.out.println("보(2)");
		}
		
		System.out.println("왼손 오른손 중 하나만 선택하세요 : 왼손(0) , 오른손(1)");
		int choice = scan.nextInt();
		int meFinal = -1;
		int comFinal = -1;
		if(choice == 0) {
			 meFinal = meLeft;
		}
		else if(choice == 1) {
			 meFinal = meRight;
		}
		
		int rChoice = ran.nextInt(2);
		
		if(rChoice == 0) {
			 comFinal = comLeft;
		}	
		else if(rChoice == 1) {
			 comFinal = comRight;
		}
		
		System.out.print("최종 내손 : ");
		if(meFinal == 0) {
			System.out.println("가위(0)");
		}
		else if(meFinal == 1) {
			System.out.println("바위(1)");
		}
		else if(meFinal == 2) {
			System.out.println("보(2)");
		}
		
		System.out.print("최종 상대손 : ");
		if(comFinal == 0) {
			System.out.println("가위(0)");
		}
		else if(comFinal == 1) {
			System.out.println("바위(1)");
		}
		else if(comFinal == 2) {
			System.out.println("보(2)");
		}
		
		
		if(meFinal == 0) {
			if(comFinal == 0) {
				System.out.println("비겼다!");
			}
			else if(comFinal == 1) {
				System.out.println("졌다!");
			}
			else if(comFinal == 2) {
				System.out.println("이겼다!");
			}
		}
		else if(meFinal == 1) {
			 if(comFinal == 0) {
			 	System.out.println("이겼다!");
			 }
			 else if(comFinal == 1) {
			 	System.out.println("비겼다!");
			 }
			 else if(comFinal == 2) {
			 	System.out.println("졌다!");
			 }
		}
		else if(meFinal == 2) {
			if(comFinal == 0) {
				System.out.println("졌다!");
			}
			else if(comFinal == 1) {
				System.out.println("이겼다!");
			}
			else if(comFinal == 2) {
				System.out.println("비겼다!");
			}
		}
		
		
	
		scan.close();
		
		

	}

}
