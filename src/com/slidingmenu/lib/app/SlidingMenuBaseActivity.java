package com.slidingmenu.lib.app;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v4.app.ListFragment;

import com.slidingmenu.lib.SlidingMenu;

public class SlidingMenuBaseActivity extends SlidingFragmentActivity {

	protected ListFragment mFrag;
	protected int mMenuFrame ;

	public SlidingMenuBaseActivity(int menu_frame) {
		mMenuFrame = menu_frame;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// set the Behind View
		setBehindContentView(mMenuFrame);

		// customize the SlidingMenu
		SlidingMenu sm = getSlidingMenu();
		sm.setShadowWidth(45);
		int colors[] = { 0x00000000 , 0x11000000, 0x33000000 };//startcolor,centercolor,endcolor
		GradientDrawable gd = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, colors);
		sm.setShadowDrawable(gd);
		sm.setBehindOffset(90);
		sm.setMode(SlidingMenu.LEFT);
		sm.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
		sm.setBehindScrollScale(0);
		sm.setFadeDegree(1);
	}

	@Override
	protected void onResume() {
		super.onResume();
	}
}
