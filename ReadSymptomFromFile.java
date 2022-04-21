package com.company;

import java.io.*;
import java.util.*;
import java.nio.file.*;

    public class ReadSymptomFromFile implements IReadSymptomFromFile{

        public  List<String> readSymptomFromFile(String filepath)throws IOException{ /**lecture des symptomes d'un fichier texte et les mettre dans une liste*/

            List <String> myList =  Files.readAllLines(Paths.get(filepath));
            return myList;
        }
    }

