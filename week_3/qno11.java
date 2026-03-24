package javaweek3;

public class qno11 {
    private String street;
    private String city;
    private String zipCode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public static void main(String[] args) {
        qno11 addr = new qno11();

        addr.setStreet("Putalisadak");
        addr.setCity("Kathmandu");
        addr.setZipCode("44600");

        System.out.println("Street: " + addr.getStreet());
        System.out.println("City: " + addr.getCity());
        System.out.println("Zip Code: " + addr.getZipCode());
    }
}