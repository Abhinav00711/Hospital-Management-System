package FileUtils;

import DataModel.Doctor;

import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets; 
import java.nio.file.*; 

public class DoctorFile{
	public boolean IsAuthenticateDoctor(String id, String password){
		File user = new File("DUserList.txt");
		if(user.exists()){
			try{
				Scanner read = new Scanner(user);
                read.useDelimiter(",");
				while(read.nextLine() !=null){
                      String username = read.next();
                      String pass = read.next();
                      if(id.equals(username) && password.equals(pass)){
                         return true;                
                      }
                   }
			} catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}
		}
		return false;
	}
	
	public void UpdateStatus(String id, String s){
		File status = new File(id.concat("_Status.txt"));
		try {
			FileWriter fw = new FileWriter(status);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(s);
			bw.close();
			fw.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			status.delete();
			e.printStackTrace();
		}
	}
	
	public String GetStatus(String id){
		String status;
		try{
			File st = new File(id.concat("_Status.txt"));
			if(st.exists()) {
				Scanner s = new Scanner(st);
				status = s.nextLine();
				s.close();
				return status;
			} else {
				System.out.println("Account does not exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return "";
	}
	
	public List<String> GetDoctorList(){
		File list = new File("DoctorList.txt");
		if(list.exists()){
			List<String> lines = Collections.emptyList(); 
			try
			{
			  lines = Files.readAllLines(Paths.get(list.getPath()), StandardCharsets.UTF_8); 
			} catch (IOException e) 
			{
			  e.printStackTrace(); 
			} 
			return lines;
		}
		return Collections.emptyList();
	}
	
	public Doctor GetDetails(String id){
		String name;
		int phone;
		String address;
		String speciality;
		String status;
		try{
			File doctor = new File(id.concat(".txt"));
			if(doctor.exists()) {
				Scanner d = new Scanner(doctor); 
				name = d.nextLine();
				phone = d.nextInt();
				address = d.nextLine();
				speciality = d.nextLine();
				d.close();
				status = GetStatus(id);
				return new Doctor(id, name, phone, address, speciality, status);
			} else {
				System.out.println("Account does not exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return null;
	}
}
