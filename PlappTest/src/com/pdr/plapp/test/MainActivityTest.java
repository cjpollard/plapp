package com.pdr.plapp.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;
import com.pdr.plapp.MainActivity;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
	
	private MainActivity mActivity;
	private TextView mDefaultString;	
	
	public MainActivityTest() {
		super(MainActivity.class);
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		
		setActivityInitialTouchMode(false);
		
		mActivity = getActivity();
		
		mDefaultString = (TextView) mActivity.findViewById(com.pdr.plapp.R.id.section_label);
	}
	
	public void testPreconditions() {
		String actualDefaultString = (String) mDefaultString.getText();
		assertEquals(actualDefaultString, "1");
	}

}
