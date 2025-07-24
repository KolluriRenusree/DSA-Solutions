package DSA.BasicMaths;
import java.util.*;
public class GCD {
    static int gcd(int r1,int r2){
        int result=Math.min(r1,r2);
        while(result>0){
            if(r1 % result==0 && r2%result==0){
                break;
            }
            result--;
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int r1=sc.nextInt();
        int r2=sc.nextInt();
        
        
        System.out.print(gcd(r1,r2));
        sc.close();
    }
    
}
