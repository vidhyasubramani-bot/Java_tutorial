package OOPSE_day2;
class student {
    private int studentid;
    private String studentname;




    void setID(int studentid, String studentname) {
        this.studentid=studentid;
        this.studentname=studentname;

    }

}
class mentor extends student {
    private int mentorid;
    private String mentorname;

    mentor(int mentorid, String mentorname) {
        this.mentorid = mentorid;
        this.mentorname = mentorname;

    }

    void setID(int mentorid, String mentorname) {
        this.mentorid = mentorid;
        this.mentorname = mentorname;


    }
}
        class hod extends student{
            private int hodid;
             private String hodname;
            hod(int hodid,String hodname){
                this.hodid=hodid;
                this.hodname=hodname;

            }
            void setID(int hodid, String hodname) {
                this.hodid=hodid;
                this.hodname=hodname;
        }



}

public class student_managment {
    public static void main(String[]args){
        student obj=new student();
        obj.setId(116,"vidhya");
    }

    }
}
