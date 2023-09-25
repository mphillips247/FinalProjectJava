public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private List<Appointment> appointments;

    public Customer(int id, String firstName, String lastName, String phoneNumber, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.appointments = new ArrayList<>();
    }

    //getters & setters for attributes

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void removeAppointment(Appointment appointment) {
        appointments.remove(appointment);
    }

    //add more to flesh out customer
}
