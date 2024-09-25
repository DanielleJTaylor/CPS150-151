
public class Event implements Comparable {

	String description;
	
	Time startTime;
	Time endTime;
	
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setStartTime(Time startTime) {
		if (startTime == null) {
			throw new IllegalArgumentException();
			
		}
		else {
			this.startTime = startTime;
		}
	}
	
	public void setEndTime(Time endTime) {
		if (endTime != null) {
			this.endTime = endTime;
		}
		else {throw new IllegalArgumentException();}
	}
	
	public Event(String description, Time endTime, Time startTime) {
		setStartTime(startTime);
		setEndTime(endTime);
		setDescription(description);
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof Event) {
		return (this.startTime.compareTo(((Event) o).startTime));

		}
		throw new IllegalArgumentException();
	}
	
	@Override
	 public String toString(){
		String event_display = "";
		
		event_display += this.description;
		event_display += "\n";

		event_display+= "Start Time: ";
        
		event_display += this.startTime.toString()+"\n";
        
		event_display += "End Time: ";
		event_display += this.endTime.toString();
		
		return event_display;
	 }
}
