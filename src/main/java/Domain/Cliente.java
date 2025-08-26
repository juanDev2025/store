package Domain;

import java.util.Objects;

public class Cliente {
   private int id;
   private String name;
   private String lastName;
   private String email;
   private String adress;

    public Cliente () {
    }

    public Cliente (int id){
        this.id= id;
    }

    public Cliente(String name, String lastName, String email, String adress) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.adress = adress;
    }

    public Cliente (int id, String name, String lastName, String email, String adress){
        this(name, lastName, email, adress);
        this.id= id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id == cliente.id && Objects.equals(name, cliente.name) && Objects.equals(lastName, cliente.lastName) && Objects.equals(email, cliente.email) && Objects.equals(adress, cliente.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, email, adress);
    }
}
