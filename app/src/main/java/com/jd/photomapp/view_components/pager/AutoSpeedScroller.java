package com.jd.photomapp.view_components.pager;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

public class AutoSpeedScroller extends Scroller
{
    public int mDuration = 1500;

    public AutoSpeedScroller(Context context) {
        super(context);
    }

    public AutoSpeedScroller(Context context, Interpolator interpolator)
    {
        super(context, interpolator);
    }

    public AutoSpeedScroller(Context context, Interpolator interpolator, boolean flywheel)
    {
        super(context, interpolator, flywheel);
    }

    @Override
    public void startScroll(int startX, int startY, int dx, int dy, int duration)
    {
        // Ignore received duration, use fixed one instead
        super.startScroll(startX, startY, dx, dy, mDuration);
    }

    @Override
    public void startScroll(int startX, int startY, int dx, int dy)
    {
        // Ignore received duration, use fixed one instead
        super.startScroll(startX, startY, dx, dy, mDuration);
    }
}