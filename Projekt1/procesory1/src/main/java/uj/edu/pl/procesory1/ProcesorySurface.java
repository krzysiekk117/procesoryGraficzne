package uj.edu.pl.procesory1;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by krzysztofbury on 22.12.2013.
 */
public class ProcesorySurface extends GLSurfaceView {

    private ProcesoryRenderer procesoryRenderer;

    public ProcesorySurface(Context context) {
        super(context);

        setEGLContextClientVersion(2);

        procesoryRenderer = new ProcesoryRenderer();
        setRenderer(procesoryRenderer);

        setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
    }
}
