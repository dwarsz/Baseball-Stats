
package pkgCore;

import java.util.Scanner;

public class BaseBall {

public static void main(String args[]){  
	   Scanner AB = new Scanner(System.in);
	   
	   int AtBats = AB.nextInt();  
	   System.out.println("Please enter the player's at-bats");
	     
	   int Hits = AB.nextInt();  
	   System.out.println("Please enter the player's hits");
	   
	   Scanner DB = new Scanner(System.in);  
	   int TwoBases = DB.nextInt();  
	   System.out.println("Please enter the player's double-hits");
	   
	   Scanner TB = new Scanner(System.in);  
	   int TripleBases = TB.nextInt();  
	   System.out.println("Please enter the player's triple-hits");
	
	   Scanner HR = new Scanner(System.in);  
	   int HomeRuns = HR.nextInt();  
	   System.out.println("Please enter the player's home-runs");

	   Scanner SF = new Scanner(System.in);  
	   int SacFly = SF.nextInt();  
	   System.out.println("Please enter the player's SacFly");
	   
	   Scanner HBP = new Scanner(System.in);  
	   int HitByPicth = HBP.nextInt();  
	   System.out.println("Please enter the number of times the player has been hit by a pitch");
	   
	   Scanner BB = new Scanner(System.in);  
	   int Walks = HBP.nextInt();  
	   System.out.println("Please enter the player's walks");

	   int singles = Hits - (TwoBases - TripleBases - HomeRuns);
	   
	   double OBP = (Hits + Walks + HitByPicth) / (AtBats + Walks + HitByPicth + SacFly);
	   System.out.println("The player's On-Base-Percentage is " + OBP);
	   
	   double BatAvg = Hits/AtBats;
	   System.out.println("The player's batting average is " +  BatAvg);

	   int TotalBases = Hits + (2 * TwoBases) + (3 * TripleBases) + (4 * HomeRuns);
	   System.out.println("The player's totalBases is " +  TotalBases);

	   double Slugging = TotalBases / AtBats;
	   System.out.println("The player's slugging percentage is " +  Slugging);

	   double OBS = (OBP + Slugging);
	   System.out.println("The player's On-base plus slugging is " +  OBS);

	   
}



}
