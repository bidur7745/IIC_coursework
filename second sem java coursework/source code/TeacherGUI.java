
/**
 * Write a description of class TeacherGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import com.sun.source.tree.NewArrayTree;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.text.JTextComponent;

public class TeacherGUI {
    private ArrayList<Teacher> teacherArrayList = new ArrayList<>();
    private JFrame frame;

    private JPanel panel, pannelLecturer, tutorPannel, btnPannel;
    private JLabel teacherIDL, teacherNameL, addressL, workingTypeL, employmentStatusL, workingHourL, departmentL,
            yearOfExperienceL, gradeScoreL, hasGradedL;
    private JLabel salaryL, specializationL, academicQualificationL, performanceIndexL, isCertifiedL;
    private JTextField salaryF, specializationF, academicQualificationF, performanceIndexF, isCertifiedF;
    private JTextField teacherIDF, teacherNameF, addressF, workingTypeF, employmentStatusF, workingHourF, departmentF,
            yearOfExperienceF, gradeScoreF, hasGradedF;

    private JButton addLecturerBtn, gradeAssignmentBtn, setSalaryBtn, removeTutorBtn, clearBtn, displayBtn, addtutorbtn;
    Font myFont = new Font("Impact", Font.ITALIC, 40);

    public TeacherGUI() {
        frame = new JFrame("Teacher Management System");
        frame.setSize(900, 770);
        frame.setFont(myFont);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        // attributes for teacher class
        panel = new JPanel();
        panel.setBounds(20, 20, 400, 300);
        panel.setBackground(Color.gray);
        panel.setLayout(null);
        TitledBorder titledBorder = BorderFactory.createTitledBorder(" Teacher Class");
        titledBorder.setTitleColor(Color.WHITE);
        panel.setBorder(titledBorder);
        Border border = BorderFactory.createLineBorder(Color.darkGray, 3);

        panel.setFont(myFont);

        teacherIDL = new JLabel("Teacher ID: ");
        teacherIDL.setBounds(20, 30, 100, 25);

        teacherNameL = new JLabel("Teacher Name: ");
        teacherNameL.setBounds(20, 70, 100, 25);

        addressL = new JLabel("Address: ");
        addressL.setBounds(20, 110, 100, 25);

        workingTypeL = new JLabel("Working Type: ");
        workingTypeL.setBounds(20, 150, 100, 25);

        employmentStatusL = new JLabel("Employment Status: ");
        employmentStatusL.setBounds(20, 190, 120, 25);

        workingHourL = new JLabel("Working Hours: ");
        workingHourL.setBounds(20, 230, 100, 25);

        teacherIDF = new JTextField();
        teacherIDF.setBounds(150, 30, 120, 25);

        teacherNameF = new JTextField();
        teacherNameF.setBounds(150, 70, 120, 25);

        addressF = new JTextField();
        addressF.setBounds(150, 110, 120, 25);

        workingTypeF = new JTextField();
        workingTypeF.setBounds(150, 150, 120, 25);

        employmentStatusF = new JTextField();
        employmentStatusF.setBounds(150, 190, 120, 25);

        workingHourF = new JTextField();
        workingHourF.setBounds(150, 230, 120, 25);

        // attributes for lecture clas
        pannelLecturer = new JPanel();
        pannelLecturer.setBounds(450, 20, 400, 300);
        pannelLecturer.setBackground(Color.gray);
        pannelLecturer.setLayout(null);
        TitledBorder titledBorder1 = BorderFactory.createTitledBorder(" Lecturer Class");
        titledBorder1.setTitleColor(Color.WHITE);
        pannelLecturer.setBorder(titledBorder1);

        departmentL = new JLabel("Department: ");
        departmentL.setBounds(65, 30, 100, 25);

        yearOfExperienceL = new JLabel("Year of Experience: ");
        yearOfExperienceL.setBounds(20, 65, 130, 25);

        gradeScoreL = new JLabel("Graded score: ");
        gradeScoreL.setBounds(53, 105, 100, 25);

        hasGradedL = new JLabel("Has Graded: ");
        hasGradedL.setBounds(57, 145, 100, 25);

        departmentF = new JTextField();
        departmentF.setBounds(150, 30, 130, 25);

        yearOfExperienceF = new JTextField();
        yearOfExperienceF.setBounds(150, 65, 130, 25);

        gradeScoreF = new JTextField();
        gradeScoreF.setBounds(150, 105, 130, 25);

        hasGradedF = new JTextField();
        hasGradedF.setBounds(150, 145, 130, 25);

        addLecturerBtn = new JButton("Add Lecture");
        addLecturerBtn.setBounds(50, 190, 120, 35);
        addLecturerBtn.setBackground(Color.BLACK);
        addLecturerBtn.setForeground(Color.WHITE);
        addLecturerBtn.setBorder(border);

        gradeAssignmentBtn = new JButton("Graded Assignment");
        gradeAssignmentBtn.setBounds(200, 190, 180, 35);
        gradeAssignmentBtn.setBackground(Color.BLACK);
        gradeAssignmentBtn.setForeground(Color.WHITE);
        gradeAssignmentBtn.setBorder(border);
        // pannel for tutor
        tutorPannel = new JPanel();
        tutorPannel.setBounds(20, 350, 400, 300);
        tutorPannel.setBackground(Color.GRAY);
        tutorPannel.setLayout(null);
        TitledBorder titledBorder2 = BorderFactory.createTitledBorder(" Tutor Class");
        titledBorder2.setTitleColor(Color.WHITE);
        tutorPannel.setBorder(titledBorder2);

        salaryL = new JLabel("Salary: ");
        salaryL.setBounds(105, 30, 100, 25);

        specializationL = new JLabel("Specializations: ");
        specializationL.setBounds(53, 70, 100, 25);

        academicQualificationL = new JLabel("Academic Qualification: ");
        academicQualificationL.setBounds(13, 110, 135, 25);

        performanceIndexL = new JLabel("Performance Index: ");
        performanceIndexL.setBounds(35, 150, 130, 25);

        isCertifiedL = new JLabel("Is certified: ");
        isCertifiedL.setBounds(82, 190, 100, 25);

        salaryF = new JTextField();
        salaryF.setBounds(155, 30, 130, 25);

        specializationF = new JTextField();
        specializationF.setBounds(155, 70, 130, 25);

        academicQualificationF = new JTextField();
        academicQualificationF.setBounds(155, 110, 130, 25);

        performanceIndexF = new JTextField();
        performanceIndexF.setBounds(155, 150, 130, 25);

        isCertifiedF = new JTextField();
        isCertifiedF.setBounds(155, 190, 130, 25);

        addtutorbtn = new JButton("Add Tutor");
        addtutorbtn.setBounds(30, 190, 100, 30);
        addtutorbtn.setBackground(Color.BLACK);
        addtutorbtn.setForeground(Color.WHITE);
        addtutorbtn.setBorder(border);

        setSalaryBtn = new JButton("Set Salary");
        setSalaryBtn.setBounds(140, 190, 100, 30);
        setSalaryBtn.setBackground(Color.BLACK);
        setSalaryBtn.setForeground(Color.WHITE);
        setSalaryBtn.setBorder(border);

        removeTutorBtn = new JButton("Remove Tutor");
        removeTutorBtn.setBounds(250, 190, 100, 30);
        removeTutorBtn.setBackground(Color.BLACK);
        removeTutorBtn.setForeground(Color.WHITE);
        removeTutorBtn.setBorder(border);

        btnPannel = new JPanel();
        btnPannel.setBounds(450, 400, 300, 100);
        btnPannel.setBackground(Color.gray);
        btnPannel.setLayout(null);
        TitledBorder titledBorder3 = BorderFactory.createTitledBorder("Buttons");
        titledBorder3.setTitleColor(Color.WHITE);

        btnPannel.setBorder(titledBorder3);

        displayBtn = new JButton("Display");
        displayBtn.setBounds(20, 30, 120, 25);
        displayBtn.setBackground(Color.BLACK);
        displayBtn.setForeground(Color.WHITE);
        displayBtn.setBorder(border);

        clearBtn = new JButton("Clear");
        clearBtn.setBounds(160, 30, 120, 25);
        clearBtn.setBackground(Color.BLACK);
        clearBtn.setForeground(Color.WHITE);
        clearBtn.setBorder(border);

        panel.add(teacherIDL);
        panel.add(teacherIDF);
        panel.add(teacherNameL);
        panel.add(teacherNameF);
        panel.add(addressL);
        panel.add(addressF);
        panel.add(workingTypeL);
        panel.add(workingTypeF);
        panel.add(employmentStatusL);
        panel.add(employmentStatusF);
        panel.add(workingHourL);
        panel.add(workingHourF);

        pannelLecturer.add(departmentL);
        pannelLecturer.add(departmentF);
        pannelLecturer.add(yearOfExperienceL);
        pannelLecturer.add(yearOfExperienceF);
        pannelLecturer.add(gradeScoreL);
        pannelLecturer.add(gradeScoreF);
        // pannelLecturer.add(hasGradedL);
        // pannelLecturer.add(hasGradedF);
        pannelLecturer.add(addLecturerBtn);
        pannelLecturer.add(gradeAssignmentBtn);

        tutorPannel.add(salaryL);
        tutorPannel.add(salaryF);
        tutorPannel.add(specializationL);
        tutorPannel.add(specializationF);
        tutorPannel.add(academicQualificationL);
        tutorPannel.add(academicQualificationF);
        tutorPannel.add(performanceIndexL);
        tutorPannel.add(performanceIndexF);
        // tutorPannel.add(isCertifiedL);
        // tutorPannel.add(isCertifiedF);
        tutorPannel.add(setSalaryBtn);
        tutorPannel.add(removeTutorBtn);
        tutorPannel.add(addtutorbtn);

        btnPannel.add(displayBtn);
        btnPannel.add(clearBtn);

        Component teacher = frame.add(panel);
        Component lecturer = frame.add(pannelLecturer);
        Component tutor = frame.add(tutorPannel);
        Component bnpannl = frame.add(btnPannel);
        frame.setVisible(true);

        addLecturerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLecturer();
            }
        });

        gradeAssignmentBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gradeAssignment();

            }
        });

        // for tutor adding buttons
        addtutorbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTutor();

            }

        });

        setSalaryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSalary();
            }
        });

        removeTutorBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeTutor();
            }
        });

        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clear();
            }
        });

        displayBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayInfo();
            }
        });
    }

    public void addTutor() {
        try {
            String teacherId = getTextFromTF(teacherIDF);
            String teacherName = getTextFromTF(teacherNameF);
            String address = getTextFromTF(addressF);
            String workingType = getTextFromTF(workingTypeF);
            String employmentStatus = getTextFromTF(employmentStatusF);
            String workingHours = getTextFromTF(workingHourF);
            String salary = getTextFromTF(salaryF);
            String specialization = getTextFromTF(specializationF);
            String academicQualification = getTextFromTF(academicQualificationF);
            String performanceIndex = getTextFromTF(performanceIndexF);

            int teacherID = Integer.parseInt(teacherId);
            int workingHour = Integer.parseInt(workingHours);

            Double salaries = Double.parseDouble(salary);
            int performanceInd = Integer.parseInt(performanceIndex);
            if (salaries < 0 && workingHour < 20) {
                JOptionPane.showMessageDialog(frame,
                        "Salary cannot be smaller than 1 and \n Working hours must be greater than 20", "Invalid",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (performanceInd < 5 || performanceInd > 10) {
                JOptionPane.showMessageDialog(frame, "Performance index must be between 5 and 10", "Invalid",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            int confirm = JOptionPane.showConfirmDialog(tutorPannel, "Please confirm the entered information",
                    "Confirmation", JOptionPane.INFORMATION_MESSAGE);
            if (!isIdUnique(teacherID)) {
                JOptionPane.showMessageDialog(frame, "Teacher ID already exists. Please choose a different ID.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (confirm != JOptionPane.YES_OPTION) {
                return;
            }
            Tutor tutor = new Tutor(teacherID, teacherName, address, workingType, employmentStatus, workingHour,
                    salaries, specialization, academicQualification, performanceInd);
            teacherArrayList.add(tutor);
            JOptionPane.showMessageDialog(frame, "Tutor added successfully!", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Invalid input. Please check the inputs and try again.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(frame, "Please fill in all required fields.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void addLecturer() {
        try {
            String teacherId = getTextFromTF(teacherIDF);
            String teacherName = getTextFromTF(teacherNameF);
            String address = getTextFromTF(addressF);
            String workingType = getTextFromTF(workingTypeF);
            String employmentStatus = getTextFromTF(employmentStatusF);
            String workingHours = getTextFromTF(workingHourF);
            String department = getTextFromTF(departmentF);
            String yearsOfExperience = getTextFromTF(yearOfExperienceF);
            String gradeScore = getTextFromTF(gradeScoreF);
            int score = Integer.parseInt(gradeScore);
            if (score < 0 || score >= 100) {
                JOptionPane.showMessageDialog(frame, "Grade score must be greater than 0 and \n smaller  than 100",
                        "Invalid", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int id = Integer.parseInt(teacherId);
            int yearOfExperience = Integer.parseInt(yearsOfExperience);
            int workingHour = Integer.parseInt(workingHours);
            if (yearOfExperience < 5 && workingHour < 20) {
                JOptionPane.showMessageDialog(frame,
                        "Year of experiences must be greater than 5 and \n Working hours must be greater than 20",
                        "Invalid", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int confirm = JOptionPane.showConfirmDialog(pannelLecturer, "Please confirm the entered information",
                    "Confirmation", JOptionPane.INFORMATION_MESSAGE);
            if (!isIdUnique(id)) {
                JOptionPane.showMessageDialog(frame, "Teacher ID already exists. Please choose a different ID.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (confirm != JOptionPane.YES_OPTION) {
                return;
            }
            Lecturer lecturer = new Lecturer(id, teacherName, address, workingType, employmentStatus, department,
                    yearOfExperience, workingHour);
            teacherArrayList.add(lecturer);
            JOptionPane.showMessageDialog(frame, "Lecturer added successfully!", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Invalid input. Please check the inputs and try again.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(frame, "Please fill in all required fields.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void gradeAssignment() {
        JFrame frame1 = new JFrame("Grading Assignment");
        frame1.setSize(400, 300);
        frame1.setLayout(null);
        frame1.setLocationRelativeTo(null);
        Border border = BorderFactory.createLineBorder(Color.darkGray, 3);

        JLabel teacherIdAL = new JLabel("TeacherId: ");
        teacherIdAL.setBounds(65, 30, 100, 25);
        JLabel gradedScoresAL = new JLabel("Graded Scores: ");
        gradedScoresAL.setBounds(40, 70, 100, 25);
        JLabel departmentAL = new JLabel("Department: ");
        departmentAL.setBounds(60, 110, 100, 25);
        JLabel yearOfExpAL = new JLabel("Year of Experiences: ");
        yearOfExpAL.setBounds(10, 150, 140, 25);

        JTextField teacherIdAF = new JTextField();
        teacherIdAF.setBounds(140, 30, 100, 25);
        JTextField gradedScoresAF = new JTextField();
        gradedScoresAF.setBounds(140, 70, 100, 25);
        JTextField departmentAF = new JTextField();
        departmentAF.setBounds(140, 110, 100, 25);
        JTextField yearOfExpAF = new JTextField();
        yearOfExpAF.setBounds(140, 150, 100, 25);

        JButton gradeBtn = new JButton("Grade");
        gradeBtn.setBounds(20, 190, 100, 25);
        gradeBtn.setBackground(Color.BLACK);
        gradeBtn.setForeground(Color.WHITE);
        gradeBtn.setBorder(border);
        JButton clearBtn = new JButton("Clear");
        clearBtn.setBounds(140, 190, 100, 25);
        clearBtn.setBackground(Color.BLACK);
        clearBtn.setForeground(Color.WHITE);
        clearBtn.setBorder(border);

        frame1.add(teacherIdAL);
        frame1.add(gradedScoresAL);
        frame1.add(departmentAL);
        frame1.add(yearOfExpAL);
        frame1.add(gradedScoresAF);
        frame1.add(teacherIdAF);
        frame1.add(departmentAF);
        frame1.add(yearOfExpAF);
        frame1.add(gradeBtn);
        frame1.add(clearBtn);
        frame1.setVisible(true);

        gradeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    String ID = getTextFromTF(teacherIdAF);
                    String score = getTextFromTF(gradedScoresAF);
                    String department = getTextFromTF(departmentAF);
                    int teacherId = Integer.parseInt(ID);
                    int gradedScore = Integer.parseInt(score);
                    int yearsOfExperience = Integer.parseInt(yearOfExpAF.getText());
                    // find the lecturer with given id
                    Lecturer lecturer = findLecturer(teacherId);
                    if (lecturer == null) {
                        JOptionPane.showMessageDialog(frame1, "Lecturer with provided id" + teacherId + " is not found",
                                "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if (!department.strip().toLowerCase().equals(lecturer.getDepartment().strip().toLowerCase())) {
                        JOptionPane.showMessageDialog(frame, "Department must be same to grade assignment",
                                "error department", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if (gradedScore > 100 || gradedScore < 0) {
                        JOptionPane.showMessageDialog(frame, "Grade score must be between 0 and 100", "Error grade",
                                JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if (yearsOfExperience < 5) {
                        JOptionPane.showMessageDialog(frame, "year of experiences must be grater than 5", "Error",
                                JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if (lecturer != null) {
                        lecturer.gradeAssignment(gradedScore, department, yearsOfExperience);
                        JOptionPane.showMessageDialog(frame, "Teacher ID:" + lecturer.getTeacherId()
                                + "\n" +
                                "Graded score: " + gradedScore + "\n" +
                                "Department: " + department + "\n" +
                                "year of experiences: " + yearsOfExperience + "\n");
                        JOptionPane.showMessageDialog(frame1,
                                "Grading assignment is successful and grade score is displayed in terninal");
                        return;
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Teacher id, grade score, year of experiences must be positive integer", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(frame, "Please fill all the empty fields", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }

        });

        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teacherIdAF.setText("");
                gradedScoresAF.setText("");
                departmentAF.setText("");
                yearOfExpAF.setText("");
            }
        });

    }

    public void setSalary() {
        JFrame frame2 = new JFrame("Salary Setting");
        frame2.setSize(350, 250);
        frame2.setLayout(null);
        frame2.setLocationRelativeTo(null);
        Border border = BorderFactory.createLineBorder(Color.darkGray, 3);

        JLabel teacherID = new JLabel("Teacher ID: ");
        teacherID.setBounds(90, 30, 100, 25);

        JTextField teacherIdSF = new JTextField();
        teacherIdSF.setBounds(170, 30, 130, 25);

        JLabel newSalaryL = new JLabel(" New salary: ");
        newSalaryL.setBounds(90, 70, 100, 25);

        JTextField newSalarySF = new JTextField();
        newSalarySF.setBounds(170, 70, 130, 25);

        JLabel newPerformance = new JLabel("New Performance Index:");
        newPerformance.setBounds(20, 110, 170, 25);

        JTextField newPerformanceSF = new JTextField();
        newPerformanceSF.setBounds(170, 110, 130, 25);

        JButton setSalaryBtn = new JButton("Set Salary");
        setSalaryBtn.setBounds(40, 150, 100, 25);
        setSalaryBtn.setBackground(Color.BLACK);
        setSalaryBtn.setForeground(Color.WHITE);
        setSalaryBtn.setBorder(border);
        JButton clearBtn = new JButton("Clear");
        clearBtn.setBounds(160, 150, 100, 25);
        clearBtn.setBackground(Color.BLACK);
        clearBtn.setForeground(Color.WHITE);
        clearBtn.setBorder(border);

        frame2.add(teacherID);
        frame2.add(teacherIdSF);
        frame2.add(newSalaryL);
        frame2.add(newSalarySF);
        frame2.add(newPerformance);
        frame2.add(newPerformanceSF);
        frame2.add(setSalaryBtn);
        frame2.add(clearBtn);
        frame2.setVisible(true);

        setSalaryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String id = getTextFromTF(teacherIdSF);
                    String salary = getTextFromTF(newSalarySF);
                    String performance = getTextFromTF(newPerformanceSF);

                    // Convert input strings to appropriate data types
                    int teacherId = Integer.parseInt(id);
                    double newSalary = Double.parseDouble(salary);
                    int newPerformanceIndex = Integer.parseInt(performance);

                    // Input validation
                    if (newSalary < 0) {
                        JOptionPane.showMessageDialog(frame, "Salary cannot be a negative value", "Invalid Salary",
                                JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    if (newPerformanceIndex < 0 || newPerformanceIndex > 10) {
                        JOptionPane.showMessageDialog(frame, "Invalid performance index", "Error",
                                JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    // Iterate over teacherArrayList to find the teacher with the provided ID
                    for (Teacher teacher : teacherArrayList) {
                        if (teacher.getTeacherId() == teacherId) {
                            if (teacher instanceof Lecturer) {
                                JOptionPane.showMessageDialog(frame2, "Lecturer cannot have their salary modified",
                                        "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }

                            Tutor tutor = (Tutor) teacher;
                            if (tutor.isCertified()) {
                                JOptionPane.showMessageDialog(frame,
                                        "Tutor is already certified. Salary cannot be modified", "Certified Tutor",
                                        JOptionPane.ERROR_MESSAGE);
                                return;
                            }

                            if (newPerformanceIndex > 5 && tutor.getWorkingHours() > 20) {
                                tutor.setSalary(newSalary, newPerformanceIndex);
                                JOptionPane.showMessageDialog(frame, "Salary for tutor successfully updated", "Tutor",
                                        JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                tutor.setSalary(newSalary, newPerformanceIndex);
                                JOptionPane.showMessageDialog(frame, "Salary updated successfully for tutor", "Tutor",
                                        JOptionPane.INFORMATION_MESSAGE);
                            }
                            // Additional message to display updated information
                            JOptionPane.showMessageDialog(frame,
                                    "Teacher ID: " + teacherId + "\nNew Salary: " + newSalary
                                            + "\nNew Performance Index: " + newPerformanceIndex,
                                    "Salary Updated", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                    }

                    JOptionPane.showMessageDialog(frame2, "No tutor found with the provided ID: " + teacherId, "Error",
                            JOptionPane.ERROR_MESSAGE);
                } catch (NumberFormatException exception) {
                    JOptionPane.showMessageDialog(frame,
                            "Please enter numerical values for Teacher ID, Salary, and Performance Index", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } catch (IllegalArgumentException exception) {
                    JOptionPane.showMessageDialog(frame, "Invalid Inputs, Please fills the values in text fields",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teacherIdSF.setText("");
                newSalarySF.setText("");
                newPerformanceSF.setText("");
            }
        });

    }

    public void displayInfo() {
        StringBuilder displayText = new StringBuilder();
        if (teacherArrayList.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "No teachers to display in array list.", "Empty List",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (Teacher teacher : teacherArrayList) {
            if (teacher instanceof Lecturer) {
                displayText.append("Lecturer:\n");
                displayText.append("Teacher ID: ").append(((Lecturer) teacher).getTeacherId()).append("\n");
                displayText.append("Teacher Name: ").append(((Lecturer) teacher).getTeacherName()).append("\n");
                displayText.append("Address: ").append(((Lecturer) teacher).getAddress()).append("\n");
                displayText.append("Working Type: ").append(((Lecturer) teacher).getWorkingType()).append("\n");
                displayText.append("Employment Status: ").append(((Lecturer) teacher).getEmploymentStatus())
                        .append("\n");
                displayText.append("Working Hours: ").append(((Lecturer) teacher).getWorkingHours()).append("\n");
                displayText.append("Department: ").append(((Lecturer) teacher).getDepartment()).append("\n");
                displayText.append("Years of Experience: ").append(((Lecturer) teacher).getYearsOfExperience())
                        .append("\n\n");
                System.out.println("Lecturer Information: ");
                System.out.println(displayText.toString());
            } else if (teacher instanceof Tutor) {
                displayText.append("Tutor:\n");
                displayText.append("Teacher ID: ").append(((Tutor) teacher).getTeacherId()).append("\n");
                displayText.append("Teacher Name: ").append(((Tutor) teacher).getTeacherName()).append("\n");
                displayText.append("Address: ").append(((Tutor) teacher).getAddress()).append("\n");
                displayText.append("Working Type: ").append(((Tutor) teacher).getWorkingType()).append("\n");
                displayText.append("Employment Status: ").append(((Tutor) teacher).getEmploymentStatus()).append("\n");
                displayText.append("Salary: ").append(((Tutor) teacher).getSalary()).append("\n");
                displayText.append("Specialization: ").append(((Tutor) teacher).getSpecialization()).append("\n");
                // displayText.append("Academic Qualification: ").append(((Tutor)
//                 teacher).getacademicQualification()).append("\n");
                displayText.append("Performance Index: ").append(((Tutor) teacher).getPerformanceIndex())
                        .append("\n\n");
                System.out.println(displayText.toString());
            }
        }
        JOptionPane.showMessageDialog(frame, displayText.toString(), "Teacher Information",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void clear() {
        // Clear text fields for teacher class
        teacherIDF.setText("");
        teacherNameF.setText("");
        addressF.setText("");
        workingTypeF.setText("");
        employmentStatusF.setText("");
        workingHourF.setText("");

        // Clear text fields for lecturer class
        departmentF.setText("");
        yearOfExperienceF.setText("");
        gradeScoreF.setText("");
        hasGradedF.setText("");

        // Clear text fields for tutor class
        salaryF.setText("");
        specializationF.setText("");
        academicQualificationF.setText("");
        performanceIndexF.setText("");
        isCertifiedF.setText("");
    }

    public void removeTutor() {
        try {
            // Ask the user to enter the Teacher ID
            String teacherIdInput = JOptionPane.showInputDialog(frame, "Enter Teacher ID:");
            if (teacherIdInput == null) {
                return;
            }

            if (teacherIdInput != null && !teacherIdInput.isEmpty()) { // Check if user entered a value
                int teacherId = Integer.parseInt(teacherIdInput);
                Tutor tutorToRemove = findTutor(teacherId);
                if (tutorToRemove != null) {
                    if (!tutorToRemove.isCertified()) {
                        int confirm = JOptionPane.showConfirmDialog(frame,
                                "Are you sure you want to remove this tutor?", "Confirmation",
                                JOptionPane.YES_NO_OPTION);
                        if (confirm == JOptionPane.YES_OPTION) {
                            teacherArrayList.remove(tutorToRemove);
                            JOptionPane.showMessageDialog(frame, "Tutor removed successfully!", "Success",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(frame, "Certified tutor cannot be removed.", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Tutor with ID " + teacherId + " not found.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Please enter a valid Teacher ID.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a valid Teacher ID.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private String getText(JTextField F) {
        String texts = F.getText().trim();
        if (texts.isEmpty()) {
            throw (new IllegalArgumentException());
        }
        return texts;
    }

    private boolean isIdUnique(int teacherId) {
        for (Teacher teacher : teacherArrayList) {
            if (teacher.getTeacherId() == teacherId) {
                return false;
            }
        }
        return true;
    }

    private String getTextFromTF(JTextField field) {
        String text = getText(field);
        if (text.isEmpty()) {
            throw (new IllegalArgumentException());
        }
        return text;
    }

    private Lecturer findLecturer(int teacherId) {
        for (Teacher teacher : teacherArrayList) {
            if (teacher instanceof Lecturer && teacher.getTeacherId() == teacherId) {
                return (Lecturer) teacher;
            }
        }
        return null;
    }

    public Teacher getTeacherById(int id) {
        // Iterate through your list of teachers and find the one with the matching ID
        for (Teacher teacher : teacherArrayList) {
            if (teacher.getTeacherId() == id) {
                return teacher;
            }
        }
        // If no teacher with the given ID is found, return null
        return null;
    }

    private Tutor findTutor(int teacherId) {
        for (Teacher teacher : teacherArrayList) {
            if (teacher instanceof Tutor && teacher.getTeacherId() == teacherId) {
                return (Tutor) teacher;
            }
        }
        return null; // Return null if tutor with given ID is not found
    }

    public static void main(String[] args) {
        TeacherGUI gui = new TeacherGUI();
    }
}
