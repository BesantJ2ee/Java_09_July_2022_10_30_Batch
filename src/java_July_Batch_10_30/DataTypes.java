package java_July_Batch_10_30;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 126;

		
		a++;
		// byte is 8 bit value
		System.out.println(a);
		a++;
		System.out.println(a);
		
		
		//Short
		
		short s = 32767;
		s++;
		System.out.println(s);
		
		short r = -32768;
		r--; //Post Decrement
		--r; //Pre decrement
		System.out.println(r);
		
		//Long data type
		
		long a1 = 100000L; 
		long b1 = -200000l;
		
		char letterA = 'A';
		//char uses 2 byte in java, It is because java uses Unicode system not ASCII code system. The \u0000 is the lowest range of Unicode system
		
		System.out.println("<<<<<<<<>>>>>>>>>>>>>");
		
		
		char letterB='\u03C1';
		
		char letterc='\uFFFF';
		
		
		System.out.println(letterB);
		System.out.println(letterc);
		
		System.out.println("<<<<<<<<>>>>>>>>>>>>>");
		
		int x = 10;
	   x += 5;

	   
	   
	   int i = 3;
	   int kc = i++; // kc = 3, i = 4
	  
	   System.out.println(kc);
	   
	   int b = ++kc;
	   System.out.println(b);
	   
	   //Cannot use over a constant value
	   //int x = ++10;
		
	}

}
