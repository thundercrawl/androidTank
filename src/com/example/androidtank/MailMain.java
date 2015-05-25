package com.example.androidtank;

import com.example.androidtank.util.SystemUiHider;

import android.R.string;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class MailMain extends FragmentActivity  {
	/**
	 * Whether or not the system UI should be auto-hidden after
	 * {@link #AUTO_HIDE_DELAY_MILLIS} milliseconds.
	 */
	private static final boolean AUTO_HIDE = true;

	/**
	 * If {@link #AUTO_HIDE} is set, the number of milliseconds to wait after
	 * user interaction before hiding the system UI.
	 */
	private static final int AUTO_HIDE_DELAY_MILLIS = 3000;

	/**
	 * If set, will toggle the system UI visibility upon interaction. Otherwise,
	 * will show the system UI visibility upon interaction.
	 */
	private static final boolean TOGGLE_ON_CLICK = true;

	/**
	 * The flags to pass to {@link SystemUiHider#getInstance}.
	 */
	private static final int HIDER_FLAGS = SystemUiHider.FLAG_HIDE_NAVIGATION;

	/**
	 * The instance of the {@link SystemUiHider} for this activity.
	 */
	private SystemUiHider mSystemUiHider;
	
	public void onStart()
	{
		super.onStart();
		EditText ed  = (EditText)findViewById(R.id.editText4);
		ed.setText("On start called"+(++MonitiorActivity._start));
	}
	public void onStop()
	{
		super.onStop();
		EditText ed  = (EditText)findViewById(R.id.editText1);
		ed.setText("On stop called"+(++MonitiorActivity._stop));
	}
	public void onResume()
	{
		super.onResume();
		EditText ed  = (EditText)findViewById(R.id.editText2);
		ed.setText("On Resume called"+(++MonitiorActivity._resume));
	}
	public void onPause()
	{
		super.onPause();
		EditText ed  = (EditText)findViewById(R.id.editText3);
		ed.setText("On Paused called"+(++MonitiorActivity._pause));
		
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_item_list);

		Intent intent = getIntent();
		String msg   =  intent.getStringExtra(LoginActivity.EXTRA_MESSAGE);
		
		 TextView textView = new TextView(this);
		    textView.setTextSize(40);
		    textView.setText(msg);

		
		EditText ed  = (EditText)findViewById(R.id.editText1);
		ed.setText(msg);
			}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);

		// Trigger the initial hide() shortly after the activity has been
		// created, to briefly hint to the user that UI controls
		// are available.
		delayedHide(100);
	}

	/**
	 * Touch listener to use for in-layout UI controls to delay hiding the
	 * system UI. This is to prevent the jarring behavior of controls going away
	 * while interacting with activity UI.
	 */
	View.OnTouchListener mDelayHideTouchListener = new View.OnTouchListener() {
		@Override
		public boolean onTouch(View view, MotionEvent motionEvent) {
			if (AUTO_HIDE) {
				delayedHide(AUTO_HIDE_DELAY_MILLIS);
			}
			return false;
		}
	};

	Handler mHideHandler = new Handler();
	Runnable mHideRunnable = new Runnable() {
		@Override
		public void run() {
			//mSystemUiHider.hide();
		}
	};

	/**
	 * Schedules a call to hide() in [delay] milliseconds, canceling any
	 * previously scheduled calls.
	 */
	private void delayedHide(int delayMillis) {
		mHideHandler.removeCallbacks(mHideRunnable);
		mHideHandler.postDelayed(mHideRunnable, delayMillis);
	}
	public void sendmail(View view)
	{
		
		
	}
}
