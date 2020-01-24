import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.Math;

public class Controller {
	
	public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        
        while(true){

            Robot robot = new Robot();
        	System.out.print("Input Command String: ");
            
            String commands = in.nextLine();
            String[] moves = commands.split(",");
            
            // For each move in the moves list
            for(int i = 0; i < moves.length; i++) {
            	String move = moves[i].toUpperCase();
            	
            	// if move is in incorrect format, printout error
            	if (!move.toUpperCase().matches("^[FRLB][0-9]+")) {
        			System.out.println("Wrong Command Detected: " + moves[i]);
        			System.out.println("Please input correct commands!");
        		}
            	
            	else {
            		char action = move.charAt(0);
            		int repeat = Integer.parseInt(move.substring(1));
            		
            		robot.move(action, repeat);
            	}
            }
            
            int minDist = Math.abs(robot.getX()) + Math.abs(robot.getY());
            
            System.out.println("Minimum Distance from starting Point = " + minDist + " Blocks");
            
            
        }
        
	}
}
