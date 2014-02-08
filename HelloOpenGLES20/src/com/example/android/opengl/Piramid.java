package com.example.android.opengl;

import android.content.Context;
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


    public Piramid(Context context) {


        float texCords[] = {
                0.5f,1.0f,
                0f,0f,
                1f,0f
        };


        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), R.raw.tex);
        float frontCoords[] = {
                piramidCoords[0],piramidCoords[1],piramidCoords[2],
                piramidCoords[6],piramidCoords[7],piramidCoords[8],
                piramidCoords[3],piramidCoords[4],piramidCoords[5]
        };
        front = new Triangle(frontCoords);
        front.setTexture(bitmap,texCords);


        bitmap = BitmapFactory.decodeResource(context.getResources(), R.raw.tex1);
        float leftCoords[] = {
                piramidCoords[0],piramidCoords[1],piramidCoords[2],
                piramidCoords[3],piramidCoords[4],piramidCoords[5],
                piramidCoords[9],piramidCoords[10],piramidCoords[11]
        };
        left = new Triangle(leftCoords);
        left.setTexture(bitmap,texCords);


        bitmap = BitmapFactory.decodeResource(context.getResources(), R.raw.tex2);
        float rightCoords[] = {
                piramidCoords[0],piramidCoords[1],piramidCoords[2],
                piramidCoords[12],piramidCoords[13],piramidCoords[14],
                piramidCoords[6],piramidCoords[7],piramidCoords[8]
        };

        right = new Triangle(rightCoords);
        right.setTexture(bitmap, texCords);


        bitmap = BitmapFactory.decodeResource(context.getResources(), R.raw.tex3);
        float backCoords[] = {
                piramidCoords[0],piramidCoords[1],piramidCoords[2],
                piramidCoords[9],piramidCoords[10],piramidCoords[11],
                piramidCoords[12],piramidCoords[13],piramidCoords[14]
        };
        back = new Triangle(backCoords);
        back.setTexture(bitmap, texCords);


        bitmap = BitmapFactory.decodeResource(context.getResources(), R.raw.tex4);
        float bottom1Coords[] = {
                piramidCoords[3],piramidCoords[4],piramidCoords[5],
                piramidCoords[6],piramidCoords[7],piramidCoords[8],
                piramidCoords[9],piramidCoords[10],piramidCoords[11]
        };
        bottom1 = new Triangle(bottom1Coords);
        bottom1.setTexture(bitmap, texCords);

        bitmap = BitmapFactory.decodeResource(context.getResources(), R.raw.tex4);
        float bottom2Coords[] = {
                piramidCoords[6],piramidCoords[7],piramidCoords[8],
                piramidCoords[12],piramidCoords[13],piramidCoords[14],
                piramidCoords[9],piramidCoords[10],piramidCoords[11]
        };
        bottom2 = new Triangle(bottom2Coords);
        bottom2.setTexture(bitmap, texCords);
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
