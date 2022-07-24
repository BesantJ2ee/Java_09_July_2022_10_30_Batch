package java_July_Batch_10_30;

public class OneDimentionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] anArray = { 
			    100, 200, 300,
			    400, 500, 600, 
			    700, 800, 900, 1000
			};
		System.out.println(anArray);
		//Converting an array to string
		System.out.println(java.util.Arrays.toString(anArray));
		
		//Add 10 with all the elements
		for(int i=0;i<anArray.length;i++)
		{
			System.out.println(anArray[i]+10);
		}
		
		
		//Copy operation
		
		 String[] copyFrom = {
		            "Jonn", "Michael", "Pepe", "Ronaldinho", "Ferminho",   
		            "Virat", "Schumacher", "akshay", "srk", "sushantsingh", "abhishekh",      
		            "harrisonford", "caprio" };
		 
		 String[] copyTo = new String[7];
		 
		 System.arraycopy(copyFrom, 2, copyTo, 0, 2);
		 
		 for(int i=0;i<copyTo.length;i++)
		 {
			 System.out.println(copyTo[i]);
		 }
		 //copyOfRange method does not require you to create 
		 //the destination array before calling the method, because the destination array is returned by the method
		 String[] copyTow = java.util.Arrays.copyOfRange(copyFrom, 2, 9); 
	}

}
