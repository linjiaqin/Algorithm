package book.chapter1;

public class gcd {
    public static int getGcd(int p, int q){
        if (q == 0) return p;
        int r = p % q;
        return getGcd(q, r);
    }
    public static void main(String[] args) {

    }
}
