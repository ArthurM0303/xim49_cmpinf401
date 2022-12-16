package xim49_MenuManager;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;
/**
*
* @author xinYiMing
*/
public class MenuManagerGUI extends JFrame {

	private JButton createCustomMenuButton, deleteMenuButton, maxCaloriesMenuButton, menuDetailsButton,
			minCaloriesMenuButton, randomMenuButton, saveMenuButton;;
	private JComboBox<String> dessertItems, entreeItems, saladItems, sideItems;
	private JLabel entreeLabel, jLabel1, jLabel6, jLabel7, saladLabel, sideLabel, dessertLabel;
	private JList<String> jList1;
	private JPanel mainPanel, jPanel1, jPanel2;
	private JScrollPane jScrollPane2;
	private JTextField jTextField1;

	private final MenuManager menuManager;
	private static final ArrayList<Menu> menus = new ArrayList<>();

	public MenuManagerGUI() {
		menuManager = new MenuManager("dish.txt");
		initComponents();
	}

	private void initComponents() {

		jTextField1 = new JTextField();
		mainPanel = new JPanel();
		jPanel1 = new JPanel();
		jLabel1 = new JLabel();
		entreeLabel = new JLabel();
		sideLabel = new JLabel();
		saladLabel = new JLabel();
		dessertLabel = new JLabel();
		entreeItems = new JComboBox<>();
		sideItems = new JComboBox<>();
		saladItems = new JComboBox<>();
		dessertItems = new JComboBox<>();
		createCustomMenuButton = new JButton();
		jPanel2 = new JPanel();
		jLabel6 = new JLabel();
		randomMenuButton = new JButton();
		minCaloriesMenuButton = new JButton();
		maxCaloriesMenuButton = new JButton();
		jLabel7 = new JLabel();
		menuDetailsButton = new JButton();
		deleteMenuButton = new JButton();
		saveMenuButton = new JButton();
		jScrollPane2 = new JScrollPane();
		jList1 = new JList<>();

		jTextField1.setText("jTextField1");

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		mainPanel.setAutoscrolls(true);
		mainPanel.setName("");

		jPanel1.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

		jLabel1.setText("Build your own Menu");

		entreeLabel.setText("Entree");

		sideLabel.setText("Side");

		saladLabel.setText("Salad");

		dessertLabel.setText("Dessert");
/*
		entreeItems.setModel(new DefaultComboBoxModel<>(menuManager.getEntreeItems()));

		sideItems.setModel(new DefaultComboBoxModel<>(menuManager.getSideItems()));

		saladItems.setModel(new DefaultComboBoxModel<>(menuManager.getSaladItems()));

		dessertItems.setModel(new DefaultComboBoxModel<>(menuManager.getDessertItems()));
*/
		createCustomMenuButton.setText("Create menu with these dishes");
		createCustomMenuButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				createCustomMenu(evt);
			}
		});

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(createCustomMenuButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
										.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(entreeLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(sideLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(saladLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(dessertLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))
								.addGap(26, 26, 26)
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(entreeItems, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(sideItems, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(saladItems, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(dessertItems, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(entreeLabel).addComponent(entreeItems, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(sideLabel).addComponent(sideItems, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(saladLabel).addComponent(saladItems, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(dessertLabel).addComponent(dessertItems, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(createCustomMenuButton).addContainerGap()));

		jPanel2.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

		jLabel6.setText("Or generate a Menu");

		randomMenuButton.setText("Generate a Random Menu");
		randomMenuButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				createRandomMenu(evt);
			}
		});

		minCaloriesMenuButton.setText("Generate a Minimum Calories menu");
		minCaloriesMenuButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				createMinCalorieMenu(evt);
			}
		});

		maxCaloriesMenuButton.setText("Generate a Manimum Calories Menu");
		maxCaloriesMenuButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				createMaxCalorieMenu(evt);
			}
		});

		GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(jLabel6))
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(26, 26, 26)
								.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
										.addComponent(randomMenuButton, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(minCaloriesMenuButton, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(maxCaloriesMenuButton, GroupLayout.DEFAULT_SIZE, 282,
												Short.MAX_VALUE))))
						.addContainerGap(24, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel6).addGap(18, 18, 18)
						.addComponent(randomMenuButton).addGap(18, 18, 18).addComponent(minCaloriesMenuButton)
						.addGap(18, 18, 18).addComponent(maxCaloriesMenuButton).addGap(0, 28, Short.MAX_VALUE)));

		jLabel7.setText("Created Menus");

		menuDetailsButton.setText("Details");
		menuDetailsButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				displayDetails(evt);
			}
		});

		deleteMenuButton.setText("Delete all");
		deleteMenuButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				deleteAllMenus(evt);
			}
		});

		/*saveMenuButton.setText("Save to file");
		saveMenuButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				saveMenusToFille(evt);
			}
		});
*/
		jList1.setModel(new AbstractListModel<String>() {
			String[] menunames = getMenuNames();

			private String[] getMenuNames() {
				int i = 0;
				System.out.println("Size : " + MenuManagerGUI.menus.size());
				String[] names = new String[MenuManagerGUI.menus.size() + 1];
				for (Menu m : MenuManagerGUI.menus) {
					names[i++] = m.toString();
				}
				return names;
			}

			@Override
			public int getSize() {
				return menunames.length;
			}

			@Override
			public String getElementAt(int i) {
				return menunames[i];
			}
		});
		jScrollPane2.setViewportView(jList1);

		GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
		mainPanel.setLayout(mainPanelLayout);
		mainPanelLayout.setHorizontalGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(mainPanelLayout.createSequentialGroup().addContainerGap()
						.addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
						.addGap(18, 18, 18)
						.addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(mainPanelLayout.createSequentialGroup().addComponent(menuDetailsButton)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(deleteMenuButton, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(saveMenuButton))
								.addGroup(mainPanelLayout.createSequentialGroup().addComponent(jLabel7).addGap(0, 0,
										Short.MAX_VALUE))
								.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
						.addGap(5, 5, 5)));
		mainPanelLayout.setVerticalGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(mainPanelLayout.createSequentialGroup().addContainerGap()
						.addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(mainPanelLayout.createSequentialGroup()
										.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jPanel2,
												GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(mainPanelLayout.createSequentialGroup().addComponent(jLabel7)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jScrollPane2).addGap(18, 18, 18)
										.addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(menuDetailsButton).addComponent(deleteMenuButton)
												.addComponent(saveMenuButton))))
						.addContainerGap()));

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(mainPanel,
						GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(mainPanel,
				GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}

	private void createCustomMenu(ActionEvent evt) {
		String name = JOptionPane.showInputDialog("What would like to name this menu as:");
		MenuItem entree = menuManager.getEntreeItem((String) entreeItems.getSelectedItem());
		MenuItem side = menuManager.getSideItem((String) sideItems.getSelectedItem());
		MenuItem salad = menuManager.getSaladItem((String) saladItems.getSelectedItem());
		MenuItem dessert = menuManager.getDessertItem((String) dessertItems.getSelectedItem());
		Menu m = new Menu(name);
		m.addItem(side);
		m.addItem(entree);
		m.addItem(salad);
		m.addItem(dessert);

		menus.add(m);
		updateMenuList();
	}

	/**
	 * Creates a random menu
	 * 
	 * @param evt
	 */
	private void createRandomMenu(ActionEvent evt) {
		String name = JOptionPane.showInputDialog("What would like to name this random menu as:");
		Menu m = menuManager.randomMenu(name);
		m.setName(name);
		menus.add(m);
// updating the model for list
		updateMenuList();
	}

	/**
	 * Creates a menu with items whose calorie value is minimum
	 * 
	 * @param evt
	 */
	private void createMinCalorieMenu(ActionEvent evt) {
// TODO add your handling code here:
		String name = JOptionPane.showInputDialog("What would like to name this min calorie menu as:");
		Menu m = menuManager.minCaloriesMenu(name);
		m.setName(name);
		menus.add(m);
// updating the model for list
		updateMenuList();
	}

	/**
	 * Creates a menu with items which has highest calorie values
	 * 
	 * @param evt
	 */
	private void createMaxCalorieMenu(ActionEvent evt) {
		String name = JOptionPane.showInputDialog("What would like to name this max calorie menu as:");
		Menu m = menuManager.maxCaloriesMenu(name);
		m.setName(name);
		menus.add(m);
// updating the model for list
		updateMenuList();
	}

	/**
	 * Displays the details of a menu in a frame
	 * 
	 * @param evt
	 */
	private void displayDetails(ActionEvent evt) {
// TODO add your handling code here:
// here u need to display the details of the selected menu
// first get the selected menu first
		String name = jList1.getSelectedValue();
		if (name == null) {
			JOptionPane.showMessageDialog(null, "Please select any one list and try again", "Error",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		System.out.println("Menu : " + name);
		Menu selectedMenu = getMenuByName(name);
	}

	/**
	 * Deletes all the menus in the menus list called when delete all button is
	 * pressed
	 * 
	 * @param evt
	 */
	private void deleteAllMenus(ActionEvent evt) {
		menus.removeAll(menus); // remove all menus in the menulist
		updateMenuList();
	}

	/**
	 * Updates the jList model, whenever a new menu added or old menu is deleted
	 * from the it.
	 */
	private void updateMenuList() {
		jList1.setModel(new AbstractListModel<String>() {
			String[] menunames = getMenuNames();

			private String[] getMenuNames() {
				int i = 0;
				System.out.println("Size : " + MenuManagerGUI.menus.size());
				String[] names = new String[MenuManagerGUI.menus.size() + 1];
				for (Menu m : MenuManagerGUI.menus) {
					names[i++] = m.toString();
				}
				return names;
			}

			@Override
			public int getSize() {
				return menunames.length;
			}

			@Override
			public String getElementAt(int i) {
				return menunames[i];
			}
		});
	}

	/**
	 * Finds the menu with the given name and returns it
	 * 
	 * @param name
	 * @return
	 */
	private Menu getMenuByName(String name) {
		for (Menu m : menus) {
			if (m.getName().equals(name))
				return m;
		}
		return null;
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MenuManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MenuManagerGUI().setVisible(true);
			}
		});
	}
}