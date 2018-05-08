package operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import bean.Patient;

public class PatientOperations {

	List<Patient> PatientList = new ArrayList<Patient>();
	ArrayList<Patient> woi = new ArrayList<>();

	
	Scanner readInput = new Scanner(System.in);
	Scanner sc = new Scanner(System.in);

	public void registerPatient() 
	{	
		System.out.println("Enter no of patients");
		int num=sc.nextInt();
		
		for (int i = 0; i < num; i++) 
		{
			Patient patient = new Patient();
			
			System.out.println("Please enter the name of new patient: ");
			patient.setName(readInput.nextLine());
	
			System.out.println("Please enter ID of new patient: ");
			patient.setPatientId(sc.nextInt());
	
			System.out.println("Please enter the gender of new patient: ");
			patient.setGender(readInput.nextLine());
	
			System.out.println("Please enter the age of the new patient: ");
			patient.setAge(sc.nextInt());
	
			System.out.println("Please enter the address of the new patient: ");
			patient.setAddress(readInput.nextLine());
	
			System.out.println("Please enter the phone number of the new patient: ");
			patient.setPhoneno(sc.nextLong());
	
			System.out.println("Please enter the blood group of the new patient: ");
			patient.setBloodgroup(readInput.nextLine());
	
			Date date = java.util.Calendar.getInstance().getTime();
			patient.setJoindate(date);
	
			System.out.println("Please enter the disease of the new patient: ");
			patient.setDisease(readInput.nextLine());

			System.out.println("Please enter the symptom of the new patient: ");
			patient.setSymptoms(readInput.nextLine());
	
			System.out.println("Please enter the medicine of the new patient: ");
			patient.setMedicine(readInput.nextLine());
			
			System.out.println("Thankyou for entering patient details");
	
			PatientList.add(patient);		
			
		}
		
		FileOperations.writeToFile(PatientList);
		
	}

	
	public void displayAllPatientDetails() throws IOException {
		
		woi=FileOperations.readFromFile();

		System.out.println(
				"Patient Name \t Patient ID \t Address \t Age \t BloodGroup \t illness \t Gender \t Medicine \t Phone no \t Symptoms \t Joined date ");

		for (int i = 0; i < woi.size(); i++) {
			System.out.println(woi.get(i).getName() + " \t " + woi.get(i).getPatientId() + " \t\t "
					+ woi.get(i).getAddress() + " \t\t " + woi.get(i).getAge() + " \t " + woi.get(i).getBloodgroup()
					+ " \t\t " + woi.get(i).getDisease() + " \t\t " + woi.get(i).getGender() + " \t\t "
					+ woi.get(i).getMedicine() + " \t\t " + woi.get(i).getPhoneno() + " \t\t "
					+ woi.get(i).getSymptoms() + " \t\t " + woi.get(i).getJoindate());
		}
	}

	
	public void displaySpecifiedPatient() throws NumberFormatException, IOException {
		System.out.println("Enter patient ID you want to display:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int idnum = Integer.parseInt(br.readLine());
		
		woi=FileOperations.readFromFile();
		
		for(int i=0;i<woi.size();i++){
	           if(woi.get(i).getPatientId()==idnum)
	           {
	        	   System.out.println(
	       				"Patient Name \t Patient ID \t Address \t Age \t BloodGroup \t illness \t Gender \t Medicine \t Phone no \t Symptoms \t Joined date");
	        	   System.out.println(woi.get(i).getName() + " \t " + woi.get(i).getPatientId() + " \t\t "
	   					+ woi.get(i).getAddress() + " \t\t " + woi.get(i).getAge() + " \t " + woi.get(i).getBloodgroup()
	   					+ " \t\t " + woi.get(i).getDisease() + " \t\t " + woi.get(i).getGender() + " \t\t "
	   					+ woi.get(i).getMedicine() + " \t\t " + woi.get(i).getPhoneno() + " \t\t "
	   					+ woi.get(i).getSymptoms() + " \t\t " + woi.get(i).getJoindate());
	        	  break;
	           }
	           else System.out.println("No such entry");	          
		}  
	}

	
	public void viewprescription() throws NumberFormatException, IOException {
		System.out.println("Enter patient ID you want to display:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int idnum = Integer.parseInt(br.readLine());
		
		woi=FileOperations.readFromFile();
		
		for(int i=0;i<woi.size();i++){
	           if(woi.get(i).getPatientId()==idnum)
	           {
	        	   System.out.println(
	       				"Patient Name \t illness \t Medicine \t Symptoms");
	        	   System.out.println(woi.get(i).getName() +  " \t\t "
	   					+ woi.get(i).getDisease() + " \t\t "
	   					+ woi.get(i).getMedicine() + " \t\t " 
	   					+ woi.get(i).getSymptoms());
	        	  break;
	           }
	           else System.out.println("No such entry");

	          
		}  

	}


	public void viewDishargeSummary() throws NumberFormatException, IOException {
		System.out.println("Enter patient ID you want to display:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int idnum = Integer.parseInt(br.readLine());
		woi=FileOperations.readFromFile();
		
		for(int i=0;i<woi.size();i++){
	           if(woi.get(i).getPatientId()==idnum)
	           {
	        	      System.out.println(" Patient Name \t\t " +woi.get(i).getName() + " \n Patient ID \t\t" + woi.get(i).getPatientId() + "\n" 
		   					+ " Address \t\t" + woi.get(i).getAddress() + " \n Age\t\t\t" + woi.get(i).getAge() + " \n BloodGroup \t\t" + woi.get(i).getBloodgroup()
		   					+ " \n Disease\t\t " + woi.get(i).getDisease() + " \n Gender\t\t\t " + woi.get(i).getGender() + "\n Medicines\t\t "
		   					+ woi.get(i).getMedicine() + " \n Phone no\t\t " + woi.get(i).getPhoneno() + " \n Symptoms\t\t "
		   					+ woi.get(i).getSymptoms() + " \n Joined Date\t\t " + woi.get(i).getJoindate()+"\n");
		        	  break;
		           }
		           else System.out.println("No such entry");

	          
		}  		
	}

}
