package extras;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class ObedientRobot {
	public static void main(String[] args) {
		int shape = JOptionPane.showOptionDialog(null, "What shape do you want the robot to draw", "Which shape?", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Square", "Triangle","Circle" }, null);		
	if (shape==0) {
	Square();
}else if (shape==1) {
	Triangle();
}else if(shape==2) {
	Circle();
}
	}	
	static void Square() {
		Robot obey = new Robot();
		int color = JOptionPane.showOptionDialog(null, "what color do you want the robot to draw with", "Color", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Blue", "Red","Green" }, null);
		if (color==0) {
			obey.penDown();
			obey.setPenColor(0, 0, 250);
		}else if(color==1) {
			obey.penDown();
			obey.setPenColor(250, 0, 0);
		}else if(color==2) {
			obey.penDown();
			obey.setPenColor(0, 250, 0);
		}
		obey.moveTo(250, 500);
		obey.setSpeed(100);
		obey.move(350);
		obey.turn(90);
		obey.move(350);
		obey.turn(90);
		obey.move(350);
		obey.turn(90);
		obey.move(350);
		obey.penUp();
		obey.move(500);
		}
	static void Triangle() {
		Robot obey = new Robot();
		int color = JOptionPane.showOptionDialog(null, "what color do you want the robot to draw with", "Color", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Blue", "Red","Green" }, null);
		if (color==0) {
			obey.penDown();
			obey.setPenColor(0, 0, 250);
		}else if(color==1) {
			obey.penDown();
			obey.setPenColor(250, 0, 0);
		}else if(color==2) {
			obey.penDown();
			obey.setPenColor(0, 250, 0);
		}
		obey.moveTo(400, 100);
		obey.setSpeed(20);
		for(int i=0; i<3; i++) {
		obey.turn(120);
		obey.move(350);
		}
		obey.penUp();
		obey.move(500);
	}
	static void Circle() {
		Robot obey = new Robot();
		int color = JOptionPane.showOptionDialog(null, "what color do you want the robot to draw with", "Color", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Blue", "Red","Green" }, null);
		if (color==0) {
			obey.penDown();
			obey.setPenColor(0, 0, 250);
		}else if(color==1) {
			obey.penDown();
			obey.setPenColor(250, 0, 0);
		}else if(color==2) {
			obey.penDown();
			obey.setPenColor(0, 250, 0);
		}
		obey.moveTo(150, 300);
		obey.setSpeed(500);
		for(int i=0; i<360; i++) {
		obey.move(5);
		obey.turn(1);
		}obey.penUp();
		obey.move(500);
}
}