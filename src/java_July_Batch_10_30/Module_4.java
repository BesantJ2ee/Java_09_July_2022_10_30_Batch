package java_July_Batch_10_30;

public class Module_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dc = "Humayun tomb in Delhi";
		String ac = "Humayun tomb in Delhi";
		Integer a =20;
		Integer b =21;
		String v = a.toString();
		
		if(dc.equals(ac))
		{
			System.out.println("Both are true");
		}
		else {
			System.out.println("Both are different");
		}
		
		if(dc==ac)
		{
			System.out.println("Both are true");
		}
		else {
			System.out.println("Both are different");
		}
	
			//System.out.println(dc.compareTo(ac));
		
			System.out.println(a.compareTo(b));
			//System.out.println(a.compareTo(b));
			
			
			
			String s1 = new String("JAVA");
		      String s2 = new String("JAVA");
		      //Reference comparison
		      System.out.println(s1 == s2);
		      //Content comparison
		      System.out.println(s1.equals(s2));
		      // integer-type
		      System.out.println(10 == 10);
		      // char-type
		      System.out.println('a' == 'a');
		
	}

}
