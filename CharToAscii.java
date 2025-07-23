import java.util.*;
class CharToAscii{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        int code=(int)c;
    System.out.println(code);
    sc.close();
    }
}