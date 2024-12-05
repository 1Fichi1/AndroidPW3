package com.example.listwithdetails;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Создаем список элементов
        List<ListItem> items = new ArrayList<>();
        items.add(new ListItem("Python", "мультипарадигмальный высокоуровневый язык программирования общего назначения с динамической строгой типизацией и автоматическим управлением памятью."));
        items.add(new ListItem("C#", "это объектно-ориентированный язык программирования, разработанный компанией Microsoft, чтобы создавать приложения для Windows"));
        items.add(new ListItem("SQL", "декларативный язык программирования, который используют для создания, обработки и хранения данных в реляционных базах данных"));

        // Настраиваем адаптер
        ListAdapter adapter = new ListAdapter(this, items);
        recyclerView.setAdapter(adapter);
    }
}
