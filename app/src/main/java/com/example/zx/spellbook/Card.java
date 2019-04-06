package com.example.zx.spellbook;

import com.squareup.moshi.Json;

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