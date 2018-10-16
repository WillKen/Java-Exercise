public class No_1 {
	
	public static class MyInteger{
		
		  int value;
		  
		  public MyInteger(int x) {
			  value=x;
		  }
		  
		  public int getter() {
			  return value;
		  }
		  
		  public boolean  isEven() {
			  return value%2==0;
		  }
		  
		  public boolean isOdd() {
			  return value%2==1;
		  }
		  
		  public boolean isPrime() {
			  int i = 0;
		      for(i = 2; i <= value / 2; i++){
		    	  if(value % i == 0)
		        	  return false;
		        }
		        return true;
		  }
		  
		  public boolean  isEven(int x) {
			  return x%2==0;
		  }
		  
		  public boolean isOdd(int x) {
			  return x%2==1;
		  }
		  
		  public boolean isPrime(int x) {
			  int i = 0;
		      for(i = 2; i <= x / 2; i++){
		    	  if(x % i == 0)
		        	  return false;
		        }
		        return true;
		  }

		  public boolean  isEven(MyInteger obj) {
			  return obj.value%2==0;
		  }
		  
		  public boolean isOdd(MyInteger obj) {
			  return obj.value%2==1;
		  }
		  
		  public boolean isPrime(MyInteger obj) {
			  int i = 0;
		      for(i = 2; i <= obj.value / 2; i++){
		    	  if(obj.value % i == 0)
		        	  return false;
		        }
		        return true;
		  }
		  
		  public boolean equals(int x) {
			  return x==value;
		  }
		  
		  public boolean equals(MyInteger obj) {
			  return equals(obj.getter());
		  }
	}
	
	public static void main(String[] args){
		   MyInteger myint1 =new MyInteger(55);
		   MyInteger myint2 =new MyInteger(96);
		   MyInteger myint3 =new MyInteger(13);
		   System.out.println("This is the test for myint 55");
		   System.out.println(myint1.isOdd());
		   System.out.println(myint1.isEven());
		   System.out.println(myint1.isPrime());
		   System.out.println("This is the test for myint 96");
		   System.out.println(myint2.isOdd());
		   System.out.println(myint2.isEven());
		   System.out.println(myint2.isPrime());
		   System.out.println("This is the test for myint 13");
		   System.out.println(myint3.isOdd());
		   System.out.println(myint3.isEven());
		   System.out.println(myint3.isPrime());
		   System.out.println("This is the test for function-equas()");
		   System.out.println(myint3.equals(0));
		   System.out.println(myint3.equals(13));
		   System.out.println(myint3.equals(myint3));
	}

}
