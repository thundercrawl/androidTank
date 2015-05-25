package com.example.androidtank.mailFragments;

import com.example.androidtank.R;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.support.v4.app.ListFragment;


public class Mail1Frag extends ListFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
    	
    	//super.onCreateView(inflater, container, savedInstanceState);
    	if(savedInstanceState != null)
    		return container;
    	System.out.println("  call Fragment inflate function for Mail1Frag ...");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_frag_main, container, false);
    }
}