package com.example.android.opengl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

/**
 * Created by krzysztofbury on 05.01.2014.
 */
public class Piramid {
    static float[] piramidCoords = {
            // in counterclockwise order:
            0.0f, 0.622008459f, 0.0f,   // top 0
            -0.5f, -0.311004243f, 0.5f,  // front left 3
            0.5f, -0.311004243f, 0.5f,    // front right 6
            - 0.5f, -0.311004243f, -0.5f,  // back left  9
            0.5f, -0.311004243f, -0.5f    // back right 12
    };

    Triangle front;
    Triangle left;
    Triangle right;
    Triangle back;
    Triangle bottom1;
    Triangle bottom2;


    public Piramid() {


        float frontCoords[] = {
                piramidCoords[0],piramidCoords[1],piramidCoords[2],
                piramidCoords[6],piramidCoords[7],piramidCoords[8],
                piramidCoords[3],piramidCoords[4],piramidCoords[5]
        };
        front = new Triangle(frontCoords);
        float colFront[] = {1.0f,0f,0f,1f};
        front.setColor(colFront);

        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), R.raw.tex);
        float texCords[] = {
                0.5f,1.0f,
                0f,0f,
                1f,0f
        };
//
//        mTriangle.setTexture(bitmap,texCords);


        float leftCoords[] = {
                piramidCoords[0],piramidCoords[1],piramidCoords[2],
                piramidCoords[3],piramidCoords[4],piramidCoords[5],
                piramidCoords[9],piramidCoords[10],piramidCoords[11]
        };
        left = new Triangle(leftCoords);
        float colleft[] = {0.0f,1f,0f,1f};
        left.setColor(colleft);


        float rightCoords[] = {
                piramidCoords[0],piramidCoords[1],piramidCoords[2],
                piramidCoords[12],piramidCoords[13],piramidCoords[14],
                piramidCoords[6],piramidCoords[7],piramidCoords[8]
        };

        right = new Triangle(rightCoords);
        float colright[] = {0.0f,0f,1.f,1f};
        right.setColor(colright);


        float backCoords[] = {
                piramidCoords[0],piramidCoords[1],piramidCoords[2],
                piramidCoords[9],piramidCoords[10],piramidCoords[11],
                piramidCoords[12],piramidCoords[13],piramidCoords[14]
        };
        back = new Triangle(backCoords);
        float colBack[] = {1.0f,0f,1.0f,1f};
        back.setColor(colBack);


        float bottom1Coords[] = {
                piramidCoords[3],piramidCoords[4],piramidCoords[5],
                piramidCoords[6],piramidCoords[7],piramidCoords[8],
                piramidCoords[9],piramidCoords[10],piramidCoords[11]
        };
        bottom1 = new Triangle(bottom1Coords);
        float colbottom1[] = {1.0f,1.0f,1.0f,1f};
        bottom1.setColor(colbottom1);

        float bottom2Coords[] = {
                piramidCoords[6],piramidCoords[7],piramidCoords[8],
                piramidCoords[12],piramidCoords[13],piramidCoords[14],
                piramidCoords[9],piramidCoords[10],piramidCoords[11]
        };
        bottom2 = new Triangle(bottom2Coords);
        float colbottom2[] = {0f,1f,1.0f,1f};
        bottom2.setColor(colbottom2);
    }









    public void draw(float[] mvpMatrix) {
        front.draw(mvpMatrix);
        left.draw(mvpMatrix);
        right.draw(mvpMatrix);
        back.draw(mvpMatrix);
        bottom1.draw(mvpMatrix);
        bottom2.draw(mvpMatrix);
    }


}
