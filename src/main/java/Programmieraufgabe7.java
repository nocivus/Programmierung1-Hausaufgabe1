public class Programmieraufgabe7 {

    public static int getMax(int a, int b, int c) {
        int max = 0;
        if (a >= b && a >= c ) {
            max=a;
        }
        if (b >= a && b >= c ) {
            max=b;
        }
        if (c >= a && c >= b ) {
            max=c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.print(getMax(143, 173, 173));
    }
}