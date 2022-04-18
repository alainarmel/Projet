package com.company;

import java.io.*;
import java.util.*;


public interface IWritingAndCount {
    int writingFileAndCount(String filepathWriting, List<String> sortedList, List<String> myList) throws IOException;
}
