package com.android.blueballs;

import android.content.Context;
import android.renderscript.RSSurfaceView;
import android.renderscript.RenderScriptGL;
import android.view.SurfaceHolder;

public class BlueBallsView extends RSSurfaceView {

    private RenderScriptGL mRS;
    private BlueBallsRS mRender;

    public BlueBallsView(Context context) {
        super(context);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public void surfaceChanged(SurfaceHolder holder, int format, int w, int h) {
        super.surfaceChanged(holder, format, w, h);

        if (mRS == null) {
            RenderScriptGL.SurfaceConfig sc = new RenderScriptGL.SurfaceConfig();
            mRS = createRenderScriptGL(sc);
            mRS.setSurface(holder, w, h);

            mRender = new BlueBallsRS();
            mRender.init(240, mRS, getResources(), w, h);
        }

    }

    @Override
    protected void onDetachedFromWindow() {
        if (mRS != null) {
            mRS.setSurface(null, 0, 0);
            mRS = null;
            destroyRenderScriptGL();
        }
    }

}
