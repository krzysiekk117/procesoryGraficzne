package com.example.android.opengl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by krzysztofbury on 05.01.2014.
 */
public class szescian {


        static float[] szescianCoords = {
                // in counterclockwise order:

                0.5f,0.5f,0.5f, // front right top    0
                0.5f,-0.5f,0.5f, // front right bottom  3
                -0.5f,-0.5f,0.5f, //  front left bottom   6
                -0.5f,0.5f,0.5f, // front left top   9

                0.5f,0.5f,-0.5f, // back right top     12
                0.5f,-0.5f,-0.5f, // back right bottom   15
                -0.5f,-0.5f,-0.5f, //  back left bottom   18
                -0.5f,0.5f,-0.5f, // back left top  21


        };


        Square front;
        Square left;
        Square right;
        Square back;
        Square bottom1;
        Square bottom2;

        public szescian(Context context) {

            float texCords[] = {
                    1f,1f,
                    0f,1f,
                    0f,0f,
                    1f,0f
            };

            Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), R.raw.tex);
        float frontCoords[] = {
                szescianCoords[21],szescianCoords[22],szescianCoords[23],
                szescianCoords[9],szescianCoords[10],szescianCoords[11],
                szescianCoords[0],szescianCoords[1],szescianCoords[2],
                szescianCoords[12],szescianCoords[13],szescianCoords[14],
            };

            front = new Square(frontCoords);  //czerwony
            front.setTexture(bitmap,texCords);


            bitmap = BitmapFactory.decodeResource(context.getResources(), R.raw.tex1);
            float rightCoords[] = {
                    szescianCoords[18],szescianCoords[19],szescianCoords[20],
                    szescianCoords[6],szescianCoords[7],szescianCoords[8],
                    szescianCoords[3],szescianCoords[4],szescianCoords[5],
                    szescianCoords[15],szescianCoords[16],szescianCoords[17],
            };

            right = new Square(rightCoords); //zielony
            right.setTexture(bitmap, texCords);

            bitmap = BitmapFactory.decodeResource(context.getResources(), R.raw.tex2);
            float backCoords[] = {
                    szescianCoords[9],szescianCoords[10],szescianCoords[11],
                    szescianCoords[6],szescianCoords[7],szescianCoords[8],
                    szescianCoords[3],szescianCoords[4],szescianCoords[5],
                    szescianCoords[0],szescianCoords[1],szescianCoords[2],

            };


            back = new Square(backCoords); //niebeski 
            back.setTexture(bitmap, texCords);

            bitmap = BitmapFactory.decodeResource(context.getResources(), R.raw.tex3);
            float leftCoords[] = {
                   szescianCoords[0],szescianCoords[1],szescianCoords[2],
                   szescianCoords[3],szescianCoords[4],szescianCoords[5],
                   szescianCoords[15],szescianCoords[16],szescianCoords[17],
                   szescianCoords[12],szescianCoords[13],szescianCoords[14],

            };

            left = new Square(leftCoords);//zolty

            left.setTexture(bitmap, texCords);


            bitmap = BitmapFactory.decodeResource(context.getResources(), R.raw.tex4);
            float bottom1Coords[] = {
                    szescianCoords[21],szescianCoords[22],szescianCoords[23],
                    szescianCoords[18],szescianCoords[19],szescianCoords[20],
                    szescianCoords[6],szescianCoords[7],szescianCoords[8],
                    szescianCoords[9],szescianCoords[10],szescianCoords[11],
            };

            bottom1 = new Square(bottom1Coords);  //fioletowy

            bottom1.setTexture(bitmap, texCords);

            bitmap = BitmapFactory.decodeResource(context.getResources(), R.raw.tex5);
            float bottom2Coords[] = {
                    szescianCoords[21],szescianCoords[22],szescianCoords[23],
                    szescianCoords[18],szescianCoords[19],szescianCoords[20],
                    szescianCoords[15],szescianCoords[16],szescianCoords[17],
                    szescianCoords[12],szescianCoords[13],szescianCoords[14],
            };

            bottom2 = new Square(bottom2Coords);  //biały
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

