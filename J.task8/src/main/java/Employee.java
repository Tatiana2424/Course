public abstract class Employee {
    private String employeeld;
    private int ID;

    public Employee(String employeeld, int ID){
       this.employeeld=employeeld;
       this.ID=ID;
    }
    public String getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(String employeeld) {
        this.employeeld = employeeld;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public abstract int calculatePay();
    public  void print(){
    }
}


class SalariedEmployee extends Employee{

    private String socialSecurityNumber;
    private int hourly_rate;
    private int number;
    public SalariedEmployee(String employeeld,int ID, String socialSecurityNumber,int hourly_rate,int number) {
        super(employeeld,ID);
        this.socialSecurityNumber=socialSecurityNumber;
        this.hourly_rate=hourly_rate;
        this.number=number;
    }
    @Override
    public int calculatePay(){
      //System.out.println("Salary= "+hourly_rate*number);
        return hourly_rate*number;
    }
    @Override
    public  void print(){
        System.out.println("Employeeld: "+getEmployeeld()+"      "+"ID: "+getID()+"      "+"socialSecurityNumber: "+
                this.socialSecurityNumber+"      "+"hourly_rate: "+this.hourly_rate+"        "+"number: "+this.number);

    }
}


class ContractEmployee extends Employee{

    private String federalTaxIdmember;
    private int f_m_p;
    public ContractEmployee(String employeeld,int ID,String federalTaxIdmember,int f_m_p) {
        super(employeeld,ID);
        this.federalTaxIdmember=federalTaxIdmember;
        this.f_m_p=f_m_p;
    }
    @Override
    public int calculatePay(){

        //System.out.println("Salary= "+f_m_p);
        return f_m_p;
    }

    @Override
    public  void print(){
        System.out.println("Employeeld: "+getEmployeeld()+"      "+"ID: "+getID()+"      "+
                "federalTaxIdmember: "+federalTaxIdmember+"      "+"fixed monthly payment: "+this.f_m_p);
    }
}
