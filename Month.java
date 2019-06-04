import java.util.ArrayList;

public class Month {
	
	ArrayList<Day> days = new ArrayList<Day>(); //initializes an array of events that belong to each day 
	Day first=new Day("May", 1, 2019, 5, 0, 0.0);
	Day second=new Day("May", 2, 2019, 8, 0, 0.0);
	Day third=new Day("May", 3, 2019, 2, 0, 0.0);
	
	public double findAverageMood()
	{
		//remove all array objects in case user made changes, start from blank slate
		
		for (int i=0;i<days.size();i++)
		{
			days.remove(i);
			
		}
		
		days.add(first);
		days.add(second);
		days.add(third);
		
		int totalMood = 0;
		double average = 0;
		

		for (int i=0;i<days.size();i++)
		{
			
			totalMood+=days.get(i).getMoodLevel();
			
		}
		
		average=(double)totalMood/days.size();
		return average;
	}

}