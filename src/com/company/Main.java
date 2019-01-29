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
    }
}
