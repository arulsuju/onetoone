package org.onetoone.demo;

import javax.persistence.*;

@Entity
@Table(name="instructor_detail")
public class InstructorDetail {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="youtubechannel")
    String youtubechannel;

    public InstructorDetail(String youtubechannel, String hobby) {
        this.youtubechannel = youtubechannel;
        this.hobby = hobby;
    }

    public InstructorDetail() {
    }

    @Column(name="hobby")

    String hobby;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYoutubechannel() {
        return youtubechannel;
    }

    public void setYoutubechannel(String youtubechannel) {
        this.youtubechannel = youtubechannel;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
