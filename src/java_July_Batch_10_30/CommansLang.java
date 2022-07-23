package java_July_Batch_10_30;
import org.apache.commons.lang3.StringUtils;



public class CommansLang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dc = "Welcome to Coding ";
		
			System.out.println(StringUtils.substringAfter(dc, "to"));
	
		
		System.out.println(StringUtils.substringBefore(dc, "Coding"));
		System.out.println(StringUtils.replace(dc, "to", "all"));
		 System.out.println(dc);
		 
	}

}
