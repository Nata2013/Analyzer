package com.javarush.cryprtanalyzer.sulcer.constants;


// homework #1 Encryption
 public class CryptoAlphabet {
     public static void main(String[] args) {
        int key  = 1;
        String text  = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ.,;””:-!?";
       text = text.toLowerCase();
        System.out.println(text);
        char [] chars = text.toCharArray();
        for(char c : chars){
        c += key;
            System.out.print(c);
    }}}

         // Decryption
  /*public static void main(String[] args) {
     String text  = "бвгдежђзийклмнопрстуфхцчшщъыьэюяѐ/-<„„;.@";
       int key = 1;
       text = text.toUpperCase();
       System.out.println(text);

       char [] chars = text.toCharArray();
       for(char c : chars) {
           c -= key;
           System.out.print(c);
       }}}*/

  /* Homework 2 Encryption - Decryption in one test .

    private static final String alphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"; //create variable String "alphabet"
    private static char symbolRightShift (char symbol, int shift ){   // create function, argument will be char - symbol, int - shift
        if (alphabet.indexOf(symbol) != -1){    // if symbol present in the string - shift to the right,   if not  - 1 (ignore)
            return alphabet.charAt((alphabet.indexOf(symbol) + shift) % alphabet.length());
        } else {
            return symbol;
        }}

    public static void main (String[] args){
        String text = "Кто поет на дереве?";
        text = text.toUpperCase();for ( int i = 0; i <= 33 ; i++){
            for( int j = 0; j < text.length(); j++){
                System.out.print(symbolRightShift(text.charAt(j),(i)));
            }
            System.out.println();
        }}}*/