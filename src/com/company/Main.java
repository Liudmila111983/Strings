package com.company;

public class Main {

    public static void main(String[] args)
    //Слияние символов и получение строк
    {
        char c1 = '\u27FF';
        char c2 = '\u261B';

        String s = "" + c1 + c2;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(s);

        //Сравнение строк
        String s1 = "first";
        String s2 = "firss";
        int i = s1.compareTo(s2);

        System.out.println(s1);

        //Конкотенация
        s1=s1.concat(s2);
        System.out.println(s1);

        //проверка на наличие цифр (или букв)
        s1="123";
        System.out.println(isContainsOnlyDigits(s1)); // Пишем private static boolean isContainsOnlyDigits(String s)

        // Содержит ли строка заданную подстроку
        s1="good";
        s2="oov";
        System.out.println(s1.contains(s2));

        //Заменить символ "." на "?" в строке
        s1="Why.";
        int pos = s1.indexOf('.');
        System.out.println(pos);

        s1 = s1.replace('.', '?');
        System.out.println(s1);

        // Извлечь подстроку "JVM"
        s1 = "JDK vs JRE vs JVM"; //JRE - Java Runtime environment
         String jvm = s1.substring(14);
        System.out.println(jvm);

        // Извлечь подстроку "JRE"
        s1 = "JDK vs JRE vs JVM"; //JRE - Java Runtime environment
        String s3 = s1.substring(7,10);
        System.out.println(s3);

        // Заменить букву на строчную
        StringBuilder sb = new StringBuilder(); // Строки в Java являются неизменяемыми
        sb.append(s1);
        sb.setCharAt(0, sb.substring(0,1).toLowerCase().charAt(0));
        System.out.println(sb);




    }
    private static boolean isContainsOnlyDigits(String s){
        boolean result = true;
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (!Character.isDigit(c)) result = false;
        }
        return result;
    }
}
