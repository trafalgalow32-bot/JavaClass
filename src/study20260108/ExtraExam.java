package study20260108;

import java.util.Arrays;

public class ExtraExam {

	public static void main(String[] args) {
		/* 문제1. 학원 관리 시스템에서 월별 매출 데이터를 배열로 관리하고 있다. 
		int[] monthlySales = {1200,950,1430,800,1600,1700,900,1100,1550,1800,1300,2000};
		(1월 ~ 12월 순서, 단위 : 만원)
		*/
		
		System.out.println("===========문제1===========");
		int[] monthlySales = {1200,950,1430,800,1600,1700,900,1100,1550,1800,1300,2000};
		int yearlySales = 0; // 연간 총 매출
		int monthlyAvgSales = 0;  // 월 평균 매출(정수)
		int maxSales = monthlySales[0]; // 최고 매출 월과 금액
		int minSales = monthlySales[0]; // 최저 매출 월과 금액
		// don't forget : 평균 이상 매출인 월의 개수
		
		for(int i=0; i < monthlySales.length ; i++) {
			yearlySales += monthlySales[i];
			monthlyAvgSales = yearlySales / monthlySales.length;
			if(monthlySales[i]>maxSales) maxSales = monthlySales[i];
			if(monthlySales[i]<minSales) minSales = monthlySales[i];
			// 최고 매출 월과 금액... 금액까지야 구했다만.... 월 환산이 어렵구만....
		}
		for(int i=0; i < monthlySales.length ; i++) {
			if(monthlySales[i]==maxSales) {
				System.out.println(maxSales+"만 원");
			}if(monthlySales[i]==minSales) {
				System.out.println(minSales+"만 원");
			}
		}
		
		int maxMonth = Arrays.asList(monthlySales).indexOf(maxSales);
		int minMonth = Arrays.asList(monthlySales).indexOf(minSales);
				
		System.out.println(yearlySales +" " +monthlyAvgSales+" "+maxSales+" "+minSales);
		System.out.println(maxMonth+" "+minMonth);
		
	}

}
