package com.mikezu.slidingmenu_sample;

import android.os.Bundle;
import android.view.KeyEvent;

import com.slidingmenu.lib.app.SlidingMenuBaseActivity;

public class MainActivity extends SlidingMenuBaseActivity {

	public MainActivity() {
		super(R.layout.slidingmenu_menu);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.slidingmenu_content);
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		boolean ret = false;
		switch(keyCode) {
		case KeyEvent.KEYCODE_BACK:
			if(getSlidingMenu().isMenuShowing()) {
				finish();
			} else {
				getSlidingMenu().showMenu();
			}
			ret = true;
			break;
		}
		return ret;
	}
	
	@Override
	public boolean onKeyUp(int keyCode, KeyEvent event) {
		// in SlidingActivityHelper,it override onKeyUp,when keycode == KeyEvent.KEYCODE_BACK,
		// and SlidingMenu.isMenuShowing() == true,it will show content,so if you do not won't it occur,
		// you should override onKeyUp(,),and return true
		return true;
	}
	
}
