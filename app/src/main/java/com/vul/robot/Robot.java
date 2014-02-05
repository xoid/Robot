package com.vul.robot;

import android.app.Activity;
import android.content.Context;

/**
 * Created by rita on 05.02.14.
 */
public class Robot
{
    public Motor l_motor;
    public Motor r_motor;
    public Robot(MainActivity act)
    {
        l_motor = new Motor("left", act);
        r_motor = new Motor("right", act);
    }


    public void Move()
    {

    }
}
