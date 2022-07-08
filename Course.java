
public class Course
{
        //defining attributes
       private String courseID;
       private String courseName;
       private String courseLeader;
       private int duration;
       
       //defining contructors for Course
       public Course(String courseID,String courseName,int duration){
         this.courseID = courseID;
         this.courseName = courseName;
         this.duration = duration;
         this.courseLeader = "";
        }
        
        //defining corresponding accessor methods
       public String getCourseID(){
            return this.courseID;
        } 
    
       public String getCourseName(){
            return this.courseName;
        } 
        
       public int getDuration(){
            return this.duration;
        } 
    
       public String getCourseLeader(){
            return this.courseLeader;
        }  
        
        //defing method to set courseleader
       public void setCourseLeader(String courseLeader){
          this.courseLeader = courseLeader; 
        } 
       
       /*method to diplay courseID, coursename,duration with message
             * if the course leader is not empty, it will also 
             * display coureLeader with suitable messsage 
             * otherwise it will not show anything for courseLeader
            */
         public void display(){
               System.out.println("The ID is " + getCourseID());
               System.out.println("The name of the course is "+ getCourseName());
               System.out.println("The duration of course is " + getDuration());
                   if(courseLeader!=""){
                       System.out.println("The leader of the course is "+ getCourseLeader());
                    }
        
        }  
}