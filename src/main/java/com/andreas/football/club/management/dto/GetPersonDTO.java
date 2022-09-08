package com.andreas.football.club.management.dto;

public class GetPersonDTO {
    private String uuid;
    private String firstName;
    private String lastName;
    private int age;

    public GetPersonDTO(String uuid, String firstName, String lastName, int age) {
        this.uuid = uuid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public GetPersonDTO() {
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
