package poo.entities;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public double missingPoints() {
        if (finalGrade() < 60.0) {
            return 60.0 - finalGrade();
        } else {
            return 0.0;
        }
    }

    public void showFinalGrade() {
        if (missingPoints() > 0) {
            System.out.println("Student: " + name + "\nGrade: " +  finalGrade() + "\nThe student failed and is" +
                    " missing: " + String.format("%.2f", missingPoints()) + " points. :(");
        } else {
            System.out.println("Student: " + name + "\nGrade: " +  finalGrade() + "\nCongratulations! The student has" +
                    " achieved a passing grade! :)");
        }
    }

}
