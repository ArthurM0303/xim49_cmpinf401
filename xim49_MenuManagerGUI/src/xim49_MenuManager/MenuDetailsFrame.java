package xim49_MenuManager;

import javax.swing.*;


public class MenuDetailsFrame extends JFrame {

	private JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6;
	private JTextField caloriesTextField, dessertTextField, entreeTextField, priceTextField, saladTextField,
			sideTextField;

	private final String details[];

	
	public MenuDetailsFrame(String[] details) {
		this.details = details;
		initComponents();

	}

	
	private void initComponents() {

		jLabel1 = new JLabel();
		entreeTextField = new JTextField();
		jLabel2 = new JLabel();
		sideTextField = new JTextField();
		jLabel3 = new JLabel();
		saladTextField = new JTextField();
		jLabel4 = new JLabel();
		dessertTextField = new JTextField();
		jLabel5 = new JLabel();
		caloriesTextField = new JTextField();
		jLabel6 = new JLabel();
		priceTextField = new JTextField();

		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setTitle(details[6]);
		setResizable(false);

		jLabel1.setText("Entree");

		entreeTextField.setEditable(false);
		entreeTextField.setText(details[0]);

		jLabel2.setText("Side");

		sideTextField.setEditable(false);
		sideTextField.setText(details[1]);

		jLabel3.setText("Salad");

		saladTextField.setEditable(false);
		saladTextField.setText(details[2]);

		jLabel4.setText("Dessert");

		dessertTextField.setEditable(false);
		dessertTextField.setText(details[3]);

		jLabel5.setText("Total calories :");

		caloriesTextField.setEditable(false);
		caloriesTextField.setText(details[4]);

		jLabel6.setText("Total price $:");

		priceTextField.setEditable(false);
		priceTextField.setText(details[5]);

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
						.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
						.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
						.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(jLabel5).addComponent(jLabel6))
				.addGap(29, 29, 29)
				.addGroup(
						layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(entreeTextField, GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
								.addComponent(sideTextField).addComponent(saladTextField).addComponent(dessertTextField)
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
												.addComponent(caloriesTextField, GroupLayout.DEFAULT_SIZE, 91,
														Short.MAX_VALUE)
												.addComponent(priceTextField))
										.addGap(0, 0, Short.MAX_VALUE)))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(17, 17, 17)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
						.addComponent(entreeTextField, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
						.addComponent(sideTextField, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
						.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
						.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(saladTextField, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(dessertTextField, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel5).addComponent(
						caloriesTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel6).addComponent(
						priceTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE))
				.addContainerGap(41, Short.MAX_VALUE)));

		setVisible(true);
		pack();
	}
}