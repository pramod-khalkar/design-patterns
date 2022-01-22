package org.patterns.creational.builder.ex2;

/**
 * Date: 03/11/21
 * Time: 5:54 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class User {
    private String fname;
    private String lname;
    private Integer age;
    private String qualification;
    private String marriedStatus;

    private User(UserBuilder userBuilder) {
        this.fname = userBuilder.fname;
        this.lname = userBuilder.lname;
        this.age = userBuilder.age;
        this.qualification = userBuilder.qualification;
        this.marriedStatus = userBuilder.marriedStatus;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public Integer getAge() {
        return age;
    }

    public String getQualification() {
        return qualification;
    }

    public String getMarriedStatus() {
        return marriedStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                ", qualification='" + qualification + '\'' +
                ", marriedStatus='" + marriedStatus + '\'' +
                '}';
    }

    public static class UserBuilder {
        private String fname;
        private String lname;
        private Integer age;
        private String qualification;
        private String marriedStatus;

        public UserBuilder fname(String fname) {
            this.fname = fname;
            return this;
        }

        public UserBuilder lname(String lname) {
            this.lname = lname;
            return this;
        }

        public UserBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public UserBuilder qualification(String qualification) {
            this.qualification = qualification;
            return this;
        }

        public UserBuilder marriedStatus(String marriedStatus) {
            this.marriedStatus = marriedStatus;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
