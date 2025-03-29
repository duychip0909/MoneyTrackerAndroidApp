package com.example.moneytracker;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class EmailPasswordActivity {
    private FirebaseAuth mAuth;

    public void onCreate() {
        mAuth = FirebaseAuth.getInstance();
    }
}
