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
}
