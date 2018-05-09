package com.fanwe.www.poper;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fanwe.lib.poper.FPoper;
import com.fanwe.lib.poper.layouter.AutoHeightLayouter;
import com.fanwe.library.activity.SDBaseActivity;
import com.fanwe.www.poper.dialog.TestDialog;
import com.fanwe.www.poper.dialog.TestPopView;

/**
 * Created by Administrator on 2018/1/10.
 */

public class DialogActivity extends SDBaseActivity
{
    private Button btn_dialog;
    private Button btn_pop;

    private TestPopView mPopView;

    @Override
    protected void init(Bundle savedInstanceState)
    {
        setContentView(R.layout.act_dialog);
        btn_dialog = findViewById(R.id.btn_dialog);
        btn_pop = findViewById(R.id.btn_pop);

        btn_dialog.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                TestDialog testDialog = new TestDialog(DialogActivity.this);
                testDialog.show();
            }
        });

        btn_pop.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                getPopView().getPoper().attach(!getPopView().getPoper().isAttached());
            }
        });
    }

    public TestPopView getPopView()
    {
        if (mPopView == null)
        {
            mPopView = new TestPopView(this);
            mPopView.getPoper()
                    .setPopLayouter(new AutoHeightLayouter())
                    .setTarget(btn_pop)
                    .setPosition(FPoper.Position.BottomOutsideCenter);
        }
        return mPopView;
    }
}
