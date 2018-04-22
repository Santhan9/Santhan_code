package Firstclass;

import java.util.Scanner;

public class table_programe {

	public static void main(String[] args) {
		
		
		Scanner s= new Scanner(System.in);
		
		int a =s.nextInt();
		
		System.out.println(a);
		
		for(int i=1;i<=10;i++) {
			
			//int k= a*i;
			
			System.out.println(a+" *"+i+" ="+a*i);
		}

	}

}
