package FileUtils;

import DataModel.Patient;

import java.io.*;

public class PatientFile{
	public void addPatient(Patient p){
		String id = p.getId();
		try{
			File patient = new File(id.concat(".txt"));
			File status = new File(id.concat("_Status.txt"));
			if(patient.createNewFile()) {
				try {
					FileWriter fw = new FileWriter(patient);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write(p.getName() + "\n" + p.getPhone() + "\n" + p.getGender() + "\n" + p.getAddress() + "\n" + p.getState());
					bw.close();
					fw.close();
					System.out.println("Account Created");
				} catch (IOException e) {
					System.out.println("An error occurred.");
					patient.delete();
					e.printStackTrace();
				}
				try {
					FileWriter fw = new FileWriter(status);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write(p.getStatus());
					bw.close();
					fw.close();
				} catch (IOException e) {
					System.out.println("An error occurred.");
					status.delete();
					e.printStackTrace();
				}
				AddPatientList(id);
			} else {
				System.out.println("Account already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
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
}