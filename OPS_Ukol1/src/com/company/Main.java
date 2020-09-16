package com.company;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String input = "";
        int sum = 0;
        int average;
        ArrayList<String> ListOfStrings = new ArrayList<>();

        do {
            System.out.println("Zadejte cislo nebo END");
            input = sc.nextLine();
            ListOfStrings.add(input);
        } while (!input.equals("END"));

        ListOfStrings.remove("END");

        List<Integer> ListOfNumbers = new ArrayList<Integer>(ListOfStrings.size()) ;
        for (String myInt : ListOfStrings)
        {
            ListOfNumbers.add(Integer.valueOf(myInt));
        }

        for(int x = 0; x < ListOfNumbers.size(); x++){
            sum += ListOfNumbers.get(x);
        }
        System.out.println("Soucet vsech cisel je: " + sum);
        average = sum / ListOfNumbers.size();
        System.out.println("Prumer je: " + average);
        System.out.println("Nejmensi cislo je: " + Collections.min(ListOfNumbers));
        System.out.println("Nejvetsi cislo je: " + Collections.max(ListOfNumbers));

        //Timhle jsem puvodne chtel vypisovat do output.txt
        //File output = new File("Output.txt");
        //output.createNewFile();
        //FileWriter writer = new FileWriter(output);
        //writer.write("Soucet vsech cisel je: " + sum + "\n" + "Prumer je: " + average + "\n" + "Nejmensi cislo je: " + Collections.min(ListOfNumbers) + "\n" + "Nejvetsi cislo je: " + Collections.max(ListOfNumbers));
        //writer.close();
    }
}