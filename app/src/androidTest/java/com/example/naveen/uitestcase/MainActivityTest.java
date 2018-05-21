package com.example.naveen.uitestcase;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule=new ActivityTestRule<>(MainActivity.class);

    @Test
    public void helloTest()
    {
        onView(withId(R.id.name_et)).perform(typeText("Naveen"),closeSoftKeyboard());//import onView method from espresso

        onView(withId(R.id.button)).perform(click());
        String expectedResult="Hello, Naveen";
        onView(withId(R.id.result_tv)).check(matches(withText(expectedResult)));
    }
}
