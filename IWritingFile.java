package com.company;

import java.io.*;
import java.util.*;


public interface IWritingFile {

    int writingFile(String filepathWriting, List<String> sortedList, List<String> myList) throws IOException;
}
