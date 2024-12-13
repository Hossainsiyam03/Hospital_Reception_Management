public class Patient {
    private  String name;
    private int age;
    private String problem;
    private String Address;
    private String Phone;


    public Patient(String name, int age, String problem, String Address,String Phone) {
        this.name = name;
        this.age = age;
        this.problem = problem;
        this.Address=Address;
        this.Phone=Phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProblem() {
        return problem;
    }
    public String getAddress() {
        return Address;
    }
    public String getPhone() {
        return Phone;
    }

    public String toString() {
        return "Patient Name: " + name + "  Age: " + age + "  Problem: " + problem +"  Address: "+ Address+"  Phone: "+Phone;
    }
}

