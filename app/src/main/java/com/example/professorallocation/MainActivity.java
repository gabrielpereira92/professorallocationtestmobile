package com.example.professorallocation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.professorallocation.model.Curso;
import com.example.professorallocation.repository.RetrofitConfig;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    List<Curso> listCurso;
    private ArrayAdapter<Curso> gerenciador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listCurso = new ArrayList<>();
        gerenciador = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, listCurso);
        ListView view = findViewById(R.id.lv_lista);

        view.setAdapter(gerenciador);

        RetrofitConfig retrofitConfig = new RetrofitConfig();
        Call<List<Curso>> call =  retrofitConfig.getCursoService().getAllCurso();
        call.enqueue(new Callback<List<Curso>>() {
            @Override
            public void onResponse(Call<List<Curso>> call, Response<List<Curso>> response) {

                listCurso =  response.body();
                gerenciador.notifyDataSetChanged();

            }

            @Override
            public void onFailure(Call<List<Curso>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Sua Request Falhou", Toast.LENGTH_LONG).show();
            }
        });


    }
}