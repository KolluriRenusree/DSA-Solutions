package DSA;
import java.util.*;
public class Functions {
static long fact(int n){
    if(n==0 ||n==1){
        return 1;
    }

int result=1;
for(int i=1;i<=n;i++){
    result*=i;
}
return result;
}



public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.close();
    System.out.println(n+"!="+fact(n));
}
}