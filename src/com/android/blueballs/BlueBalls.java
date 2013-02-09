package com.android.blueballs;

import android.app.Activity;
import android.os.Bundle;

public class BlueBalls extends Activity {

    private BlueBallsView mView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mView = new BlueBallsView(this);
        setContentView(mView);
    }
}
