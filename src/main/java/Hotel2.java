import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hotel2 {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("In what season are you booking a stay?");
            String season = bufferedReader.readLine();

            System.out.println("On the weekend, or a weeknight?");
            String dayOfWeek = bufferedReader.readLine();

            boolean summer = season.equals("summer");
            boolean weekend = dayOfWeek.equals("weekend");

            if ( !(summer && weekend) ) {    // Here, we're simply stating "if it's not the summer and the weekend..."
                System.out.println("You will likely get decent rates for your stay.");
            }
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
