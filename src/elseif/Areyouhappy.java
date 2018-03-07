package elseif;

import javax.swing.JOptionPane;

public class Areyouhappy {
	public static void main(String[] args) {
	String Happy = JOptionPane.showInputDialog(null, "Are you happy?");
	if(Happy.equals("Yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
	}else if(Happy.equals("No")){
	String boom =JOptionPane.showInputDialog(null,"Do you want to be happy?" );
	}
	
		
}}
