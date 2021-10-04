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

public class Solution39 {
    public static void main(String[] args) {

        sortRecords();
    }

    static void sortRecords() {
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

        //Sorted Map

        System.out.println("Name                | Position             | Separation Date");
        System.out.println("--------------------|----------------------|----------------");

        //Just sort last name
        Map<Integer, String> sortedlastname = lastname.entrySet().stream().sorted(comparingByValue()).collect(toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));


        //System.out.println("map after sorting by values:\n " + sortedlastname.toString());
        String tempString = "";
        String tempkey = "";
        int key;

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
                        //Get Values from Lastname
                        String lastnamevalue = lastname.get(Integer.parseInt(tempkey));

                        //Get Values from
                        String firstnamevalue = firstname.get(Integer.parseInt(tempkey));
                        //System.out.println("Value of firstname	 = " + firstnamevalue);

                        String positionvalue = position.get(Integer.parseInt(tempkey));
                        //System.out.println("Value of positionvalue	 = " +positionvalue);

                        String seperationdatevalue = seperationdate.get(Integer.parseInt(tempkey));
                        //System.out.println("Value of seperationdatevalue	 = " +seperationdatevalue);

                        System.out.printf("%-20s|  %-20s| %-20s%n", firstnamevalue + " " + lastnamevalue, positionvalue, seperationdatevalue);

                    }
                } catch (NumberFormatException e) {
                    //Do nothing skip. because the String has Keys and Values.
                }
            }
        }
    }
}


/*
Given the following data set,
create a program that sorts all employees by last name and prints them to the screen in a tabular format.

Store the data using a list of maps.

Prompt user input and store in a map
sort and print formatted
 */