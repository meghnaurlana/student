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
    public String telugu;
    @Column(name = "hindi")
    public String hindi;
    @Column(name = "english")
    public String english;
    @Column(name = "maths")
    public String maths;
    @Column(name = "science")
    public String science;
    @Column(name = "social")
    public String social;
    @Column(name = "exam_type")
    public String exam_type;


}
