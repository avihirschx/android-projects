package com.avihirsch.connect3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int c1;
    private int c2;
    private int c3;
    private int[][] board;
    private int turn;
    private ImageView red1, red2, red3, red4, red5, red6, red7, red8, red9,
                     yellow1, yellow2, yellow3, yellow4, yellow5, yellow6, yellow7, yellow8, yellow9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        turn = 0;
        c1 = 0; c2 = 0; c3 = 0;
        board = new int[3][3];

        toast("Red goes first.");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //sets up imageviews for all images.
        init();

    }

    public void col1(View view) {
        if (c1 > 2) {
            return;
        }
        if (turn % 2 == 0) {
            switch (c1) {
                case 0:
                    place(red7);
                    board[0][0] = 1;
                    break;
                case 1:
                    place(red4);
                    board[0][1] = 1;
                    break;
                case 2:
                    place(red1);
                    board[0][2] = 1;
                    break;
            }
        } else {
            switch (c1) {
                case 0:
                    place(yellow7);
                    board[0][0] = 2;
                    break;
                case 1:
                    place(yellow4);
                    board[0][0] = 2;
                    break;
                case 2:
                    place(yellow1);
                    board[0][0] = 2;
                    break;
            }
        }
        checkVictory();
        turn++;
        toast("Turn " + turn);
        c1++;
    }

    public void col2(View view) {
        if (c2 > 2) {
            return;
        }
        if (turn % 2 == 0) {
            switch (c2) {
                case 0:
                    place(red8);
                    board[1][0] = 1;
                    break;
                case 1:
                    place(red5);
                    board[1][1] = 1;
                    break;
                case 2:
                    place(red2);
                    board[1][2] = 1;
                    break;
            }
        } else {
            switch (c2) {
                case 0:
                    place(yellow8);
                    board[1][0] = 2;
                    break;
                case 1:
                    place(yellow5);
                    board[1][1] = 2;
                    break;
                case 2:
                    place(yellow2);
                    board[1][2] = 2;
                    break;
            }
        }
        checkVictory();
        turn++;
        toast("Turn " + turn);
        c2++;
    }

    public void col3(View view) {
        if (c3 > 2) {
            return;
        }
        if (turn % 2 == 0) {
            switch (c3) {
                case 0:
                    place(red9);
                    board[2][0] = 1;
                    break;
                case 1:
                    place(red6);
                    board[2][1] = 1;
                    break;
                case 2:
                    place(red3);
                    board[2][2] = 1;
                    break;
            }
        } else {
            switch (c3) {
                case 0:
                    place(yellow9);
                    board[2][0] = 2;
                    break;
                case 1:
                    place(yellow6);
                    board[2][1] = 2;
                    break;
                case 2:
                    place(yellow3);
                    board[2][2] = 2;
                    break;
            }
        }
        checkVictory();
        turn++;
        toast("Turn " + turn);
        c3++;
    }

    private void toast(String str) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }

    public void place(ImageView image) {
        image.animate().translationYBy(1000f).setDuration(1000l);
    }

    public void init() {
        this.red1 = (ImageView) findViewById(R.id.red1);
        this.red1.setTranslationY(-1000f);
        red2 = (ImageView) findViewById(R.id.red2);
        red2.setTranslationY(-1000f);
        red3 = (ImageView) findViewById(R.id.red3);
        red3.setTranslationY(-1000f);
        red4 = (ImageView) findViewById(R.id.red4);
        red4.setTranslationY(-1000f);
        red5 = (ImageView) findViewById(R.id.red5);
        red5.setTranslationY(-1000f);
        red6 = (ImageView) findViewById(R.id.red6);
        red6.setTranslationY(-1000f);
        red7 = (ImageView) findViewById(R.id.red7);
        red7.setTranslationY(-1000f);
        red8 = (ImageView) findViewById(R.id.red8);
        red8.setTranslationY(-1000f);
        red9 = (ImageView) findViewById(R.id.red9);
        red9.setTranslationY(-1000f);
        yellow1 = (ImageView) findViewById(R.id.yellow1);
        yellow1.setTranslationY(-1000f);
        yellow2 = (ImageView) findViewById(R.id.yellow2);
        yellow2.setTranslationY(-1000f);
        yellow3 = (ImageView) findViewById(R.id.yellow3);
        yellow3.setTranslationY(-1000f);
        yellow4 = (ImageView) findViewById(R.id.yellow4);
        yellow4.setTranslationY(-1000f);
        yellow5 = (ImageView) findViewById(R.id.yellow5);
        yellow5.setTranslationY(-1000f);
        yellow6 = (ImageView) findViewById(R.id.yellow6);
        yellow6.setTranslationY(-1000f);
        yellow7 = (ImageView) findViewById(R.id.yellow7);
        yellow7.setTranslationY(-1000f);
        yellow8 = (ImageView) findViewById(R.id.yellow8);
        yellow8.setTranslationY(-1000f);
        yellow9 = (ImageView) findViewById(R.id.yellow9);
        yellow9.setTranslationY(-1000f);
    }

    public void checkVictory() {
//        for(int i = 0; i < 3; i++) {
//            for(int j = 0; j < 3; j++) {
//                if (board[i][j] == 1) {
//
//                }
//            }
//        }
    }



}
