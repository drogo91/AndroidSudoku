package com.sudoku.sudoku; /**
 * Created by romainvaidie on 15/03/2018.
 */
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;


//extends de view
public class Dessin  extends View{

    public Dessin(Context context, AttributeSet attrs) {
        super(context,attrs);
    }

    int tabLigne1[] = new int[9];
    int tabLigne2[] = new int[9];
    int tabLigne3[] = new int[9];
    int tabLigne4[] = new int[9];
    int tabLigne5[] = new int[9];
    int tabLigne6[] = new int[9];
    int tabLigne7[] = new int[9];
    int tabLigne8[] = new int[9];
    int tabLigne9[] = new int[9];
    int compteur3;
    int chiffreSelectionner;
    int chiffreAleatoire;
    int chiffreAleatoire1;
    int chiffreTab1;
    int chiffreTab;
    @Override
    public void onDraw(final Canvas canvas) {
        int compteur = 0;
        int compteur2 =0;
        final Paint paint = new Paint();
        Paint paint2 = new Paint();

        paint2.setStrokeWidth(2);
        paint.setColor(Color.BLACK);
        paint2.setColor(Color.RED);


        for(int i = 0; i<2500;i+=250) {

            canvas.drawLine(0, i, 1500, i, paint);
            if ((compteur==3)||(compteur==6)){
                canvas.drawLine(0, i, 1500, i, paint2);
            }


            compteur = compteur +1;
        }
        for(int i =0; i <1500; i+=160){
            canvas.drawLine(i, 0, i,2250 , paint);
            if ((compteur2==3)||(compteur2==6)){
                canvas.drawLine(i, 0, i,2250 , paint2);
            }
            compteur2++;


        }
        paint.setColor(Color.BLACK);
        paint.setTextSize(100);

        for(int i=2300; i<2551; i+=250) {
            canvas.drawLine(0,i,1500,i,paint2 );

        }

        for(int i=0; i<2300; i+=160) {
            canvas.drawLine(i,2300,i,2550,paint2 );
            compteur3 = compteur3 + 1;
            canvas.drawText(""+compteur3, i+60, 2450, paint);
        }

        //initialisation de la grille

        //ligne 1

        boolean ligne1 = true;
        chiffreAleatoire = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
        chiffreTab = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
        for(int i = 1; i<10; i++) {
            if(chiffreTab == i) {
                tabLigne1[chiffreTab-1] = chiffreAleatoire;
                canvas.drawText(""+ chiffreAleatoire,60+(160*(chiffreTab-1)),150,paint);
                chiffreAleatoire1 = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
                chiffreTab1 = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
                if(chiffreAleatoire != chiffreAleatoire1 && chiffreTab != chiffreTab1) {
                    tabLigne1[chiffreTab1-1] = chiffreAleatoire1;
                    canvas.drawText(""+ chiffreAleatoire1,60+(160*(chiffreTab1-1)),150,paint);
                }
            }
        }


        //ligne2
        chiffreAleatoire = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
        chiffreTab = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
        for(int i = 1; i<10; i++) {
            if(chiffreTab == i) {
                tabLigne2[chiffreTab-1] = chiffreAleatoire;
                canvas.drawText(""+ chiffreAleatoire,60+(160*(chiffreTab-1)),400,paint);
                chiffreAleatoire1 = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
                chiffreTab1 = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
                if(chiffreAleatoire != chiffreAleatoire1 && chiffreTab != chiffreTab1) {
                    tabLigne2[chiffreTab1-1] = chiffreAleatoire1;
                    canvas.drawText(""+ chiffreAleatoire1,60+(160*(chiffreTab1-1)),400,paint);
                }
            }
        }




        //ligne3
        chiffreAleatoire = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
        chiffreTab = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
        for(int i = 1; i<10; i++) {
            if(chiffreTab == i) {
                tabLigne3[chiffreTab-1] = chiffreAleatoire;
                canvas.drawText(""+ chiffreAleatoire,60+(160*(chiffreTab-1)),650,paint);
                chiffreAleatoire1 = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
                chiffreTab1 = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
                if(chiffreAleatoire != chiffreAleatoire1 && chiffreTab != chiffreTab1) {
                    tabLigne3[chiffreTab1-1] = chiffreAleatoire1;
                    canvas.drawText(""+ chiffreAleatoire1,60+(160*(chiffreTab1-1)),650,paint);
                }
            }
        }


        //ligne4
        chiffreAleatoire = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
        chiffreTab = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
        for(int i = 1; i<10; i++) {
            if(chiffreTab == i) {
                tabLigne4[chiffreTab-1] = chiffreAleatoire;
                canvas.drawText(""+ chiffreAleatoire,60+(160*(chiffreTab-1)),900,paint);
                chiffreAleatoire1 = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
                chiffreTab1 = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
                if(chiffreAleatoire != chiffreAleatoire1 && chiffreTab != chiffreTab1) {
                    tabLigne4[chiffreTab1-1] = chiffreAleatoire1;
                    canvas.drawText(""+ chiffreAleatoire1,60+(160*(chiffreTab1-1)),900,paint);
                }
            }
        }


        //ligne5
        chiffreAleatoire = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
        chiffreTab = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
        for(int i = 1; i<10; i++) {
            if(chiffreTab == i) {
                tabLigne5[chiffreTab-1] = chiffreAleatoire;
                canvas.drawText(""+ chiffreAleatoire,60+(160*(chiffreTab-1)),1150,paint);
                chiffreAleatoire1 = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
                chiffreTab1 = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
                if(chiffreAleatoire != chiffreAleatoire1 && chiffreTab != chiffreTab1) {
                    tabLigne5[chiffreTab1-1] = chiffreAleatoire1;
                    canvas.drawText(""+ chiffreAleatoire1,60+(160*(chiffreTab1-1)),1150,paint);
                }
            }
        }


        //ligne6
        chiffreAleatoire = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
        chiffreTab = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
        for(int i = 1; i<10; i++) {
            if(chiffreTab == i) {
                tabLigne6[chiffreTab-1] = chiffreAleatoire;
                canvas.drawText(""+ chiffreAleatoire,60+(160*(chiffreTab-1)),1400,paint);
                chiffreAleatoire1 = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
                chiffreTab1 = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
                if(chiffreAleatoire != chiffreAleatoire1 && chiffreTab != chiffreTab1) {
                    tabLigne6[chiffreTab1-1] = chiffreAleatoire1;
                    canvas.drawText(""+ chiffreAleatoire1,60+(160*(chiffreTab1-1)),1400,paint);
                }
            }
        }


        //ligne7
        chiffreAleatoire = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
        chiffreTab = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
        for(int i = 1; i<10; i++) {
            if(chiffreTab == i) {
                tabLigne7[chiffreTab-1] = chiffreAleatoire;
                canvas.drawText(""+ chiffreAleatoire,60+(160*(chiffreTab-1)),1650,paint);
                chiffreAleatoire1 = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
                chiffreTab1 = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
                if(chiffreAleatoire != chiffreAleatoire1 && chiffreTab != chiffreTab1) {
                    tabLigne7[chiffreTab1-1] = chiffreAleatoire1;
                    canvas.drawText(""+ chiffreAleatoire1,60+(160*(chiffreTab1-1)),1650,paint);
                }
            }
        }


        //ligne8
        chiffreAleatoire = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
        chiffreTab = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
        for(int i = 1; i<10; i++) {
            if(chiffreTab == i) {
                tabLigne8[chiffreTab-1] = chiffreAleatoire;
                canvas.drawText(""+ chiffreAleatoire,60+(160*(chiffreTab-1)),1900,paint);
                chiffreAleatoire1 = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
                chiffreTab1 = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
                if(chiffreAleatoire != chiffreAleatoire1 && chiffreTab != chiffreTab1) {
                    tabLigne8[chiffreTab1-1] = chiffreAleatoire1;
                    canvas.drawText(""+ chiffreAleatoire1,60+(160*(chiffreTab1-1)),1900,paint);
                }
            }
        }


        //ligne9
        chiffreAleatoire = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
        chiffreTab = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
        for(int i = 1; i<10; i++) {
            if(chiffreTab == i) {
                tabLigne9[chiffreTab-1] = chiffreAleatoire;
                canvas.drawText(""+ chiffreAleatoire,60+(160*(chiffreTab-1)),2150,paint);
                chiffreAleatoire1 = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
                chiffreTab1 = (int)( Math.random()*( 9 - 1 + 1 ) ) + 1;
                if(chiffreAleatoire != chiffreAleatoire1 && chiffreTab != chiffreTab1) {
                    tabLigne9[chiffreTab1-1] = chiffreAleatoire1;
                    canvas.drawText(""+ chiffreAleatoire1,60+(160*(chiffreTab1-1)),2150,paint);
                }
            }
        }

        for(int i=1; i>10; i++) {
            Math.random();
            canvas.drawText(""+ tabLigne1[0],600,100,paint);
            Log.d("1","it's ok");
        }
   }


