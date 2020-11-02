package FileUtils;

import DataModel.Patient;

import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets; 
import java.nio.file.*; 

public class PatientFile{
	public void addPatient(Patient p,String password){
		String id = p.getId();
		try{
			File patient = new File(id.concat(".txt"));
			if(patient.createNewFile()) {
				try {
					FileWriter fw = new FileWriter(patient);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write(p.getName() + "\n" + p.getPhone() + "\n" + p.getGender() + "\n" + p.getAddress() + "\n" + p.getState() + "\n" + password);
					bw.close();
					fw.close();
					UpdateStatus(id,"FREE");
					AddPatientList(id);
					System.out.println("Account Created");
				} catch (IOException e) {
					System.out.println("An error occurred.");
					patient.delete();
					e.printStackTrace();
				}
			} else {
				System.out.println("Account already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	
	public boolean IsAuthenticatePatient(String id, String password){
		File user = new File(id.concat(".txt"));
		if(user.exists()){
			try{
				Scanner read = new Scanner(user);
                String pass;
				pass = read.nextLine();
				pass = read.nextLine();
				pass = read.nextLine();
				pass = read.nextLine();
				pass = read.nextLine();
				pass = read.nextLine();
                if(password.equals(pass)){
                   return true;                
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
	
	public void UpdateStatus(String id, String s, String Did){
		File status = new File(id.concat("_Status.txt"));
		try {
			FileWriter fw = new FileWriter(status);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(s + "\n" + Did);
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
	
	public String GetDid(String id){
		String did = "";
		try{
			File st = new File(id.concat("_Status.txt"));
			if(st.exists()) {
				Scanner s = new Scanner(st);
				did = s.nextLine();
				did = s.nextLine();
				s.close();
				return did;
			} else {
				System.out.println("Account does not exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return did;
	}
	
	public void AddPatientList(String id){
		try {
			File list = new File("PatientList.txt");
			if(!list.exists()){
				list.createNewFile();
			}
			try {
					FileWriter fw = new FileWriter(list,true);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write(id);
					bw.close();
					fw.close();
			} catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	
	public List<String> GetPatientList(){
		File list = new File("PatientList.txt");
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
	
	public Patient GetDetails(String id){
		String name;
		String phone;
		String gender;
		String address;
		String state;
		String status;
		try{
			File patient = new File(id.concat(".txt"));
			if(patient.exists()) {
				Scanner p = new Scanner(patient); 
				name = p.nextLine();
				phone = p.nextLine();
				gender = p.nextLine();
				address = p.nextLine();
				state = p.nextLine();
				p.close();
				status = GetStatus(id);
				return new Patient(id, name, phone, gender, address, state, status);
			} else {
				System.out.println("Account does not exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return null;
	}
	
	public void AddSymptoms(List<String> symptoms,String id){
		ListIterator<String> sitr = symptoms.listIterator();
		try {
			File symp = new File(id.concat("_symptoms.txt"));
			if(!symp.exists()){
				symp.createNewFile();
			}
			try {
				FileWriter fw = new FileWriter(symp);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(sitr.next());
				while(sitr.hasNext()){
					bw.newLine();
					bw.write(sitr.next());
				}
				bw.close();
				fw.close();
			} catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	
	public void ClearSymptoms(String id){
		File symp = new File(id.concat("_symptoms.txt"));
		if(symp.exists()){
			try {
				PrintWriter pw = new PrintWriter(symp);
				pw.print("");
				pw.close();
			} catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}
		}
	}
	
	public List<String> GetSymptoms (String id){
		File list = new File(id.concat("_symptoms.txt"));
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
}