package com.company;

import java.io.*;
import java.util.*;
import java.nio.file.*;

    public class ReadSymptomFromFile implements IReadSymptomFromFile{

        public <String> List<String> readSymptomFromFile(String filepath)throws IOException{ /**lecture des symptomes d'un fichier texte et les mettre dans une liste*/

            List <String> myList = new ArrayList<String>((Collection<? extends String>) Files.readAllLines(Paths.get("C:\\Users\\Falcon\\Desktop\\Project2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt")));
            return myList;
        }
    }

