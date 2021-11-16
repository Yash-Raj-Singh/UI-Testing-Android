package com.example.uitesting

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SecondaryActivityTest
{
    @Test
    fun test_back_press_to_mainActivity() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(ViewMatchers.withId(R.id.button_next_activity)).perform(ViewActions.click())

        onView(ViewMatchers.withId(R.id.secondary)).check(matches(isDisplayed()))

        //onView(withId(R.id.button_back)).perform(click()) // method 1

        pressBack()

        onView(ViewMatchers.withId(R.id.main)).check(matches(isDisplayed()))
    }
}