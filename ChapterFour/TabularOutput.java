package ChapterFour;

public class TabularOutput {
   static int maximum;
   static int minimum;
    public static void main(String[] args) {

        int counter = 1;
       for (counter = 1; counter <= 10; counter++ )
           if (maximum < counter){
               maximum = counter;
           }
       if (minimum > counter){
           minimum = counter;
       }
        System.out.printf("Maximum is:%n%d%nMinimum is: %n%d", maximum, minimum);

    }
}