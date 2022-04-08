package com.wsc.activity.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.wsc.dto.UserDTO;
import com.wsc.exceptions.InvalidCredentialsException;
import com.wsc.activity.index.IndexActivity;
import com.wsc.main.R;
import com.wsc.services.LoginServices;

public class MainActivity extends AppCompatActivity {

    private LoginServices ls = new LoginServices();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_main);
    }

    public void loginBtnClicked(View view)
    {
        TextView errorText = (TextView)findViewById(R.id.errorMessageView);
        EditText userName = (EditText)findViewById(R.id.wscEmailInput);
        EditText password = (EditText)findViewById(R.id.wscPasswordInput);

        try
        {
            UserDTO user = ls.isCredentialsValid(userName.getText().toString(), password.getText().toString());
            Intent intent = new Intent(this, IndexActivity.class);
            intent.putExtra("userData", user);

            startActivity(intent);
        }
        catch (InvalidCredentialsException e)
        {
            errorText.setText(e.getMessage());
            view.invalidate();
        }
    }
}