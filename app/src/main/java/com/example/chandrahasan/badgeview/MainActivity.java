package com.example.chandrahasan.badgeview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private View badgeIcon;
    private BadgeView badgeCount;
    private Button btn;
    private int count=4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        badgeIcon = (View) findViewById(R.id.badgeIcon);
        btn=(Button) findViewById(R.id.btn) ;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                badgeCount.setBadgeCount(++count);
            }
        });
        initBadge(this);
    }

    private void initBadge(Context paramContext) {
        this.badgeCount = new BadgeView(paramContext);
        this.badgeCount.setTargetView(this.badgeIcon);
        this.badgeCount.setBadgeCount(count);
        this.badgeCount.setBadgeMargin(9);
    }

}
