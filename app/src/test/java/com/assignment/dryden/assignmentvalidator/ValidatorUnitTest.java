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
        assertEquals(Validator.validate("password"), 1);
        assertEquals(Validator.validate("password1"), 2);
        assertEquals(Validator.validate("passwo"), 1);
    }
    }
}