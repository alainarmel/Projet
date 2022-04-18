package com.company;

import java.io.IOException;
import java.util.*;

public interface IReadSymptomFromFile {
    <String> List<String> readSymptomFromFile(String filepath) throws IOException;
}
