public class Stylist {
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String specialization;
    private List<Appointment> appointments;

    public Stylist(int id, String firstName, String lastName, String phoneNumber, String email, String specialization) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.specialization = specialization;
        this.appointments = new ArrayList<>();
    }

    //setters & getters for attributes

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void removeAppointment(Appointment appointment) {
        appointments.remove(appointment);
    }

    //add more infomrmation to change
}
