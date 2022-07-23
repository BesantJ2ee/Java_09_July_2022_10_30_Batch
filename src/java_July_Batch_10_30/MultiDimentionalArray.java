package java_July_Batch_10_30;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] names = { { "Mr. ", "Mrs. ", "Ms. " }, { "Smith", "Jones" }

		};

		System.out.println(names[0][0] + names[1][0]);
		System.out.println(names[0][2] + names[1][1]);

		int[][] values = { { 10, 20 }, { 40, 50 } };

		// System.out.println(values[0][0] +values[1][0]);
		// System.out.println(values[0][2] + values[1][1]);

		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values.length; j++) {
				System.out.print(values[i][j] + " ");
			}
			System.out.println();
		}

		// Printing stars 2dimention stars

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		// Printing stars in 3dimentions

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("*" + " ");
				
				
			}
			System.out.println();
		}
		
		//Adding two matrices
		
		int[][] values1 = { { 10, 20 }, { 40, 50 } };
		int[][] values2 = { { 20, 30 }, { 10, 60 } };
		
		int[][] values3 = new int[2][2];		
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				
				values3[i][j]=values2[i][j]+values1[i][j];
				System.out.print(values3[i][j]+" ");
			}
			
			System.out.println();
		}
      //Pyramid
		//int rows =5;
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <=i; j++) {
				
				
					System.out.print("*" + " ");	
				
				
				
				
			}
			System.out.println();
		}
		

	}

}
