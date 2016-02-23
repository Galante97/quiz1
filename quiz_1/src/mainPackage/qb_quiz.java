//James Galante

package mainPackage;
import java.util.Scanner;

public class qb_quiz {
	static Scanner userInput = new Scanner(System.in);
	
	static double TD;
	static double YDS;
	static double INT;
	static double COMP;
	static double ATT;
	
	static double a;
	static double b;
	static double c;
	static double d;
	
	static double passerRating;
	
	
	public static void main(String[] args) {
		
		getInfo();
	}

	public static void getInfo() {
		try { 
			System.out.println("Enter the number of TD:");
			String tds = userInput.next();
			TD = Integer.parseInt(tds);
			System.out.println("TD: "+ TD);
			
			System.out.println("Enter the number of total yards:");
			String ty = userInput.next();
			YDS = Integer.parseInt(ty);
			System.out.println("total yards: "+ YDS);
			
			System.out.println("Enter the number of interceptions:");
			String inter = userInput.next();
			INT = Integer.parseInt(inter);
			System.out.println("interceptions: "+ INT);
			
			System.out.println("Enter the number of completions:");
			String comp = userInput.next();
			COMP = Integer.parseInt(comp);
			System.out.println("Copletions: "+ COMP);
			
			System.out.println("Enter the number of passes attempted:");
			String pa = userInput.next();
			ATT = Integer.parseInt(pa);
			System.out.println("Passes attepted: "+ ATT);
			
			calcQBRating();
			
		} catch(NumberFormatException e) {
			System.out.println("Error. Please enter numbers");
			getInfo();
		}
		
	}
		
	public static void calcQBRating() {
		
		a = ((COMP/ATT) - 0.3) * 5;
		b = ((YDS/ATT) - 3) * 0.25;
		c = (TD/ATT) * 20;
		d = 2.375 - (INT/ATT * 25);
		
		passerRating = ((a+b+c+d)/6) * 100;
		System.out.println("passer Rating = " + passerRating + "%");
		
	}
		
		


}
