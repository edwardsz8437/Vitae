import java.util.ArrayList;

public class Day {

//initialize all instance variables 
private String monthName;
private int date;
private int yearNum;
private int moodLevel;
private int sleepAmount;
private double finances;


ArrayList<Event> events = new ArrayList<Event>(); //initializes an array of events that belong to each day 


public Day(String monthName, int date, int yearNum, int moodLevel, int sleepAmount, double finances) //constructor for days 
{
	this.monthName=monthName;
	this.date=date;
	this.yearNum=yearNum;
	this.setMoodLevel(moodLevel);
	this.setSleepAmount(sleepAmount);
	this.setFinances(finances);
}
	



public void listAllEvents() //attain all Events from arrayList
{ 

	String eventString=new String(); //make a String that can be easily used in the toString() method to access all the events 
			
	for (int i=0; i<events.size(); i++)
	{
		eventString=eventString + events.get(i);
	}
	
}

public String getMonthName()
{
	return monthName;
}

public void setMonthName(String monthName)
{
	this.monthName = monthName;
}

public int getDate()
{
	return date;
}

public void setDate(int date)
{
	this.date = date;
}

public int getYearNum()
{
	return yearNum;
}

public void setYearNum(int yearNum)
{
	this.yearNum = yearNum;
}
public int getMoodLevel() {
	return moodLevel;
}

public void setMoodLevel(int moodLevel) {
	this.moodLevel = moodLevel;
}

public int getSleepAmount() {
	return sleepAmount;
}

public void setSleepAmount(int sleepAmount) {
	this.sleepAmount = sleepAmount;
}

public double getFinances() {
	return finances;
}

public void setFinances(double finances) {
	this.finances = finances;
}

public String toString()
{
	return (monthName + " " + date + ", " + yearNum + 
			"----------" + 
			"Events: ");
}
	
	
	
}

/*Date (instance variable)
Events (stored in an array list) 
Tracker Levels (instance variables) 
Methods:
void setMood() (int on a scale of 1 to 10, 1 is bad 10 is amazing)
void setSleepLevel() (int)
double calculateFinances(double moneyChange) (double update bank account/spending number)
void createEvent(String nameOfEvent, String timeFrame, String location) (creates an event in the day) 
void createTracker(String trackerName, int scale) (instantiates new variable to be tracked) 
*/