package backjoon;

import java.util.Scanner;

public class OvenTimer {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int startH = in.nextInt();
		int startM = in.nextInt();
		int timeToNeed = in.nextInt();
		
		int key = (startM+timeToNeed)/60;
		
		if(key>=1) {
			if(startH+key>=24) {
				System.out.println(((startH+key)-24)+" "+((startM+timeToNeed)-(60*key)));
			}else {
				System.out.println((startH+key)+" "+((startM+timeToNeed)-(60*key)));
			}
			
		}else {
			System.out.println(startH+" "+(startM+timeToNeed));
		}
		
		
	}
}
