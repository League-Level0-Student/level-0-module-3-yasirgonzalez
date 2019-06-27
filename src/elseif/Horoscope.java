package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String zodiac = JOptionPane.showInputDialog("How would your friends define you EX: Stubborn, energetic, honest ");
		if(zodiac.equals("energetic")){
			JOptionPane.showMessageDialog(null, "Your zodiac sign would be Aries");
		}else if(zodiac.equals("stubborn")) {
			JOptionPane.showMessageDialog(null, "Your zodiac sign is Taurus");
		}else if(zodiac.equals("conversational")) {
			JOptionPane.showMessageDialog(null, "Your zodiac sign is Gemini");
		}else if(zodiac.equals("good listener")) {
			JOptionPane.showMessageDialog(null, "Your zodiac sign is Cancer");	
		}else if(zodiac.equals("honest")) {
			JOptionPane.showMessageDialog(null, "Your zodiac sign is Leo");	
		}else if(zodiac.equals("caring")) {
			JOptionPane.showMessageDialog(null, "Your zodiac sign is Virgo");
		}else if(zodiac.equals("fair")) {
				JOptionPane.showMessageDialog(null, "Your zodiac sign is Libra");		
		}else if(zodiac.equals("self-control")) {
			JOptionPane.showMessageDialog(null, "Your zodiac sign is Scorpio");
		}else if(zodiac.equals("creative")) {
			JOptionPane.showMessageDialog(null, "Your zodiac sign is Sagittarius");
		}else if(zodiac.equals("goal maker")) {
			JOptionPane.showMessageDialog(null, "Your zodiac sign is Capricorn");
		}else if(zodiac.equals("friendly")) {
			JOptionPane.showMessageDialog(null, "Your zodiac sign is Aquarius");
		}else if(zodiac.equals("empathetic")) {
			JOptionPane.showMessageDialog(null, "Your zodiac sign is Pisces");
		}else {
			JOptionPane.showMessageDialog(null, "That's not a star sign!, try one of these, energetic, stubborn, coversational, good listener, honest, caring, fair, self-control, creative, goal maker, friendly, empatheic");
		}
	}
}
