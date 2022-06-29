package com.example.sesi2trainingmobile;

import android.hardware.lights.LightState;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.data.remote.NbaTeamItem;

import java.util.List;

public class NbaTeamAdaptor extends RecyclerView.Adapter<NbaTeamAdaptor.ViewHolder> {

    private final List<NbaTeamItem> nbaTeamItems;
    public NbaTeamAdaptor(List<NbaTeamItem> nbaTeamItems){
        this.nbaTeamItems = nbaTeamItems;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemNbaTeamBinding binding = ItemNbaTeamBinding.inflate(LayoutInflater.from(parent.getContext()), parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(nbaTeamItems.get(position));
    }

    @Override
    public int getItemCount() {
        return nbaTeamItems.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        ItemNbaTeamBinding binding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
