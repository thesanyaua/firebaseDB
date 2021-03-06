package com.example.firebasedb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddUser extends AppCompatActivity {

    EditText edname, edsecondname, edemail;
    Button button;
    private DatabaseReference mDataBase;
    private  String USER_KEY = "USER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
        init();
    }

    public void init() {
        edname = findViewById(R.id.name);
        edsecondname = findViewById(R.id.secondname);
        edemail = findViewById(R.id.email);
        button = findViewById(R.id.save);
        mDataBase = FirebaseDatabase.getInstance().getReference(USER_KEY);
    }


    public void onClickSave(View view) {
        String id = mDataBase.getKey();
        String name = edname.getText().toString();
        String sacname = edsecondname.getText().toString();
        String email = edemail.getText().toString();
        com.example.firebasedb.User newUser = new com.example.firebasedb.User(id, name, sacname, email);
        mDataBase.push().setValue(newUser);
        AddUser.this.finish();
    }
}