package com.example.helloworld;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;

/**
 * Created by knnas on 13.01.2017.
 */

public class Main {

    public static void main(String[] args)
    {
        ArrayList<InitialData> dt = new ArrayList<InitialData>();
        Logic logic = new Logic();
        String str = logic.GetString();
        dt = logic.PartitionString(str);
        System.out.println(dt.get(0).payAmount);
    }
}
