import java.util.*;

public class No_3 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); 
		int year = c.get(Calendar.YEAR);  
		int month = c.get(Calendar.MONTH);   
		int date = c.get(Calendar.DATE);    
		int hour = c.get(Calendar.HOUR_OF_DAY);   
		System.out.println(year+"-"+month+"-"+date+" "+hour+"h");
		System.out.print("现在是"+year+"年, ");
		if(month<=6) {
			System.out.print("上半年，"+month+"月");
		}
		else {
			System.out.print("下半年，"+month+"月");
		}
		if(date<=10) {
			System.out.print("上旬");
		}
		else if(date>10&&date<=20) {
			System.out.print("中旬");
		}
		else {
			System.out.print("下旬");
		}
		int b=((hour>0)==true?1:0)+((hour>5)==true?1:0)+((hour>10)==true?1:0)+((hour>12)==true?1:0)+((hour>17)==true?1:0);
		switch(b) {
		case 1:
			System.out.print("凌晨");
			break;
		case 2:
			System.out.print("早上");
			break;
		case 3:
			System.out.print("中午");
			break;
		case 4:
			System.out.print("下午");
			break;
		case 5:
			System.out.print("晚上");
			break;
		}
	}

}
