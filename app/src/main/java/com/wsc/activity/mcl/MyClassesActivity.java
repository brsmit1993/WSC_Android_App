package com.wsc.activity.mcl;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wsc.adapter.ClassCardAdapter;
import com.wsc.dto.ClassDTO;
import com.wsc.main.R;

import java.util.ArrayList;

public class MyClassesActivity extends AppCompatActivity {
    private RecyclerView classRV;

    // Arraylist for storing data
    private ArrayList<ClassDTO> classDTOArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_classes_recycleview);
        classRV = findViewById(R.id.idRVClasses);

        // here we have created new array list and added data to it.
        classDTOArrayList = new ArrayList<>();
        classDTOArrayList.add(new ClassDTO("Meet Your Neighbor", "Come meet other people who live in your dorm!", R.drawable.wsc));
        classDTOArrayList.add(new ClassDTO("Cupcakes Are Cool", "Let's make some awesome cupcakes!", R.drawable.wsc));
        classDTOArrayList.add(new ClassDTO("Carve A Pumpkin", "Let's carve some pumpkins!!!", R.drawable.wsc));
        classDTOArrayList.add(new ClassDTO("Super Bowl Sunday", "Football and pizza in the lobby!", R.drawable.wsc));
        classDTOArrayList.add(new ClassDTO("Fake Event 123", "Some fake event that is extremely fake!", R.drawable.wsc));
        classDTOArrayList.add(new ClassDTO("Running Out Of Ideas", "I'm obviously not that creative but I'm trying... give me a break.", R.drawable.wsc));
        classDTOArrayList.add(new ClassDTO("I don't know something fun?", "This is obviously something fun because it has the word fun it right?", R.drawable.wsc));

        // we are initializing our adapter class and passing our arraylist to it.
        ClassCardAdapter classCardAdapter = new ClassCardAdapter(this, classDTOArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        classRV.setLayoutManager(linearLayoutManager);
        classRV.setAdapter(classCardAdapter);
    }
}
