package zeev.fraiman.manystarts;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Beeps extends AppCompatActivity {

    Context context;
    CountDownTimer cdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_beeps);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        context=Beeps.this;

        CountDownTimer cdt=new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long l) {
                MediaPlayer mp=MediaPlayer.create(context, R.raw.beep);
                mp.start();
            }

            @Override
            public void onFinish() {
                finish();
            }
        }.start();
    }
}