public class MonthDriver {
	
	public static void main(String[] args)
	{   
		Day first=new Day("May", 1, 2019, 5, 3, 20);
		Day second=new Day("May", 2, 2019, 7, 9, 50);
		Day third=new Day("May", 3, 2019, 8, 4, 34.67);
		Day fourth=new Day("May", 1, 2019, 5, 3, 20);
		Day fifth=new Day("May", 2, 2019, 7, 9, 50);
		Day sixth=new Day("May", 3, 2019, 8, 4, 34.67);
		Day seventh=new Day("May", 7, 2019, 8, 7.5, 24);
	
		Month May=new Month(first, second, third, fourth, fifth, sixth, seventh);

		System.out.println("Average mood: " + May.findAverageMood());
		System.out.println("Average sleep: " + May.findAverageSleep());
		System.out.println("Average finance: " + May.findAverageFinances());		
		}
}