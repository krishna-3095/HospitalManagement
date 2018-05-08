package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import operations.PatientOperations;

public class Main {

	public static void main(String[] args) throws IOException {
		char l;
		System.out.println("Select your choice \n 1.Doctor \n 2.Patient");
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		int choice1 = Integer.parseInt(br2.readLine());

		if (choice1 == 1) {
			do {
				PatientOperations p = new PatientOperations();
				System.out.println("Select \n 1 to register a Patient \n 2 to display Patient details \n 3 to display detials of a particular patient");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int choice = Integer.parseInt(br.readLine());

				switch (choice) {
				case 1:
					p.registerPatient();
					break;
					
				case 2:
					p.displayAllPatientDetails();
					break;
					
				case 3:
					p.displaySpecifiedPatient();
					break;
					
				default:
					System.out.println("Wrong entry..Try again");
					break;
				}

				System.out.println("Do you want to continue selecting options (y/n):");
				l = (char) br.read();
			} while (l == 'y');

		}
		if (choice1 == 2) {
			do {
				PatientOperations p = new PatientOperations();
				System.out.println("Select \n 1 to view prescriptions \n 2 to view disharge summary");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int choice = Integer.parseInt(br.readLine());

				switch (choice) {
				case 1:
					p.viewprescription();
					break;
				
				case 2:
					p.viewDishargeSummary();
					break;
				default:
					System.out.println("Wrong entry..Try again");
					break;
				}

				System.out.println("Do you want to continue selecting options (y/n):");
				l = (char) br.read();
			} while (l == 'y');

		}

	}
}