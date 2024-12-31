public class student extends person {
    private String grade;
    private String student_id;
    public student(int id,String name,int age,String address,String grade,String student_id)
    {
        super(id,name,age,address);
        this.grade=grade;
        this.student_id=student_id;
    }
    public String getgrade()
    {
        return grade;
    }
    public String getsudent_id()
    {
        return student_id;
    }
    public void setgrade()
    {
        this.grade=grade;
    }
    public void setstudent_id()
    {
        this.student_id=student_id;
    }
    public void calculateGrade(int marks){
        if(marks>=90){
            grade="A";
        }else if(marks>=75){
            grade="B";
        } else if(marks>=50){
            grade="C";
        }else{
            grade="F";
        }
        System.out.println(getname()+"'s grade is updated to: "+grade);
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println(" Grade: "+grade+"  student_id: "+student_id);
    }
}
