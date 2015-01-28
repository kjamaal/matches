package com.kirkplace.instructavids.scans;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class YouTubePlayerActivity extends YouTubeBaseActivity implements
        YouTubePlayer.OnInitializedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.youtube_player);

        YouTubePlayerView youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_player_view);
        youTubeView.initialize(DeveloperKey.DEVELOPER_KEY, this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player,
                                        boolean wasRestored) {
        try{
            if (!wasRestored) {
                Intent intent = getIntent();
                player.cueVideo(intent.getStringExtra(MainActivity.VIDEO_ID));
            }
        }
        catch(Exception e){
            //do nothing probably device go rotated
            return;
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider,
                                        YouTubeInitializationResult errorReason) {
       /*TextView txtYTPlayer = (TextView)findViewById(R.id.youTube_text);
       txtYTPlayer.setText(errorReason.name().toString());*/
    }

}
