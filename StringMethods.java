package DSA;

public class StringMethods {
    public static void main(String args[]){
        String s="Hello World!";
        String s1="Welcome";
    System.out.println(s.length());
    System.out.println(s.charAt(6));
    System.out.println(s.substring(6, 12));
    System.out.println(s + ","+s1);
    System.out.println(s.indexOf("World", 0));
    System.out.println(s.lastIndexOf("l"));
    System.out.println(s.contains("World"));
    System.out.println(s.toUpperCase());
    System.out.println(s.toLowerCase());
    System.out.println(s.startsWith("Hello"));
    System.out.println(s.endsWith("World"));
    System.out.println("'"+s.trim()+"'");
    System.out.println(s.replace('l','x'));
    System.out.println(s.repeat(5));


    }
    
}
