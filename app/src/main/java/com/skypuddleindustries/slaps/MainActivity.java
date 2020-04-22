package com.skypuddleindustries.slaps;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}



//unsure where this should go...

public class MediaPlayerService extends Service implements MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnInfoListener, MediaPlayer.OnBufferingUpdateListener,

        AudioManager.OnAudioFocusChangeListener {


    // Binder given to clients
    private final IBinder iBinder = new LocalBinder();

    @Override
    public IBinder onBind(Intent intent) {
        return iBinder;
    }

    @Override
    public void onBufferingUpdate(MediaPlayer mp, int percent) {
        //Invoked indicating buffering status of a media resource being streamed over the network
    }

    @Override
    public void onCompleteion(MediaPlayer mp) {
        //invoked when playback of media source has completed
    }

    //Handle errors
    @Override
    public boolean onError(MediaPlayer mp, int what, int extra) {
        //invoked when there has been an error during an asynchronous operation
        return false;
    }

    @Override
    public boolean onInfo(MediaPlayer mp, int what, int extra) {
        //Invoked to comminucate some info
        return false;
    }

    @Override
    public void onPrepared(MediaPlayer mp) {
        //invoked when the media source is ready for playback
    }

    @Override
    public void onSeekComplete(MediaPlayer mp) {
        //invoked indicated the completeion of a seek operation
    }

    @Override
    public void onAudioFocusChange(int focusChange) {
        //invoked when the audio focus of the system is updated
    }

    public class LocalBinder extends Binder {
        public MediaPlayerService getService() {
            return MediaPlayerService.this;
        }
    }
}
