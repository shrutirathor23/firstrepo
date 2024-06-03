package in.coBookExercises;

import java.util.Scanner;

public class ArmstrongNum {
	public static void main(String[] args) {
		
		//0, 1, 153, 370, 371 and 407
		/*(1*1*1)=1  

(5*5*5)=125  

(3*3*3)=27  

So: 1+125+27=153 */
		int num = 153;
        int originalNum = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, String.valueOf(originalNum).length());
            num /= 10;
        }
        if (sum == originalNum)
            System.out.println(originalNum + " is an Armstrong number.");
        else
            System.out.println(originalNum + " is not an Armstrong number.");
	
	}

}
	

