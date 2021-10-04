/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Mohit Ballikar
 */
package baseline;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Solution40 {
    //similart method to 39 in framing, instead storing and sorting differently as well as asking for input
    public static void main(String[] args) throws IOException {
        //Search a set of Records for a specific String.
        searchRecords();
    }

    static void searchRecords() throws IOException {
        String inputstring = "";
        String tempString = "";
        String tempkey = "";
        int key;
        boolean islastnamefound = false;
        boolean isfirstnamefound = false;
        boolean ispositionfound = false;


        //create Map for Last name
        Map<Integer, String> lastname = new HashMap<>();
        lastname.put(1, "Johnson");
        lastname.put(2, "Xiong");
        lastname.put(3, "Michaelson");
        lastname.put(4, "Jacobson");
        lastname.put(5, "Jackson");
        lastname.put(6, "Webber");

        //create Map for Last name
        Map<Integer, String> firstname = new HashMap<>();
        firstname.put(1, "John");
        firstname.put(2, "Tou");
        firstname.put(3, "Michaela");
        firstname.put(4, "Jake");
        firstname.put(5, "Jacquelyn");
        firstname.put(6, "Sally");

        //create Map for position
        Map<Integer, String> position = new HashMap<>();
        position.put(1, "Manager");
        position.put(2, "Software Engineer");
        position.put(3, "District Manager");
        position.put(4, "Programmer");
        position.put(5, "DBA");
        position.put(6, "Web Developer");

//create Map for seperation date
        Map<Integer, String> seperationdate = new HashMap<>();
        seperationdate.put(1, "2016-12-31");
        seperationdate.put(2, "2016-10-05");
        seperationdate.put(3, "2015-12-19");
        seperationdate.put(4, " ");
        seperationdate.put(5, " ");
        seperationdate.put(6, "2015-12-18");

        //Define the standard library for inputs
        BufferedReader readInput = new BufferedReader(new InputStreamReader(System.in));

        //Read Users Inputs
        System.out.print("Enter a search string: ");
        inputstring = readInput.readLine();

        //Sorted Map

        System.out.println("Name                | Position             | Separation Date");
        System.out.println("--------------------|----------------------|----------------");

        //Just sort last name
        Map<Integer, String> sortedlastname = lastname.entrySet().stream().sorted(comparingByValue()).collect(toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));


        //System.out.println("map after sorting by values:\n " + sortedlastname.toString());


        tempString = sortedlastname.toString();

        //Parse the sort string to get keys.

        String[] sortedstring = tempString.split(",");
        for (int i = 0; i < sortedstring.length; i++) {
            String[] tempsortedstring = sortedstring[i].split("=");
            //Further Spilt this.
            for (int j = 0; j < tempsortedstring.length; j++) {
                tempkey = tempsortedstring[j];
                if (j == 0) {
                    tempkey = tempkey.substring(1, tempkey.length());
                }
                //System.out.println("KEY === " + tempkey);
                try {
                    key = Integer.parseInt(tempkey);

                    if (key > 0) {
                        //Also Look for the Search Field in the same function.
                        //Get Values from Lastname
                        String lastnamevalue = lastname.get(Integer.parseInt(tempkey));
                        islastnamefound = lastnamevalue.contains(inputstring);
                        //System.out.println("Value of issearchfound " + issearchfound);

                        //Get Values from
                        String firstnamevalue = firstname.get(Integer.parseInt(tempkey));
                        isfirstnamefound = firstnamevalue.contains(inputstring);
                        //System.out.println("Value of firstname	 = " + firstnamevalue);

                        String positionvalue = position.get(Integer.parseInt(tempkey));
                        ispositionfound = positionvalue.contains(inputstring);
                        //System.out.println("Value of positionvalue	 = " +positionvalue);

                        String seperationdatevalue = seperationdate.get(Integer.parseInt(tempkey));
                        //System.out.println("Value of seperationdatevalue	 = " +seperationdatevalue);

                        //Show the results if any one of the values are found  in last name, Firstname or Position.
                        if (islastnamefound || isfirstnamefound || ispositionfound) {
                            System.out.printf("%-20s|  %-20s| %-20s%n", firstnamevalue + " " + lastnamevalue, positionvalue, seperationdatevalue);
                        }

                    }
                } catch (NumberFormatException e) {
                    //Do nothing skip. because the String has Keys and Values.
                }
            }
        }
    }
}