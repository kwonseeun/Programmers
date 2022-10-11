package Test;

import java.util.Scanner;

public class P_직사각형_별찍기2 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        for (int c = 0; c < b; c++){
	            for(int d = 0;d < a;d++){
	                System.out.printf("*");
	            }
	            System.out.println();
	        }
	    }
}
