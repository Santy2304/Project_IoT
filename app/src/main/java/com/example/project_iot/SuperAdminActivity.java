package com.example.project_iot;



import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.project_iot.Generales.notificaciones;
import com.example.project_iot.SuperAdminFragments.HistorialVentasDetalles;
import com.example.project_iot.SuperAdminFragments.PanelAdmin;
import com.example.project_iot.SuperAdminFragments.PanelCliente;
import com.example.project_iot.SuperAdminFragments.PanelRepartidor;
import com.example.project_iot.SuperAdminFragments.PanelRestaurante;
import com.example.project_iot.SuperAdminFragments.PerfilSuperAdmin;
import com.example.project_iot.SuperAdminFragments.PlatillosDescription;
import com.example.project_iot.SuperAdminFragments.RegistroAdminCorrect;
import com.example.project_iot.SuperAdminFragments.RegistroAdministrador1;
import com.example.project_iot.SuperAdminFragments.RegistroAdministrador2;
import com.example.project_iot.SuperAdminFragments.RegistroRestaurante1;
import com.example.project_iot.SuperAdminFragments.RegistroRestaurante2;
import com.example.project_iot.SuperAdminFragments.RegistroRestauranteCorrect;
import com.example.project_iot.SuperAdminFragments.RestauranteHistorialVentas;
import com.example.project_iot.SuperAdminFragments.RestaurantePlatillos;
import com.example.project_iot.SuperAdminFragments.RestauranteResumen;
import com.example.project_iot.SuperAdminFragments.RestauranteUbicacion;
import com.example.project_iot.SuperAdminFragments.VistaLogEvent;
import com.example.project_iot.SuperAdminFragments.VistaPerfilAdministrador;
import com.example.project_iot.SuperAdminFragments.VistaPerfilCliente;
import com.example.project_iot.SuperAdminFragments.VistaPerfilRepartidor;
import com.example.project_iot.databinding.ActivityMainBinding;
import com.example.project_iot.ClienteFragments.ClienteVistaRestaurante;
import com.example.project_iot.Login.InicioSesion;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.switchmaterial.SwitchMaterial;

