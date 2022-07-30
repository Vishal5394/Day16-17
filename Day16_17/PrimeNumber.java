package com.BridgeLabz.Day16_17;

import java.util.Scanner;

		public class PrimeNumber {
		    public void primeNumber(int first , int second) {
		        int i , j , f;
		
		        for(i=first;i<=second;i++) {
		            if(i==0 || i==1)
		                continue;
		            f = 1;
		
		            for(j=2;j<=i/2;++j) {
		                if(i%j == 0) {
		                    f = 0;
		                    break;
		                }
		            }
		            if(f == 1)
		                System.out.print(i+" ");
		        }
		    }
		
		    public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		
		        System.out.print("Lower limit: ");
		        int first = sc.nextInt();
		
		        System.out.print("Upper limit: ");
		        int second = sc.nextInt();
		
		        PrimeNumber prime = new PrimeNumber();
		        prime.primeNumber(first,second);
		    }
		}
