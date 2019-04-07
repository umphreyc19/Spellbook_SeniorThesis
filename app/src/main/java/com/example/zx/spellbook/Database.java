package com.example.zx.spellbook;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.content.Context;
import android.util.Log;
import android.widget.ListView;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import java.io.InputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;


public class Database extends Activity {

    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = Database.this.getAssets().open("response.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        try {
            JSONObject obj = new JSONObject(loadJSONFromAsset());
            JSONArray m_jArry = obj.getJSONArray("response");
            ArrayList<HashMap<String, String>> formList = new ArrayList<HashMap<String, String>>();
            HashMap<String, String> m_li;

            for (int i = 0; i < m_jArry.length(); i++) {
                JSONObject jo_inside = m_jArry.getJSONObject(i);
                Log.d("Details-->", jo_inside.getString("response"));
                String id_value = jo_inside.getString("id");
                String name_value = jo_inside.getString("name");
                String type_value = jo_inside.getString("type");
                String desc_value = jo_inside.getString("desc");
                String race_value = jo_inside.getString("race");
                String set_tag_value = jo_inside.getString("set_tag");
                String image_url_small = jo_inside.getString("image_url_small");
                String atk_value = jo_inside.getString("atk");
                String def_value = jo_inside.getString("def");
                String level_value = jo_inside.getString("level");
                String attribute_value = jo_inside.getString("attribute");
                String setcode_value = jo_inside.getString("setcode");

                //Add your values in your `ArrayList` as below:
                m_li = new HashMap<String, String>();
                m_li.put("name", id_value);
                m_li.put("url", name_value);
                m_li.put("type", type_value);
                m_li.put("desc", desc_value);
                m_li.put("race", race_value);
                m_li.put("set_tag", set_tag_value);
                m_li.put("image_url", image_url_small);
                m_li.put("atk", atk_value);
                m_li.put("def", def_value);
                m_li.put("level", level_value);
                m_li.put("attribute", attribute_value);
                m_li.put("setcode",setcode_value);

                formList.add(m_li);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }




}
