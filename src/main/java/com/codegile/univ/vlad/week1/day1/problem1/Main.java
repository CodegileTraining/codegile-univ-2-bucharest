package com.codegile.univ.vlad.week1.day1.problem1;


import java.io.*;

public class Main {

    public static void main(String[] args) {
        int intNumbersLength = 0;
        int realNumbersLength = 0;

        InputStream is = ClassLoader.getSystemResourceAsStream("numbers.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = null; // TODO: Remove unused initializer
        try{
            while((line = br.readLine()) !=  null){
                System.out.println(line);
                String[] array = line.split(" ");
                // TODO: Replace with foreach loop
                for(int i=0; i<= array.length-1; i++){
                    if(checkIfStringIsInteger(array[i])) {
                        intNumbersLength++; // TODO: Count
                    }
                    if(checkIfStringIsReal(array[i])){
                        realNumbersLength++;
                    }
                }
            }
        }catch (IOException e){
            e.printStackTrace();
            // TODO: You have to close BufferedReaders, InputStreams etc. with the .close() method - very important
            // TODO: Find out how to use try-with-resources to avoid writing a finally block
        }
        System.out.println("Integer numbers: "+intNumbersLength); // TODO: Always use CTRL+ALT+L to format your code before pushing
        System.out.println("Real numbers: "+realNumbersLength);


    }

    public static boolean checkIfStringIsInteger(String string){ // TODO: Use clearer naming for these methods.
        try{
            Integer.parseInt(string);
        }catch(NumberFormatException e){
            return false;
        }catch(NullPointerException e){ // TODO: Investigate this warning
            return false;
        }
        return true;
    }

    public static boolean checkIfStringIsReal(String string){
        try{
            Float.parseFloat(string);
        }catch(NumberFormatException e){
            return false;
        }catch(NullPointerException e){
            return false;
        }
        return true;
    }
}
