package com.example.androidtank;

import com.example.androidtank.mailFragments.Mail1Frag;

import android.app.Activity;
import android.app.ActionBar;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class FragMainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_frag_main);
		
		//dynamic add fragment
		if(findViewById(R.id.frag_main_container)!=null)
		{
			
			if(savedInstanceState!=null)
			{
				System.out.println("saved Instance state : " + savedInstanceState.toString());
				return;
			}
			

			System.out.println("First time initialized the framgments !");
			Mail1Frag firstFragment = new Mail1Frag();
			firstFragment.setArguments(getIntent().getExtras());
			
			getSupportFragmentManager().beginTransaction()
            .add(R.id.frag_main_container, (Fragment)firstFragment).commit();
		}
/*
		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
		*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.frag_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	
}
