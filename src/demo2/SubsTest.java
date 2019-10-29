package demo2;

import java.util.Scanner;

public class SubsTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();
//        while (!text1.equals(text2)){
//            text1 = text2;
//            text2 = scanner.nextLine();
//        }
        do{
            text1 = text2;
            text2 = scanner.nextLine();
        }while(!text1.equals(text2));
    }
}
