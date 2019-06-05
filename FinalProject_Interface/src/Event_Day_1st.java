import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

import java.util.Scanner;
public class Event_Day_1st {

	private JFrame frame;
	private JTextField txtHoursOfSleep;
	private JTextField txtMoodLevel;
	private JTextField txtFinances;
	private JTextField txtDouble;
	private JTextField txtDouble_1;
	private JTextField txtInt;
	private JTextField txtMonthDay;
	private JTextField txtYourEvents;
	private JTextField txtEvents;

	/**
	 * Launch the application.
	 */
	public static void openDayUI() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Event_Day_1st window = new Event_Day_1st();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Event_Day_1st() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		Day first = new Day("Janurary", 1, 2000, 0, 0, 0);
		frame = new JFrame();
		frame.setBounds(100, 100, 504, 512);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		boolean edit = false;
		
		JButton btnNewButton = new JButton("EDIT DAY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Scanner update = new Scanner(System.in);
				System.out.println("How long(hours) did you sleep for?");
				Double sleep = update.nextDouble();
				System.out.println("What is your mood level(1-10) today?");
				int mood = update.nextInt();
				System.out.println("How much money have you spent today?");
				Double finances = update.nextDouble();
			}
		});
		
		txtHoursOfSleep = new JTextField();
		txtHoursOfSleep.setEditable(edit);
		txtHoursOfSleep.setText("  Hours of Sleep");
		txtHoursOfSleep.setColumns(10);
		
		txtMoodLevel = new JTextField();
		txtMoodLevel.setEditable(edit);
		txtMoodLevel.setText("     Mood Level");
		txtMoodLevel.setColumns(10);
		
		txtFinances = new JTextField();
		txtFinances.setEditable(edit);
		txtFinances.setText("      Finances");
		txtFinances.setColumns(10);
		
		txtDouble = new JTextField();
		txtDouble.setEditable(edit);
		txtDouble.setText("" + first.getSleepAmount());
		txtDouble.setColumns(10);
		
		txtDouble_1 = new JTextField();
		txtDouble_1.setEditable(edit);
		txtDouble_1.setText("$" + first.getFinances());
		txtDouble_1.setColumns(10);
		
		txtInt = new JTextField();
		txtInt.setEditable(edit);
		txtInt.setText("" + first.getMoodLevel());
		txtInt.setColumns(10);
		
		txtMonthDay = new JTextField();
		txtMonthDay.setEditable(edit);
		txtMonthDay.setText(first.getMonthName() + " " + first.getDate() + ", " + first.getYearNum());
		txtMonthDay.setColumns(10);
		
		txtYourEvents = new JTextField();
		txtYourEvents.setEditable(edit);
		txtYourEvents.setText("\t\tYOUR EVENTS");
		txtYourEvents.setColumns(10);
		
		txtEvents = new JTextField();
		txtEvents.setEditable(edit);
		txtEvents.setText("EVENTS");
		txtEvents.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(txtEvents, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
						.addComponent(txtYourEvents, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(txtHoursOfSleep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(txtDouble, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(txtMoodLevel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(txtInt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(txtFinances, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(txtDouble_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addComponent(txtMonthDay, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnNewButton)
							.addPreferredGap(ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
							.addComponent(btnSave)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtHoursOfSleep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDouble, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtMoodLevel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtInt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtFinances, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDouble_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(txtMonthDay, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(txtYourEvents, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtEvents, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnSave))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
	}
}
