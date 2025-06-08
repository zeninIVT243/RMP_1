package com.example.labaa;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ExampleFragment extends Fragment {

    public ExampleFragment() {
        // Обязательный пустой конструктор
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Подключаем макет фрагмента
        View view = inflater.inflate(R.layout.fragment_example, container, false);

        // Находим элементы
        EditText editText = view.findViewById(R.id.editText);
        Button buttonSubmit = view.findViewById(R.id.buttonSubmit);
        TextView textViewResult = view.findViewById(R.id.textViewResult);

        // Обработчик нажатия кнопки
        buttonSubmit.setOnClickListener(v -> {
            String text = editText.getText().toString();
            textViewResult.setText("Вы ввели: " + text);
        });

        return view;
    }
}