package com.company;

import java.io.*;
import java.util.*;

public class SymptomWriter implements WriteSymptomFromFile {

    public  void writeFile(String filepathWriting,List<String> myList, List<String> newList) throws IOException { /** writing file from an ArrayList our aim was to write each single ArrayList element onto our new file so we decided to build a function and counting occurrences*/

        FileWriter writer = new FileWriter(filepathWriting);// creating a new empty file

        //créer un fichier de sortie à partir de la liste triée avec les nombres d'occurrences de chaque symptome
        
        for (int index = 0; index < newList.size(); index++) { //parcourir la liste triée
            int nbreOccurrence = Collections.frequency(myList, myList.get(index));
            writer.write(newList.get(index) + ""+ "="+ nbreOccurrence + System.lineSeparator());// écrire chaque ligne de la liste sur le fichier : symptome = nombre d'occurrences
        }
        writer.close();       

    }
}
