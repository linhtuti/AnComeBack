package com.example.macos.comeback;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wonderkiln.camerakit.CameraView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.cameraKitView) CameraView cameraView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        this.cameraView.start();
    }

    @Override
    protected void onPause() {
        this.cameraView.stop();
        super.onPause();
    }
}
