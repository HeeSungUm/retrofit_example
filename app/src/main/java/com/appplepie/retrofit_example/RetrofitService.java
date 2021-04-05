package com.appplepie.retrofit_example;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RetrofitService {
    @GET("/todos/{todo}") //base url을 제외한 uri ex) https://jsonplaceholder.typicode.com/todos/{post} 에서 가져옴 {todo}는 변수
    Call<TodoResult> getTodos(@Path("todo") String todo);

    @POST("/todos")
    Call<TodoPostResult> postTodos(@Body TodoPostResult todoPostResult);
}
