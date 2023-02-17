package org.example;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Recording students who attend lectures.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Record of Lectures and the Students who attended each lecture");

        ArrayList<Lecture> lectures = new ArrayList<>();

        populateLectures(lectures);

        for (Lecture l : lectures)
            System.out.println(l);


        //TODO Q5 - see questions to answer and write code here.



    }   // end main()

    /**
     * Fill the lectures List with data
     *
     * @param lectures
     */
    public static void populateLectures(ArrayList<Lecture> lectures) {

        HashSet<String> students = new HashSet<>();
        students.add("101");
        students.add("102");
        students.add("103");
        students.add("104");

        lectures.add(new Lecture("2023-02-20T14:00:00", "Quantum Entanglement",
                                    "James Bloom", students));

        students = new HashSet<>();
        students.add("101");
        students.add("102");
        students.add("105");
        students.add("106");

        lectures.add(new Lecture("2023-02-27T14:00:00", "Lambda functions",
                                "Josh Bluth", students));

        students = new HashSet<>();
        students.add("102");
        students.add("103");
        students.add("106");
        students.add("107");

        lectures.add(new Lecture("2023-03-12T14:00:00", "Rust programming",
                                "Alex Cruz", students));

    }

}
