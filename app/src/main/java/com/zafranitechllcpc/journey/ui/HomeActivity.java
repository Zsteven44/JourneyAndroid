package com.zafranitechllcpc.journey.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.zafranitechllcpc.journey.R;

import butterknife.BindView;

public class HomeActivity extends AppCompatActivity {
    @BindView(R.id.rv_journey_list)
    RecyclerView rvJourneys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    private void setupRecyclerView() {

    }


}
