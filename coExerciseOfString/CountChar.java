package in.coExerciseOfString;

public class CountChar {
	public static void main(String[] args) {
		String name[]= {"shrur","ratthhh","MMAA"};
		int count=0;
		
		for(String str:name) {
			
			String s3=str.toLowerCase();
			for(char a='a';a<='z';a++) {
				
		      for(int i=0;i<s3.length();i++)
				if(a==s3.charAt(i)) {
					
					count++;
				}
				if(count!=0) {
					System.out.println(""+a+"count ===" +count);
					count=0;
				}
			}
		}
	}

}
