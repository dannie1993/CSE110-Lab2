package com.example.danny.cse110_lab2.tests;
import android.test.ActivityInstrumentationTestCase2;
import com.example.danny.cse110_lab2.MyActivity;

/**
 * Created by danny on 4/19/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MyActivity> {

    public JUnit_test(){
        super(MyActivity.class);
    }

    public void test_first(){
        MyActivity = getActivity();

        TextView textView = (TextView) MyActivity.findViewByID(R.id.tv1);
        String tester = textView.getText.toString();

        assertEquals("Bye World", tester);

    }

}
