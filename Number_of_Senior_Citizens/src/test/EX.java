package test;

public class EX {
	public static int countSeniors(String[] details) 
	{
		String s;
		int result=0, changInt;
        for (int i=0; i<details.length; i++)
        {
        	
        	s=details[i];
        	s=s.substring(11, 13);
        	changInt = Integer.parseInt(s);
        	if(changInt >60)
        		result++;
        }
        return result;
    }
	
	public static void main(String[] args) 
	{
		String[] s = {"7868190130M7522","5303914400F9211","9273338290F4010"};
		for (int i = 0; i < s.length; i++)
		{
			System.out.println(s[i]);
		}
		
//		String s1 = s[0];
//		s1 = s1.substring(11, 13);
//		System.out.println(s1);
//		
//		String s2 = s[1];
//		System.out.println(s2.substring(11, 13));
//		
//		String s3 = s[2];
//		System.out.println(s3.substring(11, 13));
//		
//		System.out.println(Integer.parseInt(s1));
		
		System.out.println(countSeniors(s));


		
	}
}
