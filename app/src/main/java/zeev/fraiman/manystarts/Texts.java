package zeev.fraiman.manystarts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class Texts extends AppCompatActivity {

    TextView tvTTS;
    Context context;
    String[] texts={"","Five","Four","Three","Two","One","Start"};
    TextToSpeech textToSpeech;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texts);

        tvTTS=findViewById(R.id.tvTTS);

        textToSpeech=new TextToSpeech(getApplicationContext(),
                new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status==TextToSpeech.SUCCESS)  {
                            int lang=textToSpeech.setLanguage(Locale.ENGLISH);
                        }
                    }
                });

        CountDownTimer cdt=new CountDownTimer(7000, 1000) {
            @Override
            public void onTick(long l) {
                tvTTS.setText(texts[i]);
                int speech=textToSpeech.speak(texts[i], TextToSpeech.QUEUE_FLUSH,null);
                i++;
            }

            @Override
            public void onFinish() {
                finish();
            }
        }.start();
    }
}