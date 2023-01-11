package ChapterFive;

import java.util.Scanner;

public class ReadIntegers {

    public static void main(String[] args) {

     //   Scanner net = new Scanner(System.in);

        for (int count = 1; count <= 10; count++){
            if (count == 5 || count == 7 || count == 9){
                continue;
            }
            System.out.printf("%d ", count);
        }
    }
}
