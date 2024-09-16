package com.example.project_iot;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.project_iot.Login.InicioSesion;
import com.example.project_iot.Login.LoginCrearCuentaPrimerPaso;
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
    private int convertDpToPx(int dp) {
        float density = getResources().getDisplayMetrics().density;
        return Math.round(dp * density);
    }
    public void saltarInicioSesion(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmento_main_login);


        View layout = findViewById(R.id.fragmento_main_login);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                convertDpToPx(409), // Ancho en píxeles
                convertDpToPx(726)  // Alto en píxeles
        );
        layout.setLayoutParams(params);

        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmento_main_login , InicioSesion.class, null)
                    .commit();
        }


    }

    public void CrearCuenta(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmento_main_login);
        View layout = findViewById(R.id.fragmento_main_login);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        layout.setLayoutParams(params);


// Aplica los cambios
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmento_main_login , LoginCrearCuentaPrimerPaso.class, null)
                    .commit();
        }



    }


}
