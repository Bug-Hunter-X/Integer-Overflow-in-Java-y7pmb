public class UncommonBug {

    public static void main(String[] args) {
        int x = 1000000000;
        int y = 1000000000;
        int z = x + y; // potential overflow
        System.out.println(z); 
        long a = 1000000000L; //Explicitly define as Long
        long b = 1000000000L;
        long c = a + b;
        System.out.println(c); // no overflow

        double d = 1000000000;
        double e = 1000000000;
        double f = d + e;
        System.out.println(f);

    }
}