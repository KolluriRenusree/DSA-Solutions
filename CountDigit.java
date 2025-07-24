package DSA.BasicMaths;
import java.util.*;
public class CountDigit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        if(num==0){
            count=1;
        }else{
            while(num!=0){
                num/=10;
                count++;
            }
        
        System.out.println("The Number of digits is:" +count);
        sc.close();
        }

    }
    
}
