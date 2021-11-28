package pl.patryk.pizza.remote.rest.dto.common;

public class PersonOrderDto {

    private String name;
    private String lastname;
    private String phone;
    private String address;
    private String mail;

    public PersonOrderDto() {
    }

    public PersonOrderDto(String name, String lastname, String phone, String address, String mail) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.address = address;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}

