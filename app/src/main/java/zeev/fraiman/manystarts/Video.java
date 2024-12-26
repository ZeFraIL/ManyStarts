package zeev.fraiman.manystarts;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.VideoView;

public class Video extends AppCompatActivity {

    VideoView vivi;
    CheckBox chbVideo;
    private int idVideo;
    private String uriPATH;
    private Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        vivi=findViewById(R.id.vivi);
        chbVideo=findViewById(R.id.chbVideo);

        chbVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chbVideo.isChecked())  {
                    vivi.setVisibility(View.VISIBLE);
                    idVideo=R.raw.welcome;
                    uriPATH="android.resource://"+getPackageName()+"/"+idVideo;
                    uri= Uri.parse(uriPATH);
                    vivi.setVideoURI(uri);
                    vivi.start();
                }
                if (!chbVideo.isChecked()) {
                    vivi.stopPlayback();
                    vivi.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}