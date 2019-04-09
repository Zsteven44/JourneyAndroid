package com.zafranitechllcpc.journey.ui.misc;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.CircularProgressDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.zafranitechllcpc.journey.R;
import com.zafranitechllcpc.journey.models.Journey;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class JourneyAdapter extends RecyclerView.Adapter<JourneyAdapter.ViewHolder> {

    private List<Journey> journeyList;
    private Context context;

    public JourneyAdapter(@Nullable final List<Journey> journeyList,
                          @NonNull final Context context) {
        this.context = context;
        this.journeyList = journeyList;
    }

    @NonNull
    @Override
    public JourneyAdapter.ViewHolder onCreateViewHolder(@NonNull final ViewGroup parent,
                                                        final int viewType) {
        final View view = LayoutInflater.from(context).inflate(R.layout.item_journey_main, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder,
                                 final int position) {
        final Journey journey = journeyList.get(position);
        final String journeyImagePath = " ";
        Glide.with(context)
                .load(journeyImagePath)
                .centerCrop()
                .placeholder(createProgressDrawable())
                .into(holder.ivPlaceImage);
        holder.tvName.setText(journey.getName());
    }

    @Override
    public int getItemCount() {
        return journeyList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_journey_profile)
        ImageView ivPlaceImage;

        @BindView(R.id.tv_journey_name)
        TextView tvName;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    private CircularProgressDrawable createProgressDrawable() {
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(context);
        circularProgressDrawable.setStrokeWidth(5f);
        circularProgressDrawable.setCenterRadius(30f);
        circularProgressDrawable.start();
        return circularProgressDrawable;
    }
}
