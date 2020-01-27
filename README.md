Pronto_app

A java based CLI application

The application takes in a string of commands containing moves for a robot and then calculates and displays the displacement from the starting point

Command Format =  Action|repetition e.g F8 means forward 8 times.

Valid Actions:
F = move forward
B = move backward
R = turn right
L = turn left

How to run:
-The folder contains a .jar file call app.jar
-In windows, use the command prompt to access the folder with the .jar file
-Use the command "java -jar app.jar" to run the CLI application
-Input your command string when prompted to enter input


Notes:
The application consists of two main classes, the robot and the controller and an enum Orientaion.

Robot:
The robot class allows us to keep track of the robot's current location and has the methods used to move the robot.

Controller:
The controller reads the input from the CLI and passes the command to the robot. Since it is seperate from the robot class it allows us to easily
change the way we read inputs e.g from file instead of command line, without effecting functionality.

Orientation:
This is an enum that contains the 4 general direction. It also is extensible so that we can add direction such as North-East if we want to. 