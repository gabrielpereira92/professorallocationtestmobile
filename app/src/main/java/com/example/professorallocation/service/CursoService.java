package com.example.professorallocation.service;


import com.example.professorallocation.model.Curso;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface CursoService {

    @GET("course")
    Call<List<Curso>> getAllCurso();

    @GET("course")
    Call<Curso> getCurso();

    @POST("course")
    void insert();
}
