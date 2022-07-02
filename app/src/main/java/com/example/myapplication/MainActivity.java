package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends  AppCompatActivity {
  //developer .android .com
    private EditText edtName;
    private EditText edtpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // callback  , method life cycle call back
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //R connect btw java and xml
        edtName=findViewById(R.id.edtName);
        edtpass=findViewById(R.id.editTextTextPassword);
        //this is test comment for github
    }
   public void btnSumbitOnClick(View view){
    String name = edtName.getText().toString();
    String password = edtpass.getText().toString();
    if(name.equals("basil") && password.equals("basil"))
    Toast.makeText(this ,"Welcome",Toast.LENGTH_LONG).show();


        Toast.makeText(this ,"Ops !! , Wrong Login",Toast.LENGTH_LONG).show();
   }


}
