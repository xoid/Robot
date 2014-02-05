package com.vul.robot;

import android.content.Context;
import android.graphics.Color;
import android.nfc.cardemulation.OffHostApduService;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by rita on 05.02.14.
 */
public class Lamp extends ImageView
{
    private int power = 0;
    public boolean state;

    public Lamp(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        setMinimumWidth(30);
        setMinimumHeight(30);
        if (Math.random()*10 % 2 > 0) On(); else Off();
    }

    public void Start()
    {

    }

    public void  On()
    {
        setBackgroundColor(Color.WHITE);
        state = true;
    }

    public void Off()
    {
        setBackgroundColor(Color.BLACK);
        state = false;
    }

    public void Change()
    {
        if (state) Off(); else On();
    }

    public void Power(int power)
    {
        this.power = power;

    }

}
