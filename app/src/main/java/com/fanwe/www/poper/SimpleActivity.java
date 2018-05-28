package com.fanwe.www.poper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

import com.fanwe.lib.poper.FPoper;
import com.fanwe.lib.poper.Poper;
import com.fanwe.library.SDLibrary;

import java.util.HashMap;
import java.util.Map;

public class SimpleActivity extends AppCompatActivity
{
    public static final String TAG = SimpleActivity.class.getSimpleName();

    private Map<Poper, Integer> mMapPoper = new HashMap<>();
    private View view_target;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        SDLibrary.getInstance().init(getApplication());
        setContentView(R.layout.act_simple);
        view_target = findViewById(R.id.view_target);
        view_target.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ViewGroup.LayoutParams params = v.getLayoutParams();
                params.width = v.getWidth() + 100;
                v.setLayoutParams(params);
            }
        });

        Poper poper = new FPoper(this)
                .setDebug(true)
//                .setContainer((ViewGroup) findViewById(R.id.fl_container)) // 设置popview可以显示的容器范围，默认是Activity中id为android.R.id.content的容器
//                .setMarginX(10) // 设置x轴需要偏移的值，大于0往右，小于0往左
//                .setMarginY(10) // 设置y轴方向的偏移量，大于0往下，小于0往上
                .setPopView(R.layout.view_pop) // 设置要popview，可以是布局id或者View对象
                .setPosition(Poper.Position.TopLeft) //左上角对齐
                .setTarget(view_target) // 设置要跟踪的目标View
                .attach(true); // //true-依附目标view，false-移除依附

        mMapPoper.put(poper, 0);
    }

    public Poper getPoper()
    {
        return mMapPoper.keySet().iterator().next();
    }

    public void onClickTopLeft(View v)
    {
        getPoper().setPosition(Poper.Position.TopLeft) //左上角对齐
                .attach(true); //true-依附目标view，false-移除依附
    }

    public void onClickTopCenter(View v)
    {
        getPoper().setPosition(Poper.Position.TopCenter)
                .attach(true);
    }

    public void onClickTopRight(View v)
    {
        getPoper().setPosition(Poper.Position.TopRight)
                .attach(true);
    }

    public void onClickLeftCenter(View v)
    {
        getPoper().setPosition(Poper.Position.LeftCenter)
                .attach(true);
    }

    public void onClickCenter(View v)
    {
        getPoper().setPosition(Poper.Position.Center)
                .attach(true);
    }

    public void onClickRightCenter(View v)
    {
        getPoper().setPosition(Poper.Position.RightCenter)
                .attach(true);
    }

    public void onClickBottomLeft(View v)
    {
        getPoper().setPosition(Poper.Position.BottomLeft)
                .attach(true);
    }

    public void onClickBottomCenter(View v)
    {
        getPoper().setPosition(Poper.Position.BottomCenter)
                .attach(true);
    }

    public void onClickBottomRight(View v)
    {
        getPoper().setPosition(Poper.Position.BottomRight)
                .attach(true);
    }

    public void onClickTopOutsideLeft(View v)
    {
        getPoper().setPosition(Poper.Position.TopOutsideLeft)
                .attach(true);
    }

    public void onClickTopOutsideCenter(View v)
    {
        getPoper().setPosition(Poper.Position.TopOutsideCenter)
                .attach(true);
    }

    public void onClickTopOutsideRight(View v)
    {
        getPoper().setPosition(Poper.Position.TopOutsideRight)
                .attach(true);
    }

    public void onClickBottomOutsideLeft(View v)
    {
        getPoper().setPosition(Poper.Position.BottomOutsideLeft)
                .attach(true);
    }

    public void onClickBottomOutsideCenter(View v)
    {
        getPoper().setPosition(Poper.Position.BottomOutsideCenter)
                .attach(true);
    }

    public void onClickBottomOutsideRight(View v)
    {
        getPoper().setPosition(Poper.Position.BottomOutsideRight)
                .attach(true);
    }

    public void onClickLeftOutsideTop(View v)
    {
        getPoper().setPosition(Poper.Position.LeftOutsideTop)
                .attach(true);
    }

    public void onClickLeftOutsideCenter(View v)
    {
        getPoper().setPosition(Poper.Position.LeftOutsideCenter)
                .attach(true);
    }

    public void onClickLeftOutsideBottom(View v)
    {
        getPoper().setPosition(Poper.Position.LeftOutsideBottom)
                .attach(true);
    }


    public void onClickRightOutsideTop(View v)
    {
        getPoper().setPosition(Poper.Position.RightOutsideTop)
                .attach(true);
    }

    public void onClickRightOutsideCenter(View v)
    {
        getPoper().setPosition(Poper.Position.RightOutsideCenter)
                .attach(true);
    }

    public void onClickRightOutsideBottom(View v)
    {
        getPoper().setPosition(Poper.Position.RightOutsideBottom)
                .attach(true);
    }

    public void onClickToggleVisibility(View v)
    {
        if (view_target != null)
        {
            if (view_target.getVisibility() != View.VISIBLE)
            {
                view_target.setVisibility(View.VISIBLE);
            } else
            {
                view_target.setVisibility(View.GONE);
            }
        }
    }
}
