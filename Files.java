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

public class Files
{

    public static void ExportEvents(ArrayList<Event> events, int facilitatorInput)
    {

        FileWriter fileWriter = null;

        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm-dd/MM/yyyy");

        try
        {
            File file = new File("events.csv");

            if (!file.exists())
            {
                file.createNewFile();
            }

            fileWriter = new FileWriter("events.csv");

            for (int i = 0; i < events.size(); i++)
            {
                if (facilitatorInput == events.get(i).getFacilitatorId())
                {
                    String formStartTime = events.get(i).getStartTime().format(formatTime);
                    String formEndTime = events.get(i).getEndTime().format(formatTime);

                    fileWriter.write(events.get(i).getName());
                    fileWriter.write(',');
                    fileWriter.write(events.get(i).getLocation());
                    fileWriter.write(',');
                    fileWriter.write(formStartTime);
                    fileWriter.write(',');
                    fileWriter.write(formEndTime);
                    fileWriter.write(',');
                    fileWriter.write(events.get(i).getNotes());
                    fileWriter.write('\n');
                }

                else
                {
                    System.out.println("Facilitator not found.");
                }

                System.out.println("Saved succesfully.");
            }
        }

        catch (Exception e)
        {
            System.out.println("Writing unsuccesful!");
            e.printStackTrace();
        }

        finally
        {
            try
            {
                fileWriter.flush();
                fileWriter.close();
            }

            catch (IOException e)
            {
                System.out.println("Flushing/closing error!");
                e.printStackTrace();
            }
        }
    }

    public static void ExportArrangements(ArrayList<Arrangement> arrangements, int arrId)
    {

        FileWriter arrFileWriter = null;

        try
        {
            File file = new File("arrangements.csv");

            if (!file.exists())
            {
                file.createNewFile();
            }

            arrFileWriter = new FileWriter("arrangements.csv");

            for (int j = 0; j < arrangements.size(); j++)
            {
                if (arrId == arrangements.get(j).getArrId())
                {
                    arrFileWriter.write(Integer.toString(arrId));
                    arrFileWriter.write(',');
                    arrFileWriter.write(arrangements.get(j).getName());
                    arrFileWriter.write(',');
                    arrFileWriter.write(arrangements.get(j).getNotes());
                    arrFileWriter.write(',');
                    arrFileWriter.write(Integer.toString(arrangements.get(j).getGroupId()));
                    arrFileWriter.write('\n');
                }

                else
                {
                    System.out.println("Arrangements not found.");
                }

                System.out.println("Saved succesfully.");
            }
        }

        catch (Exception e)
        {
            System.out.println("Writing unsuccesful!");
            e.printStackTrace();
        }

        finally
        {
            try
            {
                arrFileWriter.flush();
                arrFileWriter.close();
            }
            catch (IOException e)
            {
                System.out.println("Flushing/closing error!");
                e.printStackTrace();
            }
        }
    }
}
