package com.panoptic.services;

import com.panoptic.data.DeviceMessage;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Objects;

public class ComService {

    String fileString;
    BufferedReader reader;
    BufferedWriter writer;

    public ComService(String fileString){

        //Folder for output file; handle case where it already exists
        Path filePath = null;
        this.fileString = fileString;
        try {
            //System.out.println("In try block");
            filePath = Files.createDirectory(Path.of(fileString));
        }
        catch (FileAlreadyExistsException f){
            System.out.println("Catching that folder exists:" + f.getMessage());
            filePath = Path.of(fileString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMsg(DeviceMessage deviceMessage){
        System.out.println(deviceMessage);
    }


}
