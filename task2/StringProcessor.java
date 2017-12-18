package com.company.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class StringProcessor {
    public static String makeStringFromNString(String copyString, int numberOfString)throws BadStringCountException{
        /*На входе строка, число повторов, исключение
        * если число<0 => выбрасывает исключение
        * если число =0 => пустая строка
        * если число >0 => выдает количество копий = числу*/
        if(numberOfString<0){
            throw new BadStringCountException(); // исключение
        }
        if(numberOfString==0){
            return new String();   // пустая строка
        }
        String resultString = copyString;
        for (int i=1; i<numberOfString; i++){
            resultString=resultString + copyString;   // копии
        }
        return resultString;
    }
    /*количество вхождения 2 строки в первую */
    public static int getNumberSecondStringInFirstString(String firstString, String secondString){
        int numberSIF=0;
        String seeingString="";
        for(int i=0; i<=firstString.length()-secondString.length(); i++){
            seeingString=firstString.substring(i, secondString.length()+i);
            if(seeingString.equals(secondString)){
                numberSIF++;
            }
        }
        return numberSIF; // количетсво
    }

    public static String makeNewStringWithReplace(String mainString){ //заменить на подстроку
        String resultString = mainString.replace("1", "Один");
        resultString = resultString.replace("2", "Два");
        resultString = resultString.replace("3", "Три");
        return resultString;
    }

    public static StringBuilder deleteEvenElement(StringBuilder workingString){ // удалить каждый 2 элемент строки
        int ind=1;
        while(ind<workingString.length()) {
            workingString.deleteCharAt(ind);
            ind++;
        }
        return workingString;
    }

    public static String swapFirstAndLast (String workingString){
        String firstWord, secondWord;
        boolean check=false, check2=false, allSpace=false;
        if(workingString.equals("")){  // проверка на пустоту
            return workingString;
        }
        for(int i=0; i<workingString.length(); i++){ // если без пробела
            if((int)workingString.charAt(i)!=32){
                allSpace=true;
            }
        }
        if(!allSpace){     // если все пробелы
            return workingString;
        }
        for(int i=0; i < workingString.length(); i++){
            if((int)workingString.charAt(i)!=32 && !check2){ // 32 - "пробел"
                check=true;
            }
            if((int)workingString.charAt(i)==32 && check){
                check2=true;
            }
            if(check2 && workingString.charAt(i)!=32){
                check=false;
            }
        }
        int firstWordStart=0, firstWordEnd, secondWordStart, secondWordEnd=workingString.length()-1;
        while((int)workingString.charAt(firstWordStart)==32){
            firstWordStart++;
        }
        firstWordEnd=firstWordStart;
        while((int)workingString.charAt(firstWordEnd)!=32){
            firstWordEnd++;
        }
        firstWord = workingString.substring(firstWordStart, firstWordEnd);
        while((int)workingString.charAt(secondWordEnd)==32){
            secondWordEnd--;
        }
        secondWordEnd++;
        secondWordStart=secondWordEnd-1;
        while((int)workingString.charAt(secondWordStart)!=32){
            secondWordStart--;
        }
        secondWordStart++;
        if(firstWordStart==secondWordStart){
            return workingString;
        }
        secondWord = workingString.substring(secondWordStart, secondWordEnd);
        workingString=workingString.replaceFirst(secondWord, firstWord);
        workingString=workingString.replaceFirst(firstWord, secondWord);
        return workingString;
    }

    public static String changeHexToDecimal(String workingString) {
        int pointStartHex=0, elem, res=0;
        char sumHex;
        String workingHex, decimalString;
        String hexString;
        Pattern startHex = Pattern.compile("0x");
        Matcher findStartHex = startHex.matcher(workingString);
        while(findStartHex.find(pointStartHex)) {
            pointStartHex = findStartHex.start();
            hexString = workingString.substring(pointStartHex + 2, pointStartHex + 10);
            res=0;
            for (int i = 0; i < hexString.length(); i++) {
                sumHex = hexString.charAt(i);
                elem = (int) sumHex;
                if (elem == 48) {
                    res = 16 * res;
                }
                if (elem == 49) {
                    res = 16 * res + 1;
                }
                if (elem == 50) {
                    res = 16 * res + 2;
                }
                if (elem == 51) {
                    res = 16 * res + 3;
                }
                if (elem == 52) {
                    res = 16 * res + 4;
                }
                if (elem == 53) {
                    res = 16 * res + 5;
                }
                if (elem == 54) {
                    res = 16 * res + 6;
                }
                if (elem == 55) {
                    res = 16 * res + 7;
                }
                if (elem == 56) {
                    res = 16 * res + 8;
                }
                if (elem == 57) {
                    res = 16 * res + 9;
                }
                if (elem == 65) {
                    res = 16 * res + 10;
                }
                if (elem == 66) {
                    res = 16 * res + 11;
                }
                if (elem == 67) {
                    res = 16 * res + 12;
                }
                if (elem == 68) {
                    res = 16 * res + 13;
                }
                if (elem == 69) {
                    res = 16 * res + 14;
                }
                if (elem == 70) {
                    res = 16 * res + 15;
                }
            }
            workingHex=workingString.substring(pointStartHex, pointStartHex+10);
            decimalString=Integer.toString(res);
            workingString=workingString.replaceFirst(workingHex, decimalString);
            findStartHex.reset(workingString);
        }
        return workingString;
    }
}
