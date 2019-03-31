import usersInfo.Adress;

import java.util.Arrays;
import java.util.Objects;

public class User {
    private String Name;
    private String SureName;
    Adress adres;
    private char[] paswd;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Name.equals(user.Name) &&
                Arrays.equals(paswd, user.paswd);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(Name);
        result = 31 * result + Arrays.hashCode(paswd);
        return result;
    }
public  User(String name,char[] paswd){
        this.Name=name;
        this.paswd=paswd;
}
    public User(String name, String sureName, Adress adres, char[] paswd) {
        Name = name;
        SureName = sureName;
        this.adres = adres;
        this.paswd = paswd;
    }

    public char[] getPaswd() {
        return paswd;
    }

    public void setPaswd(char[] paswd) {
        this.paswd = paswd;
    }

    public User(String name) {
        Name = name;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSureName() {
        return SureName;
    }

    public void setSureName(String sureName) {
        SureName = sureName;
    }

    public Adress getAdres() {
        return adres;
    }

    public void setAdres(Adress adres) {
        this.adres = adres;
    }
}
