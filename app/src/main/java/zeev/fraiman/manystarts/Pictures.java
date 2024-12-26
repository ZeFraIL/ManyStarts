package zeev.fraiman.manystarts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;

public class Pictures extends AppCompatActivity {

    Context context;
    int[] pics={R.drawable.f5,R.drawable.f4,R.drawable.f3,R.drawable.f2,R.drawable.f1};
    ImageView ivPics;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pictures);

        context=Pictures.this;
        ivPics=findViewById(R.id.ivPics);


        CountDownTimer cdt=new CountDownTimer(6000, 1000) {
            @Override
            public void onTick(long l) {
                if (i==0)  {
                    ivPics.setVisibility(View.VISIBLE);
                    ivPics.setImageResource(pics[i]);
                }
                else
                    ivPics.setImageResource(pics[i]);
                i++;
            }

            @Override
            public void onFinish() {
                finish();
            }
        }.start();
    }
}