public class adminstaff extends person {
    private String department;
    private String role;
    public adminstaff(int id,String name,int age,String address,String department,String role)
    {
        super(id, name, age, address);
        this.department=department;
        this.role=role;
    }
    public String getdepartment()
    {
        return department;
    }
    public String getrole()
    {
        return role;
    }
    public void setdepartment()
    {
        this.department=department;
    }
    public void setrole()
    {
        this.role=role;
    }
    public void assignTask(String task) {
        System.out.println(getname() + " from " + department + " department is assigned task: " + task);
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println(" Department: "+department+" role: "+role);
    }
}
