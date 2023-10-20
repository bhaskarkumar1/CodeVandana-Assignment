//package Assignment;

//Question Shuffle Array solution

public class Main {

	
	public static void main(String[] args) {
//		System.out.println("Helllo Assignment");
//		suppose you need to generate a random number from 1 to 5
		int[] arr= {1,2,3,4,5,6,7};
		shuffle(arr);
		 
		for(int a: arr) {
			System.out.print(a+ " ");
		}
				
	}
	
	/**
	 * @param array
	 */
	public static void shuffle(int array[]) {
		int n=array.length-1;
		for(int i=0;i<n;i++) {
			int random=(int) (Math.random()*(i+2));
			// I+2 BECAUSE WE WANT TO SHUFFFLE ALL THE POSTION EVEN THE LAST ELEMENT
			
			int temp=array[random];
			array[random]=array[i];
			array[i]=temp;
		}
	}
}
