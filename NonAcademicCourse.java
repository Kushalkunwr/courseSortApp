

public class NonAcademicCourse extends Course
{
    //defining attributes
    private String instructorName;
    private int duration;
    private String startingDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    
    //defining cunstructors for Non Academic Course
    public NonAcademicCourse(String courseID, String courseName, int duration, String prerequisite){
        super(courseID,courseName,duration);
        this.prerequisite=prerequisite;
        this.startingDate="";
        this.examDate="";
        this.completionDate="";
        this.isRegistered = false;
        this.isRemoved= false;
     }   
    
     //defining corresponding accessor methods
    public String getInstructorName(){
        return instructorName ;
    } 
    
    public String getStartingDate(){
        return startingDate;
        }
        
    public String getCompletionDate(){
        return completionDate;
        }      
        
    public String getExamDate(){
        return examDate;
        } 
    
    public String getPrerequisite(){
        return examDate;
        }     
        
    public boolean getIsRegistered(){
        return isRegistered;
        }      
     
    public boolean getIsRemoved(){
        return isRemoved;
        } 
      
    /*Defining method to set instructorName
     * if the name is not registered the name will be resistered
     * otherwise suitable message will be displayed
       */    
    public void setInstructorName(String instructorName){
         if (isRegistered == false){
             this.instructorName = instructorName;       
         }
         else{
            System.out.println("Already registered; Changing the instructor name is not allowed");
            }
    }  
    
    /*defining method to register 
     * instructorName, start date completion date and exam date
     * if already registered message will be shown
       */
    public void register( String courseLeader, String instructorName, String startingDate, String completionDate, String examDate){
           if (isRegistered == false){
                super.setCourseLeader(courseLeader);   
                setInstructorName(instructorName);
                this.startingDate= startingDate;
                this.completionDate = completionDate;
                this.examDate = examDate;
                this.isRegistered= true;
            }
           else{
               System.out.println("The course has already been registered.");
            } 
    }
    
    /*definig method to remove non-academic courses
     * if it is already removed a message is shown
       */
    public void remove(){
        if(isRemoved == false){
            super.setCourseLeader("");
            this.instructorName = "";
            this.startingDate = "";
            this.completionDate = "";    
            this.examDate ="";
            this.isRegistered = false;
            this.isRemoved = true;
        }
        else{
            System.out.println("The course is already removed");
        }
    }
    
    /*defining method to display details of non academic course that includes
     * courseID, coursename and duration if rnot registered 
     * otherwise along with them instructor name starting date completion date and exam date is alse displayed
       */
    public void display()
    {
        super.display();
        if (isRegistered == true)
        {
            System.out.println("The name of the instructor is "+ this.instructorName);
            System.out.println("The starting date is "+ this.startingDate);
            System.out.println("The date of completion is "+ this.completionDate);
            System.out.println("The date of the exam is "+ this.examDate);
        }
    }
}
    

