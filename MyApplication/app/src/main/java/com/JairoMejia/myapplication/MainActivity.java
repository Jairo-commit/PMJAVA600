package com.JairoMejia.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText edtNombre = findViewById(R.id.editTextTextNombre);
        EditText edtApellido = findViewById(R.id.editTextApellido);
        EditText edtDireccion = findViewById(R.id.editTextDireccion);
        EditText edtTelefono = findViewById(R.id.editTextTelefono);
        EditText edtCedula = findViewById(R.id.editTextCedula);
        EditText edtCorreo = findViewById(R.id.editTextCorreo);
        EditText edtEstrato = findViewById(R.id.editTextEstrato);
        EditText edtEstadoCivil = findViewById(R.id.editTextEstadoCivil);
        EditText edtProfesion = findViewById(R.id.editTextProfesion);
        EditText edtNacionalidad = findViewById(R.id.editTextNacionalidad);

        TextView txvNombre = findViewById(R.id.textViewNombre);
        TextView txvApellido = findViewById(R.id.textViewApellido);
        TextView txvDireccion = findViewById(R.id.textViewDireccion);
        TextView txvTelefono = findViewById(R.id.textViewTelefono);
        TextView txvCedula = findViewById(R.id.textViewCedula);
        TextView txvCorreo = findViewById(R.id.textViewCorreo);
        TextView txvEstrato = findViewById(R.id.textViewEstrato);
        TextView txvEstadoCivil = findViewById(R.id.textViewEstadoCivil);
        TextView txvProfesion = findViewById(R.id.textViewProfesion);
        TextView txvNacionalidad = findViewById(R.id.textViewNacionalidad);

        Button btnAceptar = findViewById(R.id.buttonAceptar);
        btnAceptar.setOnClickListener(v -> {
            edtNombre.setText("Carlos");
            edtApellido.setText("Pérez");
            edtDireccion.setText("Calle 123");
            edtTelefono.setText("555-1234");
            edtCedula.setText("123456789");
            edtCorreo.setText("carlos@email.com");
            edtEstrato.setText("3");
            edtEstadoCivil.setText("Casado");
            edtProfesion.setText("Ingeniero");
            edtNacionalidad.setText("Colombiano");
        });

        Button buttonCancelar = findViewById(R.id.buttonCancelar);

        buttonCancelar.setOnClickListener(v -> {
            edtNombre.setText("");
            edtApellido.setText("");
            edtDireccion.setText("");
            edtTelefono.setText("");
            edtCedula.setText("");
            edtCorreo.setText("");
            edtEstrato.setText("");
            edtEstadoCivil.setText("");
            edtProfesion.setText("");
            edtNacionalidad.setText("");
        });

    }
}