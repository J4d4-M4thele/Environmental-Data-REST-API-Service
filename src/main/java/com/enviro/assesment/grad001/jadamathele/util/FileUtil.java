package com.enviro.assesment.grad001.jadamathele.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class FileUtil {
    public static List<String> readFile(String filePath) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            return br.lines().collect(Collectors.toList());
        }
    }

    public static void main(String[] args) {
        try {
            List<String> lines = readFile("C:\\Users\\Jada\\OneDrive\\Documents\\Bootcamp\\Enviro365\\cct-waste-management.txt");
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
