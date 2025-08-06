   import java.util.*;
   public class test{
 
public static void main(String[]args){
    Scanner obj=new Scanner (System.in);
    int a=obj.nextInt();
    int temp=a;
    int val=0;
    while(temp>0){
        int rem=temp%10;
        temp/=10;
        int fact=1;
        for(int i=0;i<=rem;i++){
            fact=i*fact;
        }
        val=fact+val;
    }
if(a==0){
    System.out.println("yes");
}
else {
    System.out.println("No");
}
}
}