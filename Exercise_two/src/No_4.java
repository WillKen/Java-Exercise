
public class No_4 {
	public static class MyDate{
		private int year,month,day;
		private static String[] strMonths= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		private static String[] strDays= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		private static int[] daysInMonths= {31,28,31,30,31,30,31,31,30,31,30,31};
		public static boolean isLeapYear(int year) {
			if((year%4==0&&year%100!=0)||year%400==0) {
				return true;
			}
			else
				return false;
		}
		public static boolean isValidDate(int year,int month,int day) {
			if(year<1||year>9999||month<1||month>12||day<1) {
				return false;
			}
			else {
				if(isLeapYear(year)) {
					daysInMonths[1]=29;
				}
				if(day>daysInMonths[month-1]) {
					return false;
				}
				return true;
			}
		}
		public static int getDayOfWeek(int year, int month,int day) {
			 if(month==1||month==2)
			    {  
			        month+=12;  
			        year--;  
			    }  
			    int week=(day+2*month+3*(month+1)/5+year+year/4-year/100+year/400+1)%7;  
			    return week;
		}
		public MyDate(int year,int month,int day) {
			if(isValidDate(year,month,day)) {
				this.year=year;
				this.month=month;
				this.day=day;
			}
		}
		public void setDate(int year,int month,int day) {
			if(isValidDate(year,month,day)) {
				this.year=year;
				this.month=month;
				this.day=day;
			}
		}
		public void setYear(int year) {
			if(year>=1&&year<=9999) {
				this.year=year;
			}
		}
		public void setMonth(int month) {
			if(month>=1&&year<=12) {
				this.month=month;
			}
		}
		public void setDay(int day) {
			if(isLeapYear(this.year)) {
				daysInMonths[1]=29;
			}
			if(day>=1&&day<=daysInMonths[this.month-1]) {
				this.day=day;
			}
		}
		public int getYear() {
			return year;
		}
		public int getMonth() {
			return month;
		}
		public int getDay() {
			return day;
		}
		public String toString() {
			String re="";
			int y=this.year;
			int m=this.month;
			int d=this.day;
			re+=strDays[getDayOfWeek(y,m,d)];
			re+=(" "+d+" ");
			re+=strMonths[m-1];
			re+=(" "+y);
			return re;
		}
		public MyDate nextDay() {
			if(isLeapYear(year)) {
				daysInMonths[1]=29;
			}
			if(this.day==daysInMonths[this.month-1]) {
				this.day=1;
				this.month++;
				if(this.month>12) {
					this.month=month%12;
					this.year++;
				}
			}
			else {
				this.day++;
			}
			return this;
		}
		public MyDate nextMonth() {
			this.month++;
			if(this.month>12) {
				this.month=month%12;
				this.year++;
			}
			if(this.day>daysInMonths[this.month-1]) {
				this.day=daysInMonths[this.month-1];
			}
			return this;
		}
		public MyDate nextYear() {
			this.year++;
			if(this.day==29&&this.month==2) {
				if(!isLeapYear(year)) {
					this.day--;
				}
			}
			return this;
		}
		public MyDate previousDay() {
			if(isLeapYear(year)) {
				daysInMonths[1]=29;
			}
			this.day--;
			if(day<1) {
				this.month--;
				if(month>=1) {
					this.day=daysInMonths[this.month-1];
				}
				else {
					this.month=12;
					this.day=daysInMonths[this.month-1];
					this.year--;
				}
			}
			return this;
		}
		public MyDate previousMonth() {
			this.month--;
			if(this.month<1) {
				this.month+=12;
				this.year--;
			}
			if(this.day>daysInMonths[this.month-1]) {
				this.day=daysInMonths[this.month-1];
			}
			return this;
		}
		public MyDate previousYear() {
			this.year--;
			if(this.day==29&&this.month==2) {
				if(!isLeapYear(year)) {
					this.day--;
				}
			}
			return this;
		}
	}
	
	public static void main(String[] args) {
		MyDate d1 = new MyDate(2012, 2, 28); System.out.println(d1); // Tuesday 28 Feb 2012 
		System.out.println(d1.nextDay()); // Wednesday 29 Feb 2012
		System.out.println(d1.nextDay()); // Thursday 1 Mar 2012 
		System.out.println(d1.nextMonth()); // Sunday 1 Apr 2012 
		System.out.println(d1.nextYear()); // Monday 1 Apr 2013 
		MyDate d2 = new MyDate(2012, 1, 2); 
		System.out.println(d2); // Monday 2 Jan 2012 
		System.out.println(d2.previousDay()); // Sunday 1 Jan 2012 
		System.out.println(d2.previousDay()); // Saturday 31 Dec 2011 
		System.out.println(d2.previousMonth()); // Wednesday 30 Nov 2011 
		System.out.println(d2.previousYear()); // Tuesday 30 Nov 2010 
		MyDate d3 = new MyDate(2012, 2, 29); 
		System.out.println(d3.previousYear()); // Monday 28 Feb 2011 
		// MyDate d4 = new MyDate(2099, 11, 31); // Invalid year, month, or day! 
		// MyDate d5 = new MyDate(2011, 2, 29); // Invalid year, month, or day!
	}
}