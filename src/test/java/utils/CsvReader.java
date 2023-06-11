package utils;

import models.MyPersons;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Files;


public class CsvReader {
    public static List<MyPersons> getListObjectFromCsv() {
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get("src\\test\\resources\\data.csv"));
//            CsvToBean<MyPersons> csvObjectBuilder =  new CsvToBeanBuilder<myPersons>(reader)
//                    .withType(myPersons.class)
//                    .build();
//            return csvObjectBuilder.parse();
        } catch (IOException exception) {
            throw new RuntimeException("The file could not be found");

        }
        return null;
    }
}

