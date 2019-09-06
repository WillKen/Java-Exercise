public class No_4{
	public static class account {
		public int balance;
		public String name;
		account(String my){
			balance=100;
			name=my;
		}
	}
	
	public static class bankSystem implements Runnable{
		account m;
		account n;
		int ini=0;
		bankSystem(account m_,account n_){
			m=m_;
			n=n_;
		}
		public void run() {	
			while(n.balance<2000) {
				transfer(m,n);
			}
			System.out.printf(Thread.currentThread().getName()+" Thread end! Balance of account A: %d\n", n.balance);
		}

		public void transfer(account m,account n) {
			try {
				Thread.sleep(50);
			}
			catch (InterruptedException e) {
				System.out.println("Thread interrupted.");
			}
			synchronized(bankSystem.class) {//某个类的范围，synchronized (类名.class){}防止多个线程同时访问这个类中的synchronized 里面的代码。它可以对类的所有对象实例起作用。
				n.balance+=100;
				System.out.println("account "+m.name+" transfer $100 to account "+n.name+", the balance of account "+n.name+": $"+n.balance);
			}
		}
	}
	
	
	public static void main(String[]args){
		account A=new account("A");
		account B=new account("B");
		account C=new account("C");
		bankSystem test1=new bankSystem(B,A);
		bankSystem test2=new bankSystem(C,A);
		Thread t1=new Thread(test1);
		Thread t2=new Thread(test2);
		t1.setName("B");
		t2.setName("C");
		System.out.printf("Balance of account A: %d\n", A.balance);
		t1.start();
		t2.start();
	}
	
}