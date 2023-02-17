package org.example;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Lecture {
    private LocalDateTime dateTime;
    private String topic;
    private String lecturerName;
    private Set<String> students;

    public Lecture( String strDateTime, String topic, String lecturerName, Set<String> attendees) {
        dateTime = LocalDateTime.parse(strDateTime);  // 2pm
        this.topic = topic;
        this.lecturerName = lecturerName;
        this.students = new HashSet<>(attendees);   // make a copy of the set
    }

    public void addStudentAttendeeName( String studentID ) {
        students.add(studentID);
    }

    public Set<String> getStudentAttendeeSet() {
        return students;        // returns a reference to set of attendees
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "dateTime=" + dateTime +
                ", topic='" + topic + '\'' +
                ", lecturerName='" + lecturerName + '\'' +
                ", studentAttendees=" + students +
                '}';
    }
}
