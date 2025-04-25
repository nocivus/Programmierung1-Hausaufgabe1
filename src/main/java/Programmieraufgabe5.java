public class Programmieraufgabe5 {
    public static void printLines(int count) {
        int max = count/2+1;
        for (int line=1; line<=max; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int line=1; line<=max; line++) {
            for (int chars = line; chars < max; chars++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printLines(9);
    }
}