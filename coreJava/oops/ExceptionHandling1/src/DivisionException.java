import javax.swing.JOptionPane;
public class DivisionException extends Exception {
		public void showMsg() {
			JOptionPane.showMessageDialog(null, "You cannot perform division for  negative numbers...");
	}

}
