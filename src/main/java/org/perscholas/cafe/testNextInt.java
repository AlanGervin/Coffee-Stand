package org.perscholas.cafe;

import java.util.Scanner;

public class testNextInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int exit = 4;
		String read = "";
		Scanner in = new Scanner(System.in);
		
		while (exit != 1) {
			exit = in.nextInt();
			in.nextLine();
			read = in.nextLine();
			if(exit == 1) {
				break;
			}
		}
		in.close();
	}

}
