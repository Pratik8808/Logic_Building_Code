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
    public ArrayList <StudyLog>   Database=new ArrayList<StudyLog>();

    // public StudyTracker()
    // {
      
    // }

}

    class Program855
    {
        public static void main(String A[])
        {
          
            StudyTracker stobj=new StudyTracker();




        }
    }