package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class SortList implements  ISortList {

    public  List<String> sortList(List<String> newList) {  /** méthode pour trier la liste par ordre croissant*/

        List<String> sortedList = newList.stream().sorted().collect(Collectors.toList());
        return sortedList;
    }
}
