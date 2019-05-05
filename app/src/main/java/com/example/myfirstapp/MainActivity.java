package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.myfirstapp.ex1.UnderstandTheActivityLifecycle;
import com.example.myfirstapp.ex2.ConstraintLayoutSample;
import com.example.myfirstapp.ex2.LinearLayoutSample;
import com.example.myfirstapp.ex2.TableLayoutSample;

/**
 * 包含实验1~2的入口，弃用
 */
public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex0_activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = findViewById(R.id.editText2);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void redirectedToUnderstandTheActivityLifecycle(View view) {
        Intent intent = new Intent(this, UnderstandTheActivityLifecycle.class);
        startActivity(intent);
    }

    public void redirectedToLinearLayoutTest(View view) {
        Intent intent = new Intent(this, LinearLayoutSample.class);
        startActivity(intent);
    }

    public void redirectedToConstraintLayoutTest(View view) {
        Intent intent = new Intent(this, ConstraintLayoutSample.class);
        startActivity(intent);
    }

    public void redirectedToTableLayoutTest(View view) {
        Intent intent = new Intent(this, TableLayoutSample.class);
        startActivity(intent);
    }
}
