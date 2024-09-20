package com.example.project_iot;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.project_iot.AdministradorFragments.AdministradorDetalleCompra;
import com.example.project_iot.AdministradorFragments.AdministradorFinalizarRegistroPlato;
import com.example.project_iot.AdministradorFragments.AdministradorHistorial;
import com.example.project_iot.AdministradorFragments.AdministradorRegistroPlatosParte1;
import com.example.project_iot.AdministradorFragments.AdministradorRegistroPlatosParte2;
import com.example.project_iot.AdministradorFragments.AdministradorReporteClientes;
import com.example.project_iot.AdministradorFragments.AdministradorReporteComida;
import com.example.project_iot.ClienteFragments.ClienteVistaCarrito;

public class AdministradorActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.vista_principal_admin);
    }


    public void verDetalleCompra(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalAdmin, AdministradorDetalleCompra.class, null)
                    .commit();
        }
    }

    public void verFinalizarRegistroPlato(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalAdmin, AdministradorFinalizarRegistroPlato.class, null)
                    .commit();
        }
    }

    public void verAdministrarHistorial(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalAdmin, AdministradorHistorial.class, null)
                    .commit();
        }
    }
    public void verRegistroPlatosParte1(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalAdmin, AdministradorRegistroPlatosParte1.class, null)
                    .commit();
        }
    }
    public void verRegistroPlatosParte2(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalAdmin, AdministradorRegistroPlatosParte2.class, null)
                    .commit();
        }
    }

    public void verReporteClientes(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalAdmin, AdministradorReporteClientes.class, null)
                    .commit();
        }
    }
    public void verReporteComida(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalAdmin, AdministradorReporteComida.class, null)
                    .commit();
        }
    }



}
