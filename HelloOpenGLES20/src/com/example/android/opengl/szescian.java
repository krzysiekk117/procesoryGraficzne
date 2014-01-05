package com.example.android.opengl;

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

        public szescian() {


        float frontCoords[] = {
                szescianCoords[0],szescianCoords[1],szescianCoords[2],
                szescianCoords[3],szescianCoords[4],szescianCoords[5],
                szescianCoords[6],szescianCoords[7],szescianCoords[8],
                szescianCoords[9],szescianCoords[10],szescianCoords[11],
            };

            front = new Square(frontCoords);
            float colFront[] = {1.0f,0f,0f,1f};
            front.setColor(colFront);


            float rightCoords[] = {
                    szescianCoords[21],szescianCoords[22],szescianCoords[23],
                    szescianCoords[18],szescianCoords[19],szescianCoords[20],
                    szescianCoords[3],szescianCoords[4],szescianCoords[5],
                    szescianCoords[0],szescianCoords[1],szescianCoords[2],
            };

            right = new Square(rightCoords);
            float colRight[] = {0.0f,1f,0f,1f};
            right.setColor(colRight);

            float backCoords[] = {
                    szescianCoords[12],szescianCoords[13],szescianCoords[14],
                    szescianCoords[15],szescianCoords[16],szescianCoords[17],
                    szescianCoords[18],szescianCoords[19],szescianCoords[20],
                    szescianCoords[21],szescianCoords[22],szescianCoords[23],

            };


            back = new Square(backCoords);
            float colBack[] = {0.0f,0f,1f,1f};
            back.setColor(colBack);


        }



    public void draw(float[] mvpMatrix) {
        front.draw(mvpMatrix);
//        left.draw(mvpMatrix);
        right.draw(mvpMatrix);
        back.draw(mvpMatrix);
//        bottom1.draw(mvpMatrix);
//        bottom2.draw(mvpMatrix);
    }

}

