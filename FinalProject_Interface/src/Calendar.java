import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calendar extends JFrame {

	private JPanel contentPane;
	private JTextField txtMonthyear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calendar frame = new Calendar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void setIndex(String x, String month)
	{
		x = month;
	}
	

	/**
	 * Create the fram.
	 */
	public Calendar() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		String x = "oopsy woopsy this don't work";
		String[] months = new String [12];
		setBounds(100, 100, 476, 299);
=======
		setBounds(100, 100, 452, 356);
>>>>>>> parent of 37fb776... Calnedar UI Update
=======
		setBounds(100, 100, 452, 356);
>>>>>>> parent of 37fb776... Calnedar UI Update
=======
		setBounds(100, 100, 452, 356);
>>>>>>> parent of 37fb776... Calnedar UI Update
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		JMenu mnMonth = new JMenu("Month");
		menuBar.add(mnMonth);
		
		JMenuItem mntmJanuary = new JMenuItem("January");
		mnMonth.add(mntmJanuary);
		months[0] = "January";
		mntmJanuary.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				setIndex(x, "January");
			}
		});

		
		JMenuItem mntmFebruary = new JMenuItem("February");
		mnMonth.add(mntmFebruary);
		months[1] = "February";
		mntmJanuary.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				setIndex(x, "February");
			}
		});

		
		JMenuItem mntmMarch = new JMenuItem("March");
		mnMonth.add(mntmMarch);
		months[2] = "March";
		mntmJanuary.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				setIndex(x, "March");
			}
		});

		
		JMenuItem mntmApril = new JMenuItem("April");
		mnMonth.add(mntmApril);
		months[3] = "April";
		mntmJanuary.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				setIndex(x, "April");
			}
		});

		
		JMenuItem mntmMay = new JMenuItem("May");
		mnMonth.add(mntmMay);
		months[4] = "May";
		mntmJanuary.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				setIndex(x, "May");
			}
		});

		
		JMenuItem mntmJune = new JMenuItem("June");
		mnMonth.add(mntmJune);
		months[5] = "June";
		mntmJanuary.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				setIndex(x, "June");
			}
		});

		
		JMenuItem mntmJuly = new JMenuItem("July");
		mnMonth.add(mntmJuly);
		months[6] = "July";
		mntmJanuary.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				setIndex(x, "July");
			}
		});

		
		JMenuItem mntmAugust = new JMenuItem("August");
		mnMonth.add(mntmAugust);
		months[7] = "August";
		mntmJanuary.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				setIndex(x, "August");
			}
		});

		
		JMenuItem mntmSeptember = new JMenuItem("September");
		mnMonth.add(mntmSeptember);
		months[8] = "September";
		mntmJanuary.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				setIndex(x, "September");
			}
		});

		
		JMenuItem mntmOctober = new JMenuItem("October");
		mnMonth.add(mntmOctober);
		months[9] = "October";
		mntmJanuary.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				setIndex(x, "October");
			}
		});

		
		JMenuItem mntmNovember = new JMenuItem("November");
		mnMonth.add(mntmNovember);
		months[10] = "November";
		mntmJanuary.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				setIndex(x, "November");
			}
		});

		
		JMenuItem mntmDecember = new JMenuItem("December");
		mnMonth.add(mntmDecember);
		months[11] = "December";
		mntmJanuary.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				setIndex(x, "December");
			}
		});

=======
=======
>>>>>>> parent of 37fb776... Calnedar UI Update
=======
>>>>>>> parent of 37fb776... Calnedar UI Update
		JButton btnMonth = new JButton("Month");
		btnMonth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuBar.add(btnMonth);
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> parent of 37fb776... Calnedar UI Update
=======
>>>>>>> parent of 37fb776... Calnedar UI Update
=======
>>>>>>> parent of 37fb776... Calnedar UI Update
		
		txtMonthyear = new JTextField();
		txtMonthyear.setEditable(false);
		txtMonthyear.setHorizontalAlignment(SwingConstants.CENTER);
		txtMonthyear.setText(x);
		menuBar.add(txtMonthyear);
		txtMonthyear.setColumns(10);
		
		JButton btnYear = new JButton("Year");
		btnYear.setHorizontalAlignment(SwingConstants.TRAILING);
		menuBar.add(btnYear);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		JButton btnst = new JButton(" 1st ");
		btnst.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				 int x = 0;
=======
=======
>>>>>>> parent of 37fb776... Calnedar UI Update
=======
>>>>>>> parent of 37fb776... Calnedar UI Update
		JButton btnst = new JButton("1st");
		btnst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
