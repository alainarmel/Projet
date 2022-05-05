package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {  // drive function

        List<String> myList = new ArrayList<String>();
        List<String> newList = new ArrayList<String>();

        // polymorhisme appliqué à toutes les instances des classes qui implémentent chacune une interface

            ReadSymptomFromFile reader = new SymptomReader();
            WriteSymptomFromFile writer = new SymptomWriter();
            CountSymptomFromFile counter = new SymptomCounter();


            //appel des différentes méthodes avec les variables des instances des classes créees en utilisant les interfaces pour en faire usage du polymorphisme et mettre en exergue l'abstraction

            myList=reader.readSymptom("C:\\Users\\Falcon\\Desktop\\Project2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt");
            newList=counter.count(myList);
            writer.writeFile("C:\\Users\\Falcon\\projet\\result.out",myList,newList);

        System.out.println(" The end of the project 2");

    }
}








