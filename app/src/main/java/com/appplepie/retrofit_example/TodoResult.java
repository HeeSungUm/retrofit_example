package com.appplepie.retrofit_example;


import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

public class TodoResult {
    @SerializedName("userId")
    private String userId;
    //key 값과 변수명이 일치하지 않다면 @SerializedName 으로 응답 데이터의 key 와 변수명 일치

    private String id;

    private String title;

    private Boolean completed;

    @NonNull
    @Override
    public String toString() {
        return title;
    }
}
