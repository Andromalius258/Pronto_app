import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.Math;

public class Controller {
	
	public static void main(String[] args) throws FileNotFoundException {
		// create scanner to read input
        Scanner in = new Scanner(System.in);
        
        //keep reading input until program runs
        while(true){
        	
        	// Initialize robot
            Robot robot = new Robot();
            boolean correct_input = true;
            
        	System.out.print("Input Command String: ");
            
            String commands = in.nextLine();
            String[] moves = commands.split(",");
            
            // For each move in the moves list
			for (String move : moves) {

				// if move is in incorrect format, print error message
				if (!move.toUpperCase().matches("^[FRLB][0-9]+")) {
					correct_input = false;
					System.out.println("Wrong Command Detected: " + move);
					System.out.println("Please input correct commands!");
					break;
				} 
				else {
					// divide move string to the action and how many times to repeat the action
					char action = move.toUpperCase().charAt(0); // convert command characters to uppercase to overcome input mistakes
					int repeat = Integer.parseInt(move.substring(1));

					// tell the robot to move
					robot.move(action, repeat);
				}
			}
            
            // calculate distance to starting point
            int minDist = Math.abs(robot.getX()) + Math.abs(robot.getY());

            if (correct_input){
				//print out distance to starting point
				System.out.println("Minimum Distance from starting Point = " + minDist + " Blocks");
			}

            
            
        }
        
	}
}
