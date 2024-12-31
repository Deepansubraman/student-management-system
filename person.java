

public class person{
    private int id;
    private String name;
    private int age;
    private String address;
    private int leavebalance;
    public person(int id,String name,int age,String address)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.address=address;
        this.leavebalance=10;
    }
    public void setid()
    {
        this.id=id;
    }
    public void setname()
    {
        this.name=name;
    }
    public void setage()
    {
        this.age=age;
    }
    public void setaddress()
    {
        this.address=address;
    }
    public int getid()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }
    public int getage()
    {
        return age;
    }
    public String getaddress()
    {
        return address;
    }
    public int getLeaveBalance(){
        return leavebalance;
    }
    public void setLeaveBalance(int leaveBalance) {
        this.leavebalance=leaveBalance;
    }
    public boolean applyLeave(int days){
        if(leavebalance>=days){
            leavebalance-=days;
            System.out.println(name+" has taken "+days+" days of leave. Remaining balance: "+leavebalance);
            return true;
        }else{
            System.out.println(name+" does not have enough leave balance.");
            return false;
        }
    }
    public void display()
    {
        System.out.println("Id: "+id+" Name: "+name+" Age:"+age+" Address: "+address);
    }
}

