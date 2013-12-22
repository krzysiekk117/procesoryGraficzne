package uj.edu.pl.procesory1;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by krzysztofbury on 22.12.2013.
 */
public class ProcesoryRenderer implements GLSurfaceView.Renderer {

    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eglConfig) {
        GLES20.glClearColor(.0f,0.0f,1f,1.0f);
    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0,0,i,i2);
    }

    @Override
    public void onDrawFrame(GL10 gl10) {
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);


    }
}
