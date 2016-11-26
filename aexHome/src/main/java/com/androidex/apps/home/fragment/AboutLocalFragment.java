package com.androidex.apps.home.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidex.apps.home.R;

/**
 * Created by liyp on 16/11/24.
 */

public class AboutLocalFragment extends Fragment {
      private static final String TAG = "systemsetfragment";
      private View rootView;

      @Nullable
      @Override
      public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            rootView = inflater.inflate(R.layout.fragment_aboutlocal, container, false);
            return rootView;
      }
}
