package com.assignment.dryden.assignmentvalidator;

import org.junit.Test;
import com.assignment.dryden.assignmentvalidator.Validator;
import static org.junit.Assert.assertEquals;
/**
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ValidatorUnitTest {
    @Test
    public void validatorTester() throws Exception {
        assertEquals(Validator.validate("password"), 2);
        assertEquals(Validator.validate("Password123"),5);
        assertEquals(Validator.validate("password123"), 4);
        assertEquals(Validator.validate("PASSWORD123"),4);
        assertEquals(Validator.validate("Pa5"),4);
        assertEquals(Validator.validate(""), 1);
    }
}