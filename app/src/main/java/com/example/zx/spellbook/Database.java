package com.example.zx.spellbook;

import android.app.Activity;

import android.content.res.AssetManager;
import android.os.Bundle;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.content.Context;
import android.util.Log;
import android.widget.ListView;


import java.io.InputStream;
import java.io.IOException;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import com.example.zx.spellbook.Card;


public class Database extends Activity{

    public static String AssetJSONFile (String filename, Context context) throws IOException {
        AssetManager manager = context.getAssets();
        InputStream file = manager.open(filename);
        byte[] formArray = new byte[file.available()];
        file.read(formArray);
        file.close();

        return new String(formArray);
    }





    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = Database.this.getAssets().open("response.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }

        return json;
    }

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        ListView databaseView = findViewById(R.id.listDatabase);








        try {
            JSONArray obj = new JSONArray(loadJSONFromAsset());
            Log.d("Length", Integer.toString(obj.length()));
            ArrayList<HashMap<String, String>> formList = new ArrayList<HashMap<String, String>>();
            HashMap<String, String> m_li;

            for (int i = 0; i < obj.length(); i++) {
                JSONObject jo_inside = obj.getJSONObject(i);
                String id_value = jo_inside.getString("id");
                String name_value = jo_inside.getString("name");
                String type_value = jo_inside.getString("type");
                String desc_value = jo_inside.getString("desc");
                String race_value = jo_inside.getString("race");
                String set_tag_value = jo_inside.getString("set_tag");
                String image_url_small = jo_inside.getString("image_url_small");
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
                m_li.put("setcode",setcode_value);

                formList.add(m_li);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }





}
