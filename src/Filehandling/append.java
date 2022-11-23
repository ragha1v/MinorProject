
package Filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class append {
	
	
	private static String Username = "Raghav";
	private static String Password = "Raghav@123";
	
	public static void appendtext(String filecontent)
	{
		
		//String path=System.getProperty("user.dir")+"\\"+fileName;
		//System.out.println(path);
		
		try
		{
			FileWriter fw=new FileWriter("student.txt",true);
			//fw.append('\n');
			fw.write("\n"+filecontent);
			
			fw.close();
			System.out.println("Name of student saved !!!!!!!");
			
			
		}catch(IOException e)
		{
			System.out.println("");
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public static void readfile(String readfile)
	{
		try {
			File myobj= new File(readfile);
		Scanner read=new Scanner(myobj);
		while(read.hasNextLine())
		{
			String data=read.nextLine();
			System.out.println(data);
		}
		System.out.println("*******************************************************************");
		System.out.println("done");
		
		
	}catch(IOException e)
		{
		System.out.println("An error occoured.");
		e.printStackTrace();
		}
		
		
	}
	
	public static void council() throws Exception
	{
		

		int max=0;
		
		// reading text file into List in Java 7 
		List<String> lines = Collections.emptyList();
		try 
		{
			lines = Files.readAllLines(Paths.get("student.txt"), StandardCharsets.UTF_8);
			}
		catch (IOException e) 
		{ // TODO Auto-generated catch block
			e.printStackTrace(); 
			} 
		//System.out.println("Content of List:");
		//System.out.println(lines);
	
		// reading text file into ArrayList 
		
		BufferedReader bufReader = new BufferedReader(new FileReader("skills.txt"));
		List<String>al = new ArrayList<>();
		
		String line = bufReader.readLine();
		
		while (line != null)
		{ 
			al.add(line);
			line = bufReader.readLine();
			}
		bufReader.close();
	
		//System.out.println("Content of ArrayLiList:");
	//	System.out.println(al);
		
	
		Scanner scanner = new Scanner(new File("Marks.txt"));
		int [] tall = new int [100];
		int i = 0;
		while(scanner.hasNextInt())
		{
		     tall[i++] = scanner.nextInt();
		    
		}

	
		
		bufReader.close();
		
		int maxi= maxnumber(tall);
		
		System.out.println(lines.get(0)+" Should go in " +al.get(maxi) +" field as marks of amit is " +tall[maxi]);
		

		
		}
	
	private static int maxnumber(int[] tall) {
		// TODO Auto-generated method stub
		int largest = 0;
		for ( int i = 1; i < tall.length; i++ )
		{
		if ( tall[i] > tall[largest] ) 
			largest = i;
		}
		return largest; // position of the first largest found.
		}
	
	

	
	
	public static void mark(String filecontent,int m1,int m2,int m3,int m4,int m5)
	{
		System.out.println();
		try
		{
			FileWriter fw=new FileWriter("marks1.txt",true);
			//fw.append('\n');
			fw.write("\n"+m1);
		
			fw.close();
			
			
			
			FileWriter fw2=new FileWriter("marks2.txt",true);
			
			fw2.write("\n"+m2);
			
			fw2.close();
		
			
			FileWriter fw3=new FileWriter("marks3.txt",true);
			//fw.append('\n');
			fw3.write("\n"+m3);
			
			fw3.close();
			
			
			
			FileWriter fw4=new FileWriter("marks4.txt",true);
			//fw.append('\n');
			fw4.write("\n"+m4);
			
			fw4.close();
			
			
			FileWriter fw5=new FileWriter("marks5.txt",true);
			//fw.append('\n');
			fw5.write("\n"+m5);
			
			fw5.close();
			
			
			System.out.println("Marks of "+ filecontent +" for all class are  saved !!!!!!!");
			
			
			
			
		}catch(IOException e)
		{
			System.out.println("");
			e.printStackTrace();
		}
	}

	

	

 
		public static boolean login()
	{
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("                                                                                 |");
			System.out.println("                         ADMIN  LOGIN                                            |");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("Please enter username                                                            |");
			Scanner in = new Scanner(System.in);
			String UN = in.nextLine();
			System.out.println("                                                                                 |");
			System.out.println("                                                                                 |");
			System.out.println("                                                                                 |");
			System.out.println("                                                                                 |");
			System.out.println("                                                                                 |");
		    System.out.println("Please enter password                                                            |");
		    Scanner inn = new Scanner(System.in);
		    String PW = inn.nextLine();
			System.out.println("                                                                                 |");
			System.out.println("                                                                                 |");
			System.out.println("                                                                                 |");
			System.out.println("                                                                                 |");
			System.out.println("                                                                                 |");
			System.out.println("                                                                                 |");
			System.out.println("                                                                                 |");
			System.out.println("                                                                                 |");
			System.out.println("                                                                                 |");
			 if ((UN.equals(Username) && PW.equals(Password)))
			    {
				 
		    System.out.println(" You have Successfully SIGNED IN                                                 |");
			
			    }
			 else
			 {
		    System.out.println(" password is incorrect                                                           |");
			 }
			System.out.println("                                                                                 |");
		    System.out.println("---------------------------------------------------------------------------------");
		    
		    
		    
		    if ((UN.equals(Username) && PW.equals(Password)))
		    {
		        return true;
		    }
		    else
		    {
		    	return false;
		    }
		
	}
	
		
		public static void parentalguide()
		{
			try {
			      File myObj = new File("parentalguide.txt");
			      if (myObj.createNewFile()) {
			        System.out.println("File created: " + myObj.getName());
			      } else {
			        System.out.println("File already exists.");
			      }
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			  
		
		  
		try {
		      File myObj = new File("parentalguide.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		}
		
		
		
		
		
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		if(login()==true)
		{
			System.out.println("                                                                                 |");
			System.out.println("                                                                                 |");
			System.out.println("                        ADMIN CONSOLE                                            |");
			System.out.println("--------------------------------------------------------------------------------- ");
			Scanner input=new Scanner(System.in);
			Scanner ins=new Scanner(System.in);
			System.out.println("Hi Admin please enter 1 if you want to use our system Or use 5 if you want to exit");
			int press=ins.nextInt();
			System.out.println("---------------------------------------------------------------------------------");
			while(press!=5)
			{
			System.out.println("");
			System.out.println("You have following choices in our applications ");
			System.out.println("1.Update the System");
			System.out.println("2.Council the System");
			System.out.println("3.Read the files");
			System.out.println("4.Parental Guide ");
			System.out.println("5.EXIT");
			
			
			System.out.println("Enter the choice " );
			int choice=input.nextInt();	
			
			
			if(choice==1)
			{
				Scanner input2=new Scanner(System.in);
		
					
			System.out.println("Please Enter Name of student");
			String filecontent=input2.nextLine();
			
			appendtext(filecontent);
			System.out.println();
			Scanner input4=new Scanner(System.in);
			System.out.println("enter the marks of class 1");
			int m1=input4.nextInt();
			System.out.println("enter the marks of class 2");
			int m2=input4.nextInt();
			
			System.out.println("enter the marks of class 3");
			int m3=input4.nextInt();
			
			System.out.println("enter the marks of class 4");
			int m4=input4.nextInt();
			
			System.out.println("enter the marks of class 5");
			int m5=input4.nextInt();
			
			
			
			mark(filecontent,m1,m2,m3,m4,m5);
			
			
			
			}
			
			else if (choice==2)
			{
				
				
				council();
				
							
			}
		
			else if(choice==3)
			{
				Scanner input3=new Scanner(System.in);
				System.out.println("Enter the name of file you want to read");
				String readfile=input.next();
				readfile(readfile);
				

			}
			
			else if(choice==4)
			{
				
				parentalguide();
				
			}
			
			
			
			
			else if(choice==5)
			{
				System.out.println("you have exited the application can close it");
				return;
			}
			
			
			
			
		}

         System.out.println("thanks for using ");
		
			
		}
		
		else 
		{
			System.out.println("You are not a admin please contact to Admin");
		}
	
		
		
	}

}