>>>>>>> parent of 37fb776... Calnedar UI Update
			}
		});
		GridBagConstraints gbc_btnst = new GridBagConstraints();
		gbc_btnst.insets = new Insets(0, 0, 5, 5);
		gbc_btnst.gridx = 0;
		gbc_btnst.gridy = 0;
		contentPane.add(btnst, gbc_btnst);
		
		JButton btnnd = new JButton("2nd");
		GridBagConstraints gbc_btnnd = new GridBagConstraints();
		gbc_btnnd.insets = new Insets(0, 0, 5, 5);
		gbc_btnnd.gridx = 1;
		gbc_btnnd.gridy = 0;
		contentPane.add(btnnd, gbc_btnnd);
		
		JButton btnrd = new JButton("3rd");
		GridBagConstraints gbc_btnrd = new GridBagConstraints();
		gbc_btnrd.insets = new Insets(0, 0, 5, 5);
		gbc_btnrd.gridx = 2;
		gbc_btnrd.gridy = 0;
		contentPane.add(btnrd, gbc_btnrd);
		
		JButton btnNewButton = new JButton("4th");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 0;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("5th");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.anchor = GridBagConstraints.NORTH;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 4;
		gbc_btnNewButton_1.gridy = 0;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("6th");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 5;
		gbc_btnNewButton_2.gridy = 0;
		contentPane.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnth = new JButton("7th");
		GridBagConstraints gbc_btnth = new GridBagConstraints();
		gbc_btnth.insets = new Insets(0, 0, 5, 0);
		gbc_btnth.gridx = 6;
		gbc_btnth.gridy = 0;
		contentPane.add(btnth, gbc_btnth);
		
		JButton btnth_1 = new JButton("8th");
		GridBagConstraints gbc_btnth_1 = new GridBagConstraints();
		gbc_btnth_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnth_1.gridx = 0;
		gbc_btnth_1.gridy = 1;
		contentPane.add(btnth_1, gbc_btnth_1);
		
		JButton btnth_2 = new JButton("9th");
		GridBagConstraints gbc_btnth_2 = new GridBagConstraints();
		gbc_btnth_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnth_2.gridx = 1;
		gbc_btnth_2.gridy = 1;
		contentPane.add(btnth_2, gbc_btnth_2);
		
		JButton btnth_3 = new JButton("10th'");
		GridBagConstraints gbc_btnth_3 = new GridBagConstraints();
		gbc_btnth_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnth_3.gridx = 2;
		gbc_btnth_3.gridy = 1;
		contentPane.add(btnth_3, gbc_btnth_3);
		
		JButton btnth_4 = new JButton("11th");
		GridBagConstraints gbc_btnth_4 = new GridBagConstraints();
		gbc_btnth_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnth_4.gridx = 3;
		gbc_btnth_4.gridy = 1;
		contentPane.add(btnth_4, gbc_btnth_4);
		
		JButton btnth_5 = new JButton("12th");
		GridBagConstraints gbc_btnth_5 = new GridBagConstraints();
		gbc_btnth_5.insets = new Insets(0, 0, 5, 5);
		gbc_btnth_5.gridx = 4;
		gbc_btnth_5.gridy = 1;
		contentPane.add(btnth_5, gbc_btnth_5);
		
		JButton btnth_6 = new JButton("13th");
		GridBagConstraints gbc_btnth_6 = new GridBagConstraints();
		gbc_btnth_6.insets = new Insets(0, 0, 5, 5);
		gbc_btnth_6.gridx = 5;
		gbc_btnth_6.gridy = 1;
		contentPane.add(btnth_6, gbc_btnth_6);
		
		JButton btnth_7 = new JButton("14th");
		GridBagConstraints gbc_btnth_7 = new GridBagConstraints();
		gbc_btnth_7.insets = new Insets(0, 0, 5, 0);
		gbc_btnth_7.gridx = 6;
		gbc_btnth_7.gridy = 1;
		contentPane.add(btnth_7, gbc_btnth_7);
		
		JButton btnth_8 = new JButton("15th");
		GridBagConstraints gbc_btnth_8 = new GridBagConstraints();
		gbc_btnth_8.insets = new Insets(0, 0, 5, 5);
		gbc_btnth_8.gridx = 0;
		gbc_btnth_8.gridy = 2;
		contentPane.add(btnth_8, gbc_btnth_8);
		
		JButton btnth_9 = new JButton("16th");
		GridBagConstraints gbc_btnth_9 = new GridBagConstraints();
		gbc_btnth_9.insets = new Insets(0, 0, 5, 5);
		gbc_btnth_9.gridx = 1;
		gbc_btnth_9.gridy = 2;
		contentPane.add(btnth_9, gbc_btnth_9);
		
		JButton btnth_10 = new JButton("17th");
		GridBagConstraints gbc_btnth_10 = new GridBagConstraints();
		gbc_btnth_10.insets = new Insets(0, 0, 5, 5);
		gbc_btnth_10.gridx = 2;
		gbc_btnth_10.gridy = 2;
		contentPane.add(btnth_10, gbc_btnth_10);
		
		JButton btnth_11 = new JButton("18th");
		GridBagConstraints gbc_btnth_11 = new GridBagConstraints();
		gbc_btnth_11.insets = new Insets(0, 0, 5, 5);
		gbc_btnth_11.gridx = 3;
		gbc_btnth_11.gridy = 2;
		contentPane.add(btnth_11, gbc_btnth_11);
		
		JButton btnth_12 = new JButton("19th");
		GridBagConstraints gbc_btnth_12 = new GridBagConstraints();
		gbc_btnth_12.insets = new Insets(0, 0, 5, 5);
		gbc_btnth_12.gridx = 4;
		gbc_btnth_12.gridy = 2;
		contentPane.add(btnth_12, gbc_btnth_12);
		
		JButton btnth_13 = new JButton("20th");
		GridBagConstraints gbc_btnth_13 = new GridBagConstraints();
		gbc_btnth_13.insets = new Insets(0, 0, 5, 5);
		gbc_btnth_13.gridx = 5;
		gbc_btnth_13.gridy = 2;
		contentPane.add(btnth_13, gbc_btnth_13);
		
		JButton btnth_14 = new JButton("21th");
		GridBagConstraints gbc_btnth_14 = new GridBagConstraints();
		gbc_btnth_14.insets = new Insets(0, 0, 5, 0);
		gbc_btnth_14.gridx = 6;
		gbc_btnth_14.gridy = 2;
		contentPane.add(btnth_14, gbc_btnth_14);
		
		JButton btnht = new JButton("22th");
		GridBagConstraints gbc_btnht = new GridBagConstraints();
		gbc_btnht.insets = new Insets(0, 0, 5, 5);
		gbc_btnht.gridx = 0;
		gbc_btnht.gridy = 3;
		contentPane.add(btnht, gbc_btnht);
		
		JButton btnth_15 = new JButton("23th");
		GridBagConstraints gbc_btnth_15 = new GridBagConstraints();
		gbc_btnth_15.insets = new Insets(0, 0, 5, 5);
		gbc_btnth_15.gridx = 1;
		gbc_btnth_15.gridy = 3;
		contentPane.add(btnth_15, gbc_btnth_15);
		
		JButton btnth_16 = new JButton("24th");
		GridBagConstraints gbc_btnth_16 = new GridBagConstraints();
		gbc_btnth_16.insets = new Insets(0, 0, 5, 5);
		gbc_btnth_16.gridx = 2;
		gbc_btnth_16.gridy = 3;
		contentPane.add(btnth_16, gbc_btnth_16);
		
		JButton btnth_17 = new JButton("25th");
		GridBagConstraints gbc_btnth_17 = new GridBagConstraints();
		gbc_btnth_17.insets = new Insets(0, 0, 5, 5);
		gbc_btnth_17.gridx = 3;
		gbc_btnth_17.gridy = 3;
		contentPane.add(btnth_17, gbc_btnth_17);
		
		JButton btnth_18 = new JButton("26th");
		GridBagConstraints gbc_btnth_18 = new GridBagConstraints();
		gbc_btnth_18.insets = new Insets(0, 0, 5, 5);
		gbc_btnth_18.gridx = 4;
		gbc_btnth_18.gridy = 3;
		contentPane.add(btnth_18, gbc_btnth_18);
		
		JButton btnth_19 = new JButton("27th");
		GridBagConstraints gbc_btnth_19 = new GridBagConstraints();
		gbc_btnth_19.insets = new Insets(0, 0, 5, 5);
		gbc_btnth_19.gridx = 5;
		gbc_btnth_19.gridy = 3;
		contentPane.add(btnth_19, gbc_btnth_19);
		
		JButton btnth_20 = new JButton("28th");
		GridBagConstraints gbc_btnth_20 = new GridBagConstraints();
		gbc_btnth_20.insets = new Insets(0, 0, 5, 0);
		gbc_btnth_20.gridx = 6;
		gbc_btnth_20.gridy = 3;
		contentPane.add(btnth_20, gbc_btnth_20);
		
		JButton btnth_21 = new JButton("29th");
		GridBagConstraints gbc_btnth_21 = new GridBagConstraints();
		gbc_btnth_21.insets = new Insets(0, 0, 0, 5);
		gbc_btnth_21.gridx = 0;
		gbc_btnth_21.gridy = 4;
		contentPane.add(btnth_21, gbc_btnth_21);
		
		JButton btnth_22 = new JButton("30th");
		GridBagConstraints gbc_btnth_22 = new GridBagConstraints();
		gbc_btnth_22.insets = new Insets(0, 0, 0, 5);
		gbc_btnth_22.gridx = 1;
		gbc_btnth_22.gridy = 4;
		contentPane.add(btnth_22, gbc_btnth_22);
		
		JButton btnth_23 = new JButton("31th");
		GridBagConstraints gbc_btnth_23 = new GridBagConstraints();
		gbc_btnth_23.insets = new Insets(0, 0, 0, 5);
		gbc_btnth_23.gridx = 2;
		gbc_btnth_23.gridy = 4;
		contentPane.add(btnth_23, gbc_btnth_23);
	}

}
