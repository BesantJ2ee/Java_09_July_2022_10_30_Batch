package java_July_Batch_10_30;

public class CommansLang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String abc = "Rahul";
		String k=abc.concat(" Dravid");
		
		System.out.println(abc);
		System.out.println(k);
		
		
		char chart[]= {'b','e','v','r','l','e','y'};
		String bn= new String(chart);
		System.out.println(bn.toUpperCase());
		
		//Immutability
		   String s="Jodha";  
		   s.concat(" Akbar");
		   System.out.println(s);
	}

}
