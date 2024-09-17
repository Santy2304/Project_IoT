package com.example.project_iot;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.project_iot.Login.FinalizarRegistro;
import com.example.project_iot.Login.InicioSesion;
import com.example.project_iot.Login.LoginCambiarPasswordFinal;
import com.example.project_iot.Login.LoginCambiarPasswordPrimerPaso;
import com.example.project_iot.Login.LoginCambiarPasswordSegundoPaso;
import com.example.project_iot.Login.LoginCambiarPasswordTercerPaso;
import com.example.project_iot.Login.LoginCrearCuentaCuartoPaso;
import com.example.project_iot.Login.LoginCrearCuentaFinal;
import com.example.project_iot.Login.LoginCrearCuentaPrimerPaso;
import com.example.project_iot.Login.LoginCrearCuentaQuintoPaso;
import com.example.project_iot.Login.LoginCrearCuentaSegundoPaso;
import com.example.project_iot.Login.LoginCrearCuentaSextoPaso;
import com.example.project_iot.Login.LoginCrearCuentaTercerPaso;
import com.example.project_iot.Login.VistaInicial;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Calendar;

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
        //pARA GESTIONAR RETROCESO DESDE LOS BOTONES DE ANDROID
//        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
//            @Override
//            public void handleOnBackPressed() {
//            }
//        });
    }

    //METODO PARA SALTAR ENTRE FRAGMENTOS

    //---------METODO PARA AVANZAR EN FORM DE CREAR CUENTA---------------------
    public void CrearCuenta(View view) {
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmento_main_login);
        View layout = findViewById(R.id.fragmento_main_login);


// Aplica los cambios
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmento_main_login, LoginCrearCuentaPrimerPaso.class, null)
                    .commit();
        }

    }
    public void CrearCuenta2(View view) {
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmento_main_login);

        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmento_main_login, LoginCrearCuentaSegundoPaso.class, null)
                    .commit();
        }
    }
    public void CrearCuenta3(View view) {

        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmento_main_login);

        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmento_main_login, LoginCrearCuentaTercerPaso.class, null)
                    .commit();
        }

    }
    public void CrearCuenta4(View view) {

        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmento_main_login);

        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmento_main_login, LoginCrearCuentaCuartoPaso.class, null)
                    .commit();
        }

    }
    public void CrearCuenta5(View view) {

        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmento_main_login);

        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmento_main_login, LoginCrearCuentaQuintoPaso.class, null)
                    .commit();
        }
    }
    public void CrearCuenta6(View view) {
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmento_main_login);

        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmento_main_login, LoginCrearCuentaSextoPaso.class, null)
                    .commit();
        }
    }
    public void FinalizarCrearCuenta(View view) {
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmento_main_login);

        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmento_main_login, LoginCrearCuentaFinal.class, null)
                    .commit();
        }
    }
    //---------------------------------------------------------------------

    //----------METODO PARA REGRESAR EN FORM DE CREAR CUENTA---------------
    public void RegresarInicioSesion(View view) {
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmento_main_login);
        View layout = findViewById(R.id.fragmento_main_login);

// Aplica los cambios
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmento_main_login, InicioSesion.class, null)
                    .commit();
        }

    }
    public void RegresarCrearCuenta(View view) {
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmento_main_login);
        View layout = findViewById(R.id.fragmento_main_login);

// Aplica los cambios
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmento_main_login, LoginCrearCuentaPrimerPaso.class, null)
                    .commit();
        }

    }
    public void RegresarCrearCuenta2(View view) {
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmento_main_login);

        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmento_main_login, LoginCrearCuentaSegundoPaso.class, null)
                    .commit();
        }
    }
    public void RegresarCrearCuenta3(View view) {

        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmento_main_login);

        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmento_main_login, LoginCrearCuentaTercerPaso.class, null)
                    .commit();
        }

    }
    public void RegresarCrearCuenta4(View view) {

        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmento_main_login);

        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmento_main_login, LoginCrearCuentaCuartoPaso.class, null)
                    .commit();
        }

    }
    public void RegresarCrearCuenta5(View view) {

        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmento_main_login);

        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmento_main_login, LoginCrearCuentaQuintoPaso.class, null)
                    .commit();
        }
    }
    public void RegresarCrearCuenta6(View view) {
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmento_main_login);

        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmento_main_login, LoginCrearCuentaSextoPaso.class, null)
                    .commit();
        }
    }

    //---------------------------------------------------------------------
    //---------METODO PARA AVANZAR EN FORM DE CAMBIAR CONTRASEÑA-----------
    public void cambiarPasswordPrimerPaso(View view) {
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmento_main_login);

        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmento_main_login, LoginCambiarPasswordPrimerPaso.class, null)
                    .commit();
        }
    }
    public void cambiarPasswordSegundoPaso(View view) throws InterruptedException {
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmento_main_login);

        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmento_main_login, LoginCambiarPasswordSegundoPaso.class, null)
                    .commit();
        }


    }
    public void cambiarPasswordTercerPaso(View view) {
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmento_main_login);

        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmento_main_login, LoginCambiarPasswordTercerPaso.class, null)
                    .commit();
        }
    }
    public void cambiarPasswordFinal(View view) {
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmento_main_login);

        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmento_main_login, LoginCambiarPasswordFinal.class, null)
                    .commit();
        }
    }

    //---------------------------------------------------------------------


    //-----------------METODO PARA REGRESAR EN FORM DE CAMBIAR CONTRASEÑA---------------------
    public void saltarInicioSesion(View view) {
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmento_main_login);

        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmento_main_login, InicioSesion.class, null)
                    .commit();
        }
    }
    public void regresarCambiarPasswordPrimerPaso(View view) {
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmento_main_login);
        if (fragment != null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragmento_main_login, LoginCambiarPasswordPrimerPaso.class, null);
            transaction.commit();
        }
    }
    public void regresarCambiarPasswordSegundoPaso(View view) {
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmento_main_login);
        if (fragment != null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragmento_main_login, LoginCambiarPasswordSegundoPaso.class, null);
            transaction.commit();
        }
    }
    //-------------------------------------------------------------------------



    //Al presionar inicioSesion que lleve a cliente
    public void iniciarSesion(View view) {
        startActivity(new Intent(this, ClienteActivity.class));
    }

}

