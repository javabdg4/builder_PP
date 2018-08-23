package com.sda.builder;

public class Main {
    public static void main(String[] args) {
        //User user = new User.UserBuilder("Jan", "Kowalski").age(22).email("dasdasd").build();


        User user = User.UserBuilder.anUser().age(24).name("Alibaba").lastName("Mistrz Kebaba").build();

        System.out.println(user.getName() + " " + user.getLastName() + " " + user.getAge() );
    }
}
