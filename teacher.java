public class teacher extends person {
    private String subject;
    private double salary;
    private String timetable;
    public teacher(int id,String name,int age,String address,String subject,double salary)
    {
        super(id,name,age,address);
        this.subject=subject;
        this.salary=salary;
        this.timetable="not assign";
    }
    public void assignTimetable(String timetable){
        this.timetable=timetable;
        System.out.println(getname()+" has been assigned the timetable: "+timetable);
    }

    public void assign_timetable(String timetable)
    {
        this.timetable=timetable;
        System.out.println(getname()+"s timetable assigned"+timetable);
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println(" Subject: "+subject+" salary: "+salary);
    }
}
