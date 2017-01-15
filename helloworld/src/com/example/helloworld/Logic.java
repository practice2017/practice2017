package com.example.helloworld;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by knnas on 13.01.2017.
 */
public class Logic
{
    public static String GetString()
    {
        String InitialDataString="";
        try(BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\knnas\\Desktop\\data.csv"))) {
            String lineText;
            while ((lineText = in.readLine()) != null) {
                if (lineText.charAt(0)!='#')
                {
                    InitialDataString+=lineText+"\n";
                }
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return InitialDataString;
    }

    public static  ArrayList<InitialData> PartitionString(String InitialDataString)
    {
        ArrayList<InitialData> dt = new ArrayList<InitialData>();
        String line=null;
        try(BufferedReader in = new BufferedReader(new StringReader(InitialDataString))) {
            while((line = in.readLine()) != null )
            {
                String[] s = line.split("\\|", 14);
                InitialData obj = new InitialData(s[0], s[1], s[2], s[3],
                        s[4], s[5], s[6], s[7], s[8],
                        s[9], s[10], s[11], s[12], s[13].substring(0, s[13].length() - 1));
                dt.add(obj);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dt;
    }
}
