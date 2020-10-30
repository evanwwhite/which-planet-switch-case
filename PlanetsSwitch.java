//Evan White
import java.util.Scanner;

public class PlanetsSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner input = new Scanner(System.in);

System.out.println("What is your weight: ");
int weight = input.nextInt();

System.out.println("Pick a Number: 1 : Mercury "
		                        +" 2 : Venus "
		                        +" 3 : Earth "
		                        +" 4 : Mars "
		                        +" 5 : Jupiter "
		                        +" 6 : Saturn "
		                        +" 7 : Uranus "
		                        +" 8 : Neptune ");
int choice = input.nextInt();
double gravity = 0;
String PlanetName = "";


switch(choice)
{
case 1: gravity = .38;
	PlanetName = "Mercury";
   break;

case 2: gravity = .78;
    PlanetName = "Venus";
    break;
	
case 3: gravity = 1.00;
    PlanetName = "Earth";
   break;
	
case 4: gravity = .39;
    PlanetName = "Mars";
   break;
	
case 5: gravity = 2.65;
    PlanetName = "Jupiter";
   break;
	
case 6: gravity = 1.17;
    PlanetName = "Saturn";
   break;
   
case 7: gravity = 1.05;
    PlanetName = "Uranus";
    
case 8: gravity = 1.23;
    PlanetName = "Neptune";	
}

double newWeight = weight * gravity;
System.out.println("New Weight: " + newWeight);
	}

}
