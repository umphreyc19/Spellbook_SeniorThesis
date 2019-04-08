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
import com.squareup.moshi.Json;


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




    public class Card {

        @Json(name = "id")
        private String id;
        @Json(name = "name")
        private String name;
        @Json(name = "type")
        private String type;
        @Json(name = "desc")
        private String desc;
        @Json(name = "race")
        private String race;
        @Json(name = "set_tag")
        private String setTag;
        @Json(name = "setcode")
        private String setcode;
        @Json(name = "image_url")
        private String imageUrl;
        @Json(name = "image_url_small")
        private String imageUrlSmall;
        @Json(name = "atk")
        private String atk;
        @Json(name = "def")
        private String def;
        @Json(name = "level")
        private String level;
        @Json(name = "attribute")
        private String attribute;
        @Json(name = "scale")
        private String scale;
        @Json(name = "archetype")
        private String archetype;
        @Json(name = "linkval")
        private String linkval;
        @Json(name = "linkmarkers")
        private String linkmarkers;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getRace() {
            return race;
        }

        public void setRace(String race) {
            this.race = race;
        }

        public String getSetTag() {
            return setTag;
        }

        public void setSetTag(String setTag) {
            this.setTag = setTag;
        }

        public String getSetcode() {
            return setcode;
        }

        public void setSetcode(String setcode) {
            this.setcode = setcode;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getImageUrlSmall() {
            return imageUrlSmall;
        }

        public void setImageUrlSmall(String imageUrlSmall) {
            this.imageUrlSmall = imageUrlSmall;
        }

        public String getAtk() {
            return atk;
        }

        public void setAtk(String atk) {
            this.atk = atk;
        }

        public String getDef() {
            return def;
        }

        public void setDef(String def) {
            this.def = def;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getAttribute() {
            return attribute;
        }

        public void setAttribute(String attribute) {
            this.attribute = attribute;
        }

        public String getScale() {
            return scale;
        }

        public void setScale(String scale) {
            this.scale = scale;
        }

        public String getArchetype() {
            return archetype;
        }

        public void setArchetype(String archetype) {
            this.archetype = archetype;
        }

        public String getLinkval() {
            return linkval;
        }

        public void setLinkval(String linkval) {
            this.linkval = linkval;
        }

        public String getLinkmarkers() {
            return linkmarkers;
        }

        public void setLinkmarkers(String linkmarkers) {
            this.linkmarkers = linkmarkers;
        }

    }





}
