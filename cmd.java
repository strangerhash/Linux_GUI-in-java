import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader; 
// public class cmd
// {
//  public static void main(String[] args) 
// {
     
// String cmd = "ls -al";
// Runtime run = Runtime.getRuntime();
// Process pr = run.exec(cmd);
// pr.waitFor();
// BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
// String line = "";
// while ((line=buf.readLine())!=null) {
// System.out.println(line);
// }


// }
// }
// Java program to illustrate Process exec() 
// method of Runtime class 
public class cmd 
{ 
	public static void main(String[] args) 
	{ 
		try
		{ 
			// create a process and execute google-chrome 
			Process process = Runtime.getRuntime().exec("ls -al"); 
            BufferedReader buf = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = "";
            while ((line=buf.readLine())!=null) {
            System.out.println(line);
            }
		} 
		catch (Exception e) 
		{ 
			e.printStackTrace(); 
		} 
	} 
} 
