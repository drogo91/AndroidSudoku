package com.sudoku.sudoku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(),Main2Activity.class));
           /* if you want to finish the first activity then just call
            finish(); */
            }
        });

        final Button button2=(Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(),Main2Activity.class));

            }
        });


        final MainActivity lecontext = this;
        button2.setOnClickListener((new Button.OnClickListener(){
            public void onClick(View V) {
                Intent defineIntent = new Intent(lecontext, Main2Activity.class);
                Bundle objetbunble = new Bundle();

                objetbunble.putString("passInfo",button2.getText().toString());
                defineIntent.putExtras(objetbunble);
                lecontext.startActivity(defineIntent);
            }
        }));

    }


}
