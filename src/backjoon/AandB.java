package backjoon;

import java.util.Scanner;

public class AandB {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		String t = in.nextLine();
		
		boolean flag = false;
		
		while(true) {
			if(t.charAt(t.length()-1)=='A') {
				t = t.substring(0, t.length()-1);
			}else if(t.charAt(t.length()-1)=='B'){
				t = t.substring(0, t.length()-1);
				t = reverse(t);
			}
			
			if(t.equals(s)) {
				flag = true;
				break;
			}
			
			if(s.length()>t.length()) {
				break;
			}
		}
		
		if(flag) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	}
	
	public static String reverse(String str) {
		String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
		return reverse;
	}
	
}
