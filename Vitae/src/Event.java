
public class Event {
	
private String eventName;
private String startTime;
private String endTime;
private String eventLocation;

public Event()
{

	
}

public Event(String event, String time1, String time2, String location)
{  
	this.eventName=event;
	this.startTime=time1;
	this.endTime=time2;
	this.eventLocation=location;
}
public String getEventName() {
	return eventName;
}
public void setEventName(String eventName) {
	this.eventName = eventName;
}


public String getEventLocation() {
	return eventLocation;
}
public void setEventLocation(String eventLocation) {
	this.eventLocation = eventLocation;
}

public String getStartTime() {
	return startTime;
}

public void setStartTime(String startTime) {
	this.startTime = startTime;
}

public String getEndTime() {
	return endTime;
}

public void setEndTime(String endTime) {
	this.endTime = endTime;
} 
	
public String toString()
{
	return (eventName + "\n" + startTime + "-" + endTime + "\n" + eventLocation);
	
}



}
