import javax.swing.JOptionPane;

public class PrimeorNot {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("Type a number");
	int a = Integer.parseInt(answer);
	for (int i=2; i < a-1; i++) {
		if(a%i==0) {
			System.out.println("not");
			System.exit(0);
		}
	}
		System.out.println("yes");
		
}
}
