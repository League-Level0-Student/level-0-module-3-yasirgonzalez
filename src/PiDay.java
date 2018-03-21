import javax.swing.JOptionPane;

public class PiDay {
	public static void main(String[] args) {
String Pi = "3.1415926535" ;
for (int i = 0; i <4; i++) {
	System.out.print(Pi.charAt(i));
}
for (int i = 4; i <Pi.length(); i++) {
String o =Character.toString(Pi.charAt(i));
	String a=JOptionPane.showInputDialog("what is the next digit of pie?");
 if(a.equals(o)){
	JOptionPane.showMessageDialog(null, "Correct");
	
 }else {

	 JOptionPane.showMessageDialog(null, "Incorrrect, NO PIE FOR YOU!!!!");
 }
}
}
}
