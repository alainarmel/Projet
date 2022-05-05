package com.company;

import java.io.*;
import java.util.*;


public interface WriteSymptomFromFile {

    void writeFile(String filepathWriting,List<String> myList,List<String> newList) throws IOException;
}
