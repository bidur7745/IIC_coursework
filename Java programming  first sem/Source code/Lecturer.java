

public class Lecturer extends Teacher {
    // Additional Attributes for lecturer class
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;

    // Constructor of lecturer class
    public Lecturer(int teacherId, String teacherName, String address, String workingType, String employmentStatus,
                    String department, int yearsOfExperience, int WorkingHours) {
        super(teacherId, teacherName, address, workingType, employmentStatus);
        super.setWorkingHours(WorkingHours);        
        // intilization of addational attributes of lecturer class
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = 0;
        this.hasGraded = false;
    }
    public String getDepartment() {
        return department;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public int getGradedScore() {
        return gradedScore;
    }

    public boolean gethasGraded() {
        return hasGraded;
    }

    // Mutator method for gradedScore
    public void setGradedScore(int newgradedScore) {
        this.gradedScore = newgradedScore;
    }

    // method for giving grade assignment
    public void gradeAssignment(int gradedscore, String department, int yearsOfExperience) {
        if (!hasGraded) {
            if (yearsOfExperience >= 5 && department.equals(department)) {
                if (gradedscore >= 70) {
                    setGradedScore(gradedscore);
                    System.out.println("Graded scored = 'A'");
                }
                else if (gradedscore >= 60) {
                    setGradedScore(gradedscore);
                    System.out.println("Graded scored = 'B'");
                } 
                else if (gradedscore >= 50) {
                    setGradedScore(gradedscore);
                    System.out.println("Graded scored = 'C'");

                } 
                else if (gradedscore >= 40) {
                    setGradedScore(gradedscore);
                    System.out.println("Graded scored = 'D'");

                } 
                else {
                    setGradedScore(gradedscore);
                    System.out.println("Graded scored = 'E'");

                }

                this.hasGraded = true;
            } else {
                System.out.println("Lecturer cannot grade assignments for this student.");
            }
        } else {
            System.out.println(" The assignments is  already  graded.");
}}
    // overriding the display method to add new attributes
    @Override
    public void DisplayTeacherInfo() {
        super.DisplayTeacherInfo(); // Calling the display methodof the  superclass
        //displaying the addtional attributes of this class
        System.out.println("Department= " + this.department);
        System.out.println("Years of Experiences= " + this.yearsOfExperience);
        
        if (hasGraded) {
            System.out.println("Grade Scores= " + this.gradedScore);
        } else {
            System.out.println("Grade Scores= Score has not graded till now.");
        }
    }

}
