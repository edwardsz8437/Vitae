import java.awt.GridLayout;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
public class Calendar
{
    JFrame frame = new JFrame("Calendar V1.0");
    JPanel panel = new JPanel();
    JButton day1 = new JButton("May 1st");
    JButton day2 = new JButton("May 2nd");
    JButton day3 = new JButton("May 3rd");
    JButton day4 = new JButton("May 4th");
    JButton day5 = new JButton("May 5th");
    JButton day6 = new JButton("May 6th");
    JButton day7 = new JButton("May 7th");
    JButton day8 = new JButton("May 8th");
    JButton day9 = new JButton("May 9th");
    JButton day10 = new JButton("May 10th");
    JButton day11 = new JButton("May 11th");
    JButton day12 = new JButton("May 12th");
    JButton day13 = new JButton("May 13th");
    JButton day14 = new JButton("May 14th");
    JButton day15 = new JButton("May 15th");
    JButton day16 = new JButton("May 16th");
    JButton day17 = new JButton("May 17th");
    JButton day18 = new JButton("May 18th");
    JButton day19 = new JButton("May 19th");
    JButton day20 = new JButton("May 20th");
    JButton day21 = new JButton("May 21st");
    JButton day22 = new JButton("May 22nd");
    JButton day23 = new JButton("May 23rd");
    JButton day24 = new JButton("May 24th");
    JButton day25 = new JButton("May 25th");
    JButton day26 = new JButton("May 26th");
    JButton day27 = new JButton("May 27th");
    JButton day28 = new JButton("May 28th");
    JButton day29 = new JButton("May 29th");
    JButton day30 = new JButton("May 30th");
    JButton day31 = new JButton("May 31st");
    
    JButton daysOfTheWeek = new JButton("Sunday\tMonday\tTuesday\tWednesday\tThursday\tFriday\tSaturday");
    
    public Calendar()
    {
        panel.setLayout(new GridLayout(5,7,3,3));
        panel.add(day1);
        panel.add(day2);
        panel.add(day3);
        panel.add(day4);
        panel.add(day5);
        panel.add(day6);
        panel.add(day7);
        panel.add(day8);
        panel.add(day9);
        panel.add(day10);
        panel.add(day11);
        panel.add(day12);
        panel.add(day13);
        panel.add(day14);
        panel.add(day15);
        panel.add(day16);
        panel.add(day17);
        panel.add(day18);
        panel.add(day19);
        panel.add(day20);
        panel.add(day21);
        panel.add(day22);
        panel.add(day23);
        panel.add(day24);
        panel.add(day25);
        panel.add(day26);
        panel.add(day27);
        panel.add(day28);
        panel.add(day29);
        panel.add(day30);
        panel.add(day31);
        frame.add(panel);
        
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String args[])
    {
        SwingUtilities.invokeLater(new Runnable() 
        {
            public void run()
            {
                new Calendar(); 
            } 
        });
    }
}