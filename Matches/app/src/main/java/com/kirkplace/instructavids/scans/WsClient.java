package com.kirkplace.instructavids.scans;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import java.io.BufferedInputStream;

/**
 * Created by kirkplace on 1/25/2015.
 */
public class WsClient {

    private InputStream input;
    private HttpURLConnection con;

    public void WsClient(URL url){
        try {
            con = (HttpURLConnection) url.openConnection();
            input = new BufferedInputStream(con.getInputStream());
        }catch(Exception e){

        }
    }

    public String getAttribute(){
        return "string";
    }
}
