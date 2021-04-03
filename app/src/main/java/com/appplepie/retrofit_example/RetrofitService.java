package com.appplepie.retrofit_example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RetrofitService {
    @GET("/todos/{post}") //base url을 제외한 uri ex) https://jsonplaceholder.typicode.com/todos/{post} 에서 가져옴 {post}는 변수
    Call<PostResult> getPosts(@Path("post") String post);
}
