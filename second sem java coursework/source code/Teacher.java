
/**
 * Write a description of class Teacher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 

public class Teacher {
    // Attributes of Teacher class
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours; //  the default value of working hours is 0

    // Constructor of teacher class
    public Teacher(int teacherId, String teacherName, String address, String workingType, String employmentStatus) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
    }

    // Accessor methods 
    public int getTeacherId() {
        return teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getAddress() {
        return address;
    }

    public String getWorkingType() {
        return workingType;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    // Method to seting working hours 
    public void setWorkingHours(int newWorkingHours) {
        this.workingHours = newWorkingHours;
    }

    // Display method to display teacher info
    public void DisplayTeacherInfo() {
        System.out.println("Teacher ID= " + this.teacherId);
        System.out.println("Teacher Name= " + this.teacherName);
        System.out.println("Address= " + this.address);
        System.out.println("Working Type= " + this.workingType);
        System.out.println("Employment Status= " + this.employmentStatus);

        if (workingHours > 0) {
            System.out.println("Working Hours= " + workingHours);
        } else {
            System.out.println("Working Hours= Not assigned");
        }
    }

    
}



