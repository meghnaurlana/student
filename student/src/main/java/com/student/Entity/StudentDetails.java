package com.student.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "student_details")
public class StudentDetails {
    @Id
public int id;
    @Column(name = "name")
    public String name;
    @Column(name = "section")
    public String section;

    @OneToMany(targetEntity = Subjects.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private List<Subjects> subjects;

}
