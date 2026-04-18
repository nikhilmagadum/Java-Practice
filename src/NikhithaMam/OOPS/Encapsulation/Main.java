package NikhithaMam.OOPS.Encapsulation;

class Classroom {
    // Static variable for tracking total attendance across all classrooms
    static int totalAttendance = 0;

    // Non-static variable for tracking attendance in this specific classroom
    int classroomAttendance;

    // Method to mark a student's attendance
    public void markAttendance() {
        classroomAttendance++;  // Increment attendance for this classroom
        totalAttendance++;      // Increment total attendance across the school
    }

    public void displayAttendance() {
        System.out.println("Attendance in this classroom: " + classroomAttendance);
        System.out.println("Total attendance in school: " + totalAttendance);
    }
}

public class Main{
    public static void main(String[] args) {
        // Write your code here.

        Classroom c = new Classroom();

        c.markAttendance();
        c.markAttendance();

        c.displayAttendance();
    }
}