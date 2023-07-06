package com.student.Repository;

import com.student.Entity.StudentDetails;
import com.student.dto.StudentDetailsDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDetailsRepository extends JpaRepository<StudentDetails, Integer> {

//    @Query("SELECT * FROM subjects WHERE exam_type = unit_1  AND student_id = 1")
//            public StudentDetails sum();

    @Query("select new com.student.Entity.StudentDetails(s.id, st.exam_type,st.telugu,st.hindi,st.english,st.maths,st.science,st.social) from StudentDetails s JOIN s.subjects st where st.id=:id")
    public StudentDetailsDto getDetailsByID(@Param("id") Integer id);

}
