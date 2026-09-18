import java.util.*;
class Calculator {
    public int sumOfdigits(int num){
        if(num==0){
            return 0;
        }
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=digit;
            num=num/10;
    }
    return sum;
}
}

class Tester {

	public static void main(String args[]) {
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    int original=num;
		Calculator calculator = new Calculator();
        int result=calculator.sumOfdigits(num);
		System.out.println("("+original+") sum of the digit is :"+result);
		

	}
}
