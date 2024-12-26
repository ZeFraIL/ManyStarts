package zeev.fraiman.manystarts;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button bBeeps, bPics, bTexts, bVideo, bBIA;
    Intent go;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context=MainActivity.this;

        bBeeps=findViewById(R.id.bBeeps);
        bBeeps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                go=new Intent(context, Beeps.class);
                startActivity(go);
            }
        });

        bPics=findViewById(R.id.bPics);
        bPics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                go=new Intent(context, Pictures.class);
                startActivity(go);
            }
        });

        bTexts=findViewById(R.id.bTexts);
        bTexts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                go=new Intent(context, Texts.class);
                startActivity(go);
            }
        });

        bVideo=findViewById(R.id.bVideo);
        bVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                go=new Intent(context, Video.class);
                startActivity(go);
            }
        });

        bBIA=findViewById(R.id.bBIA);
        bBIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                go=new Intent(context, BuildInAnimate.class);
                startActivity(go);
            }
        });
    }
}