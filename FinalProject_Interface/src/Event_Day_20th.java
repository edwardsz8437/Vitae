import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class Event_Day_20th {

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
					Event_Day_20th window = new Event_Day_20th();
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
	public Event_Day_20th() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 504, 512);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		txtHoursOfSleep = new JTextField();
		txtHoursOfSleep.setEditable(false);
		txtHoursOfSleep.setText("  Hours of Sleep");
		txtHoursOfSleep.setColumns(10);
		
		txtMoodLevel = new JTextField();
		txtMoodLevel.setEditable(false);
		txtMoodLevel.setText("    Mood Level");
		txtMoodLevel.setColumns(10);
		
		txtFinances = new JTextField();
		txtFinances.setEditable(false);
		txtFinances.setText("      Finances");
		txtFinances.setColumns(10);
		
		txtDouble = new JTextField();
		txtDouble.setEditable(true);
		txtDouble.setText("DOUBLE");
		txtDouble.setColumns(10);
		
		txtDouble_1 = new JTextField();
		txtDouble_1.setEditable(true);
		txtDouble_1.setText("DOUBLE");
		txtDouble_1.setColumns(10);
		
		txtInt = new JTextField();
		txtInt.setEditable(true);
		txtInt.setText("INT");
		txtInt.setColumns(10);
		
		txtMonthDay = new JTextField();
		txtMonthDay.setEditable(false);
		txtMonthDay.setText("MONTH - 20th");
		txtMonthDay.setColumns(10);
		
		txtYourEvents = new JTextField();
		txtYourEvents.setEditable(false);
		txtYourEvents.setText("\t\tYOUR EVENTS");
		txtYourEvents.setColumns(10);
		
		txtEvents = new JTextField();
		txtEvents.setEditable(false);
		txtEvents.setText("EVENTS");
		txtEvents.setColumns(10);
		
		JButton btnNewButton = new JButton("EDIT DAY");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtEvents, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
						.addComponent(txtYourEvents, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
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
						.addComponent(btnNewButton, Alignment.LEADING))
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
					.addComponent(btnNewButton)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
	}
}
