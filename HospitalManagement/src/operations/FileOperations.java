package operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import bean.Patient;

public class FileOperations {
	
	public static void writeToFile(List<Patient> PatientList)
	{
		OutputStream ops = null;
		ObjectOutputStream objOps = null;

		try 
		{
			ops = new FileOutputStream("F:\\PatientFile.txt");
			objOps = new ObjectOutputStream(ops);
			objOps.writeObject(PatientList);
			objOps.flush();
		}

		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally {
				try {
					if (objOps != null)
						objOps.close();
					} 
				catch (Exception ex)
				{
				ex.printStackTrace();
				}
				}
	}
	
	public static ArrayList<Patient> readFromFile() throws IOException
	{
		ArrayList<Patient> woi = new ArrayList<>();
		FileInputStream fis =null;
		ObjectInputStream ois=null;

		try {
				fis = new FileInputStream("F:\\PatientFile.txt");
			    ois = new ObjectInputStream(fis);
			
			woi = (ArrayList<Patient>) ois.readObject();	
			} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally 
		{
		    	fis.close();
		    	ois.close();
		}
		return woi;
	}


}
