import java.util.Scanner;

public class jibon {

	public static void main(String[] args) {
		String a=" ";
		System.out.println("please enter the string  input :");
		Scanner ji=new Scanner(System.in);
		String string=ji.nextLine();
		System.out.println("The string output is :");
		System.out.println(string);
		
		
		 String[] parts = string.split(a);

		    for(int i=0;i<parts.length;i++){
		      System.out.println(parts[i]);}
		   
		

	}

}