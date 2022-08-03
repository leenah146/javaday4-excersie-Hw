public class Customer {
    int ID;
    String name;
    char gender;

    public Customer(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() throws Exception {
        if(gender == 'f'||gender=='m'){
            return gender;
        }else {
            throw new Exception("not a gender");
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }


}
