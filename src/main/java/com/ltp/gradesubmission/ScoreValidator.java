package com.ltp.gradesubmission;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class ScoreValidator implements ConstraintValidator<Score,String> {

    List<String> scores = Arrays.asList(
            "A+", "A", "A-",
            "B+", "B", "B-",
            "C+", "C", "C-",
            "D+", "D", "D-",
            "f"
    );

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {

        for (String item: scores) {
            if (value.equals(item)) return true;
        }

        return false;
    }
}
