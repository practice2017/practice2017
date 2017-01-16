package com.example.practice2017;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by knnas on 13.01.2017.
 */

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<InitialData> dt = new ArrayList<InitialData>();
        Logic logic = new Logic();
        //String str = null;
        //str = logic.getString();
        //dt = (ArrayList<InitialData>) logic.partitionString(str);
        List<String> result = logic.getList();
        List<InitialData> rows=result.stream().map(row->logic.getData(row)).collect(Collectors.toList());
        System.out.println(rows.get(6636).payAmount);
    }
}
