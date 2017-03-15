package com.example.boby.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.boby.MainActivity;
import com.example.boby.R;
import com.xyz.xswitch.XyzSwitch;

/**
 * 性别选取
 */
public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        XyzSwitch xSwitch =  (XyzSwitch) findViewById(R.id.xswitch);
        xSwitch.setOnXyzSwitchChangeListener(new XyzSwitch.XyzSwitchChange() {
            @Override
            public void changed(boolean isRight) {
                Toast.makeText(Main2Activity.this,isRight?"男":"女",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
