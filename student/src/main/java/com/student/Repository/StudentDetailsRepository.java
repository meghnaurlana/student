package com.student.Repository;

import com.student.Entity.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDetailsRepository extends JpaRepository<StudentDetails, Integer> {

    @Query(value = "SELECT s FROM StudentDetails s WHERE s.id = (SELECT st.id FROM StudentDetails st INNER JOIN st.subjects sub GROUP BY st.id ORDER BY SUM(sub.telugu + sub.hindi + sub.english + sub.maths + sub.social + sub.science) DESC LIMIT 1)")
    StudentDetails classTopper();
}
