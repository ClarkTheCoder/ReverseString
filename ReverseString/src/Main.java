


import java.util.Scanner;


public class Main {
	

	public static void main(String[] args) {
		
		String originalName;
		String newName = "";
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a name: ");
	
		originalName = in.nextLine();
		
		for(int i = originalName.length() - 1; i >= 0; i--) {
			newName = newName + originalName.charAt(i);
		}
		
		System.out.print("Reverse Name is: " + newName);
		

	}
	


}
