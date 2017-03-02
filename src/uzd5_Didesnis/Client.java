package uzd5_Didesnis;

/**
 * Created by Askew on 3/1/2017.
 */
public class Client {
    private String firstName;
    private String lastName;
    private String city;
    private String phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }



    Client(String firstName, String lastName, String city, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }


}
