package ie.gmit.sw;

import java.util.Scanner;

public class MenuInterface {

	private Scanner scan ;
	private String fileName;
	private int shingleSize;
	private Launcher runner =new Launcher();
	
	public MenuInterface (){
		
		
	}
	
	public void start(){
			
			scan =  new Scanner(System.in);
			
			System.out.println("***Document Comparison Service***");
			System.out.println("Please Enter the name of File 1:");
			fileName = scan.next();
			runner.setFile1(fileName);
			
			System.out.println("Please Enter the name of File 2:");	
			fileName = scan.next();
			runner.setFile2(fileName);
			
			System.out.println("Please Enter the Shingle Size:");		
			shingleSize = scan.nextInt();
			runner.setShingleSize(shingleSize);
			
			System.out.println("Processing files...");
			runner.launch();
	
			scan.close();
	
	}

}
