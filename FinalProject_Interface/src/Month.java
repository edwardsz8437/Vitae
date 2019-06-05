import java.util.ArrayList;

public class Month {
	
	private ArrayList<Day> days = new ArrayList<Day>(); //initializes an array of events that belong to each day 
	
	public Month ()
	{
		this.days=days;
	}
	
	public Month (Day first, Day second, Day third)
	{
		
		days.add(first);
		days.add(second);
		days.add(third);
		
		
	}
	
	Day first=new Day("May", 1, 2019, 5, 0, 0);
	Day second=new Day("May", 2, 2019, 0, 0, 0);
	Day third=new Day("May", 3, 2019, 0, 0, 0);
	
	public double findAverageMood()
	{
		
		
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