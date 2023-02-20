package it.oop.exercise_three;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {

        System.out.println("Exercise 1:");
        Student dario = new Student("Dario", 25, "Java Backend");
        System.out.println("Grades Mean: " + dario.getGradesMean());
        dario.setGrades(25);
        dario.setGrades(29);
        dario.setGrades(27);
        dario.setGrades(28);
        dario.setGrades(28);
        System.out.println("Grades: " + dario.getGrades());
        System.out.println("Grades Mean: " + dario.getGradesMean());
        System.out.println("Name: " + dario.getName());
        System.out.println("Age: " + dario.getAge());
        System.out.println("Name: " + dario.getName());
        System.out.println("Course: " + dario.getCourse());
        dario.setCourse("Data Analysis");
        System.out.println("Course: " + dario.getCourse());
        // Write and use your 5 getters and setters!
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        Student student2 = new Student("Gigio", 15, "Front End");
        Student student3 = new Student("Gigio", 19, "Front End");
        Student student4 = new Student("Gigio", 14, "Front End");
        Student student5 = new Student("Gigio", 27, "Front End");
        Student student6 = new Student("Gigio", 31, "Front End");
        Student student7 = new Student("Gigio", 18, "Front End");
        System.out.println("Total students: " + Student.getStudentCounter());
        System.out.println("Underage students: " + Student.getUnderageStudentCounter());
        System.out.println("Adult students: " + Student.getAdultStudentCounter());

        //Write your code here
    }

}
