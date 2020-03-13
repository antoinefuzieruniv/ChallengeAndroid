package com.indysoft.amazingtetris;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static android.content.ContentValues.TAG;

public class ListenerActivity extends AppCompatActivity {

    DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listener);

        mDatabase = FirebaseDatabase.getInstance().getReference();
        verifNbJoueurs();
    }


    public void verifNbJoueurs(){
        mDatabase.child("playerHere").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.getValue() != null) {
                    if ((Boolean) dataSnapshot.getValue() == true) {
                        ListenerActivity.this.startActivity(new Intent(ListenerActivity.this, GameActivity.class));
                    }
                }

            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) { }
        });
    }

    @Override
    protected void onPause() {
        mDatabase.child("users").removeValue();
        mDatabase.child("playerHere").removeValue();
        super.onPause();

    }
}