public class SuperAdminActivity extends AppCompatActivity implements PanelCliente.OnLogEventClickListener {
    private SwitchMaterial switchMaterial;
    private TextView tvEstado;
    MaterialToolbar topAppBar;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal_superadmin);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                /*FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                 */

                if (item.getItemId() == R.id.restaurant) {

                    Fragment fragment = getSupportFragmentManager()
                            .findFragmentById(R.id.fragmentoPrincipalSuperAdmin);
                    if (fragment != null) {
                        getSupportFragmentManager().beginTransaction()
                                .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                                .replace(R.id.fragmentoPrincipalSuperAdmin, PanelRestaurante.class, null)
                                .commit();
                    }

                } else if (item.getItemId() == R.id.principal) {
                    Fragment fragment = getSupportFragmentManager()
                            .findFragmentById(R.id.fragmentoPrincipalSuperAdmin);
                    if (fragment != null) {
                        getSupportFragmentManager().beginTransaction()
                                .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                                .replace(R.id.fragmentoPrincipalSuperAdmin, PanelCliente.class, null)
                                .commit();
                    }
                } else if (item.getItemId() == R.id.profile) {
                    Fragment fragment = getSupportFragmentManager()
                            .findFragmentById(R.id.fragmentoPrincipalSuperAdmin);
                    if (fragment != null) {
                        getSupportFragmentManager().beginTransaction()
                                .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                                .replace(R.id.fragmentoPrincipalSuperAdmin, PerfilSuperAdmin.class, null)
                                .commit();
                    }
                } else {
                    // handle default case or return false
                    return false;
                }
                return true;

            }
        });

        /*
        topAppBar.setOnMenuItemClickListener(new MaterialToolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.log_event) {
                    // Reemplaza el fragment actual con VistaLogEvent
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragmentoPrincipalSuperAdmin, new VistaLogEvent());
                    fragmentTransaction.commit();
                    return true;
                } else {
                    return false;
                }
            }
        });

         */



    }
    //Conectando vistas pista3:"El collar con una cruz sangrienta indicará el camino hacia el ocaso"



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
    /*
    public void vistaLogEventos(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalSuperAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalSuperAdmin, notificaciones.class, null)
                    .commit();
        }
    }


     */
    public void vistaLogEventos() {
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalSuperAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalSuperAdmin, VistaLogEvent.class, null)
                    .commit();
        }
    }

    @Override
    public void onLogEventClick() {
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalSuperAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalSuperAdmin, VistaLogEvent.class, null)
                    .commit();
        }
    }

    public void vistaPanelCliente(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalSuperAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalSuperAdmin, PanelCliente.class, null)
                    .commit();
        }
    }

    public void vistaPanelRepartidor(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalSuperAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalSuperAdmin, PanelRepartidor.class, null)
                    .commit();
        }
    }

    public void vistaPanelAdmin(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalSuperAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalSuperAdmin, PanelAdmin.class, null)
                    .commit();
        }
    }
    public void vistaPanelRestaurante(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalSuperAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalSuperAdmin, PanelRestaurante.class, null)
                    .commit();
        }
    }

    public void vistaPerfilCliente(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalSuperAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalSuperAdmin, VistaPerfilCliente.class, null)
                    .commit();
        }
    }
    public void vistaPerfilRepartidor(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalSuperAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalSuperAdmin, VistaPerfilRepartidor.class, null)
                    .commit();
        }
    }

    public void vistaPerfilAdmin(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalSuperAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalSuperAdmin, VistaPerfilAdministrador.class, null)
                    .commit();
        }
    }

    public void vistaPerfilSuperAdmin(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalSuperAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalSuperAdmin, PerfilSuperAdmin.class, null)
                    .commit();
        }
    }

    public void vistaPlatillosDescription(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalSuperAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalSuperAdmin, PlatillosDescription.class, null)
                    .commit();
        }
    }

    public void vistaVentasDetails(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalSuperAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalSuperAdmin, HistorialVentasDetalles.class, null)
                    .commit();
        }
    }

    public void vistaRegistroAdmin1(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalSuperAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalSuperAdmin, RegistroAdministrador1.class, null)
                    .commit();
        }
    }
    public void vistaRegistroAdmin2(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalSuperAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalSuperAdmin, RegistroAdministrador2.class, null)
                    .commit();
        }
    }

    public void vistaRegistroAdminCorrect(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalSuperAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalSuperAdmin, RegistroAdminCorrect.class, null)
                    .commit();
        }
    }

    public void vistaRegistroRestaurante1(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalSuperAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalSuperAdmin, RegistroRestaurante1.class, null)
                    .commit();
        }
    }

    public void vistaRegistroRestaurante2(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalSuperAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalSuperAdmin, RegistroRestaurante2.class, null)
                    .commit();
        }
    }

    public void vistaRestauranteHistorialVentas(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalSuperAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalSuperAdmin, RestauranteHistorialVentas.class, null)
                    .commit();
        }
    }

    public void vistaRestaurantePlatillos(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalSuperAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalSuperAdmin, RestaurantePlatillos.class, null)
                    .commit();
        }
    }

    public void vistaRestauranteResumen(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalSuperAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalSuperAdmin, RestauranteResumen.class, null)
                    .commit();
        }
    }

    public void vistaRestauranteUbicacion(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalSuperAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalSuperAdmin, RestauranteUbicacion.class, null)
                    .commit();
        }
    }

    public void vistaRegistroRestauranteCorrect(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalSuperAdmin);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalSuperAdmin, RegistroRestauranteCorrect.class, null)
                    .commit();
        }
    }


    private int convertDpToPx(int dp) {
        float density = getResources().getDisplayMetrics().density;
        return Math.round(dp * density);
    }


}
