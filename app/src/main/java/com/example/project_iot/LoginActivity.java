package com.example.project_iot;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.project_iot.Login.InicioSesion;
import com.example.project_iot.Login.VistaInicial;

public class LoginActivity extends AppCompatActivity {
    //Primera vista del login
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.vista_inicial);
        //Debemos asignar primero una vista al fragmentLayout
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragmento_main_login, VistaInicial.class, null)
                    .commit();
        }
    }

    public void saltarInicioSesion(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmento_main_login);

        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmento_main_login , InicioSesion.class, null)
                    .commit();

        }


    }

}
