package com.example.mcs.ostmoderncode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerAdapter adapter;
    private List<Show> shows;
    private ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);

        Call<List<Show>> call = apiInterface.getShows();

        call.enqueue(new Callback<List<Show>>() {
            @Override
            public void onResponse(Call<List<Show>> call, Response<List<Show>> response) {

                shows = response.body();
                adapter = new RecyclerAdapter(shows);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Show>> call, Throwable t) {

            }
        });
    }
}
