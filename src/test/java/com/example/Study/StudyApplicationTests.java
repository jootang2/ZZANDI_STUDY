package com.example.Study;

import com.example.Study.domain.Study;
import com.example.Study.repository.StudyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.Table;

import java.time.LocalDateTime;
import java.util.Date;

import static org.assertj.core.util.DateUtil.now;

@SpringBootTest
class StudyApplicationTests {

	@Autowired
	private StudyRepository studyRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void 스터디_레포지터리_저장(){
		Study s1 = new Study();
		s1.setStudyTitle("스터디 테스트 1");
		s1.setStudyPeople(3);
		s1.setStudyRate(30);
		s1.setStudyTag("코딩");
		s1.setStudyType("책");
		s1.setStudyStatus("모집 중");
		studyRepository.save(s1);
	}



}
