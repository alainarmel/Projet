package com.company;

import java.io.*;
import java.util.*;

public class WritingAndCount implements IWritingAndCount {

    public  int writingFileAndCount(String filepathWriting, List<String> sortedList, List<String>myList) throws IOException { /** writing file from an ArrayList our aim was to write each single ArrayList element onto our new file so we decided to build a function and counting occurrences*/

        int val= 0;
        FileWriter writer = new FileWriter(filepathWriting); // creating a new empty file

        //créer un fichier de sortie à partir de la liste triée avec les nombres d'occurrences de chaque symptome
        for (int index = 0; index < sortedList.size(); index++) { //parcourir la liste triée
            int nbreOccurrence = Collections.frequency(myList, myList.get(index));
            writer.write(sortedList.get(index) + ""+ "="+ nbreOccurrence + System.lineSeparator());// écrire chaque ligne de la liste sur le fichier : symptome = nombre d'occurrences
        }
        writer.close();       
        return val;
    }
}
