package com.example.emafely.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.emafely.R;
import com.example.emafely.models.SliderData;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.ArrayList;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.SliderAdapterViewHolder> {
    Context myContext;
    ArrayList<SliderData> mySliderData;

    public SliderAdapter(Context myContext, ArrayList<SliderData> mySliderData) {
        this.myContext = myContext;
        this.mySliderData = mySliderData;
    }

    @Override
    public SliderAdapter.SliderAdapterViewHolder onCreateViewHolder(ViewGroup parent) {
        LayoutInflater myLayoutInflater = LayoutInflater.from(parent.getContext());
        View myView = myLayoutInflater.inflate(R.layout.image_slider_layout, parent, false);
        return new SliderAdapterViewHolder(myView);
    }

    @Override
    public void onBindViewHolder(SliderAdapter.SliderAdapterViewHolder viewHolder, int position) {
          SliderData mySliderDataView = mySliderData.get(position);
          viewHolder.myImages.setImageResource(mySliderDataView.getImages());
    }

    @Override
    public int getCount() {

        return mySliderData.size();
    }

    public class SliderAdapterViewHolder extends ViewHolder {

         private ImageView myImages;
        public SliderAdapterViewHolder(View itemView) {
            super(itemView);

            myImages = itemView.findViewById(R.id.img_images);
        }
    }
}
