import java.util.ArrayList;

public class Month {
	
	private ArrayList<Day> days = new ArrayList<Day>(); //initializes an array of events that belong to each day 
	
	public Month ()
	{
		this.days=days;
	}
	
	public Month (Day first, Day second, Day third, Day fourth, Day fifth, Day sixth, Day seventh)
	{
		
		days.add(first);
		days.add(second);
		days.add(third);
		days.add(fourth);
		days.add(fifth);
		days.add(sixth);
		days.add(seventh);
		
		
	}
	
	Day first=new Day("May", 1, 2019, 5, 3, 100);
	Day second=new Day("May", 2, 2019, 7, 3, 30);
	Day third=new Day("May", 3, 2019, 6, 7, 2);
	
	public double findAverageMood()
	{		
		int totalMood = 0;
		double average = 0;
		

		for (int i=0;i<days.size();i++) //adds all the mood levels together from the month 
		{
			
			totalMood+=days.get(i).getMoodLevel();
			
		}
		
		average=(double)totalMood/days.size();
		return average;
	}
	
	
	public String badSleepEffect()
	{
		String badSleep[]=new String[]{"memory issues", "mood changes", "high blood pressure", "increased risk of diabetes", "weight gain",
		"weakened immune system"};
		
		return badSleep[(int)(Math.random())*6];
		
		
	}
	
	
	public String goodSleepEffect()
	{
		String goodSleep[]=new String[]{"happy mood", "increased memory", "strong immune system", "decreased risk of disease", "alertness",
		"more energy"};
		
		return goodSleep[(int)(Math.random())*6];
		
		
	}
	
	
	
	
	
	
	
	public String findAverageSleep()
	{
		double totalSleep = 0;
		double average = 0;
		String statement = "";

		for (int i=0;i<days.size();i++) //adds all the sleep levels together from the month
		{
			
		totalSleep=totalSleep + days.get(i).getSleepAmount();
			
		}
		
		average=(double)totalSleep/days.size();
		
		if (average<6)
		{
			statement=average + "\n" +"You should be getting more sleep." + "\n" + " A side effect of sleep deprivation is: "+ badSleepEffect();
		}
		
		
		if (average>6)
		{
			statement=average + "\n"+ "You are getting a good amount of sleep." + "\n" + " Good sleep leads to: "+goodSleepEffect();
		}
		
		return statement;
		
	}
	
	public double findAverageFinances()
	{
		double totalFinances = 0;
		double average = 0;
		   

		for (int i=0;i<days.size();i++) //adds all the sleep levels together from the month
		{
			
			totalFinances=totalFinances + days.get(i).getSleepAmount();
			
		}
		
		average=(double)totalFinances/days.size();
		return average;
		
	}


}