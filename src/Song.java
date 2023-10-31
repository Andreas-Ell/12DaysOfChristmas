import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Song {

    public void printSongToCSV(String file) throws FileNotFoundException {
        PrintStream printStream = new PrintStream(file);
        printStream.println("day, verse");
        try {

        for (int day = 1; day <= 12; day++) {

            String verse = "On the " + day;


           verse += switch (day) {
                case 1 -> "st";
                case 2 ->  "nd";
                case 3 ->  "rd";
                default -> "th";
            };

            verse += " day of Christmas my true love gave to me";

            verse += switch  (day) {
                case 12 -> "Twelve drummers drumming,";
                case 11 -> "Eleven pipers piping,";
                case 10 -> "Ten lords a leaping,";
                case 9 ->  "Nine ladies dancing,";
                case 8 ->  "Eight maids a milking,";
                case 7 ->  "Seven swans a swimming,";
                case 6 ->  "Six geese a laying,";
                case 5 ->  "Five golden rings,";
                case 4 ->  "Four calling birds,";
                case 3 ->  "Three French hens,";
                case 2 ->  "Two turtle doves, and";
                default -> "A partridge in a pear tree.";
            };
            printStream.println(day + ", " + verse);

        }

    } catch(Exception e) {
            new RuntimeException(e);
        }

        }


    public static void main(String[] args) throws FileNotFoundException {

        Song song = new Song();
        song.printSongToCSV("song.csv");


    }
}
