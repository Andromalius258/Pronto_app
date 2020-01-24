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
		if(action == 'F' || action == 'B') {
			if(action == 'B') {
				repeat = -repeat;
			}
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
		else if(action == 'L' || action == 'R') {
			for(int i=0; i<repeat; i++) {
				changeDirection(action);
			}
		}
		System.out.println("current coordinates: " + this.x + "," + this.y + " facing " + this.facing);
	}
	
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
}
