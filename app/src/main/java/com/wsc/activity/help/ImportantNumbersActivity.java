package com.wsc.activity.help;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.wsc.main.R;

public class ImportantNumbersActivity extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.important_numbers);
    }

    public void callSecurity(View view)
    {
        callNum("tel:4023757216");
    }

    public void callHealth(View view)
    {
        callNum("tel:4023757470");
    }

    public void callNats(View view)
    {
        callNum("tel:4023757107");
    }

    public void callBookstore(View view)
    {
        callNum("tel:4023757099");
    }

    public void callSfs(View view)
    {
        callNum("tel:4023757229");
    }

    public void callRecords(View view)
    {
        callNum("tel:4023757239");
    }

    public void callAnderson(View view)
    {
        callNum("tel:4023757264");
    }

    public void callBerry(View view)
    {
        callNum("tel:4023757305");
    }

    public void callBowen(View view)
    {
        callNum("tel:4023757205");
    }

    public void callNeihardt(View view)
    {
        callNum("tel:4023757333");
    }

    public void callPile(View view)
    {
        callNum("tel:4023757284");
    }

    public void callTerrace(View view)
    {
        callNum("tel:4023757262");
    }

    private void callNum(String numToCall)
    {
        Uri number = Uri.parse(numToCall);
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
    }

}
