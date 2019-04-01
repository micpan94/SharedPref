package com.example.panczopc.sharedpref;


import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

private SharedPreferences sPreferences;
private  SharedPreferences.Editor sEditor;

private EditText name,password;
private Button logbtn;
private CheckBox cbbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    void init(){
        sPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        sEditor = sPreferences.edit();
        name = (EditText)findViewById(R.id.et1);
        password = (EditText)findViewById(R.id.et2);
        logbtn = (Button)findViewById(R.id.loginbtn);
        cbbtn =(CheckBox)findViewById(R.id.cbbtn);
    }

    private void checkSP(){
        String checkbox = sPreferences.getString(getString(R.string.checkbox),"False");
        String name = sPreferences.getString(getString(R.string.name),"");
        String passowrd = sPreferences.getString(getString(R.string.password),"");
    }



    }







