package com.hanbit.matrix;

import java.util.Scanner;

public class MoneyArray {
	/**
	 * 금액을 입력받은 후 우리나라 화폐종류별로 해당 갯수를 표기하는 프로그램 [요구사항] 금융업을 하는 고객사로부터 프로그램 개발요청이
	 * 들어왔습니다. 금액을 입력받은 후 우리나라 화폐종류별로 해당 갯수를 표기하는 프로그램입니다. 예를들어, 125,520 원을 입력하면
	 * 화면에 이렇게 보이게 하면 됩니다. 표시하고 10원미만은 절삭
	 ******************************************************
	 * 요청금액 : 126520 원 5만원 : 2매 1만원 : 2매 5천원 : 1매 1천원 : 1매 5백원 : 1개 백원 : 0개 오십원
	 * : 0개 십원 : 2개
	 ********************************************************
	 */
	public static void main(String[] args) {

		System.out.println("금액을 입력하세요");

		Scanner s = new Scanner(System.in);

		int money = s.nextInt();

		int[] moneyUnit = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		String temp = "";
		int mok = 0, nmg = 0; 
		System.out.println("Money:" + money + "원");

		for (int i = 0; i < moneyUnit.length; i++) {
			mok = money / moneyUnit[i];
			nmg = money % moneyUnit[i];
			money = nmg;
			temp += moneyUnit[i] + "원" + "\t" + mok + "개" + ",";
			/*switch(i){
        	case 0:
            mok=money/moneyUnit[i];
            nmg=money%moneyUnit[i];break;
            case 1:
        		mok=nmg/moneyUnit[i];
        		money=nmg;
        		nmg=money%moneyUnit[i];break;
        	case 2:
        		mok=nmg/moneyUnit[i];
        		money=nmg;
        		nmg=money%moneyUnit[i];break;
        	case 3:
        		mok=nmg/moneyUnit[i];
        		money=nmg;
        		nmg=money%moneyUnit[i];break;
        	case 4:
        		mok=nmg/moneyUnit[i];
        		money=nmg;
        		nmg=money%moneyUnit[i];break;
        	case 5:
        		mok=nmg/moneyUnit[i];
        		money=nmg;
        		nmg=money%moneyUnit[i];break;
        	case 6:
        		mok=nmg/moneyUnit[i];
        		money=nmg;
        		nmg=money%moneyUnit[i];break;
        	case 7:
        		mok=nmg/moneyUnit[i];
        		money=nmg;
        		nmg=money%moneyUnit[i];break;}
        		temp+=moneyUnit[i]+"원"+"\t"+mok+"개"+"\t";
            		   
        }*/
		}
		
		System.out.printf(temp);
	}
}