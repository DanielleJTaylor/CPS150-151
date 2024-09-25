
public class Time implements Comparable<Object> {

 int hours;
 int minutes;
	
	public void setHours(int hours) {
		if (hours>= 0 && hours<= 23) {
			this.hours = hours;
		}
		else {
			throw new IllegalArgumentException("Hours must in between 0 to 23");
		}
	}
	
	public void setMinutes(int minutes) {
		if (minutes>= 0 && minutes<= 59) {
			this.minutes = minutes;
		}
		else {
			throw new IllegalArgumentException("Minutes must in between 0 to 59");
		}
	}
	
	
	public Time (int hours, int minutes) {
		setHours(hours);
		setMinutes(minutes);
	}
	
	public double asDouble() {
		return this.hours + (this.minutes) / 60;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
			if (o instanceof Time) {

				return (int) Math.round((this.asDouble() - ((Time) o).asDouble()));
				
			}
	

		throw new IllegalArgumentException("O object should be an Time object");
		
	}
	

	@Override
	public String toString() {
		String time_display = "";
		 if(this.hours < 10) {time_display += "0";}
		time_display += this.hours;
		time_display += ":"; 
		if(this.minutes < 10) {time_display += "0";}
		time_display += this.minutes; 
		
		return time_display;
	}
	
	
	
	
	
	
}
