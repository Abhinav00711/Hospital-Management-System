package FileUtils;

import java.io.*;
import java.util.*;

public class CurrentUser{
	public void UpdateUser(String id ,String role){
		File user = new File("cuser.txt");
		try {
			FileWriter fw = new FileWriter(user);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(id + "\n" + role);
			bw.close();
			fw.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			user.delete();
			e.printStackTrace();
		}
	}
	
	public String GetUser(){
		String id;
		try{
			File user = new File("cuser.txt");
			if(user.exists()) {
				Scanner s = new Scanner(user);
				id = s.nextLine();
				s.close();
				return id;
			} else {
				System.out.println("Account does not exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return "";
	}
	
	public String GetRole(){
		String role;
		try{
			File user = new File("cuser.txt");
			if(user.exists()) {
				Scanner s = new Scanner(user);
				role = s.nextLine();
				role = s.nextLine();
				s.close();
				return role;
			} else {
				System.out.println("Account does not exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return "";
	}
}