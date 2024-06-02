
/**
 * Write a description of class Tutor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 

public class Tutor extends Teacher {
    // Adding additional attributes to tutor class
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;

    // making constructor for tutuor class
    public Tutor(int teacherId, String teacherName, String address, String workingType, String employmentStatus,
                 int workingHours, double salary, String specialization, String academicQualifications, int performanceIndex) {
        super(teacherId, teacherName, address, workingType, employmentStatus);
        super.setWorkingHours(workingHours);
        //  initializationing the additional attributes
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
    }

    // Accessor methods
    public double getSalary() {
        return salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getAcademicQualifications() {
        return academicQualifications;
    }

    public int getPerformanceIndex() {
        return performanceIndex;
    }

    public boolean isCertified() {
        return isCertified;
    }

    // Mutator method for salary
    public void setSalary(double newSalary, int newPerformanceIndex) {
        if (!isCertified) {
            if (newPerformanceIndex > 5 && super.getWorkingHours() > 20) {
                double appraisalPercentage;

                if (newPerformanceIndex >= 5 && newPerformanceIndex <= 7) {
                    appraisalPercentage = 0.05;
                } else if (newPerformanceIndex >= 8 && newPerformanceIndex <= 9) {
                    appraisalPercentage = 0.10;
                } else {
                    appraisalPercentage = 0.20;
                }

                double appraisalAmount = salary * appraisalPercentage;
                this.salary = salary + appraisalAmount;
                this.performanceIndex = newPerformanceIndex;
                this.isCertified = true;
                System.out.println("tutor is ceftified with new salary. ");
            }
        } else {
            System.out.println("Certified tutor cannot be modified for salary.");
        }
    }

    // Method to remove tutor
    public void removeTutor() {
        if (!isCertified) {
            this.salary = 0;
            this.specialization = "";
            this.academicQualifications = "";
            this.performanceIndex = 0;
            this.isCertified = false;
        } else {
            System.out.println("Certified tutor cannot be removed.");
        }
    }

    // Override display method to include additional details
    @Override
    public void DisplayTeacherInfo() {
        super.DisplayTeacherInfo(); // Call the display method in the superclass

        if (isCertified) {
            System.out.println("Salary: " + this.salary);
            System.out.println("Specialization: " + this.specialization);
            System.out.println("Academic Qualifications: " + this.academicQualifications);
            System.out.println("Performance Index: " + this.performanceIndex);
        }
    }
   
}

