
public class Date {
	
	private int day;
	 private int month;
	 private int year;
	 
    public void display( ) {
	     System.out.println("day:-"+day+"\t"+"month:-"+month+"\t"+"year:-"+year);
	  }
    public Date(int d, int m, int y) {
		// TODO Auto-generated constructor stub
		day = d;
		month = m;
		year = y;
	}
	
 public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
