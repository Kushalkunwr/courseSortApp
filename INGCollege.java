import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 
 * @author (Kushal Kunwar)
 * 20049166(UniversityID)
 * N2
 * np01NT4S210052(collegeID)
 */
public class INGCollege implements ActionListener
{
    //Using from swing for frame
    JFrame jf;
    
    //for menu
    JMenuBar mb;
    JMenu course, more;
    JMenuItem home,nonACourse, aCourse, exit, help;
    
    //for pannel
    JPanel panHome,panA,panNonA,panBack;
    
    //from swing for home
    JLabel lblWelcome, lbl1, lbl2, lbl3, lbl4;
    JButton btnACourse,btnNonACourse,btnHelp, btnExit;
    
    //from swing for panA
    JLabel lblTitle, lblCourseID,lblRegCourseID ,lblCourseName, lblDuration, lblCourseLeader, lblLecturerName, lblLevel, lblCredit, lblStartingDate, lblCompletionDate, lblNumberOfAssessments;
    JTextField txtCourseID,txtRegCourseID, txtCourseName, txtDuration, txtCourseLeader, txtLecturerName, txtLevel, txtCredit, txtStartingDate, txtCompletionDate, txtNumberOfAssessments;
    JButton btnAdd,btnRegister,btnDisplay, btnClear;
    
    //from swing for panB(no.2 is used for the variables having same name as the variables in panA)
    JLabel lblTitle2, lblCourseID2,lblRegCourseID2, lblCourseName2, lblDuration2, lblPrerequisite,lblCourseLeader2 , lblInstructorName,lblStartingDate2,lblCompletionDate2, lblExamDate, lblCompare;
    JTextField txtCourseID2, txtCourseName2,txtRegCourseID2, txtDuration2, txtPrerequisite, txtCourseLeader2, txtInstructorName,txtStartingDate2,txtCompletionDate2, txtExamDate, txtCompare;
    JButton btnAdd2,btnRegister2,btnRemove, btnDisplay2, btnClear2;
    
    //font
    Font ff=new Font("Aerial",Font.BOLD,25);//creating font
    Font f1= new Font("Aerial", Font.BOLD,15);
    Font f2= new Font("Normal", Font.BOLD,15);
    
