package com.assignment.dryden.assignmentvalidator;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static android.support.test.espresso.assertion.ViewAssertions.matches;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Rule;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class UserInterfaceTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule(MainActivity.class);
    @Test
    public void UserInterfaceTester() {
        onView(withId(R.id.password_field)).perform(typeText("password"));
        onView(withId(R.id.button_id)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Invalid Password!")));

        onView(withId(R.id.password_field)).perform(typeText("pAssword3"));
        onView(withId(R.id.button_id)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Valid Password!")));
    }
}
