package com.android.gummybeam;

import android.app.Activity;
import android.os.Bundle;

public class GummyBeam extends Activity {

    private GummyBeamView mView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mView = new GummyBeamView(this);
        setContentView(mView);
    }
}
