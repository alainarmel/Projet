package com.company;

import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {  // drive function

        List<String> myList = new ArrayList<String>();
        List<String> newList = new ArrayList<String>();
        List<String> sortedList = new ArrayList<String>();
        int val=0;

        IReadSymptomFromFile readSymptom = new ReadSymptomFromFile();
        IRemoveDuplicates removeduplicates = new RemoveDuplicates();
        ISortList sortlist = new SortList();
        IWritingAndCount writingAndcount = new WritingAndCount();

        myList =readSymptom.readSymptomFromFile("C:\\Users\\Falcon\\Desktop\\Project2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt");
        newList =removeduplicates.removeDuplicates(myList);
        sortedList =sortlist.sortList(newList);
        val=writingAndcount.writingFileAndCount("C:\\Users\\Falcon\\projet\\result.out",sortedList,myList);

        System.out.println(" The end of the project 2");

      }
}








