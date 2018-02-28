//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot color  = new Robot();
		//3. Ask the user what color they would like the robot to draw
		String answer = JOptionPane.showInputDialog(null,"what color would you likethe robot to draw with");
		//5. Use an if/else statement to set the pen color that the user requested
		if(answer.equalsIgnoreCase("green")){
			color.setPenColor(0,250,0);
			}else if(answer.equalsIgnoreCase("red")){
				color.setPenColor(250,0,0);
			}else if(answer.equalsIgnoreCase("blue")){
			color.setPenColor(0,0,250);
			}else if(answer.equalsIgnoreCase("purple")){
				color.setPenColor(200,0,250);
			}else if(answer.equalsIgnoreCase("pink")){
				color.setPenColor(250,0,150);
			}else if(answer.equalsIgnoreCase("yellow")){
				color.setPenColor(250,250,0);
			}else if(answer.equalsIgnoreCase("orange")){
				color.setPenColor();
			}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		color.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		color.setSpeed(1000);
		color.penDown();
		color.move(200);
		color.turn(90);
		color.move(200);
		color.turn(90);
		color.move(200);
		color.turn(90);
		color.move(200);

	}
}
