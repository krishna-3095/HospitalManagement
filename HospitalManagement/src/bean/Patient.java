package bean;

import java.io.Serializable;
import java.util.Date;

public class Patient implements Serializable
{
		String name;
		int patientId;
		String gender;
		int age;
		String address;
		long phoneno;
		String bloodgroup;
		Date joindate;
		String disease;
		String symptoms;
		String medicine;
		
		public Patient() {}
		
		public Patient(String name, int patientId, String gender, int age, String address, long phoneno,
				String bloodgroup, Date joindate, String disease, String symptoms, String medicine) {
			super();
			this.name = name;
			this.patientId = patientId;
			this.gender = gender;
			this.age = age;
			this.address = address;
			this.phoneno = phoneno;
			this.bloodgroup = bloodgroup;
			this.joindate = joindate;
			this.disease = disease;
			this.symptoms = symptoms;
			this.medicine = medicine;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPatientId() {
			return patientId;
		}
		public void setPatientId(int patientId) {
			this.patientId = patientId;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public long getPhoneno() {
			return phoneno;
		}
		public void setPhoneno(long l) {
			this.phoneno = l;
		}
		public String getBloodgroup() {
			return bloodgroup;
		}
		public void setBloodgroup(String bloodgroup) {
			this.bloodgroup = bloodgroup;
		}
		public Date getJoindate() {
			return joindate;
		}
		public void setJoindate(Date joindate) {
			this.joindate = joindate;
		}
		public String getDisease() {
			return disease;
		}
		public void setDisease(String disease) {
			this.disease = disease;
		}
		public String getSymptoms() {
			return symptoms;
		}
		public void setSymptoms(String symptoms) {
			this.symptoms = symptoms;
		}
		public String getMedicine() {
			return medicine;
		}
		public void setMedicine(String medicine) {
			this.medicine = medicine;
		}

		
		
		
		
		
		
		
	

}
