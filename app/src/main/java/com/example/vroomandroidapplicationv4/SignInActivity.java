package com.example.vroomandroidapplicationv4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_in);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // Creating an 'OnClick' Event Handler method/function for the Button 'Views'.
    // This Event Handler changes the 'Activity'/page from the current 'Activity'/page
    // to the 'SignInActivity' 'Activity'/page
    public void changeToSignInActivity(View v){
        // Android App development terminology:
        // Intent - the transfer of data from 1 activity/page of the app to another

        // - SettingsActivity - the name of the other 'Activty'/page to navigate to
        // - 'this' - refers to the current 'Activty'/page
        Intent i = new Intent(this, SignInActivity.class);
        startActivity(i);
    }

    // Creating an 'OnClick' Event Handler method/function for the Button 'Views'.
    // This Event Handler changes the 'Activity'/page from the current 'Activity'/page
    // to the 'LogInActivity' 'Activity'/page
    public void changeToLogInActivity(View v){
        // Android App development terminology:
        // Intent - the transfer of data from 1 activity/page of the app to another

        // - SettingsActivity - the name of the other 'Activty'/page to navigate to
        // - 'this' - refers to the current 'Activty'/page
        Intent i = new Intent(this, LogInActivity.class);
        startActivity(i);
    }

    // Creating an 'OnClick' Event Handler method/function for the Button 'Views'.
    // This Event Handler changes the 'Activity'/page from the current 'Activity'/page
    // to the 'HomeActivity' 'Activity'/page
    public void changeToHomeActivity(View v){
        // Android App development terminology:
        // Intent - the transfer of data from 1 activity/page of the app to another

        // - SettingsActivity - the name of the other 'Activty'/page to navigate to
        // - 'this' - refers to the current 'Activty'/page
        Intent i = new Intent(this, HomeActivity.class);
        startActivity(i);
    }
}