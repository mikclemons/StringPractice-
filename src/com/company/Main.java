package com.company;

public class Main {

    public static void main(String[] args) {

	String myName = new String("Mikayla Clemons");

	String myNameLowerCase = new String("mikayla clemons");

	boolean isEqual = myName.equals(myNameLowerCase);

        System.out.println(isEqual);

    boolean areEqual = myName.equalsIgnoreCase(myNameLowerCase);
        System.out.println(areEqual);

        System.out.println(myName.length());

        System.out.println(myName.concat(myNameLowerCase));

        System.out.println(myName.charAt(3));

   String myFirstName = new String("Mikayla");

   String myClassmatesFirstName = new String("Nada");

   int result = myFirstName.compareToIgnoreCase(myClassmatesFirstName);
        System.out.println(result);

    String myNewName = myName.replace('a' , 'Z');

        System.out.println(myNewName);

    String lastTwoCharOfMyName = myName.substring(myName.length()-2);

        System.out.println(lastTwoCharOfMyName);
    }
}
