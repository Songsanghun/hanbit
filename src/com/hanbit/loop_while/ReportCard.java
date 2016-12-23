
package com.hanbit.loop_while;

import java.util.Scanner;

public class ReportCard {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("name : ");
		String name = s.next();
		System.out.println("If you want to stop, Type -1");
		int total = 0; int count = 0;
		while(true){
			System.out.println("score : ");
			int score = s.nextInt();
			count = count+1;
			if(score==-1){break;}
			total = total + score;
		} 
		int average = total / 3;
		char grade = 0;
		if(average >=90){
			grade = 'A';			
		}else if(average >=80){
			grade = 'B';
		}else if(average >=70){
			grade = 'C';
		}else{
			grade = 'D';
		}
		
		System.out.println("name : "+name);
		System.out.println("Total : "+total);
		System.out.println("Average : "+average);
		System.out.println("Grade :"+grade);
	}
}
