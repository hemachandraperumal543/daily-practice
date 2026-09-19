import java.util.*;
public class Tester {
    public static int calculateSumOfEvenNumbers(int[] numbers){
        int res=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                res+=numbers[i];
            } 
        }
        return res;
    }
    
	public static void main(String[] args) {
		int[] numbers =new int[8];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<numbers.length;i++){
            System.out.println("Enter a number : ");
            numbers[i]=sc.nextInt();
        }
		System.out.println("Sum of even numbers: " +calculateSumOfEvenNumbers(numbers));
	}
} 
