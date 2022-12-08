package com.example.quizapp_assignment_3;

import android.app.Activity;
import android.content.Context;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StorageManager {
    String fileName = "Scores.txt";
    int attempts = 0;
    int averageScore;

    //Function to save data to local storage
    public void SaveData(Activity activity, String scores){

        FileOutputStream fileOutput = null;
        try {
            fileOutput = activity.openFileOutput(fileName, Context.MODE_APPEND);
            fileOutput.write(scores.getBytes());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileOutput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    //Function to get data from local storage
    String dataFromStorage;
    public String GetData(Activity activity){

        FileInputStream inputStream = null;
        StringBuffer stringBuffer = new StringBuffer();
        int read = 0;
        try {
            inputStream = activity.openFileInput(fileName);
            while ((read = inputStream.read()) != -1){
                stringBuffer.append((char)read);
                dataFromStorage = stringBuffer.toString();
            }
            System.out.println("**** data from file ***"+dataFromStorage);
            return dataFromStorage;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //

        return "No data found";
    }

    public int CountNumberOfAttempts() {
        int i;
        attempts=0;
        for (i = 0; i < dataFromStorage.toCharArray().length; i++) {
            if (dataFromStorage.toCharArray()[i] == '#') {
                attempts++;
            }
        }
        return attempts;
    }

    public int CountAverageScore(){
        int i;
        averageScore=0;
        for (i = 0; i < dataFromStorage.toCharArray().length; i++) {
            if(dataFromStorage.toCharArray()[i]=='/'){
                averageScore = averageScore + Character.getNumericValue(dataFromStorage.toCharArray()[i-1]);
            }
            System.out.println("Attempts = "+attempts);
            System.out.println("Average Score = "+averageScore);
        }
        return averageScore;
    }

    //Function to reset data
    public void ResetData(Activity activity){

        FileOutputStream fileOutput = null;
        try {
            fileOutput = activity.openFileOutput(fileName, Context.MODE_PRIVATE);
            fileOutput.write("".getBytes());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileOutput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}