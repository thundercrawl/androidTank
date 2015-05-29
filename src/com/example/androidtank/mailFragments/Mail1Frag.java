package com.example.androidtank.mailFragments;

import com.example.androidtank.R;

import java.lang.String;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.support.v4.app.ListFragment;


public class Mail1Frag extends ListFragment {
	public static String ViewsArray[] = {"view1","view2","view3"};
	
	
	OnHeadlineSelectedListener mCallback;

    // The container Activity must implement this interface so the frag can deliver messages
    public interface OnHeadlineSelectedListener {
        /** Called by HeadlinesFragment when a list item is selected */
        public void onArticleSelected(int position);
    }

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		
	  super.onCreate(savedInstanceState);

	  // We need to use a different list item layout for devices older than Honeycomb
	  int layout = Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB ?
            android.R.layout.simple_list_item_activated_1 : android.R.layout.simple_list_item_1;
	  
	// Create an array adapter for the list view, using the Ipsum headlines array
      setListAdapter(new ArrayAdapter<String>(getActivity(), layout, ViewsArray));
		
	}
	
	@Override
    public void onStart() {
        super.onStart();

        // When in two-pane layout, set the listview to highlight the selected list item
        // (We do this during onStart because at the point the listview is available.)
        
    }
	/*
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
    	
    	//super.onCreateView(inflater, container, savedInstanceState);
    	if(savedInstanceState != null)
    		return container;
    	System.out.println("  call Fragment inflate function for Mail1Frag ...");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_frag_main, container, false);
    }*/
}