package com.example.firebaseuploadexample;

public class Upload {
    private String mName, mImageUrl;

    public Upload(){
        //empty contructor needed
    }

    public Upload(String name, String imageUrl){
        if(name.trim().equals("")){
            name = "No Name";
        }


        mName = name;
        mImageUrl = imageUrl;
    }
    public String getmName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }




}
