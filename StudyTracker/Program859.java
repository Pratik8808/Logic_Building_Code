 import java.util.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
import java.io.*;
    class StudyLog
    {
        private LocalDate Date;
        private String Subject;
        private double Duration;
        private String Description;

        public StudyLog(LocalDate a, String b, double c, String d)
        {
            this.Date = a;
            this.Subject = b;
            this.Duration = c;
            this.Description = d;
        }

        @Override
        public String toString()
        {
            return Date + " | " + Subject + " | " + Duration + " | " + Description;
        }

        public LocalDate getDate()
        {
            return this.Date;
        }

        public String getSubject()
        {
            return this.Subject;
        }

        public double getDuration()
        {
            return this.Duration;
        }

        public String getDescription()
        {
            return this.Description;
        }
    }


class StudyTracker
{
    public ArrayList <StudyLog> Database;

    public StudyTracker()
    {
        Database=new ArrayList<StudyLog>();
    }
    public void InsertLog()
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("-----Enter the Details of your Study-----");
        System.out.println("-------------------------------------------------------------------");

        LocalDate lobj=LocalDate.now();

        System.out.println("We Are Entering Data as :"+lobj);
        System.out.println("Enter the  Name of Subject  Like C/C++/Java \n");

        String Sub=sobj.nextLine();
        System.out.println("Enter the Time Period of your Study \n");
        double dur=sobj.nextDouble();

        // Issue Resolved Buffered Reader it next lined
       System.out.println("");
       
        System.out.println("Please Provide the Descrpition of your study \n");
        String desc=sobj.nextLine();


        StudyLog studyobj=new StudyLog(lobj, Sub, dur, desc);

        Database.add(studyobj);

        System.out.println("Study Log Gets Inserted Scuessfully \n");

        System.out.println("-------------------------------------------------------------------");





        

    }
    public void DisplayLog()
    {

    }
    public void ExporttoCsv()
    {}
    
    public void SummarybyDate()
    {

    }

    public void SummarybySubject()
    {}

}

    class Program859
    {
        public static void main(String A[])
        {
            int iChoice=0;
            Scanner sobj=new Scanner(System.in);
          
            StudyTracker stobj=new StudyTracker();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("---Welcome to Marvellous Study Tracker --");
        System.out.println("-------------------------------------------------------------------");
        
        //Shell to interact with end User 
        do
        {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("---Please Select appropriate Option: --");

        System.out.println("-------------------------------------------------------------------");


            System.out.println("Please Select Approriate Option :");
            System.out.println("1:Insert new Study Log");
            System.out.println("2:View all Study Log");
            System.out.println("3:Export Study Log to CSV");
            System.out.println("4:Summary of Study log by Date");
            System.out.println("5:Summary of Study log by Subject");
            System.out.println("6:Exit the Application");


        System.out.println("-------------------------------------------------------------------");


            iChoice=sobj.nextInt();

            switch(iChoice)
            {
                // Insert new Log
                case 1:
                    stobj.InsertLog();
                    break;
                // View All Study Log
                 case 2:
                    stobj.DisplayLog();
                    break;

                //Export to CSV
                 case 3:
                    stobj.ExporttoCsv();
                    break;
                //Summary by Date
                 case 4:
                    stobj.SummarybyDate();
                    break;
                // Summary by Subject
                 case 5:
                    stobj.SummarybySubject();
                    break;
                // Terminate the project
                case 6:
                    
                    break;
                
                default:
                    System.out.println("Please Enter Vaild Option \n");

            }

            

        }while(iChoice !=6);



        System.out.println("-------------------------------------------------------------------");
        System.out.println("---Thank you are using Study Tracker--");
        System.out.println("-------------------------------------------------------------------");
        
        }   // End of  main
    }   //End of the class