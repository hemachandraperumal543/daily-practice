import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter no of Heads");
       int head=sc.nextInt();
       System.out.println("Enter no of legs");
       int leg=sc.nextInt();
        if(leg%2==0){
            int tot=head*2;
            int legs=leg-tot;
            int rabbit=legs/2;
            int cow=head-rabbit;
            System.out.println("------------");
            System.out.println("Rabbit  : "+rabbit);
            System.out.println("chicken : "+cow);
        }else{
            System.out.println("The number of Chickens and Rabbits cannot not found");
        }
        
      }      
}
