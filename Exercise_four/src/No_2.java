import java.util.*;

public class No_2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in);
		try {
			System.out.println("Please enter an index of the array:");
			int index=input.nextInt();
			printArray(index); 
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage()+" is out of the range of the array!");
		}
	}

	public static void printArray(int index) throws ArrayIndexOutOfBoundsException{
		int[] array=new int[100];
		for(int i=0;i<100;i++) {
			array[i]=(int) (Math.random()*100);
		}
		if(index>100)
			throw new ArrayIndexOutOfBoundsException(index);
		for(int i=0;i <index;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

}
