
public class MonthDrive {
public static void main(String[] args)
{   Day first=new Day("May", 1, 2019, 5, 10, 0);
Day second=new Day("May", 2, 2019, 0, 10, 0);
Day third=new Day("May", 3, 2019, 0, 10, 0);

	
	Month May=new Month(first, second, third);

	System.out.print("Average mood: " + May.findAverageMood() + "\n");
	System.out.print("Average Sleep: " + May.findAverageSleep()+"\n");
	System.out.print("Average spending: $" + May.findAverageFinances()+"\n");
}
}
