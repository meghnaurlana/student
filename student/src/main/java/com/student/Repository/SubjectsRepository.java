package com.student.Repository;

import com.student.Entity.Subjects;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectsRepository extends CrudRepository<Subjects, Integer> {
//    @Query("SELECT SUM(s.marks) FROM Subject s WHERE s.student.id = :studentId")
//    Integer sumByStudentId(@Param("studentId") Long studentId);
//    @Query("SELECT SUM(s.telugu, s.hindi, s.english) FROM subjects s")
//    public List<Subjects> sum();
}
