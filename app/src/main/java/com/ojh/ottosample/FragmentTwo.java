package com.ojh.ottosample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.squareup.otto.Subscribe;

/**
 * Created by 01071724654 on 2016-07-04.
 */
public class FragmentTwo extends Fragment {

    TextView tvText;

    public static Fragment newInstance() {
        return new FragmentTwo();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        init(view);
        return view;
    }

    private void init(View v) {
        tvText = (TextView)v.findViewById(R.id.tvText);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BusProvider.getInstance().register(this);
    }

    @Override
    public void onDestroy() {
        BusProvider.getInstance().unregister(this);
        super.onDestroy();
    }

    @Subscribe
    public void onEventOtto(OttoEvent ottoEvent) {
        tvText.setText(""+ottoEvent.num);
    }
}
