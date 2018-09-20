package cn.com.srx.a64rotationdemo;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rotation_0)
    Button rotation0;
    @BindView(R.id.rotation_1)
    Button rotation1;
    @BindView(R.id.rotation_2)
    Button rotation2;
    @BindView(R.id.rotation_3)
    Button rotation3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.rotation_0, R.id.rotation_1, R.id.rotation_2, R.id.rotation_3})
    public void onViewClicked(View view) {
        int newOrientation = 255;
        switch (view.getId()) {
            case R.id.rotation_0:
                newOrientation = ActivityInfo.SCREEN_ORIENTATION_REVERSE_PORTRAIT;
                break;
            case R.id.rotation_1:
                newOrientation = ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE;
                break;
            case R.id.rotation_2:
                newOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
                break;
            case R.id.rotation_3:
                newOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;
                break;
        }
            setRequestedOrientation(newOrientation);
    }
}
