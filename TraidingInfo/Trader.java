package TraidingInfo;

public class Trader {
    private String name;
    private String city;
    private String country;

    public Trader() {
        this.name = "Default Trader";
        this.city = "Default City";
        this.country = "Default Country";
    }

    public Trader(String name, String city, String country) {
        this.name = name;
        this.city = city;
        this.country = country;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Trader{name='" + name + "', city='" + city + "', country='" + country + "'}";
    }

    public static void main(String[] args) {
        Trader trader = new Trader();
        System.out.println(trader);
    }

}