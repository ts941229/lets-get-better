package question;

import java.util.Scanner;

public class CheckAttendance {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int time = 0;
		
		for(int i=0; i<5; i++) {
			time = time + getTime(sc.nextLine());
		}
		
		System.out.println(time);
		
	}
	
	public static int getTime(String workTime) {
		int HH = 0;
		int MM = 0;
		
		String[] attendance = workTime.split(" ");
		
		String[]start =  attendance[0].split(":");
		String[]end =  attendance[1].split(":");
		
		int startHH = Integer.parseInt(start[0]); 
		int startMM = Integer.parseInt(start[1]); 
		int endHH = Integer.parseInt(end[0]); 
		int endMM = Integer.parseInt(end[1]);
		
		if((endHH-startHH)<0) {
			HH = (endHH+24)-startHH;
		}else {
			HH = endHH-startHH;
		}
		
		if((endMM-startMM)<0) {
			HH = HH - 1;
			MM = (endMM+60)-startMM;
		}else {
			MM = endMM-startMM;
		}
		
		return (HH*60) + MM;
	}
	
}

