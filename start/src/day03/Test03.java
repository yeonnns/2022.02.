package day03;

import javax.swing.JOptionPane;

public class Test03 {

	public static void main(String[] args) {
		System.out.println('J' + 3.14);
		System.out.println((char)('J' + 3.14));
		
		//'j' 이후의 열번째 문자는?
		JOptionPane.showMessageDialog(null, ('J' + 10)); //char+int=>int

	}

}
