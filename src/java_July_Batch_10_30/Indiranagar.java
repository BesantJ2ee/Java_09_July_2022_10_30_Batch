package java_July_Batch_10_30;

import java.util.StringTokenizer;

public class Indiranagar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("123");
		System.out.println("Welcome");
		System.out.println("  Java");
		
		String str ="besant";
		System.out.println(str.hashCode());
		
		String str2 ="besa   nt";
		System.out.println(str2.hashCode());
		
		String str3 ="fbesant";
		System.out.println(str3.hashCode());
		
		String str4 =new String("fbesant");
		System.out.println(str4.charAt(0)+" "+str4.compareTo(str3));
		
		System.out.println(str4.charAt(0)+" "+str4.concat(str3));
		
		System.out.println(str4.substring(1));
		
		System.out.println(str4.length());
		
		
		String str5 ="Besant";
		
		System.out.println("<<<<<<sTARTSWITH METHOD>>>>>>");
		
		System.out.println(str5.startsWith("B"));
		
		System.out.println("<<<<<<sTARTSWITH METHOD ENDING>>>>>>");
		
		System.out.println(str4.startsWith("e"));
		
		System.out.println(str4.endsWith("e"));
		
		
		System.out.println(str2.trim());

		
	   
	    
	    
	    StringBuffer s = new StringBuffer("Toyota");
	    s.append(str3);
	    StringBuffer s2 = new StringBuffer("Toyota");
	    s2.capacity();
	    
	    StringBuffer s3 = new StringBuffer("Toyota");
	    s3.length();
	  //  s3.reverse();
	    s3.replace(0, 2, "a");
	    System.out.println(s3);
	    
	    
	    jvjvgjv gsdgs=new jvjvgjv();
	    gsdgs.sum();
	    
	    jvjvgjv vnsvksj= new jvjvgjv();
	    
	    vnsvksj.sum();
	    
	    String abc = "Rahul";
		String k=abc.concat(" Dravid");
		
		System.out.println(abc);
		System.out.println(k);
		
		
		char chart[]= {'b','e','v','r','l','e','y'};
		String bn= new String(chart);
		System.out.println(bn.toUpperCase());
		
		//Immutability
		   String sd="Jodha";  
		   sd.concat(" Akbar");
		   System.out.println(sd);
	    
		
		   
		   String dc = "Taj Mahal Located in Agra";
		  // dc.replaceAll("Agra", "Bangalore")
		   System.out.println(dc.replaceAll("Agra", "Bangalore"));
		   
		   
		   String str7 ="     Besant IN JAVA";
		   System.out.println(str7.trim());
		   System.out.println(str7.charAt(2));
		   
		   str7 = str7.replaceAll("\\s", "");
		   System.out.println(str7);
		 //The StringTokenizer class is deprecated now. It is recommended to use the split() method
		   StringTokenizer st = new StringTokenizer("my name is khan"," ");  
		     while (st.hasMoreTokens()) {  
		         System.out.println(st.nextToken());  
		     } 
		     
		     StringTokenizer st1 = new StringTokenizer("my-name-is-khan","-");  
		     while (st1.hasMoreTokens()) {  
		         System.out.println(st1.nextToken());  
		     }  
		     
		     
		     String avsc="a,b,c,d,e";
			    

		    	String[] a =avsc.split(",");
			    
			    for(int i=0;i<a.length;i++)
			    {
			    		    	
			    	System.out.println(a[i]);	
			    }
			    
			String rahul="Rahul Dravid";
			
			char abcd;
			
			char abce;
			
			for(int i=rahul.length()-1;i>=0;i--) {
				
				
				abcd =rahul.charAt(i);
				System.out.print(abcd);
				
			}
			System.out.println(" ");
               for(int i=0;i<rahul.length();i++) {
				
				
            	   abce =rahul.charAt(i);
				System.out.print(abce);
				
			}
			    
               String rahule="Rahulee Dravid";   
			    
               
			   
	}

}
