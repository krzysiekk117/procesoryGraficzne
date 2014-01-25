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
        Square bottom1;
        Square bottom2;

        public szescian() {


        float frontCoords[] = {
                szescianCoords[21],szescianCoords[22],szescianCoords[23],
                szescianCoords[9],szescianCoords[10],szescianCoords[11],
                szescianCoords[0],szescianCoords[1],szescianCoords[2],
                szescianCoords[12],szescianCoords[13],szescianCoords[14],
            };

            front = new Square(frontCoords);  //czerwony
            float colFront[] = {1.0f,0f,0f,1f};
            front.setColor(colFront);


            float rightCoords[] = {
                    szescianCoords[18],szescianCoords[19],szescianCoords[20],
                    szescianCoords[6],szescianCoords[7],szescianCoords[8],
                    szescianCoords[3],szescianCoords[4],szescianCoords[5],
                    szescianCoords[15],szescianCoords[16],szescianCoords[17],
            };

            right = new Square(rightCoords); //zielony
            float colRight[] = {0.0f,1f,0f,1f};
            right.setColor(colRight);

            float backCoords[] = {
                    szescianCoords[9],szescianCoords[10],szescianCoords[11],
                    szescianCoords[6],szescianCoords[7],szescianCoords[8],
                    szescianCoords[3],szescianCoords[4],szescianCoords[5],
                    szescianCoords[0],szescianCoords[1],szescianCoords[2],

            };


            back = new Square(backCoords); //niebeski
            float colBack[] = {0.0f,0.0f,1.0f,1.0f};
            back.setColor(colBack);


            float leftCoords[] = {
                   szescianCoords[0],szescianCoords[1],szescianCoords[2],
                   szescianCoords[3],szescianCoords[4],szescianCoords[5],
                   szescianCoords[15],szescianCoords[16],szescianCoords[17],
                   szescianCoords[12],szescianCoords[13],szescianCoords[14],

            };

            left = new Square(leftCoords);//zolty
            float colLeft[] = {1.0f,1.0f,0.0f,1.0f};
            left.setColor(colLeft);



            float bottom1Coords[] = {
                    szescianCoords[21],szescianCoords[22],szescianCoords[23],
                    szescianCoords[18],szescianCoords[19],szescianCoords[20],
                    szescianCoords[6],szescianCoords[7],szescianCoords[8],
                    szescianCoords[9],szescianCoords[10],szescianCoords[11],
            };

            bottom1 = new Square(bottom1Coords);  //fioletowy
            float colBottom1[] = {1.0f,0.0f,1.0f,1.0f};
            bottom1.setColor(colBottom1);


            float bottom2Coords[] = {
                    szescianCoords[21],szescianCoords[22],szescianCoords[23],
                    szescianCoords[18],szescianCoords[19],szescianCoords[20],
                    szescianCoords[15],szescianCoords[16],szescianCoords[17],
                    szescianCoords[12],szescianCoords[13],szescianCoords[14],
            };

            bottom2 = new Square(bottom2Coords);  //biały
            float colBottom2[] = {1.0f,1.0f,1.0f,1.0f};
            bottom2.setColor(colBottom2);

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

