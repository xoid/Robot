package com.vul.robot;

import android.app.Activity;

/**
 * Created by rita on 05.02.14.
 */
public class Motor
{
    public Lamp power;
    public Lamp forward;
    public Lamp back;
    public Motor(String name, MainActivity act)
    {
        power   = (Lamp)act.str2view(name + "_power");  power.Start();
        forward = (Lamp)act.str2view(name + "_forward");
        back    = (Lamp)act.str2view(name + "_back");
    }

    public void Forward()
    {
        forward.On();
        back.Off();
    }

    public void Back()
    {
        back.On();
        forward.Off();
    }

    public void Power(int power)
    {
        this.power.Power(power);
    }

    public void Power(float power)
    {
        if (power > 0) Forward();
        Power(Math.abs(power));
    }


}
