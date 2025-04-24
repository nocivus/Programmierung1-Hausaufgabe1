package main.java;

public class Programmieraufgabe4 {

    public static void printLines(int count) {
        
        
        for(int line = count; line>0; line--) {
            
            
            for(int chars = line; chars>0; chars--) {
                if (line%5==0) {
                    System.out.print('.');
                }
                else {
                System.out.print('*');
                }
            }    
            
            
            System.out.println();
        }
    
    }

    public static void main(String[] args) {
        printLines(7);
    }
}