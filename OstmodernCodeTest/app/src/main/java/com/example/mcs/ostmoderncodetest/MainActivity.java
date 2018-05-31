package com.example.mcs.ostmoderncodetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.mcs.ostmoderncodetest.adapter.AnswerAdapter;
import com.example.mcs.ostmoderncodetest.data.model.OstmodernResponse;
import com.example.mcs.ostmoderncodetest.data.remote.ApiUtils;
import com.example.mcs.ostmoderncodetest.data.remote.OstmodernService;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;

//import android.support.v7.widget.DividerObjectDecoration;

public class MainActivity extends AppCompatActivity {
    private AnswerAdapter mAdapter;
    private RecyclerView mRecyclerView;
    private OstmodernService mService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mService = ApiUtils.getOsternService();
        mRecyclerView = (RecyclerView)findViewById(R.id.recycler);
        mAdapter = new AnswerAdapter(this, new ArrayList<Object>(0), new AnswerAdapter.PostObjectListener() {
            @Override
            public void onPostClick(int tempId) {
                Toast.makeText(MainActivity.this, "Post id is: " + tempId, Toast.LENGTH_SHORT).show();
            }
        });

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        mRecyclerView.addItemDecoration(itemDecoration);

        loadAnswers();
    }

    public void loadAnswers() {
        mService.getObjects().enqueue(new Callback<OstmodernResponse>() {
            @Override
            public void onResponse(Call<OstmodernResponse> call, retrofit2.Response<OstmodernResponse> response) {
                if (response.isSuccessful())
                {
                    mAdapter.updateAnswers(response.body().getObjects());

                }

            }

            @Override
            public void onFailure(Call<OstmodernResponse> call, Throwable t) {

                showErrorMessage();

            }


        });
    }

    public void showErrorMessage(){
        Toast.makeText(this, "Error loading posts", Toast.LENGTH_SHORT).show();
    }
}
