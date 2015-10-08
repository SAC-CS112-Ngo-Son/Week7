
//Son Ngo
//Guess-a-Number

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab1
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int ComputerNum, UserNum;

		ComputerNum = 0 + (int) (Math.random() * 10);
		System.out.printf("%d\n", ComputerNum);
		
		String prompt = "";

		do
		{			
			UserNum = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number: "));

			if (UserNum > ComputerNum)
				JOptionPane.showMessageDialog(null, "Your number is too big");
			else if (UserNum == ComputerNum)
				JOptionPane.showMessageDialog(null, "Your number is correct");
			else
				JOptionPane.showMessageDialog(null, "Your number is too small");
			
			if (!(UserNum == ComputerNum))
				prompt = JOptionPane.showInputDialog("Do you want to continue (YES or NO): ");
		} while ((prompt.equals("YES")) && (!(UserNum == ComputerNum)));

		if (prompt.equals("NO"))
			JOptionPane.showMessageDialog(null, "Bye");
	}

}
