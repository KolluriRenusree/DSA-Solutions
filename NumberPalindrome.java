package DSA;

public class NumberPalindrome {
    public static void main(String args[]){
        int n=121;
        int temp=n;
        int reverse=0;
        while(temp!=0){
            int digit=temp%10;
            reverse=reverse*10+digit;
            temp/=10;
        //System.out.println("n value"+n);
        //System.out.println("reversed value"+reverse);
        System.out.println("Is Palindrome"+(n==reverse));
        }
    }
    
}
