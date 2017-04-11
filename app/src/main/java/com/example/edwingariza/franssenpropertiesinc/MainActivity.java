package com.example.edwingariza.franssenpropertiesinc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**This is the Explore action when user click on Explore */
    public void exploreButton(View view){
        Intent intent = new Intent(this, Explore.class);
       /** EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message); */
        startActivity(intent);
    }
    public void loginBtn(View view){
        Intent intent = new Intent(this, LogIn.class);

        startActivity(intent);
    }
}
