package com.ltp.gradesubmission;

import static org.mockito.Mockito.when;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.ltp.gradesubmission.pojo.Grade;
import com.ltp.gradesubmission.repository.GradeRepository;
import com.ltp.gradesubmission.service.GradeService;

@RunWith(MockitoJUnitRunner.class)
public class GradeServiceTest {
    
    @Mock
    GradeRepository gradeRepository;

    @InjectMocks
    GradeService gradeService;

    @Test
    public void getGradesTest() {   
        // Grade grade = new Grade("Ayush", "A+", "Computer");
        // List<Grade> gradeList = Arrays.asList(grade);
        // when(gradeRepository.getGrades()).thenReturn(gradeList);
        
        
    }


}
