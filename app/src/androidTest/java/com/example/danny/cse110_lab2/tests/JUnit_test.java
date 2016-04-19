package com.example.danny.cse110_lab2.tests;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.danny.cse110_lab2.MyActivity;
import com.example.danny.cse110_lab2.R;

/**
 * Created by danny on 4/19/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MyActivity> {

    MyActivity myActivity;
    public JUnit_test(){
        super(MyActivity.class);
    }


    public void test_first(){
        myActivity = getActivity();

        TextView textView = (TextView) myActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Bye World", tester);

    }

}
