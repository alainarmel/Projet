package com.company;

import java.util.*;

public class RemoveDuplicates implements IRemoveDuplicates {

    public  List<String> removeDuplicates(List<String> myList){ /**méthode de suppression des doublons sur la liste*/

        List<String> newList = new ArrayList<String>();  // Create an empty new ArrayList

        // Traverse through the first list
        for (int index = 0; index < myList.size(); index++) {

            if (!newList.contains(myList.get(index))) {  // vérifier c'est l'index n'est pas dans la nouvelle liste si oui
                newList.add(myList.get(index));  //ajouter l'élément de l'index de la liste myListe dans la nouvelle liste (newList)
            }
        }
        return newList;  // retourner la nouvelle liste
    }
}