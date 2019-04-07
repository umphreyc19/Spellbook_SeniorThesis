package com.example.zx.spellbook;

import android.support.v7.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONObject;
import android.content.Context;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import java.io.InputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


public class Database extends AppCompatActivity{

    private static final String API_BASE_URL = "https://db.ygoprodeck.com/api/v4/cardinfo.php";
    private AsyncHttpClient client;

    public Database() {
        this.client = new AsyncHttpClient();
    }

    private String getApiUrl(String relativeUrl) {
        return API_BASE_URL + relativeUrl;
    }

    // Method for accessing the search API
    public void getBooks(final String query, JsonHttpResponseHandler handler) {
        try {
            String url = getApiUrl("search.json?q=");
            client.get(url + URLEncoder.encode(query, "utf-8"), handler);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


}
