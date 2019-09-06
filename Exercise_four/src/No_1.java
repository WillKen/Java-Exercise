import java.util.*;

public class No_1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in);
		try {
			System.out.println("Please input a binery string:");
			String str=input.next();
			System.out.println("After convert:"+bin2Dex(str));
		}
		catch(NumberFormatException ex) {
			System.out.println(ex.getMessage()+"is not a binary string");
		}
	}

	public static int bin2Dex(String str) throws NumberFormatException{
		int result=0;
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)!='0'&&str.charAt(i)!='1') {
				throw new NumberFormatException(str);
			}
			else
				if(str.charAt(i)=='1')
					result+=Math.pow(2,(str.length()-i-1)*(str.charAt(i)-'0'));
		}
		return result;
	}
}
