package com.example.sesi2trainingmobile;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NbaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NbaFragment extends Fragment {

    private ActivityMainBinding mBinding;
    private MainViewModel mMainViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_nba, container, false);
        // Inflate the layout for this fragment
        return v;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mMainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        mMainViewModel.callApi();




        mBinding.rvNbaTeams.setLayoutManager(new LinearLayoutManager(this));
        mMainViewModel.getNbaTeamItems().observe(this, nbaTeamItems -> {
            mBinding.rvNbaTeams.setAdapter(new NbaTeamAdaptor(nbaTeamItems));
        });
}