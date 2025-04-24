public class Programmieraufgabe3 {

    public static void printLines(int count) {
        for(int i = 1; i<= count; i++) {
            if(i%2==1) {
                System.out.println("*******");
            }
            else if(i%2==0) {
                System.out.println(".......");
            }
        }
    }

    public static void main(String[] args) {
        printLines(4);
    }
}
