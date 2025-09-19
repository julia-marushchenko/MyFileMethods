// Java program to use File Methods
package com.files;

import java.io.File;
import java.io.IOException;

// Main class
public class Main {

    // Main class to run java program
    public static void main(String[] args) {

        // Creating file object
        File file = new File("myFile.txt");

        // Creating file
        try {
            if (file.createNewFile())
                System.out.println("File created.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Checking if "myFile.txt exists
        if (file.exists()) {
            System.out.println("myFile.txt exists");
        }

        // Checking if file myFile.txt is a file
        if (file.isFile()) {
            System.out.println("myFile.txt is one file.");
        } else {
            System.out.println("Not a file.");
        }
    }
}
