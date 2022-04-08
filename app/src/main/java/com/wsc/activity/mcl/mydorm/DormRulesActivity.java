package com.wsc.activity.mcl.mydorm;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wsc.adapter.RuleCardAdapter;
import com.wsc.dto.DormRegulationDTO;
import com.wsc.dto.UserDTO;
import com.wsc.main.R;

import com.wsc.services.MyDormServices;

import java.util.ArrayList;

public class DormRulesActivity extends AppCompatActivity
{
        private RecyclerView dormRulesRV;

        // Arraylist for storing data
        private ArrayList<DormRegulationDTO> dormRegList;
        private MyDormServices dormRegServices = new MyDormServices();

        private UserDTO user;

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dorm_rule_recycleview);
        dormRulesRV = findViewById(R.id.idRVRules);

        user = getIntent().getParcelableExtra("userData");

        // here we have created new array list and added data to it.
        dormRegList = dormRegServices.getDormRegulations();

        // we are initializing our adapter class and passing our arraylist to it.
        RuleCardAdapter ruleCardAdapter = new RuleCardAdapter(this, dormRegList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        dormRulesRV.setLayoutManager(linearLayoutManager);
        dormRulesRV.setAdapter(ruleCardAdapter);
        }

}
