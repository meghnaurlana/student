package com.student.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDetailsDto {
    public int student_id;
    public String exam_type;
    public String telugu;
    public String hindi;
    public String english;
    public String maths;
    public String science;
    public String social;

}
