import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class Event_Day_14th {

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
					Event_Day_14th window = new Event_Day_14th();
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
	public Event_Day_14th() {
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
		
		Day fourteenth = new Day("Janurary", 14, 2000, 5, 2, 100.00);
		boolean edit = false;
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
		txtDouble.setText("" + fourteenth.getSleepAmount());
		txtDouble.setColumns(10);
		
		txtDouble_1 = new JTextField();
		txtDouble_1.setEditable(edit);
		txtDouble_1.setText("$" + fourteenth.getFinances());
		txtDouble_1.setColumns(10);
		
		txtInt = new JTextField();
		txtInt.setEditable(edit);
		txtInt.setText("" + fourteenth.getMoodLevel());
		txtInt.setColumns(10);
		
		txtMonthDay = new JTextField();
		txtMonthDay.setEditable(edit);
		txtMonthDay.setText(fourteenth.getMonthName() + " " + fourteenth.getDate() + ", " + fourteenth.getYearNum());
		txtMonthDay.setColumns(10);
		
		txtYourEvents = new JTextField();
		txtYourEvents.setEditable(edit);
		txtYourEvents.setText("\t\tYOUR EVENTS");
		txtYourEvents.setColumns(10);
		
		txtEvents = new JTextField();
		txtEvents.setEditable(edit);
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
