
class PrimeGenerator extends Thread{
	private long beginNum;
	private long endNum;
	
	public PrimeGenerator(long beginNum,long endNum) {
		this.beginNum=beginNum;
		this.endNum=endNum;
	}
	public void run() {
		while(true) {
			if(isPrime(beginNum)) {
				System.out.println("Number "+beginNum+" is prime.");
			}
			if(isInterrupted()) {
				System.out.println("Interrupted!");
				return;
			}
			if(beginNum>endNum) {
				return;
			}
			beginNum++;
		}
	}
	private boolean isPrime(long num) {
		if(num<=2)
			return true;
		for(long i=2;i<num;i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
}


public class No_3 {

	public static void main(String[] args) {
		PrimeGenerator t1=new PrimeGenerator(1,1000);
		t1.start();
		PrimeGenerator t2=new PrimeGenerator(1001,2000);
		t2.start();
		PrimeGenerator t3=new PrimeGenerator(2001,3000);
		t3.start();
	}

}
