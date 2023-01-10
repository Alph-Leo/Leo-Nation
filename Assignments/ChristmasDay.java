package Assignments;

public class ChristmasDay {

    private static int day;
    private static String a;

    public static void main(String[] args) {
        ChristmasDaySong song = new ChristmasDaySong(); 

        for (day = 1; day<=12; day++){
            switch (day){
                case 1:
                    a = "first";
                    break;
                case 2:
                    a = "second";
                    break;
                case 3:
                    a = "third";
                    break;
                case 4:
                    a = "fourth";
                    break;
                case 5:
                    a = "fifth";
                    break;
                case 6:
                    a = "sixth";
                    break;
                case 7:
                    a = "seventh";
                    break;
                case 8:
                    a = "eight";
                    break;
                case 9:
                    a = "ninth";
                    break;
                case 10:
                    a = "tenth";
                    break;
                case 11:
                    a = "eleventh";
                    break;
                case 12:
                    a = "twelfth";
            }
            System.out.println("On the " + a + "Day of Christmas, my true love send to me");
            switch (day){
                case 12:

                    System.out.printf("1 %s%n", song.getFirstVerse());
                    System.out.printf("2 %s%n", song.getSecondVerse());
                    System.out.printf("3 %s%n", song.getThirdVerse());
                    System.out.printf("4 %s%n", song.getFourthVerse());
                    System.out.printf("5 %s%n", song.getFifthVerse());
                    System.out.printf("6 %s%n", song.getSixthVerse());
                    System.out.printf("7 %s%n", song.getSeventhVerse());
                    System.out.printf("8 %s%n", song.getEighthVerse());
                    System.out.printf("9 %s%n", song.getNinthVerse());
                    System.out.printf("10 %s%n", song.getTenthVerse());
                    System.out.printf("11 %s%n", song.getEleventhVerse());
                    System.out.printf("12 %s%n", song.getTwelfthVerse());

            }
        }
    }
}
