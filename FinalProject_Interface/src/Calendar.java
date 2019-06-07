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
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

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

	/**
	 * Create the frame.
	 */
	public Calendar() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String[] months = new String [12];
		setBounds(100, 100, 476, 299);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMonth = new JMenu("Month");
		menuBar.add(mnMonth);
		
		JMenuItem mntmJanuary = new JMenuItem("January");
		mnMonth.add(mntmJanuary);
		months[0] = "January";
		
		JMenuItem mntmFebruary = new JMenuItem("February");
		mnMonth.add(mntmFebruary);
		months[1] = "February";
		
		JMenuItem mntmMarch = new JMenuItem("March");
		mnMonth.add(mntmMarch);
		months[2] = "March";
		
		JMenuItem mntmApril = new JMenuItem("April");
		mnMonth.add(mntmApril);
		months[3] = "April";
		
		JMenuItem mntmMay = new JMenuItem("May");
		mnMonth.add(mntmMay);
		months[4] = "May";
		
		JMenuItem mntmJune = new JMenuItem("June");
		mnMonth.add(mntmJune);
		months[5] = "June";
		
		JMenuItem mntmJuly = new JMenuItem("July");
		mnMonth.add(mntmJuly);
		months[6] = "July";
		
		JMenuItem mntmAugust = new JMenuItem("August");
		mnMonth.add(mntmAugust);
		months[7] = "August";
		
		JMenuItem mntmSeptember = new JMenuItem("September");
		mnMonth.add(mntmSeptember);
		months[8] = "September";
		
		JMenuItem mntmOctober = new JMenuItem("October");
		mnMonth.add(mntmOctober);
		months[9] = "October";
		
		JMenuItem mntmNovember = new JMenuItem("November");
		mnMonth.add(mntmNovember);
		months[10] = "November";
		
		JMenuItem mntmDecember = new JMenuItem("December");
		mnMonth.add(mntmDecember);
		months[11] = "December";
		
		txtMonthyear = new JTextField();
		txtMonthyear.setEditable(false);
		txtMonthyear.setHorizontalAlignment(SwingConstants.CENTER);
		txtMonthyear.setText(months[0]);
		menuBar.add(txtMonthyear);
		txtMonthyear.setColumns(10);
		
		JMenu mnYear = new JMenu("Year");
		menuBar.add(mnYear);
		
		JMenuItem menuItem = new JMenuItem("2018");
		mnYear.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("2019");
		mnYear.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("2020");
		mnYear.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("2021");
		mnYear.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem("2022");
		mnYear.add(menuItem_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnst = new JButton(" 1st ");
		btnst.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				Event_Day_1st dayUI = new Event_Day_1st();
				dayUI.openDayUI();
			}
		});
		
		JButton btnnd = new JButton("2nd");
		btnnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_2nd dayUI = new Event_Day_2nd();
				dayUI.openDayUI();
			}
		});
		
		JButton btnrd = new JButton(" 3rd ");
		btnrd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_3rd dayUI = new Event_Day_3rd();
				dayUI.openDayUI();
			}
		});
		
		JButton btnNewButton = new JButton(" 4th ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_4th dayUI = new Event_Day_4th();
				dayUI.openDayUI();
			}
		});
		
		JButton btnNewButton_1 = new JButton(" 5th ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_5th dayUI = new Event_Day_5th();
				dayUI.openDayUI();
			}
		});
		
		JButton btnNewButton_2 = new JButton(" 6th ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_6th dayUI = new Event_Day_6th();
				dayUI.openDayUI();
			}
		});
		
		JButton btnth = new JButton(" 7th ");
		btnth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_7th dayUI = new Event_Day_7th();
				dayUI.openDayUI();
			}
		});
		
		JButton btnth_1 = new JButton(" 8th ");
		btnth_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_8th dayUI = new Event_Day_8th();
				dayUI.openDayUI();
			}
		});
		
		JButton btnth_2 = new JButton(" 9th ");
		btnth_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_9th dayUI = new Event_Day_9th();
				dayUI.openDayUI();
			}
		});
		
		JButton btnth_3 = new JButton("10th");
		btnth_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_10th dayUI = new Event_Day_10th();
				dayUI.openDayUI();
			}
		});
		
		JButton btnth_4 = new JButton("11th");
		btnth_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_11th dayUI = new Event_Day_11th();
				dayUI.openDayUI();
			}
		});
		
		JButton btnth_5 = new JButton("12th");
		btnth_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_12th dayUI = new Event_Day_12th();
				dayUI.openDayUI();
			}
		});
		
		JButton btnth_6 = new JButton("13th");
		btnth_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_13th dayUI = new Event_Day_13th();
				dayUI.openDayUI();
			}
		});
		
		JButton btnth_7 = new JButton("14th");
		btnth_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_14th dayUI = new Event_Day_14th();
				dayUI.openDayUI();
			}
		});
		
		JButton btnth_8 = new JButton("15th");
		btnth_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_15th dayUI = new Event_Day_15th();
				dayUI.openDayUI();
			}
		});
		
		JButton btnth_9 = new JButton("16th");
		btnth_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_16th dayUI = new Event_Day_16th();
				dayUI.openDayUI();
			}
		});
		
		JButton btnth_10 = new JButton("17th");
		btnth_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_17th dayUI = new Event_Day_17th();
				dayUI.openDayUI();
			}
		});
		
		JButton btnth_11 = new JButton("18th");
		btnth_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_18th dayUI = new Event_Day_18th();
				dayUI.openDayUI();
			}
		});
		
		JButton btnth_12 = new JButton("19th");
		btnth_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_19th dayUI = new Event_Day_19th();
				dayUI.openDayUI();
			}
		});
		
		JButton btnth_13 = new JButton("20th");
		btnth_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_20th dayUI = new Event_Day_20th();
				dayUI.openDayUI();
			}
		});
		
		JButton btnth_14 = new JButton("21st");
		btnth_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_21st dayUI = new Event_Day_21st();
				dayUI.openDayUI();
			}
		});
		
		JButton btnht = new JButton("22nd");
		btnht.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_22nd dayUI = new Event_Day_22nd();
				dayUI.openDayUI();
			}
		});
		
		JButton btnth_15 = new JButton("23rd");
		btnth_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_23rd dayUI = new Event_Day_23rd();
				dayUI.openDayUI();
			}
		});
		
		JButton btnth_16 = new JButton("24th");
		btnth_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_24th dayUI = new Event_Day_24th();
				dayUI.openDayUI();
			}
		});
		
		JButton btnth_17 = new JButton("25th");
		btnth_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_25th dayUI = new Event_Day_25th();
				dayUI.openDayUI();
			}
		});
		
		JButton btnth_18 = new JButton("26th");
		btnth_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_26th dayUI = new Event_Day_26th();
				dayUI.openDayUI();
			}
		});
		
		JButton btnth_19 = new JButton("27th");
		btnth_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_27th dayUI = new Event_Day_27th();
				dayUI.openDayUI();
			}
		});
		
		JButton btnth_20 = new JButton("28th");
		btnth_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_28th dayUI = new Event_Day_28th();
				dayUI.openDayUI();
			}
		});
		
		JButton btnth_21 = new JButton("29th");
		btnth_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_29th dayUI = new Event_Day_29th();
				dayUI.openDayUI();
			}
		});
		
		JButton btnth_22 = new JButton("30th");
		btnth_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_30th dayUI = new Event_Day_30th();
				dayUI.openDayUI();
			}
		});
		
		JButton btnth_23 = new JButton("31st");
		btnth_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event_Day_31st dayUI = new Event_Day_31st();
				dayUI.openDayUI();
			}
		});
		
		JButton btnGetCharts = new JButton("Get Avg Mood");
		btnGetCharts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month moodAvg = new Month();
				moodAvg.findAverageMood();
			}
		});
		
		JButton btnGetAvgSleep = new JButton("Get Avg Sleep");
		btnGetAvgSleep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton btnGetAvgFinaces = new JButton("Get Avg Finaces");
		btnGetAvgFinaces.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
			
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(2)
							.addComponent(btnst)
							.addGap(9)
							.addComponent(btnnd)
							.addGap(7)
							.addComponent(btnrd)
							.addGap(5)
							.addComponent(btnNewButton)
							.addGap(5)
							.addComponent(btnNewButton_1)
							.addGap(5)
							.addComponent(btnNewButton_2)
							.addGap(5)
							.addComponent(btnth))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(btnth_1)
							.addGap(6)
							.addComponent(btnth_2)
							.addGap(5)
							.addComponent(btnth_3)
							.addGap(5)
							.addComponent(btnth_4)
							.addGap(5)
							.addComponent(btnth_5)
							.addGap(5)
							.addComponent(btnth_6)
							.addGap(5)
							.addComponent(btnth_7))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(btnth_8)
							.addGap(6)
							.addComponent(btnth_9)
							.addGap(5)
							.addComponent(btnth_10)
							.addGap(5)
							.addComponent(btnth_11)
							.addGap(5)
							.addComponent(btnth_12)
							.addGap(5)
							.addComponent(btnth_13)
							.addGap(6)
							.addComponent(btnth_14))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnht)
							.addGap(5)
							.addComponent(btnth_15)
							.addGap(5)
							.addComponent(btnth_16)
							.addGap(5)
							.addComponent(btnth_17)
							.addGap(5)
							.addComponent(btnth_18)
							.addGap(5)
							.addComponent(btnth_19)
							.addGap(5)
							.addComponent(btnth_20))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnGetCharts)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnth_21)
									.addGap(6)
									.addComponent(btnth_22)
									.addGap(6)
									.addComponent(btnth_23))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnGetAvgSleep)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnGetAvgFinaces)))
					.addContainerGap(33, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnst)
						.addComponent(btnnd)
						.addComponent(btnrd)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton_2)
						.addComponent(btnth))
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnth_1)
						.addComponent(btnth_2)
						.addComponent(btnth_3)
						.addComponent(btnth_4)
						.addComponent(btnth_5)
						.addComponent(btnth_6)
						.addComponent(btnth_7))
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnth_8)
						.addComponent(btnth_9)
						.addComponent(btnth_10)
						.addComponent(btnth_11)
						.addComponent(btnth_12)
						.addComponent(btnth_13)
						.addComponent(btnth_14))
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnht)
						.addComponent(btnth_15)
						.addComponent(btnth_16)
						.addComponent(btnth_17)
						.addComponent(btnth_18)
						.addComponent(btnth_19)
						.addComponent(btnth_20))
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnth_21)
						.addComponent(btnth_22)
						.addComponent(btnth_23))
					.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnGetAvgSleep)
						.addComponent(btnGetAvgFinaces))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnGetCharts)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}