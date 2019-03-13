
/* ***************************************************************************
 *                          Домашнее Задание № 2                            *
 *************************************************************************** */

import MyException.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MainClass {
    public static void main(String[] args) throws Exception {
        String[][] stringArray = {{"1", "5", "0", "g"},
                {"3", "5", "8", "7"},
                {"1", "h", "e", "9"},
                {"1", "2", "6", "8"}};
        String[][] integers = new String[3][4];
        ArraySum arraySum = new ArraySum();

        try {
            arraySum.parseAndSumArrayInt(integers);
        } catch (MyArrayException ex) {
            ex.printStackTrace();
        }

        try {
            arraySum.parseAndSumArrayInt(stringArray);
        } catch (MyArrayException ex) {
            ex.printStackTrace();
        }

        System.out.printf("Sum array elements = %d\n", arraySum.sum);


        try (FileOutputStream writer = new FileOutputStream("file.txt");
             MyAutoCloseable close = new MyAutoCloseable())
        {
            writer.write("Hello, GeekBrains".getBytes());
            Files.lines(Paths.get("file.txt")).forEach(System.out::println);
            close.close();
            writer.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
