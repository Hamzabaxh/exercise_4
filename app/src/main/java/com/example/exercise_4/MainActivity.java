package com.example.exercise_4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editTextText);
        editText2 = findViewById(R.id.editTextText2);
        Button concatButton = findViewById(R.id.button);

        concatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concat(view);
            }
        });
    }

    public void concat(View view) {
        // Récupérez le texte des EditText.
        String text1 = editText1.getText().toString();
        String text2 = editText2.getText().toString();

        if (text1.isEmpty() || text2.isEmpty()) {
            // Vérifiez si l'un des EditText est vide.
            Toast.makeText(this, "Champs vide", Toast.LENGTH_SHORT).show();
        } else {
            // Concaténez les deux textes et affichez-les dans un Toast.
            String concatenatedText = text1 + " " + text2;
            Toast.makeText(this, concatenatedText, Toast.LENGTH_SHORT).show();
        }
    }
}
