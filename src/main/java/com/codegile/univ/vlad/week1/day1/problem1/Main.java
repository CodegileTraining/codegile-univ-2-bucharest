package com.codegile.univ.vlad.week1.day1.problem1;


import java.io.*;

public class Main {

    public static void main(String[] args) {
        int intNumbersLength = 0;
        int realNumbersLength = 0;

        InputStream is = ClassLoader.getSystemResourceAsStream("numbers.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = null;
        try{
            while((line = br.readLine()) !=  null){
                System.out.println(line);
                String[] array = line.split(" ");
                for(int i=0; i<= array.length-1; i++){
                    if(checkIfStringIsInteger(array[i])) {
                        intNumbersLength++;
                    }
                    if(checkIfStringIsReal(array[i])){
                        realNumbersLength++;
                    }
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Integer numbers: "+intNumbersLength);
        System.out.println("Real numbers: "+realNumbersLength);


    }

    public static boolean checkIfStringIsInteger(String string){
        try{
            Integer.parseInt(string);
        }catch(NumberFormatException e){
            return false;
        }catch(NullPointerException e){
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
