package usersInfo;

public class Adress {
    private String Country;
    private String City;
    private String Streat;

    @Override
    public String toString() {
        return "Adress{" +
                "Country='" + Country + '\'' +
                ", City='" + City + '\'' +
                ", Streat='" + Streat + '\'' +
                ", number=" + number +
                '}';
    }

    int number;

    public Adress(){

    };

    public Adress(String country, String city, String streat, int number) {
        Country = country;
        City = city;
        Streat = streat;
        this.number = number;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getStreat() {
        return Streat;
    }

    public void setStreat(String streat) {
        Streat = streat;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
