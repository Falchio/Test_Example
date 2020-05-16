package ru.falchio.tests.espresso;


import org.junit.Rule;
import org.junit.Test;
import androidx.test.rule.ActivityTestRule;


import ru.falchio.tests.MainActivity;
import ru.falchio.tests.R;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void farewell(){
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.text)).check(matches(withText("Goodbye, world!")));
    }
}