    //Array
    ArrayList<Course> academicCourse= new ArrayList<Course>();
    ArrayList<Course> nonAcademicCourse= new ArrayList<Course>();
    public INGCollege(){
        jf= new JFrame("Course Registration");//creating a frame
        
        //creating menubar
        mb= new JMenuBar();
        jf.setJMenuBar(mb);
        //creating menu
        course= new JMenu("Courses");
        more= new JMenu("More");
        mb.add(course);mb.add(more);//adding to menubar
        
        //creating menuitem for more
        exit= new JMenuItem ("Exit");
        help= new JMenuItem("Help");
        more.add(help);more.add(exit);
        
        //creating menuitem for course
        home= new JMenuItem("Home");
        nonACourse= new JMenuItem("Non-Academic course");
        aCourse= new JMenuItem("Academic course");
        course.add(home);course.add(aCourse);course.add(nonACourse);//adding to course
        
        //menu event handling
        exit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                int a=JOptionPane.showConfirmDialog(jf,"Are you sure you want to exit?","Exit",JOptionPane.YES_NO_OPTION);
                if(a== JOptionPane.YES_NO_OPTION){
                    System.exit(0);
                }
            }
        });
        
        home.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                panHome.setVisible(true);
                panA.setVisible(false);
                panNonA.setVisible(false);
            }
        });
        
        nonACourse.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                panHome.setVisible(false);
                panA.setVisible(false);
                panNonA.setVisible(true);
            }
        });
        
        aCourse.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                panHome.setVisible(false);
                panNonA.setVisible(false);
                panA.setVisible(true);
            }
        });
        
        help.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(jf,"For any help on this application or incase of any queries contact:np01nt4s210052@islingtoncollege.edu.np");
            }
        });
       
        //for home page
        panHome= new JPanel();//creating panel for home
        panHome.setBounds(50,50,649,630);//setting location and size
        panHome.setBackground(new Color(255, 226, 207));
        panHome.setLayout(null);
        panHome.setVisible(true);//setting initital visibility to false
        jf.add(panHome);//adding pannel to frame
        
        //label for home page
        lblWelcome= new JLabel("Welcome to Course Registration Application");//creating a welcome label
        lblWelcome.setBounds(30,20,550,190);//location and size
        lblWelcome.setFont(ff);//setting font
        panHome.add(lblWelcome);//adding label to panel
        
        //label for button btnACourse
        lbl1= new JLabel("For Academic Course: ");//creating label
        lbl1.setBounds(140,190,200,20);//location and size
        lbl1.setFont(f2);//setting font
        panHome.add(lbl1);//adding to panel
        
        //label for button btnNonACourse
        lbl2= new JLabel("For Non-Academic Course: ");//creating label
        lbl2.setBounds(140,240,210,20);//location and size
        lbl2.setFont(f2);//setting font
        panHome.add(lbl2);//adding to panel
        
        //label for button btnNonACourse
        lbl3= new JLabel("For any help or queries: ");//creating label
        lbl3.setBounds(140,290,200,20);//location and size
        lbl3.setFont(f2);//setting font
        panHome.add(lbl3);//adding to panel
        
        //label for button exit
        lbl4= new JLabel("To exit the Aplication: ");//creating label
        lbl4.setBounds(140,340,200,20);//location and size
        lbl4.setFont(f2);//setting font
        panHome.add(lbl4);//adding to panel
        
        //button for home page
        btnACourse= new JButton("Click Here");//creating button for academic course
        btnACourse.setBounds(350,190,95,20);//location and size
        panHome.add(btnACourse);//adding button to panel
        
        btnNonACourse= new JButton("Click Here");//creating button for non academic course
        btnNonACourse.setBounds(350,240,95,20);//location and size
        panHome.add(btnNonACourse);//adding button to panel
        
        btnHelp= new JButton("Click Here");//creating button for help panel
        btnHelp.setBounds(350,290,95,20);//location and size
        panHome.add(btnHelp);//adding button to panel
        
        btnExit= new JButton("Click Here");//creating button to exit the application
        btnExit.setBounds(350,340,95,20);//location and size
        panHome.add(btnExit);//adding button to panel
        
        //event handling for the homepage
        btnExit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
               int a=JOptionPane.showConfirmDialog(jf,"Are you sure you want to exit?","Exit",JOptionPane.YES_NO_OPTION);
                if(a== JOptionPane.YES_NO_OPTION){
                    System.exit(0);
                }
            }
        });
        
        btnHelp.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
              JOptionPane.showMessageDialog(jf,"For any help on this application or incase of any queries contact:np01nt4s210052@islingtoncollege.edu.np");  
            }
        });
        
        btnNonACourse.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                panHome.setVisible(false);
                panA.setVisible(false);
                panNonA.setVisible(true);
            }
        });
        
        btnACourse.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                panHome.setVisible(false);
                panNonA.setVisible(false);
                panA.setVisible(true);
            }
        });
        
        //for academic course
        panA= new JPanel();//creating panel for academic course
        panA.setBounds(17,15,603,660);//location and size
        panA.setLayout(null);//setting no layout
        panA.setBackground(new Color(240, 190, 156));
        panA.setVisible(false);//setting initial visibility to false
        jf.add(panA);//adding panel to frame
        
        //labels for Academic course panel
        lblTitle= new JLabel("ACADEMIC COURSE");//creating title using label
        lblTitle.setBounds(161,15,260,50);//location and size for Title1\
        lblTitle.setFont(ff);//setting font
        panA.add(lblTitle);//adding to panA
        
        
        lblCourseID= new JLabel("CourseID");//creating label for courseID
        lblCourseID.setBounds(30,100,120,20);//location and size
        lblCourseID.setFont(f1);//setting font
        panA.add(lblCourseID);//adding to panel panA
        
        
        lblCourseName= new JLabel("CourseName");//creating label for CourseName
        lblCourseName.setBounds(320,100,100,20);//location and size
        lblCourseName.setFont(f1);//setting font
        panA.add(lblCourseName);//adding to panel panA
        
        lblDuration = new JLabel("Duration");//creating label for Duration
        lblDuration.setBounds(30,150,100,20);//location and size
        lblDuration.setFont(f1);//setting font
        panA.add(lblDuration);//adding to panel panA
        
        lblLevel= new JLabel("Level");//creating label for Level
        lblLevel.setBounds(320,150,100,20);//location and size
        lblLevel.setFont(f1);//setting font
        panA.add(lblLevel);//adding to panel panA
        
        lblCredit= new JLabel("Credit");//creating label for Credit
        lblCredit.setBounds(30,200,100,20);//location and size
        lblCredit.setFont(f1);//setting font
        panA.add(lblCredit);//adding to panel panA
        
        lblNumberOfAssessments= new JLabel("Number of Assessments"); //creating label for number of assessments
        lblNumberOfAssessments.setBounds(320,200,190,20);//location and size
        lblNumberOfAssessments.setFont(f1);//setting font
        panA.add(lblNumberOfAssessments);//adding to panel panA
        
        lblRegCourseID= new JLabel("CourseID");//creating label for courseID
        lblRegCourseID.setBounds(30,310,150,20);//location and size
        lblRegCourseID.setFont(f1);//setting font
        panA.add(lblRegCourseID);//adding to panel panA
        
        lblCourseLeader= new JLabel("Course Leader");//creating label for courseLeader
        lblCourseLeader.setBounds(30,360,200,20);//location and size
        lblCourseLeader.setFont(f1);//setting font
        panA.add(lblCourseLeader);//adding to panel panA
        
        lblLecturerName= new JLabel("Lecturer Name");//creating label for lecturer name
        lblLecturerName.setBounds(320,360,200,20);//location and size
        lblLecturerName.setFont(f1);//setting font
        panA.add(lblLecturerName);//adding to panel panA
        
        lblStartingDate= new JLabel("Starting Date");//creating label for starting date
        lblStartingDate.setBounds(30,410,200,20);//location and size
        lblStartingDate.setFont(f1);//setting font
        panA.add(lblStartingDate);//adding to panel panA
        
        lblCompletionDate= new JLabel("Completion Date");//creating label for completion date
        lblCompletionDate.setBounds(320,410,200,20);//location and size
        lblCompletionDate.setFont(f1);//setting font
        panA.add(lblCompletionDate);//adding to panel panA
        
        
        //text fields for academic course panel
        
        txtCourseID= new JTextField();//creating textfield for courseID
        txtCourseID.setBounds(120,100,130,23);//location and size
        panA.add(txtCourseID);//adding to panel panA
        
        txtCourseName= new JTextField();//creating textfield for CourseName
        txtCourseName.setBounds(443,100,130,23);//location and size
        panA.add(txtCourseName);//adding to panel panA
        
        txtDuration = new JTextField();//creating textfield for Duration
        txtDuration.setBounds(120,150,130,23);//location and size
        panA.add(txtDuration);//adding to panel panA
        
        txtLevel= new JTextField();//creating textfield for Level
        txtLevel.setBounds(443,150,130,23);//location and size
        panA.add(txtLevel);//adding to panel panA
        
        txtCredit= new JTextField();//creating textfield for Credit
        txtCredit.setBounds(120,200,130,23);//location and size
        panA.add(txtCredit);//adding to panel panA
        
        txtNumberOfAssessments= new JTextField(); //creating textfield for number of assessments
        txtNumberOfAssessments.setBounds(505,200,68,23);//location and size
        panA.add(txtNumberOfAssessments);//adding to panel panA
        
        txtRegCourseID= new JTextField();//creating textfield for courseID
        txtRegCourseID.setBounds(150,310,100,23);//location and size
        panA.add(txtRegCourseID);//adding to panel panA
        
        txtCourseLeader= new JTextField();//creating TextField for course leader
        txtCourseLeader.setBounds(150,360,100,23);//location and size
        panA.add(txtCourseLeader);//adding to panel panA
        
        txtLecturerName= new JTextField();//creating TextField for lecturer name
        txtLecturerName.setBounds(450,360,121,23);//location and size
        panA.add(txtLecturerName);//adding to panel panA
        
        txtStartingDate= new JTextField();//creating TextField for starting date
        txtStartingDate.setBounds(150,410,100,23);//location and size
        panA.add(txtStartingDate);//adding to panel panA
        
        txtCompletionDate= new JTextField();//creating TextField for completion date
        txtCompletionDate.setBounds(450,410,121,23);//location and size
        panA.add(txtCompletionDate);//adding to panel panA
        
        //buttons for panA
        btnAdd= new JButton("Add Course");//button to add course
        btnAdd.setBounds(240,245,120,27);//location and size
        panA.add(btnAdd);//adding to frame
        btnAdd.addActionListener(this);
        
        btnRegister= new JButton("Register Course");//button to Register course
        btnRegister.setBounds(230,455,140,26);//location and size
        panA.add(btnRegister);//adding to frame
        btnRegister.addActionListener(this);
        
        btnDisplay= new JButton("Display");//button to display course
        btnDisplay.setBounds(90,495,100,30);//location and size
        panA.add(btnDisplay);//adding to frame
        btnDisplay.addActionListener(this);
        
        btnClear= new JButton("Clear");//button to clear course
        btnClear.setBounds(400,495,100,30);//location and size
        panA.add(btnClear);//adding to frame
        btnClear.addActionListener(this);
        
        //for NonAcademic course
        panNonA= new JPanel();//creating panel for non academic course
        panNonA.setBounds(17,15,603,660);//location and size
        panNonA.setLayout(null);//setting no layout
        panNonA.setVisible(false);//setting initial visibilty to false
        panNonA.setBackground(new Color(255, 203, 168));
        jf.add(panNonA);//adding panel to frame
        
        //Labels for Non Academic course panel 
        lblTitle2= new JLabel("NON-ACADEMIC COURSE");//creating title using label
        lblTitle2.setBounds(140,20,310,50);//location and size for Title1
        lblTitle2.setFont(ff);//setting font
        panNonA.add(lblTitle2);//adding to panNonA
        
        lblCourseID2= new JLabel("CourseID");//creating label for courseID
        lblCourseID2.setBounds(30,100,120,20);//location and size
        lblCourseID2.setFont(f1);//setting font
        panNonA.add(lblCourseID2);//adding to panel panNonA
        
        lblCourseName2= new JLabel("CourseName");//creating label for CourseName
        lblCourseName2.setBounds(320,100,100,20);//location and size
        lblCourseName2.setFont(f1);//setting font
        panNonA.add(lblCourseName2);//adding to panel panNonA
        
        lblDuration2 = new JLabel("Duration");//creating label for Duration
        lblDuration2.setBounds(30,150,100,20);//location and size
        lblDuration2.setFont(f1);//setting font
        panNonA.add(lblDuration2);//adding to panel panNonA
        
        lblPrerequisite= new JLabel("Prerequisite");//creating label for Prerequisite
        lblPrerequisite.setBounds(320,150,100,20);//location and size
        lblPrerequisite.setFont(f1);//setting font
        panNonA.add(lblPrerequisite);//adding to panel panNonA
        
        lblInstructorName= new JLabel("Instructor Name");//creating label for InstructorName
        lblInstructorName.setBounds(30,310,140,20);//location and size
        lblInstructorName.setFont(f1);//setting font
        panNonA.add(lblInstructorName);//adding to panel panNonA
        
        lblRegCourseID2= new JLabel("CourseID");//creating label for courseID
        lblRegCourseID2.setBounds(30,260,120,20);//location and size
        lblRegCourseID2.setFont(f1);//setting font
        panNonA.add(lblRegCourseID2);//adding to panel panNonA
        
        lblCourseLeader2= new JLabel("Course Leader");//creating label for course leader
        lblCourseLeader2.setBounds(320,310,150,20);//location and size
        lblCourseLeader2.setFont(f1);//setting font
        panNonA.add(lblCourseLeader2);//adding to panel panNonA
        
        lblStartingDate2= new JLabel("Starting Date");//creating label for starting date
        lblStartingDate2.setBounds(30,360,150,20);//location and size
        lblStartingDate2.setFont(f1);//setting font
        panNonA.add(lblStartingDate2);//adding to panel panNonA
        
        lblCompletionDate2= new JLabel("Completion Date");//creating label for completion date
        lblCompletionDate2.setBounds(320,360,150,20);//location and size
        lblCompletionDate2.setFont(f1);//setting font
        panNonA.add(lblCompletionDate2);//adding to panel panNonA
        
        lblExamDate= new JLabel("Exam Date");//creating label for exam date
        lblExamDate.setBounds(30,410,150,20);//location and size
        lblExamDate.setFont(f1);//setting font
        panNonA.add(lblExamDate);//adding to panel panNonA
        
        lblCompare= new JLabel("Enter CourseID to remove");//creating label for courseID to remove
        lblCompare.setBounds(30,455,300,20);//location and size
        lblCompare.setFont(f1);//setting font
        panNonA.add(lblCompare);//adding to panel panNonA
                
        //text fields for Non-Academic course panel
        
        txtCourseID2= new JTextField();//creating textfield for courseID
        txtCourseID2.setBounds(120,100,130,23);//location and size
        panNonA.add(txtCourseID2);//adding to panel panNonA
        
        txtCourseName2= new JTextField();//creating textfield for CourseName
        txtCourseName2.setBounds(443,100,130,23);//location and size
        panNonA.add(txtCourseName2);//adding to panel panNonA
        
        txtDuration2 = new JTextField();//creating textfield for Duration
        txtDuration2.setBounds(120,150,130,23);//location and size
        panNonA.add(txtDuration2);//adding to panel panNonA
        
        txtPrerequisite= new JTextField();//creating textfield for Prerequisite
        txtPrerequisite.setBounds(443,150,130,23);//location and size
        panNonA.add(txtPrerequisite);//adding to panel panNonA
        
        txtInstructorName= new JTextField();//creating textfield for InstructorName
        txtInstructorName.setBounds(150,310,100,23);//location and size
        panNonA.add(txtInstructorName);//adding to panel panNonA
        
        txtRegCourseID2= new JTextField();//creating textfield for courseID
        txtRegCourseID2.setBounds(140,260,110,23);//location and size
        panNonA.add(txtRegCourseID2);//adding to panel panNonA
        
        txtCourseLeader2= new JTextField();//creating textfield for courseLeader
        txtCourseLeader2.setBounds(450,310,121,23);//location and size
        panNonA.add(txtCourseLeader2);//adding to panel panNonA
        
        
        txtStartingDate2= new JTextField();//creating TextField for starting date
        txtStartingDate2.setBounds(140,360,110,23);//location and size
        panNonA.add(txtStartingDate2);//adding to panel panNonA
        
        txtCompletionDate2= new JTextField();//creating TextField for completion date
        txtCompletionDate2.setBounds(450,360,121,23);//location and size
        panNonA.add(txtCompletionDate2);//adding to panel panNonA
        
        txtExamDate= new JTextField();//creating TextField for exam date
        txtExamDate.setBounds(140,410,110,23);//location and size
        panNonA.add(txtExamDate);//adding to panel panNonA
        
        txtCompare= new JTextField();//creating textfield for compare
        txtCompare.setBounds(228,455,100,23);//location and size
        panNonA.add(txtCompare);//adding to panel panNonA
        
        //buttons for panNonA
        btnAdd2= new JButton("Add Course");//button to add course
        btnAdd2.setBounds(240,200,120,28);//location and size
        panNonA.add(btnAdd2);//adding to frame
        btnAdd2.addActionListener(this);
        
        btnRegister2= new JButton("Register Course");//button to Register course
        btnRegister2.setBounds(355,410,140,25);//location and size
        panNonA.add(btnRegister2);//adding to frame
        btnRegister2.addActionListener(this);
        
        btnRemove= new JButton("Remove");//button to Register course
        btnRemove.setBounds(355,455,100,25);//location and size
        panNonA.add(btnRemove);//adding to frame
        btnRemove.addActionListener(this);
        
        btnDisplay2= new JButton("Display");//button to display course
        btnDisplay2.setBounds(90,495,100,30);//location and size
        panNonA.add(btnDisplay2);//adding to frame
        btnDisplay2.addActionListener(this);
        
        btnClear2= new JButton("Clear");//button to clear course
        btnClear2.setBounds(400,495,100,30);//location and size
        panNonA.add(btnClear2);//adding to frame
        btnClear2.addActionListener(this);
        
        //for background
        panBack=new JPanel();
        panBack.setBounds(0,0,649,630);
        panBack.setBackground(new Color(212, 193, 180));
        panBack.setVisible(true);
        jf.add(panBack);
        
        //frame properties
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setBounds(400,70,649,630);//setting location and size
        jf.setResizable(false);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        
    }
    public void actionPerformed(ActionEvent e){
        
        //adding action listener to add course in academic course    
        if(e.getSource() == btnAdd){
            String courseID;
            String courseName;
            String level;
            int duration;
            String credit;
            int numberOfAssessments;
            try{
                courseID= txtCourseID.getText();
                courseName= txtCourseName.getText();
                level= txtLevel.getText();
                duration=Integer.parseInt(txtDuration.getText());
                credit=txtCredit.getText();
                numberOfAssessments= Integer.parseInt(txtNumberOfAssessments.getText());
                boolean check=false;
                for(Course ac:academicCourse){
                    if(ac.getCourseID().equals(courseID)){
                        check= true;
                        break;
                    }
                }
                if(check==false){
                    AcademicCourse aCourse= new AcademicCourse(courseID,courseName,duration, level, credit,numberOfAssessments); 
                    academicCourse.add(aCourse);
                    JOptionPane.showMessageDialog(jf,"The course has been added successfully.");
                    
                    txtCourseID.setText("");
                    txtCourseName.setText("");
                    txtDuration.setText("");
                    txtLevel.setText("");
                    txtCredit.setText("");
                    txtNumberOfAssessments.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(jf,"The course has already been added.");
                    txtCourseID.setText("");
                }
            }
            catch(Exception exc){
                JOptionPane.showMessageDialog(jf,"Error! Please recheck if all the fields are filled and are in proper format","Alert",JOptionPane.WARNING_MESSAGE);
            }
        }
        
        //adding action listener to register course
        if(e.getSource()==btnRegister){
            //defining attributes
            String courseID;
            String courseLeader;
            String lecturerName;
            String startingDate;
            String completionDate;
            if (txtRegCourseID.getText().isEmpty() || txtCourseLeader.getText().isEmpty() || txtLecturerName.getText().isEmpty() || txtStartingDate.getText().isEmpty() || txtCompletionDate.getText().isEmpty()){
                JOptionPane.showMessageDialog(jf,"Empty fields found. Please recheck all the fields","Alert",JOptionPane.WARNING_MESSAGE);
                }
            else{
                courseID= txtRegCourseID.getText();
                courseLeader= txtCourseLeader.getText();
                lecturerName= txtLecturerName.getText();
                startingDate= txtStartingDate.getText();
                completionDate= txtCompletionDate.getText();
                boolean check= false;
                for(int i=0; i<academicCourse.size(); i++){
                    if((academicCourse.get(i).getCourseID()).equals(courseID)){
                        AcademicCourse ac= (AcademicCourse)(academicCourse.get(i));
                        check= true;
                        //using accessor method for isregistered and checking condition
                        if(!ac.getIsRegistered()){
                            ac.register(courseLeader,lecturerName, startingDate,completionDate);
                            JOptionPane.showMessageDialog(jf,"The course has been registered successfully.");
                            
                            txtRegCourseID.setText("");
                            txtCourseLeader.setText("");
                            txtLecturerName.setText("");
                            txtStartingDate.setText("");
                            txtCompletionDate.setText("");
                
                            break;
                        }
                        else{
                            JOptionPane.showMessageDialog(jf,"The courseID you have entered is already in use");
                            txtRegCourseID.setText("");
                            break;
                        }
                    }
                   
                }
                if(check== false){
                        JOptionPane.showMessageDialog(jf,"The courseID you have entered doesn't exist");
                        txtRegCourseID.setText("");
                    }
                
            }
            
            
        }
    
        //adding action listener to clear in academic course
        if(e.getSource() == btnClear){
            txtCourseID.setText("");
            txtCourseName.setText("");
            txtDuration.setText("");
            txtLevel.setText("");
            txtCredit.setText("");
            txtNumberOfAssessments.setText("");
            txtRegCourseID.setText("");
            txtCourseLeader.setText("");
            txtLecturerName.setText("");
            txtStartingDate.setText("");
            txtCompletionDate.setText("");
        }
        
        //adding action listener to add course in non-academic course 
        if(e.getSource()==btnAdd2){
            String courseID;
            String courseName;
            int duration;
            String prerequisite;
            try{
                courseID= txtCourseID2.getText();
                courseName= txtCourseName2.getText();
                duration= Integer.parseInt(txtDuration2.getText());
                prerequisite=txtPrerequisite.getText();
                boolean check=false;
                for(Course nac:nonAcademicCourse){
                    if(nac.getCourseID().equals(courseID)){
                        check=true;
                        break;
                    }
                }
                
                if(check==false){
                    NonAcademicCourse nACourse= new NonAcademicCourse(courseID, courseName,duration, prerequisite);
                    nonAcademicCourse.add(nACourse);
                    JOptionPane.showMessageDialog(jf,"The course has been added successfully.");
                    txtCourseID2.setText("");
                    txtCourseName2.setText("");
                    txtDuration2.setText("");
                    txtPrerequisite.setText("");
                    txtRegCourseID2.setText(courseID);
                    }
                else{
                    JOptionPane.showMessageDialog(jf,"The course has already been added.");
                    txtCourseID.setText("");
                }
            }
            catch(Exception exc){
                JOptionPane.showMessageDialog(jf,"Error! Please recheck if all the fields are filled and are in proper format","Alert",JOptionPane.WARNING_MESSAGE);
            }
        }
        
        //adding action listener to register non academic course
        if(e.getSource() == btnRegister2){
            //defining attributes
            String courseID;
            String courseLeader;
            String instructorName;
            String startingDate;
            String completionDate;
            String examDate;
            
            if (txtRegCourseID2.getText().isEmpty() || txtCourseLeader2.getText().isEmpty() || txtInstructorName.getText().isEmpty() || txtStartingDate2.getText().isEmpty() || txtCompletionDate2.getText().isEmpty() || txtExamDate.getText().isEmpty()){
                JOptionPane.showMessageDialog(jf,"Empty fields found. Please recheck all the fields","Alert",JOptionPane.WARNING_MESSAGE);
                }
            
            else{
                courseID = txtRegCourseID2.getText();
                courseLeader = txtCourseLeader2.getText();
                instructorName= txtInstructorName.getText();
                startingDate= txtStartingDate2.getText();
                completionDate= txtCompletionDate2.getText();
                examDate= txtExamDate.getText();
                boolean check= false;
                
                for(int i=0; i<nonAcademicCourse.size(); i++){
                    if((nonAcademicCourse.get(i).getCourseID()).equals(courseID)){
                        NonAcademicCourse nac= (NonAcademicCourse)(nonAcademicCourse.get(i));
                        check=true;
                        //using accessor method for is registered and checking condition
                        if(!nac.getIsRegistered()){
                            nac.register(courseLeader, instructorName,startingDate, completionDate, examDate);
                            JOptionPane.showMessageDialog(jf,"The course has been registered successfully.");
                            
                            txtRegCourseID2.setText("");
                            txtCourseLeader2.setText("");
                            txtStartingDate2.setText("");
                            txtCompletionDate2.setText("");
                            txtExamDate.setText("");
                            txtInstructorName.setText("");
                            break;
                        }
                        else{
                            JOptionPane.showMessageDialog(jf,"The courseID you have entered is already in use");
                            txtRegCourseID2.setText("");
                            break;
                        }
                    }
                    
                }
                if(check== false){
                        JOptionPane.showMessageDialog(jf,"The courseID you have entered doesn't exist");
                        txtRegCourseID2.setText("");
                    }                
            }
        }
        
        if(e.getSource() == btnRemove){
              if (txtCompare.getText().isEmpty()){
                    JOptionPane.showMessageDialog(jf,"Empty fields found. Please recheck all the fields","Alert",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    String courseID = txtCompare.getText();
                    Iterator<Course> itr = nonAcademicCourse.iterator();
                    boolean check = false;
                    while(itr.hasNext()){
                        Course c = itr.next();
                        if (c.getCourseID().equals(courseID)){
                            check = true;
                            NonAcademicCourse NAC = (NonAcademicCourse) c;
                            if (!NAC.getIsRemoved()){
                                NAC.remove();
                            }
                            itr.remove();
                            JOptionPane.showMessageDialog(jf,"The Course has Been Sucessful Removed");
                            txtCompare.setText("");
                        }
                    }
                    if (check == false){
                        JOptionPane.showMessageDialog(jf,"The CourseID could not be found"); 
                        txtCompare.setText("");
                    }
                }
            
        }
        
        //adding action listner to clear in non academecic course
        if(e.getSource() == btnClear2){
            txtCourseID2.setText("");
            txtCourseName2.setText("");
            txtDuration2.setText("");
            txtPrerequisite.setText("");
            txtInstructorName.setText("");
            txtRegCourseID2.setText("");
            txtStartingDate2.setText("");
            txtCompletionDate2.setText("");
            txtCourseLeader2.setText("");
            txtExamDate.setText("");
            txtCompare.setText("");
        }
        
        //Adding ActionListener to the button display
         if (e.getSource() == btnDisplay){ 
             boolean check= false;
             for(Course ac:academicCourse){
                if(ac instanceof AcademicCourse){
                   AcademicCourse AC=(AcademicCourse)ac; 
                   AC.display();
                   check= true;
                }
             }
             if(check== false){
                JOptionPane.showMessageDialog(jf,"FILE EMPTY!!! NOTHING TO DISPLAY"); 
                }
        }
        
        //Adding ActionListener to the button display2
        if (e.getSource() == btnDisplay2){ 
            boolean check= false;
            for(Course nac:nonAcademicCourse){
                if(nac instanceof NonAcademicCourse){
                       NonAcademicCourse NAC=(NonAcademicCourse)nac; 
                       NAC.display();
                       check= true;
                    } 
              }
            if(check== false){
                JOptionPane.showMessageDialog(jf,"FILE EMPTY!!! NOTHING TO DISPLAY"); 
                }
        }
        
        
    }
    
    //declaring main method
    public static void main(String[] args){
        new INGCollege();
    }
    
}
