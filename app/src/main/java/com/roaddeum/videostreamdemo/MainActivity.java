package com.roaddeum.videostreamdemo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;

    //TODO: replace with your own URL
    String videoURL = "rtsp://r6---sn-vgqskn7e.googlevideo.com/Cj0LENy73wIaNAlEAMuYSpBa8hMYDSANFC3LTLlZMOCoAUIASARg3fjl5eGI09xZigELSEZQMWJsdko3RGcM/271CBD237D3C114A1C351DAEC078BFE00276469C.B7DA05438ED48728C3E1BBD2EFD7997554054C82/yt6/1/video.3gp";//"rtsp://r1---sn-vgqsrn7l.googlevideo.com/Cj0LENy73wIaNAkzdpODL4608hMYDSANFC24tmJZMOCoAUIASARg94TKnsHc_ppYigELVzNVbk9YbUxLZWMM/4D8ACA609949F6D08A31055A8ACEB3305810CCEE.B8E1A9C460F74958E23ACFFE66F2044FEF3426DF/yt6/1/video.3gp";
    Uri videoUri = Uri.parse(videoURL);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = (VideoView)findViewById(R.id.video_view);
        videoView.setVideoURI(videoUri);
        videoView.start();
    }
}

