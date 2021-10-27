package com.company.textanalysis.model;

import com.company.textanalysis.ui.ReadingFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;


public class ReaderFile implements ReadingFile {

    @Override
    public String read() { // java 11
        String fileName = "Text.txt";
        String textRead = null;
        try {
            textRead = Files.readString(Paths.get(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return textRead;
    }

//    public List<String> readJava8(){ //java 8
//        List<String> collect = Collections.singletonList("");
//        try {
//            String fileName = "Text.txt";
//            Stream<String> lines = Files.lines(Paths.get(fileName));
//            collect = lines.collect(Collectors.toList());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return collect;
//    }

//    public String readJava 7(Scanner scanner) { // java 7
//        String textRead = "";
//        try (FileReader reader = new FileReader("Text.txt")) {
//            char[] buf = new char[10000];
//            int i;
//            System.out.println("Read file...");
//            while ((i = reader.read(buf)) > 0) {
//                if (i < 10000) {
//                    buf = Arrays.copyOf(buf, i);
//                }
//                textRead = String.valueOf(buf);
//            }
//            readJava11();
//        } catch (IOException ex) {
//            System.err.println("Read error. Change the content (file type).");
//        }
//        return textRead;
//    }


}
