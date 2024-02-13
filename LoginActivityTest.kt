package com.example.myapplication

import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*


class LoginActivityTest
{
    private lateinit var scenario: ActivityScenario<LoginActivity>

    @Before
    fun setup()
    {
        scenario = ActivityScenario.launch(LoginActivity::class.java)
        scenario.moveToState(Lifecycle.State.RESUMED)


    }


    @Test
    fun testButtonClick2()
    {
        Thread.sleep(3000)
        Espresso.onView(ViewMatchers.withId(R.id.login_btn2)).perform(ViewActions.click())

    }

}


