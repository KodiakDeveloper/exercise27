package selectionStructures;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex27 {

	public static void main(String[] args) {

		String userChoice;

		int quantity, quantity_1, size_1 = 0;// esse size é para 200 e 500ml

		String sideDish, size = null ; // Esse size é para os tamanhos pequenos,medios e grandes

		Double total;

		DecimalFormat df = new DecimalFormat("R$ ##.##");

		userChoice = JOptionPane.showInputDialog(null,
				"WELCOME" + "\nOur menu includes \n1-Hamburger \n2-Bauru \n3-Cheeseburger \n4-X-salad.");

		if (userChoice.equals("")) {

			JOptionPane.showMessageDialog(null, "Invalid data, please try again!");

			return;
		}

		else {

			userChoice = userChoice.toLowerCase();

			userChoice = userChoice.trim();

		}

		switch (userChoice) {

		case "hamburger":

			quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of hamburgers you want."));

			if (quantity <= 0) {

				JOptionPane.showMessageDialog(null, "Please input value greater than zero!");

			}

			else {

				total = quantity * 6.80;

				sideDish = JOptionPane.showInputDialog(null,
						"Would you like a side dish?" + "\nSoda, juice, French fries, salad."
								+ "\nIf you want a side, type its name; otherwise, type 'no'.");

				sideDish = sideDish.toLowerCase();

				sideDish = sideDish.trim();

				if (sideDish.equals("no")) {

					JOptionPane.showMessageDialog(null, "TOTAL = " + df.format(total) + "\nQuantity = " + quantity);
				}

				else if (sideDish.equals("french fries")) {

					size = JOptionPane.showInputDialog(null,
							"The French fries are available in small, medium, and large sizes. Please choose one.");

					if (size.equals("small")) {

						quantity_1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input quantity: "));

						total += quantity * 3.50;

						JOptionPane.showMessageDialog(null,
								"Hamburger quantity: " + quantity + "\nSide dish: " + sideDish
										+ "\nSide dish quantity: " + quantity_1 + "\nSize : " + size + "\nTOTAL = "
										+ df.format(total));

					} else if (size.equals("medium")) {

						quantity_1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input quantity: "));

						total += quantity * 4.50;

						JOptionPane.showMessageDialog(null,
								"Hamburger quantity: " + quantity + "\nSide dish: " + sideDish
										+ "\nSide dish quantity: " + quantity_1 + "\nSize : " + size + "\nTOTAL = "
										+ df.format(total));

					} else if (size.equals("large")) {

						quantity_1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input quantity: "));

						total += quantity * 5.50;

						JOptionPane.showMessageDialog(null,
								"Hamburger quantity: " + quantity + "\nSide dish: " + sideDish
										+ "\nSide dish quantity: " + quantity_1 + "\nSize : " + size + "\nTOTAL = "
										+ df.format(total));

					}

				}

				else if (sideDish.equals("soda")) {

					size_1 = Integer
							.parseInt(JOptionPane.showInputDialog(null, "The Soda are available 200 and 500ml"));

					if (size_1 < 200 && size_1 > 500) {

						JOptionPane.showMessageDialog(null, "We only have 200 ml and 500 ml sodas.");

						JOptionPane.showMessageDialog(null, "TOTAL = " + df.format(total) + "\nQuantity = " + quantity);

					}

					else if (size_1 == 200) {

						quantity_1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input quantity: "));

						total += quantity * 2.30;

						JOptionPane.showMessageDialog(null,
								"Hamburger quantity: " + quantity + "\nSide dish: " + sideDish
										+ "\nSide dish quantity: " + quantity_1 + "\nSize : " + size_1 + "\nTOTAL = "
										+ df.format(total));
					}

					else if (size_1 == 500) {

						quantity_1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input quantity: "));

						total += quantity * 4.00;

						JOptionPane.showMessageDialog(null,
								"Hamburger quantity: " + quantity + "\nSide dish: " + sideDish
										+ "\nSide dish quantity: " + quantity_1 + "\nSize : " + size_1 + "\nTOTAL = "
										+ df.format(total));

					}
				}

				else if (sideDish.equals("juice")) {

					size_1 = Integer
							.parseInt(JOptionPane.showInputDialog(null, "The Juice are available 200 and 500ml"));

					if (size_1 < 200 && size_1 > 500) {

						JOptionPane.showMessageDialog(null, "We only have 200 ml and 500 ml juice.");

					}

					else if (size_1 == 200) {

						quantity_1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input quantity: "));

						total += quantity * 3.50;

						JOptionPane.showMessageDialog(null,
								"Hamburger quantity: " + quantity + "\nSide dish: " + sideDish
										+ "\nSide dish quantity: " + quantity_1 + "\nSize : " + size_1 + "\nTOTAL = "
										+ df.format(total));
					}

					else if (size_1 == 500) {

						quantity_1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input quantity: "));

						total += quantity * 6.00;

						JOptionPane.showMessageDialog(null,
								"Hamburger quantity: " + quantity + "\nSide dish: " + sideDish
										+ "\nSide dish quantity: " + quantity_1 + "\nSize : " + size_1 + "\nTOTAL = "
										+ df.format(total));

					}

				}

				else if (sideDish.equals("salad")) {

					size = JOptionPane.showInputDialog(null, "The Salad are available in medium only.");

					if (size.equals("large") || size.equals("small")) {

						JOptionPane.showMessageDialog(null, "We don't have large or small salads.");

						JOptionPane.showMessageDialog(null, "TOTAL = " + df.format(total) + "\nQuantity = " + quantity);

					}

					else if (size.equals("medium")) {

						quantity_1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input quantity: "));

						total += quantity * 8.00;

						JOptionPane.showMessageDialog(null,
								"Hamburger quantity: " + quantity + "\nSide dish: " + sideDish
										+ "\nSide dish quantity: " + quantity_1 + "\nSize : " + size + "\nTOTAL = "
										+ df.format(total));

					}

				}

				break;
			}

		}

	}

}
