package com.mysite.sbb.question;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface QuestionRepository extends JpaRepository<Question, Integer>{
	Question findBySubject(String subejct);
	Question findBySubjectAndContent(String subject, String content);
	List<Question> findBysubjectLike(String subject);

}
