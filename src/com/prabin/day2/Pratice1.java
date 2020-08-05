package com.prabin.day2;

import java.sql.SQLOutput;

public class Pratice1 {
    public static void main (String [] args) {


        String fisrtName = "Chinu";
        String lastName = "Kattel";
        String address = "3818 Esters Rd Irving Texas";
        String fatersName = "Bhanu Bhakta Kattel";
        String mothersName = " Kamala Kattel";
        String higherEducation = "Associate Degree";
        String emailID = "Chinuktl95@gmail.com";
        String occupation = " Quality Assurance";

        String fullName = fisrtName + lastName;
        System.out.println("Name = " + fullName);
        System.out.println("Address = " + address);
        System.out.println("Fathers Name = " + fatersName);
        System.out.println("Mothers Name = " + mothersName);
        System.out.println("Higher Education= " + higherEducation);
        System.out.println("Email ID= " + emailID);
        System.out.println("Occupation= " + occupation);

        String s1 = "abc";
        String s2 = "abc";
        String s3 = "def";
        String s4 = "ABC";

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));
        System.out.println(s1.equalsIgnoreCase(s3));

        String s= "Hello world";
        s= s. replace( 'l', 'm' );
        System.out.println( "After replacing l with m");
        System.out.println(s);

        String x1 = "Hello Prabin , Hi Ramesh";
        x1      = s1.replaceAll( "Hello" , "Hi" );
        System.out.println( "After replacing :");
        System.out.println(x1);

        String a1 = "Hello journaldev, Hello pankaj";
        s1 = a1.replaceAll("Hello", "Hi");
        System.out.println("After Replacing :");
        System.out.println(a1);


    }
}
