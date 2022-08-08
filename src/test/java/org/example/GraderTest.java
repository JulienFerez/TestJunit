package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void numberGradeInferiorZero() {
        Grader grader = new Grader();
        assertThrows(IllegalArgumentException.class, () -> {
            grader.determineLetterGrade(-1);
        });
    }


    @Test
    void numberGradeInferiorSixty() {
        Grader grader = new Grader();
        assertEquals('E', grader.determineLetterGrade(59));
    }

    @Test
    void numberGradeInferiorSeventy() {
        Grader grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(69));
    }

    @Test
    void numberGradeInferiorEighty() {
        Grader grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(79));
    }

    @Test
    void numberGradeInferiorNinety() {
        Grader grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(89));
    }

    @Test
    void numberGradeInferiorHundred() {
        Grader grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(99));
    }


}