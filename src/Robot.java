// This class is responsible for keeping track of the robot location and orientation
public class Robot {
	private int x;
	private int y;
	private Orientation facing;
	
	//Initialize the robots starting position and orientation
	public Robot() {
		this.x = 0;
		this.y = 0;
		this.facing = Orientation.NORTH;
	}
	
	public void move(char action, int repeat) {
		
		// move the robot as required
		if(action == 'F' || action == 'B') {
			
			//To convert to a backward move just negate the move
			if(action == 'B') {
				repeat = -repeat;
			}
			
			// move with respect to the direction the robot is facing
			switch(this.facing) {
			case NORTH:
				y += repeat;
				break;
			case SOUTH:
				y -= repeat;
				break;
			case EAST:
				x += repeat;
				break;
			case WEST:
				x -= repeat;	
			}
		}
		// change the direction of the robot as many times as required
		else if(action == 'L' || action == 'R') {
			for(int i=0; i<repeat; i++) {
				changeDirection(action);
			}
		}
		
		// used to display the effects of each move
		System.out.println("new coordinates: " + this.x + "," + this.y + " facing " + this.facing);
	}
	
	
	// Function used to change the direction of the robot as appropriate
	private void changeDirection(char action) {
		if(action == 'L') {
			switch(this.facing) {
			case NORTH:
				this.facing = Orientation.WEST;
				break;
			case WEST:
				this.facing = Orientation.SOUTH;
				break;
			case SOUTH:
				this.facing = Orientation.EAST;
				break;
			case EAST:
				this.facing = Orientation.NORTH;
				break;
			}
		}
		else if(action == 'R') {
			switch(this.facing) {
			case NORTH:
				this.facing = Orientation.EAST;
				break;
			case WEST:
				this.facing = Orientation.NORTH;
				break;
			case SOUTH:
				this.facing = Orientation.WEST;
				break;
			case EAST:
				this.facing = Orientation.SOUTH;
				break;
			}
		}
	}

	// Getter functions to access robot's location
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}