    public boolean onTouchEvent(MotionEvent event){

        int action = event.getActionMasked();

        switch(action) {
            case (MotionEvent.ACTION_DOWN) :
                Log.d("1","" + event.getX() + "    -     " +event.getY());
                Log.d("1","Action was DOWN");
                if(event.getX() < 160 && event.getY() < 2550 && event.getY() > 2300) {
                    chiffreSelectionner = 1;
                } else if (event.getX() < 320 && event.getX() > 160 && event.getY() < 2550 && event.getY() > 2300) {
                    chiffreSelectionner = 2;
                } else if(event.getX() < 480 && event.getX() > 320 && event.getY() < 2550 && event.getY() > 2300) {
                    chiffreSelectionner = 3;
                } else if(event.getX() < 640 && event.getX() > 480 && event.getY() < 2550 && event.getY() > 2300) {
                    chiffreSelectionner = 4;
                } else if(event.getX() < 800 && event.getX() > 640 && event.getY() < 2550 && event.getY() > 2300) {
                    chiffreSelectionner = 5;
                } else if(event.getX() < 960 && event.getX() > 800 && event.getY() < 2550 && event.getY() > 2300) {
                    chiffreSelectionner = 6;
                } else if(event.getX() < 1120 && event.getX() > 960 && event.getY() < 2550 && event.getY() > 2300) {
                    chiffreSelectionner = 7;
                } else if(event.getX() < 1280 && event.getX() > 1120 && event.getY() < 2550 && event.getY() > 2300) {
                    chiffreSelectionner = 8;
                } else if(event.getX() < 1440 && event.getX() > 1280 && event.getY() < 2550 && event.getY() > 2300) {
                    chiffreSelectionner = 9;
                }
                Log.d("1","Chiffre = "+ chiffreSelectionner);
                return true;
            case (MotionEvent.ACTION_MOVE) :
                Log.d("2","Action was MOVE");
                return true;
            case (MotionEvent.ACTION_UP) :
                Log.d("1","" + event.getX() + "    -     " +event.getY());

                //First line
                if(event.getX() < 160 && event.getY() > 0 && event.getY() < 250) {
                    tabLigne1[0] = chiffreSelectionner;
                    Log.d("1","ligne 1: met "+chiffreSelectionner);
                } else if (event.getX() < 320 && event.getX() > 160 && event.getY() < 250 && event.getY() > 0) {
                    Log.d("1","ligne 1: met "+chiffreSelectionner);
                    tabLigne1[1] = chiffreSelectionner;
                } else if(event.getX() < 480 && event.getX() > 320 && event.getY() < 250 && event.getY() > 0) {
                    Log.d("1","ligne 1: met "+chiffreSelectionner);
                    chiffreSelectionner = 3;
                } else if(event.getX() < 640 && event.getX() > 480 && event.getY() < 250 && event.getY() > 0) {
                    Log.d("1","ligne 1: met "+chiffreSelectionner);
                    chiffreSelectionner = 4;
                } else if(event.getX() < 800 && event.getX() > 640 && event.getY() < 250 && event.getY() > 0) {
                    Log.d("1","ligne 1: met "+chiffreSelectionner);
                    chiffreSelectionner = 5;
                } else if(event.getX() < 960 && event.getX() > 800 && event.getY() < 250 && event.getY() > 0) {
                    Log.d("1","ligne 1: met "+chiffreSelectionner);
                    chiffreSelectionner = 6;
                } else if(event.getX() < 1120 && event.getX() > 960 && event.getY() < 250 && event.getY() > 0) {
                    Log.d("1","ligne 1: met "+chiffreSelectionner);
                    chiffreSelectionner = 7;
                } else if(event.getX() < 1280 && event.getX() > 1120 && event.getY() < 250 && event.getY() > 0) {
                    Log.d("1","ligne 1: met "+chiffreSelectionner);
                    chiffreSelectionner = 8;
                } else if(event.getX() < 1440 && event.getX() > 1280 && event.getY() < 250 && event.getY() > 0) {
                    Log.d("1","ligne 1: met "+chiffreSelectionner);
                    chiffreSelectionner = 9;
                }

                //Second line
                if(event.getX() < 160 && event.getY() < 500 && event.getY() > 250) {
                    Log.d("1","ligne 2: met "+chiffreSelectionner);
                } else if (event.getX() < 320 && event.getX() > 160 && event.getY() < 500 && event.getY() > 250) {
                    Log.d("1","ligne 2: met "+chiffreSelectionner);
                    tabLigne1[1] = chiffreSelectionner;
                } else if(event.getX() < 480 && event.getX() > 320 && event.getY() < 500&& event.getY() > 250) {
                    Log.d("1","ligne 2: met "+chiffreSelectionner);
                    chiffreSelectionner = 3;
                } else if(event.getX() < 640 && event.getX() > 480 && event.getY() < 500 && event.getY() > 250) {
                    Log.d("1","ligne 2: met "+chiffreSelectionner);
                    chiffreSelectionner = 4;
                } else if(event.getX() < 800 && event.getX() > 640 && event.getY() < 500 && event.getY() > 250) {
                    Log.d("1","ligne 2: met "+chiffreSelectionner);
                    chiffreSelectionner = 5;
                } else if(event.getX() < 960 && event.getX() > 800 && event.getY() < 500 && event.getY() > 250) {
                    Log.d("1","ligne 2: met "+chiffreSelectionner);
                    chiffreSelectionner = 6;
                } else if(event.getX() < 1120 && event.getX() > 960 && event.getY() < 500 && event.getY() > 250) {
                    Log.d("1","ligne 2: met "+chiffreSelectionner);
                    chiffreSelectionner = 7;
                } else if(event.getX() < 1280 && event.getX() > 1120 && event.getY() < 500 && event.getY() > 250) {
                    Log.d("1","ligne 2: met "+chiffreSelectionner);
                    chiffreSelectionner = 8;
                } else if(event.getX() < 1440 && event.getX() > 1280 && event.getY() < 500 && event.getY() > 250) {
                    Log.d("1","ligne 2: met "+chiffreSelectionner);
                    chiffreSelectionner = 9;
                }


                //Three line
                if(event.getX() < 160 && event.getY() < 750 && event.getY() > 500) {
                    Log.d("1","ligne 3: met "+chiffreSelectionner);
                } else if (event.getX() < 320 && event.getX() > 160 && event.getY() < 750 && event.getY() > 500) {
                    Log.d("1","ligne 3: met "+chiffreSelectionner);
                    tabLigne1[1] = chiffreSelectionner;
                } else if(event.getX() < 480 && event.getX() > 320 && event.getY() < 750 && event.getY() > 500) {
                    Log.d("1","ligne 3: met "+chiffreSelectionner);
                    chiffreSelectionner = 3;
                } else if(event.getX() < 640 && event.getX() > 480 && event.getY() < 750 && event.getY() > 500) {
                    Log.d("1","ligne 3: met "+chiffreSelectionner);
                    chiffreSelectionner = 4;
                } else if(event.getX() < 800 && event.getX() > 640 && event.getY() < 750 && event.getY() > 500) {
                    Log.d("1","ligne 3: met "+chiffreSelectionner);
                    chiffreSelectionner = 5;
                } else if(event.getX() < 960 && event.getX() > 800 && event.getY() < 750 && event.getY() > 500) {
                    Log.d("1","ligne 3: met "+chiffreSelectionner);
                    chiffreSelectionner = 6;
                } else if(event.getX() < 1120 && event.getX() > 960 && event.getY() < 750 && event.getY() > 500) {
                    Log.d("1","ligne 3: met "+chiffreSelectionner);
                    chiffreSelectionner = 7;
                } else if(event.getX() < 1280 && event.getX() > 1120 && event.getY() < 750 && event.getY() > 500) {
                    Log.d("1","ligne 3: met "+chiffreSelectionner);
                    chiffreSelectionner = 8;
                } else if(event.getX() < 1440 && event.getX() > 1280 && event.getY() < 750 && event.getY() > 500) {
                    Log.d("1","ligne 3: met "+chiffreSelectionner);
                    chiffreSelectionner = 9;
                }

                //Four line
                if(event.getX() < 160 && event.getY() < 1000 && event.getY() > 750) {
                    Log.d("1","ligne 4: met "+chiffreSelectionner);
                } else if (event.getX() < 320 && event.getX() > 160 && event.getY() < 1000 && event.getY() > 750) {
                    Log.d("1","ligne 4: met "+chiffreSelectionner);
                    tabLigne1[1] = chiffreSelectionner;
                } else if(event.getX() < 480 && event.getX() > 320 && event.getY() < 1000 && event.getY() > 750) {
                    Log.d("1","ligne 4: met "+chiffreSelectionner);
                    chiffreSelectionner = 3;
                } else if(event.getX() < 640 && event.getX() > 480 && event.getY() < 1000 && event.getY() > 750) {
                    Log.d("1","ligne 4: met "+chiffreSelectionner);
                    chiffreSelectionner = 4;
                } else if(event.getX() < 800 && event.getX() > 640 && event.getY() < 1000 && event.getY() > 750) {
                    Log.d("1","ligne 4: met "+chiffreSelectionner);
                    chiffreSelectionner = 5;
                } else if(event.getX() < 960 && event.getX() > 800 && event.getY() < 1000 && event.getY() > 750) {
                    Log.d("1","ligne 4: met "+chiffreSelectionner);
                    chiffreSelectionner = 6;
                } else if(event.getX() < 1120 && event.getX() > 960 && event.getY() < 1000 && event.getY() > 750) {
                    Log.d("1","ligne 4: met "+chiffreSelectionner);
                    chiffreSelectionner = 7;
                } else if(event.getX() < 1280 && event.getX() > 1120 && event.getY() < 1000 && event.getY() > 750) {
                    Log.d("1","ligne 4: met "+chiffreSelectionner);
                    chiffreSelectionner = 8;
                } else if(event.getX() < 1440 && event.getX() > 1280 && event.getY() < 1000 && event.getY() > 750) {
                    Log.d("1","ligne 4: met "+chiffreSelectionner);
                    chiffreSelectionner = 9;
                }

                //Five line
                if(event.getX() < 160 && event.getY() < 1250 && event.getY() > 1000) {
                    Log.d("1","ligne 5: met "+chiffreSelectionner);
                } else if (event.getX() < 320 && event.getX() > 160 && event.getY() < 1250 && event.getY() > 1000) {
                    Log.d("1","ligne 5: met "+chiffreSelectionner);
                    tabLigne1[1] = chiffreSelectionner;
                } else if(event.getX() < 480 && event.getX() > 320 && event.getY() < 1250 && event.getY() > 1000) {
                    Log.d("1","ligne 5: met "+chiffreSelectionner);
                    chiffreSelectionner = 3;
                } else if(event.getX() < 640 && event.getX() > 480 && event.getY() < 1250 && event.getY() > 1000) {
                    Log.d("1","ligne 5: met "+chiffreSelectionner);
                    chiffreSelectionner = 4;
                } else if(event.getX() < 800 && event.getX() > 640 && event.getY() < 1250 && event.getY() > 1000) {
                    Log.d("1","ligne 5: met "+chiffreSelectionner);
                    chiffreSelectionner = 5;
                } else if(event.getX() < 960 && event.getX() > 800 && event.getY() < 1250 && event.getY() > 1000) {
                    Log.d("1","ligne 5: met "+chiffreSelectionner);
                    chiffreSelectionner = 6;
                } else if(event.getX() < 1120 && event.getX() > 960 && event.getY() < 1250 && event.getY() > 1000) {
                    Log.d("1","ligne 5: met "+chiffreSelectionner);
                    chiffreSelectionner = 7;
                } else if(event.getX() < 1280 && event.getX() > 1120 && event.getY() < 1250 && event.getY() > 1000) {
                    Log.d("1","ligne 5: met "+chiffreSelectionner);
                    chiffreSelectionner = 8;
                } else if(event.getX() < 1440 && event.getX() > 1280 && event.getY() < 1250 && event.getY() > 1000) {
                    Log.d("1","ligne 5: met "+chiffreSelectionner);
                    chiffreSelectionner = 9;
                }

                //Six line
                if(event.getX() < 160 && event.getY() < 1500 && event.getY() > 1250) {
                    Log.d("1","ligne 6: met "+chiffreSelectionner);
                } else if (event.getX() < 320 && event.getX() > 160 && event.getY() < 1500 && event.getY() > 1250) {
                    Log.d("1","ligne 6: met "+chiffreSelectionner);
                    tabLigne1[1] = chiffreSelectionner;
                } else if(event.getX() < 480 && event.getX() > 320 && event.getY() < 1500 && event.getY() > 1250) {
                    Log.d("1","ligne 6: met "+chiffreSelectionner);
                    chiffreSelectionner = 3;
                } else if(event.getX() < 640 && event.getX() > 480 && event.getY() < 1500 && event.getY() > 1250) {
                    Log.d("1","ligne 6: met "+chiffreSelectionner);
                    chiffreSelectionner = 4;
                } else if(event.getX() < 800 && event.getX() > 640 && event.getY() < 1500 && event.getY() > 1250) {
                    Log.d("1","ligne 6: met "+chiffreSelectionner);
                    chiffreSelectionner = 5;
                } else if(event.getX() < 960 && event.getX() > 800 && event.getY() < 1500 && event.getY() > 1250) {
                    Log.d("1","ligne 6: met "+chiffreSelectionner);
                    chiffreSelectionner = 6;
                } else if(event.getX() < 1120 && event.getX() > 960 && event.getY() < 1500 && event.getY() > 1250) {
                    Log.d("1","ligne 6: met "+chiffreSelectionner);
                    chiffreSelectionner = 7;
                } else if(event.getX() < 1280 && event.getX() > 1120 && event.getY() < 1500 && event.getY() > 1250) {
                    Log.d("1","ligne 6: met "+chiffreSelectionner);
                    chiffreSelectionner = 8;
                } else if(event.getX() < 1440 && event.getX() > 1280 && event.getY() < 1500 && event.getY() > 1250) {
                    Log.d("1","ligne 6: met "+chiffreSelectionner);
                    chiffreSelectionner = 9;
                }

                //Seven line
                if(event.getX() < 160 && event.getY() < 1750 && event.getY() > 1500) {
                    Log.d("1","ligne 7: met "+chiffreSelectionner);
                } else if (event.getX() < 320 && event.getX() > 160 && event.getY() < 1750 && event.getY() > 1500) {
                    Log.d("1","ligne 7: met "+chiffreSelectionner);
                    tabLigne1[1] = chiffreSelectionner;
                } else if(event.getX() < 480 && event.getX() > 320 && event.getY() < 1750 && event.getY() > 1500) {
                    Log.d("1","ligne 7: met "+chiffreSelectionner);
                    chiffreSelectionner = 3;
                } else if(event.getX() < 640 && event.getX() > 480 && event.getY() < 1750 && event.getY() > 1500) {
                    Log.d("1","ligne 7: met "+chiffreSelectionner);
                    chiffreSelectionner = 4;
                } else if(event.getX() < 800 && event.getX() > 640 && event.getY() < 1750 && event.getY() > 1500) {
                    Log.d("1","ligne 7: met "+chiffreSelectionner);
                    chiffreSelectionner = 5;
                } else if(event.getX() < 960 && event.getX() > 800 && event.getY() < 1750 && event.getY() > 1500) {
                    Log.d("1","ligne 7: met "+chiffreSelectionner);
                    chiffreSelectionner = 6;
                } else if(event.getX() < 1120 && event.getX() > 960 && event.getY() < 1750 && event.getY() > 1500) {
                    Log.d("1","ligne 7: met "+chiffreSelectionner);
                    chiffreSelectionner = 7;
                } else if(event.getX() < 1280 && event.getX() > 1120 && event.getY() < 1750 && event.getY() > 1500) {
                    Log.d("1","ligne 7: met "+chiffreSelectionner);
                    chiffreSelectionner = 8;
                } else if(event.getX() < 1440 && event.getX() > 1280 && event.getY() < 1750 && event.getY() > 1500) {
                    Log.d("1","ligne 7: met "+chiffreSelectionner);
                    chiffreSelectionner = 9;
                }

                //Height line
                if(event.getX() < 160 && event.getY() < 2000 && event.getY() > 1750) {
                    Log.d("1","ligne 8: met "+chiffreSelectionner);
                } else if (event.getX() < 320 && event.getX() > 160 && event.getY() < 2000 && event.getY() > 1750) {
                    Log.d("1","ligne 8: met "+chiffreSelectionner);
                    tabLigne1[1] = chiffreSelectionner;
                } else if(event.getX() < 480 && event.getX() > 320 && event.getY() < 2000 && event.getY() > 1750) {
                    Log.d("1","ligne 8: met "+chiffreSelectionner);
                    chiffreSelectionner = 3;
                } else if(event.getX() < 640 && event.getX() > 480 && event.getY() < 2000 && event.getY() > 1750) {
                    Log.d("1","ligne 8: met "+chiffreSelectionner);
                    chiffreSelectionner = 4;
                } else if(event.getX() < 800 && event.getX() > 640 && event.getY() < 2000 && event.getY() > 1750) {
                    Log.d("1","ligne 8: met "+chiffreSelectionner);
                    chiffreSelectionner = 5;
                } else if(event.getX() < 960 && event.getX() > 800 && event.getY() < 2000 && event.getY() > 1750) {
                    Log.d("1","ligne 8: met "+chiffreSelectionner);
                    chiffreSelectionner = 6;
                } else if(event.getX() < 1120 && event.getX() > 960 && event.getY() < 2000 && event.getY() > 1750) {
                    Log.d("1","ligne 8: met "+chiffreSelectionner);
                    chiffreSelectionner = 7;
                } else if(event.getX() < 1280 && event.getX() > 1120 && event.getY() < 2000 && event.getY() > 1750) {
                    Log.d("1","ligne 8: met "+chiffreSelectionner);
                    chiffreSelectionner = 8;
                } else if(event.getX() < 1440 && event.getX() > 1280 && event.getY() < 2000 && event.getY() > 1750) {
                    Log.d("1","ligne 8: met "+chiffreSelectionner);
                    chiffreSelectionner = 9;
                }

                //Nine line
                if(event.getX() < 160 && event.getY() < 2500 && event.getY() > 2000) {
                    Log.d("1","ligne 9: met "+chiffreSelectionner);
                } else if (event.getX() < 320 && event.getX() > 160 && event.getY() < 2500 && event.getY() > 2000) {
                    Log.d("1","ligne 9: met "+chiffreSelectionner);
                    tabLigne1[1] = chiffreSelectionner;
                } else if(event.getX() < 480 && event.getX() > 320 && event.getY() < 2500 && event.getY() > 2000) {
                    Log.d("1","ligne 9: met "+chiffreSelectionner);
                    chiffreSelectionner = 3;
                } else if(event.getX() < 640 && event.getX() > 480 && event.getY() < 2500 && event.getY() > 2000) {
                    Log.d("1","ligne 9: met "+chiffreSelectionner);
                    chiffreSelectionner = 4;
                } else if(event.getX() < 800 && event.getX() > 640 && event.getY() < 2500 && event.getY() > 2000) {
                    Log.d("1","ligne 9: met "+chiffreSelectionner);
                    chiffreSelectionner = 5;
                } else if(event.getX() < 960 && event.getX() > 800 && event.getY() < 2500 && event.getY() > 2000) {
                    Log.d("1","ligne 9: met "+chiffreSelectionner);
                    chiffreSelectionner = 6;
                } else if(event.getX() < 1120 && event.getX() > 960 && event.getY() < 2500 && event.getY() > 2000) {
                    Log.d("1","ligne 9: met "+chiffreSelectionner);
                    chiffreSelectionner = 7;
                } else if(event.getX() < 1280 && event.getX() > 1120 && event.getY() < 2500 && event.getY() > 2000) {
                    Log.d("1","ligne 9: met "+chiffreSelectionner);
                    chiffreSelectionner = 8;
                } else if(event.getX() < 1440 && event.getX() > 1280 && event.getY() < 2500 && event.getY() > 2000) {
                    Log.d("1","ligne 9: met "+chiffreSelectionner);
                    chiffreSelectionner = 9;
                }


                Log.d("3","Action was UP");
                return true;
            case (MotionEvent.ACTION_CANCEL) :
                Log.d("4","Action was CANCEL");
                return true;
            case (MotionEvent.ACTION_OUTSIDE) :
                Log.d("5","Movement occurred outside bounds " +
                        "of current screen element");
                return true;
            default :
                return super.onTouchEvent(event);
        }
    }

}
