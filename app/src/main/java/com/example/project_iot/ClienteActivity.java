package com.example.project_iot;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.project_iot.ClienteFragments.ClienteVistaCarrito;
import com.example.project_iot.ClienteFragments.ClienteVistaConfirmacionCompra;
import com.example.project_iot.ClienteFragments.ClienteVistaHistorial;
import com.example.project_iot.ClienteFragments.ClienteVistaRestaurante;
import com.example.project_iot.ClienteFragments.ClienteVistaTracking;
import com.example.project_iot.ClienteFragments.ClienteVistaUnPlato;
import com.example.project_iot.ClienteFragments.vistaPrincipalCliente;
import com.example.project_iot.Generales.notificaciones;
import com.example.project_iot.Login.InicioSesion;
import com.example.project_iot.databinding.ActivityMainBinding;

public class ClienteActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal_cliente);
        //Agregamos funcionalidades a los botones
    }
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        //De acuerdo al escogido se realiza el cambio de vista

        if(item.getItemId() == R.id.historial  ){
            //En caso de click a esto se suelta un fragmento
            return true ;
        }
        if(item.getItemId() == R.id.restaurant ){
            //En caso de click a esto se suelta un fragmento
            return true ;
        }
        if(item.getItemId() == R.id.profile ){
            //En caso de click a esto se suelta un fragmento
            return true ;
        }
        return super.onContextItemSelected(item);
    }

    //-------------PARA IR A UNA VISTA----------------------
    public void saltarAResturante(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalCliente);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalCliente, ClienteVistaRestaurante.class, null)
                    .commit();
        }
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

    public void vistaCarrito(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalCliente);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalCliente, ClienteVistaCarrito.class, null)
                    .commit();
        }
    }
    public void vistaConfirmaciónCompra(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalCliente);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalCliente, ClienteVistaConfirmacionCompra.class, null)
                    .commit();
        }
    }
    public void vistaHistorial(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalCliente);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalCliente, ClienteVistaHistorial.class, null)
                    .commit();
        }
    }
    public void vistaRestaurante(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalCliente);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalCliente, ClienteVistaRestaurante.class, null)
                    .commit();
        }
    }
    public void vistaTracking(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalCliente);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalCliente, ClienteVistaTracking.class, null)
                    .commit();
        }
    }
    public void vistaUnPlato(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalCliente);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalCliente, ClienteVistaUnPlato.class, null)
                    .commit();
        }
    }
    public void vistaPrincipalCliente(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalCliente);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalCliente, vistaPrincipalCliente.class, null)
                    .commit();
        }
    }
    public void vistaNotificaciones(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalCliente);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalCliente, notificaciones.class, null)
                    .commit();
        }
    }
    private int convertDpToPx(int dp) {
        float density = getResources().getDisplayMetrics().density;
        return Math.round(dp * density);
    }



}
