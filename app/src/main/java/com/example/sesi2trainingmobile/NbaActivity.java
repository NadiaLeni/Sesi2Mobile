package com.example.sesi2trainingmobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;



import com.example.sesi2trainingmobile.databinding.ActivityNbaBinding;
import com.example.viewmodel.MainViewModel;

public class NbaActivity extends AppCompatActivity {

    private ActivityNbaBinding mBinding;

    private MainViewModel mMainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = ActivityNbaBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mMainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        mMainViewModel.callApi();


        mBinding.rvNbaTeams.setLayoutManager(new LinearLayoutManager(this));
        mMainViewModel.getNbaTeamItems().observe(this, nbaTeamItems -> {
            mBinding.rvNbaTeams.setAdapter(new NbaTeamAdaptor(nbaTeamItems));
        });
    }
}