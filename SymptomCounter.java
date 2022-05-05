package com.company;

import java.util.*;
import java.util.stream.Collectors;


public class SymptomCounter implements CountSymptomFromFile {

    public List<String>  count(List<String> myList) {

        List<String> newList = new ArrayList<>();

         List<String> sortedList = myList.stream().sorted().collect(Collectors.toList()); //ranger les éléments de la liste par ordre croissant

        // Traverse through the first list
        for (int index = 0; index < sortedList.size(); index++) {

            if (!newList.contains(sortedList.get(index))) {  // vérifier c'est l'index n'est pas dans la nouvelle liste si oui
                newList.add(sortedList.get(index));  //ajouter l'élément de l'index de la liste myListe dans la nouvelle liste (newList)
            }
        }
        return newList;
    }

}

