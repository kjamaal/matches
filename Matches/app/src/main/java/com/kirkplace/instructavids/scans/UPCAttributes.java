package com.kirkplace.instructavids.scans;


import android.support.annotation.NonNull;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by kirkplace on 1/25/2015.
 */
public final class UPCAttributes {

    private static String videoID;
    private static URL url;
    {
        try {
            url = new URL("url");
        } catch (MalformedURLException e) {
            //handle exception
        }
    }
    private static WsClient ws = new WsClient(url);

    private void UPCAttributes(){

    }

    public static String getVideoID(String upc){
        setVideoID(upc);
        return videoID;
    }

    private static void setVideoID(String upc){
        //ws calls
        videoID = ;
    }
}
