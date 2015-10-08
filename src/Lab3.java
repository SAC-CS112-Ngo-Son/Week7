
//Son Ngo

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

public class Lab3
{

	public static void main(String[] args)
	{
		Random randomizer = new Random();

		// choice list
		List<String> list = new ArrayList<String>();
		list.add("ROCK");
		list.add("PAPER");
		list.add("SCISSOR");

		int reply = 0;

		do
		{
			String User = "", Comp = "";

			while ((!User.equals("ROCK")) && (!User.equals("PAPER")) && (!User.equals("SCISSOR")))
			{
				User = JOptionPane.showInputDialog("ROCK, PAPER, SCISSOR: ");
			}

			// randomize computer's choice
			Comp = list.get(randomizer.nextInt(list.size()));
			System.out.printf("%s\n", Comp);

			switch (User)
			{
			case "ROCK":
				switch (Comp)
				{
				case "ROCK":
					reply = JOptionPane.showConfirmDialog(null, "That's a tie. Do you want to continue?", "",
							JOptionPane.YES_NO_OPTION);
					break;
				case "PAPER":
					reply = JOptionPane.showConfirmDialog(null, "You've lost. Do you want to continue?", "",
							JOptionPane.YES_NO_OPTION);
					break;
				case "SCISSOR":
					reply = JOptionPane.showConfirmDialog(null, "You've won. Do you want to continue?", "",
							JOptionPane.YES_NO_OPTION);
					break;
				default:
					reply = JOptionPane.showConfirmDialog(null, "Something's wrong. Do you want to continue?", "",
							JOptionPane.YES_NO_OPTION);
					break;
				}
				break;
			case "PAPER":
				switch (Comp)
				{
				case "ROCK":
					reply = JOptionPane.showConfirmDialog(null, "You've won. Do you want to continue?", "",
							JOptionPane.YES_NO_OPTION);
					break;
				case "PAPER":
					reply = JOptionPane.showConfirmDialog(null, "That's a tie. Do you want to continue?", "",
							JOptionPane.YES_NO_OPTION);
					break;
				case "SCISSOR":
					reply = JOptionPane.showConfirmDialog(null, "You've lost. Do you want to continue?", "",
							JOptionPane.YES_NO_OPTION);
					break;
				default:
					reply = JOptionPane.showConfirmDialog(null, "Something's wrong. Do you want to continue?", "",
							JOptionPane.YES_NO_OPTION);
					break;
				}
				break;
			case "SCISSOR":
				switch (Comp)
				{
				case "ROCK":
					reply = JOptionPane.showConfirmDialog(null, "You've lost. Do you want to continue?", "",
							JOptionPane.YES_NO_OPTION);
					break;
				case "PAPER":
					reply = JOptionPane.showConfirmDialog(null, "You've won. Do you want to continue?", "",
							JOptionPane.YES_NO_OPTION);
					break;
				case "SCISSOR":
					reply = JOptionPane.showConfirmDialog(null, "That's a tie. Do you want to continue?", "",
							JOptionPane.YES_NO_OPTION);
					break;
				default:
					reply = JOptionPane.showConfirmDialog(null, "Something's wrong. Do you want to continue?", "",
							JOptionPane.YES_NO_OPTION);
					break;
				}
				break;
			default:
				reply = JOptionPane.showConfirmDialog(null, "Something's wrong. Do you want to continue?", "",
						JOptionPane.YES_NO_OPTION);
				break;
			}
		} while (reply == JOptionPane.YES_OPTION);
	}
}
