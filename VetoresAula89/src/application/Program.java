package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rooms;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rooms[] vect = new Rooms[10];
		
		System.out.printf("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i = 1; i < n + 1 ; i++) {
			System.out.println();		
			System.out.println("Rent #" + i + ": ");
			System.out.printf("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Email: ");
			String email = sc.nextLine();
			System.out.printf("Room: ");
			int room = sc.nextInt();
			vect[room] = new Rooms(name, email);
		}
		
		
		System.out.println();
		System.out.println("Busy rooms:");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i].getName() + ", " + vect[i].getEmail()); 
			}
		}
	}

}
