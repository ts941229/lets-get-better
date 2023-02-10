package programmers;

public class CodeOfTwo {
	
	public static void main(String[] args) {
		
		System.out.println("answer : "+solution("aukks", "wbqd", 5));
		
	}
	
	public static String solution(String s, String skip, int index) {
		
		String answer = "";
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		
		for(int i=0; i<s.length(); i++) {
			Character.toString(s.charAt(i));
			int j = 0;
			
			while(true) {
				if(Character.toString(s.charAt(i)).equals(alphabet[j])) {
					break;
				}
				j++;
			}
			
//			System.out.println("j : "+j);
			
			int check = 0;
			
			for(int k=j; k<j+index; k++) {
				if(k>(alphabet.length-1)) {
					k=k-(alphabet.length);
				}
				
				for(int l=0; l<skip.length(); l++) {
					if(alphabet[k].equals(Character.toString(skip.charAt(l)))) {
						check++;
					}
				}
				
			}
			
			
			System.out.println("j+index+check : "+(j+index+check));
//			System.out.println("j : "+j);
//			System.out.println("index : "+index);
//			System.out.println("check : "+check);
			
			if((j+index+check)>(alphabet.length-1)) {
				
				answer+=alphabet[((j+index+check)-(alphabet.length))];
				
			}else {
				answer+=alphabet[j+index+check];
			}
			
		}
		
		return answer;
	}
	
	
}
