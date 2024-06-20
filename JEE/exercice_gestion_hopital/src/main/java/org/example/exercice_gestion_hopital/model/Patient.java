package org.example.exercice_gestion_hopital.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Patient {
    @Id
    @GeneratedValue
    private Long id;

    private String lastname;

    private String firstname;

    private String password;


    @Temporal(TemporalType.DATE)
    private Date dateOfbirth;

    private String profilePic;


    public Patient(String lastname, String firstname, String password, Date dateOfbirth, String profilePic) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.password = password;
        this.dateOfbirth = dateOfbirth;
        this.profilePic = profilePic;
    }

    public Patient() {

    }


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(Date dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    @Override
    public String toString() {
        return "Patient{" +
                ", firstname='" + firstname + '\'' +
                "lastname='" + lastname + '\'' +
                ", dateOfbirth=" + dateOfbirth +
                ", profilePic='" + profilePic + '\'' +
                '}';
    }
}
