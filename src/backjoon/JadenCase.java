package backjoon;

public class JadenCase {
	public static void main(String[] args) {
		Solution3 solution3 = new Solution3();
		
		solution3.solution("for the last week");
		System.out.println(solution3.solution("for the last week"));
	}
}

class Solution3 {
    public String solution(String s) {
    	String[] s_array = s.split(" ");
    	String a = "";
    	
    	for(int i=0; i<s_array.length; i++) {
    		a+=Character.toString(s_array[i].charAt(0)).toUpperCase();
    		for(int j=1; j<s_array[i].length(); j++) {
				a+=Character.toString(s_array[i].charAt(j)).toLowerCase();
    		}
    		if(i<s_array.length-1) {
    			a+=" ";
    		}
    	}
    	
        return a;
    }
}
