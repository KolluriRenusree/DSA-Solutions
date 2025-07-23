public class Overflow {
    public static void main(String args[]){
        byte b=127;
        b++; // wraps around
    System.out.println(b);
    System.out.println("Max int: " + Integer.MAX_VALUE);
    System.out.println("Min byte: " + Byte.MIN_VALUE);

    }
}
