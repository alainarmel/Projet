package com.company;

import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {  // drive function

        List<String> myList = new ArrayList<String>();
        List<String> newList = new ArrayList<String>();
        List<String> sortedList = new ArrayList<String>();
        int val=0;
        int nbreOccurence=0;
        String element="";


        // polymorhisme appliqué à toutes les instances des classes qui implémentent chacune une interface

        IReadSymptomFromFile readSymptom = new ReadSymptomFromFile();
        IRemoveDuplicates removeduplicates = new RemoveDuplicates();
        ISortList sortlist = new SortList();
        IWritingFile writingfile = new WritingFile();
        ICount count = new Count();


        //appel des différentes méthodes avec les variables des instances des classes créees en utilisant les interfaces pour en faire usage du polymorphisme et mettre en exergue l'abstraction

        myList =readSymptom.readSymptomFromFile("C:\\Users\\Falcon\\Desktop\\Project2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt");
        newList =removeduplicates.removeDuplicates(myList);
        sortedList =sortlist.sortList(newList);
        nbreOccurence += count.frequency(myList,element);
        val+=writingfile.writingFile("C:\\Users\\Falcon\\projet\\result.out",sortedList,myList);

        System.out.println(" The end of the project 2");

      }
}








