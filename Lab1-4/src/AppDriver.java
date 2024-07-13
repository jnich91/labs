import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppDriver {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to AppDriver for Lab 1-4!");

        Vehicle v1 = new Vehicle("Batmobile", 100.1, 2023);
        v1.display();

        String name = getResponseFromPrompt("What is the name of the vehicle?", reader);
        int year = Integer.parseInt(getResponseFromPrompt("What is the year of manufacture of the vehicle?", reader));
        double speed = Double.parseDouble(getResponseFromPrompt("What is the maximum speed of the vehicle?", reader));

        Vehicle v2 = new Vehicle(name, speed, year);
        v2.display();

        double timeAtMaxSpeed = Double.parseDouble(getResponseFromPrompt("How much time at max speed would you like to know the distance traveled?", reader));
        System.out.println(v2.showDistance(timeAtMaxSpeed));
    }

    private static String getResponseFromPrompt(String prompt, BufferedReader reader) throws IOException
    {
        System.out.println(prompt);

        return reader.readLine();
    }
}
