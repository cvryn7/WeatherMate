package com.example.cv.weathermate;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        List<String> forecastData = new ArrayList<String>();
        forecastData.add("Today-Sunny-28/01");
        forecastData.add("Tomorrow-foggy-29/01");
        forecastData.add("Saturday-rainy-30/01");
        forecastData.add("Sunday-cloudy-31/01");
        forecastData.add("Monday-Snow-1/02");
        forecastData.add("Tuesday-cloud-2/02");
        forecastData.add("Wednesday-rainy-03/03");

        ArrayAdapter<String> forecastDataAdapter = new ArrayAdapter<String>(
                //current context (this fragment's parent activity
                getActivity(),
                //Id of the list item layout
                R.layout.list_item_forecast,
                //Id of textview to populate
                R.id.list_item_forecast_textview,
                //data to the array adapter
                forecastData);
        //Get refrence to list view and then attach adapter to it
        ListView forecastListView = (ListView)rootView.findViewById(R.id.listview_forecast);
        forecastListView.setAdapter(forecastDataAdapter);
        return rootView;
    }
}
