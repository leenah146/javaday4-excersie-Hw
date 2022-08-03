public class Employee {
    int id;
    String firstname;
    String lastname;
    int salary;

    public Employee(int id, String firstname, String lastemail, int salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastemail;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
    public String getname(){
        return firstname+lastname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getannsalary(){
        int annsalary;
        annsalary=salary*12;
        return annsalary;
    }
    public int raise(int percent){
        salary = salary +((salary*percent)/100);
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
