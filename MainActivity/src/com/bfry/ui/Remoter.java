package com.bfry.ui;

import java.util.Locale;

import com.example.android.navigationdrawerexample.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Remoter extends Fragment {
	
	public static final String Menu_Item_Number = "menu item number";
	
    public Remoter() {
		// TODO Auto-generated constructor stub
	}
    
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_remoter, container, false);
        int i = getArguments().getInt(Menu_Item_Number);
        String planet = getResources().getStringArray(R.array.menu_item_array)[i];
        /*
        int imageId = getResources().getIdentifier(planet.toLowerCase(Locale.getDefault()),
                        "drawable", getActivity().getPackageName());
        ((ImageView) rootView.findViewById(R.id.image)).setImageResource(imageId);
        getActivity().setTitle(planet);
        */
        return rootView;
	}
	
}
