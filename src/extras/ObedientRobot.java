package extras;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class ObedientRobot {
	public static void main(String[] args) {
		String color = JOptionPane.showInputDialog("What color fo you want the shapes to be");

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
		String color = JOptionPane.showInputDialog("what color do you want the square to be?");
		Robot obey = new Robot();
		obey.moveTo(250, 500);
		obey.setSpeed(100);
		obey.penDown();
		obey.setPenColor(color);
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
		obey.moveTo(400, 100);
		obey.setSpeed(20);
		obey.penDown();
		for(int i=0; i<3; i++) {
		obey.turn(120);
		obey.move(350);
		}
		obey.penUp();
		obey.move(500);
	}
	static void Circle() {
		Robot obey = new Robot();
		obey.moveTo(150, 300);
		obey.setSpeed(100);
		obey.penDown();
		for(int i=0; i<360; i++) {
		obey.move(5);
		obey.turn(1);
		}obey.penUp();
		obey.move(500);
}
}