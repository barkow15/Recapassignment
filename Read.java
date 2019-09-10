import java.io.File;
import java.time.*;
import java.time.format.*;
import java.awt.datatransfer.*;
import java.awt.Toolkit;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Read
{

    public static ArrayList<Event> LoadEvents()
    {
        String file = "events.csv";
        String line = "";
        String cvsSplitBy = ",";

        FileWriter fileWriter = null;

        File fileLoad = new File("events.csv");
        File fileMissing = new File("PLACE FILE HERE");

        ArrayList<Event> events = new ArrayList<Event>();

        if (fileLoad.isFile())
        {
            try (BufferedReader br = new BufferedReader(new FileReader(file)))
            {

                while ((line = br.readLine()) != null)
                {
                    String[] event = line.split(cvsSplitBy);

                    events.add(new Event(event[0],event[1],event[2],event[3],event[4]));
                }

                return  events;
            }

            catch (FileNotFoundException e)
            {
                System.out.println(e.getMessage());
            }

            catch (IOException e)
            {
                System.out.println(e.getMessage());
            }
        }

        else
        {
            System.out.println("File is missing. Please retrieve it, and try again.\n");
            System.out.println("Closing program.\n");
            System.exit(0);
        }

        return events;
    }

    public static ArrayList<Arrangement> LoadArrangements()
    {
        String file = "arrangements.csv";
        String line = "";
        String cvsSplitBy = ",";

        FileWriter fileWriter = null;

        File fileLoad = new File("arrangements.csv");
        File fileMissing = new File("PLACE FILE HERE");

        ArrayList<Arrangement> arrangements = new ArrayList<Arrangement>();

        if (fileLoad.isFile())
        {
            try (BufferedReader br = new BufferedReader(new FileReader(file)))
            {

                while ((line = br.readLine()) != null)
                {
                    String[] arr = line.split(cvsSplitBy);

                    arrangements.add(new Arrangement(arr[0],arr[1],arr[2],arr[3]));
                }
            }

            catch (FileNotFoundException e)
            {
                System.out.println(e.getMessage());
            }

            catch (IOException e)
            {
                System.out.println(e.getMessage());
            }
        }

        else
        {
            System.out.println("File is missing. Please retrieve it, and try again.\n");
            System.out.println("Closing program.\n");
            System.exit(0);
        }
        return arrangements;
    }
}
