package com.example.sadic.retrofitapp;

public class Album {

    String albumId, id, title, imgUrl, thumUrl;

    public Album(String albumId, String id, String title, String imgUrl, String thumUrl) {
        this.albumId = albumId;
        this.id = id;
        this.title = title;
        this.imgUrl = imgUrl;
        this.thumUrl = thumUrl;
    }

    public Album() {
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getThumUrl() {
        return thumUrl;
    }

    public void setThumUrl(String thumUrl) {
        this.thumUrl = thumUrl;
    }
}
