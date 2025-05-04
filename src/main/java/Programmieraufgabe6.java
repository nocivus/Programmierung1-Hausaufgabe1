public class Programmieraufgabe6 {

    public static void printLines(int count) {
        for (int line=1; line<=count; line++) {

            if (line%2==1) {
                for (int dotNumber=1; dotNumber<=count; dotNumber++) {
                    if (dotNumber%2==1) {
                        System.out.print('*');
                    }
                    else {
                        System.out.print('.');
                    }
                }
            }
            else {
                for (int dotNumber=1; dotNumber<=count; dotNumber++) {
                    if (dotNumber%2==1) {
                        System.out.print('.');
                    }
                    else {
                        System.out.print('*');
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printLines(9);
    }
}