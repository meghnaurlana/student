package com.student.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "subjects")
public class Subjects {
    @Id
public int id;
    @Column(name = "telugu")
    public int telugu;
    @Column(name = "hindi")
    public int hindi;
    @Column(name = "english")
    public int english;
    @Column(name = "maths")
    public int maths;
    @Column(name = "science")
    public int science;
    @Column(name = "social")
    public int social;
    @Column(name = "examType")
    public String examType;


}
