import javax.swing.JOptionPane;

public class FavoriteFood {

	public static void main(String[] args) {
		// TODO Auto-generated method st

		String FavoriteFood = JOptionPane.showInputDialog(null, "what is your favorite food?");

		if (FavoriteFood.equals("pozole")) {

			String FavoriteNumber = JOptionPane.showInputDialog(null, "What is your favorite number?");

			for (int i = 0; i < Integer.parseInt(FavoriteNumber); i++) {

				System.out.println(FavoriteFood);
			}

		}

	}

}
