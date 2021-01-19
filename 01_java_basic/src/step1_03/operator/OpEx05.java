package step1_03.operator;
/*
 * # 논리 연산자
 * 
 * 		&& (and)  : 양쪽 모두 다 참이어야 최종적으로 참
 * 					Ex ) 무주택 세대주이어야 '하고' 연봉이 3400 미만이어야 한다.
 * 
 * 		|| (or)   : 어느 한쪽이라도 참이면 최종적으로 참
 * 					Ex ) 무주택 세대주 '이거나' 연봉이 3400 미만이어야 한다.
 * 
 * 		!  (not)  : 부정 (true > false , false > true )
 * 					
 * 
 * 		[ 중요 ] 
 * 
 * 		- 논리 연산자의 결과도 참(true) 또는 거짓(false) 이다.
 * 
 * 
 * */
public class OpEx05 {

	public static void main(String[] args) {
		
		System.out.println(10 == 10 && 3 == 3);
		System.out.println(10 != 10 && 3 == 3);
		System.out.println(10 == 10 && 3 != 3);
		System.out.println(10 != 10 && 3 != 3);
		
		System.out.println();
		
		
		System.out.println(10 == 10 || 3 == 3);
		System.out.println(10 != 10 || 3 == 3);
		System.out.println(10 == 10 || 3 != 3);
		System.out.println(10 != 10 || 3 != 3);
		
		System.out.println();
		
		System.out.println( !(10 == 10 ));
		System.out.println( !(10 != 10 ));
		

	}

}
