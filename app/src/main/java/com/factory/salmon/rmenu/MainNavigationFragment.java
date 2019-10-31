package com.factory.salmon.rmenu;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;

import androidx.annotation.Nullable;

public class MainNavigationFragment extends PreferenceFragment {

    SharedPreferences pref;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.menu_fragment_navigation);

        pref= PreferenceManager.getDefaultSharedPreferences(getActivity());

    }



}



