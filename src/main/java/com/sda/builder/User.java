package com.sda.builder;

public class User {

    private String name;
    private String lastName;
    private String address;
    private String city;
    private String postalCode;
    private String email;
    private String telephoneNumber;
    private int age;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static final class UserBuilder {
        private String name;
        private String lastName;
        private String address;
        private String city;
        private String postalCode;
        private String email;
        private String telephoneNumber;
        private int age;

        private UserBuilder() {
        }

        public static UserBuilder anUser() {
            return new UserBuilder();
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder city(String city) {
            this.city = city;
            return this;
        }

        public UserBuilder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder telephoneNumber(String telephoneNumber) {
            this.telephoneNumber = telephoneNumber;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            User user = new User();
            user.address = this.address;
            user.telephoneNumber = this.telephoneNumber;
            user.name = this.name;
            user.email = this.email;
            user.postalCode = this.postalCode;
            user.city = this.city;
            user.lastName = this.lastName;
            user.age = this.age;
            return user;
        }
    }



    /*public String getName() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(UserBuilder builder) {
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.address = builder.address;
        this.city = builder.city;
        this.postalCode = builder.postalCode;
        this.email = builder.email;
        this.telephoneNumber = builder.telephoneNumber;
        this.age = builder.age;
    }

    public static class UserBuilder {
        private String name;
        private String lastName;
        private String address;
        private String city;
        private String postalCode;
        private String email;
        private String telephoneNumber;
        private int age;

        public UserBuilder(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public UserBuilder email(String email){
            this.email = email;
            return this;
        }

        public UserBuilder address(String address){
            this.address = address;
            return this;
        }

        public UserBuilder city(String city){
            this.city = city;
            return this;
        }

        public UserBuilder telephoneNumber(String telephoneNumber){
            this.telephoneNumber = telephoneNumber;
            return this;
        }

        public UserBuilder postalCode(String postalCode){
            this.postalCode = postalCode;
            return this;
        }


        public User build(){
            return new User(this);
        }
    }*/
}
