package com.example.recycf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contactsRecView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsRecView = findViewById(R.id.contactsRecView);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("macska","asd@asd.asd","https://www.zooplus.hu/magazin/wp-content/uploads/2019/07/A-macska-kommunik%C3%A1ci%C3%B3j%C3%A1nak-meg%C3%A9rt%C3%A9se.jpg"));
        contacts.add(new Contact("kecske","asd@asd.asd","https://nepszava.hu/i/10/6/1/1272847.jpg"));
        contacts.add(new Contact("fecske","asd@asd.asd","https://www.zooplus.hu/magazin/wp-content/uploads/2019/07/A-macska-kommunik%C3%A1ci%C3%B3j%C3%A1nak-meg%C3%A9rt%C3%A9se.jpg"));
        contacts.add(new Contact("jani","asd@asd.asd","https://nepszava.hu/i/10/6/1/1272847.jpg"));

        ContactsRecViewAdapter adapter = new ContactsRecViewAdapter(this);
        adapter.setContacts(contacts);

        contactsRecView.setAdapter(adapter);
        contactsRecView.setLayoutManager(new LinearLayoutManager(this));
    }
}