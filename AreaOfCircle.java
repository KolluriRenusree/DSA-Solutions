import java.util.*;
public class AreaOfCircle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double pie=Math.PI;
        double area=pie*r*r;
    System.out.println(area);
    sc.close();
    }
}
