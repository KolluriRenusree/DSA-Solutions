package DSA;
import java.util.*;
//import java.util.Scanner;

public class Pattern1 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for(int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*" +" ");
            }
            System.out.println();
        }
        sc.close();

    }
    
}

