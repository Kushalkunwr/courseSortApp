 


public class AcademicCourse extends Course
{
      //defining attributes
      private String lecturerName;
      private String level;
      private String credit;
      private String startingDate;
      private String completionDate;
      private int numberOfAssessments;
      private boolean isRegistered;
      
      //defining constructors for AcademicCourse
      public AcademicCourse(String courseID, String courseName, int duration, String level, String credit, int numberOfAssessments){
            super(courseID, courseName, duration);
            this.level = level;
            this.credit = credit;
            this.numberOfAssessments = numberOfAssessments;
            this.lecturerName="";
            this.startingDate="";
            this.completionDate="";
            this.isRegistered = false;
        }
        
      //defining corresponding accessor methods
      public String getLecturerName(){
         return this.lecturerName;
        } 
    
      public String getLevel(){
        return this.level;
         }  
       
      public String getCredit(){
        return this.credit;
        }  
        
      public String getStartingDate(){
        return this.startingDate;
        }  
        
      public String getCompletionDate(){
        return this.completionDate;
        }    
        
      public int getNumberOfAssessments(){
        return this.numberOfAssessments;
        } 
        
      public boolean getIsRegistered(){
        return this.isRegistered;
        }   
        
      //defing method to set lecturer's name  
      public void setLecturerName(String lecturerName){
        this.lecturerName = lecturerName;
        }    
        
      //defining method to set number of assessments  
      public void setNumberOfAssessments(int numberOfAssessments){
        this.numberOfAssessments = numberOfAssessments;
        }  
         
      /*method to register Academic course 
       * if already registered message is printed with the
       * lecturer name,starting and ending date.
        */ 
      public void register(String courseLeader, String lecturerName, String startingDate, String completionDate){
            if(this.isRegistered == true){
                System.out.println("The AcademicCourse is already registered");
                System.out.println("The name of the lecturer is " + this.lecturerName);
                System.out.println("The starting date is "+ this.startingDate);
                System.out.println("The completion date is" + this.completionDate);
            }
            else{
                super.setCourseLeader(courseLeader);
                this.lecturerName = lecturerName;
                this.startingDate = startingDate;
                this.completionDate = completionDate;
                this.isRegistered = true;
            }   
        }  
        
       /*Method to display details of academic course that includes
       lecturer name, level, credit, no of assessments, start and completion date*/
      public void display(){
                super.display();
                if (isRegistered == true){
                    System.out.println("The name of the lecturer is "+ this.lecturerName);
                    System.out.println("The level is " + this.level); 
                    System.out.println("The credit is " + this.credit);
                    System.out.println("The  starting date is " + this.startingDate);
                    System.out.println("The  ending date is " + this.completionDate);
                    System.out.println("The  number of assesment is equal to " + this.numberOfAssessments);
                }
         }  
}
