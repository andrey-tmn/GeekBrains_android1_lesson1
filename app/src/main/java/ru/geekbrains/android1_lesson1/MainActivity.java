package ru.geekbrains.android1_lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button showFirstTaskLayoutButton;
    private Button showEditFieldsFormLayoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initMainView();
    }

    // Добавляем обработчики кнопок
    private void addListeners() {
        showFirstTaskLayoutButton.setOnClickListener(view -> {
            setContentView(R.layout.activity_first_task);
            initBackButton();
        });
        showEditFieldsFormLayoutButton.setOnClickListener(view -> {
            setContentView(R.layout.activity_input_fields);
            initBackButton();
        });
    }

    private void initBackButton() {
        TextView backToMainLayoutTextView = findViewById(R.id.back_text_view);
        backToMainLayoutTextView.setOnClickListener(view -> {
            setContentView(R.layout.activity_main);
            initMainView();
        });
    }

    private void initMainView() {
        // Находим все наши элементы
        showFirstTaskLayoutButton = findViewById(R.id.open_1_design_button);
        showEditFieldsFormLayoutButton = findViewById(R.id.open_2_design_button);
        // Указали обработчики на наши кнопки
        addListeners();
    }
}