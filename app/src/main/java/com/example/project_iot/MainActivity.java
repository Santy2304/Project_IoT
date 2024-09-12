package com.example.project_iot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.inicio_auxiliar);
    }
    //En el futuro será el login xd
    //Para organizar flujos con botones

    public void verCliente(View view) {
        startActivity(new Intent(this, ClienteActivity.class));
    }

    public void verRepartidor(View view) {
        startActivity(new Intent(this, RepartidorActivity.class));
    }
    public void verAdministrador(View view) {
        startActivity(new Intent(this, AdministradorActivity.class));
    }
    public void verSuperadministrador(View view) {
        startActivity(new Intent(this, SuperAdminActivity.class));
    }
    public void verLogin(View view) {
        startActivity(new Intent(this, LoginActivity.class));
    }
}