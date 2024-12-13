public class Doctor {
    private String name;
    private String specialization;
    private String Phone;
    private int Fees;
    private String DoctorId;

    public Doctor(String name, String specialization,String Phone,int Fees, String DoctorId) {
        this.name = name;
        this.specialization = specialization;
        this.Phone=Phone;
        this.Fees=Fees;
        this.DoctorId=DoctorId;
    }
    public String getName() {
        return name;
    }
    public String getSpecialization() {
        return specialization;
    }
    public String getPhone() {
        return Phone;
    }
    public int getFees() {
        return Fees;
    }
    public String getDoctorId() {
        return DoctorId;
    }

    public String toString() {
        return "Doctor Name: " + name + "Specialization: " + specialization +"Phone Number: "+Phone+"Doctor Fees: "+Fees+"Doctor Id: "+DoctorId;
    }
}

