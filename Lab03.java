
// a change
public class Lab03 {
    public static void main(String args[]){
        int startingValue = 100000123;
        int hours = startingValue / 36000000;
        int minutes = 2800 / 60;
        int seconds = 2800 % 60;
        int milliseconds = startingValue / 810000;



        System.out.println("Lab03, 100 point version\n");
        System.out.println("Starting milliseconds-seconds: " + startingValue  );
        System.out.println("Hours: " + hours );
        System.out.println("Minutes:  " + minutes);
        System.out.println( "seconds: " + seconds );
        System.out.println("Milli Seconds: " + milliseconds );



    }
}
