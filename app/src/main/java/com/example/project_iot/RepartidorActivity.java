package com.example.project_iot;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.project_iot.ClienteFragments.ClienteVistaRestaurante;
import com.example.project_iot.Login.VistaInicial;
import com.example.project_iot.RepartidorFragments.DetalleCompraDelivery;
import com.example.project_iot.RepartidorFragments.RepartidorConfirmacionTomarPedido;
import com.example.project_iot.RepartidorFragments.RepartidorListaPedidosPosibles;
import com.example.project_iot.RepartidorFragments.RepartidorRechazoTomarPedido;
import com.example.project_iot.RepartidorFragments.RepartidorVerMapaPedido;

public class RepartidorActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.inicio_repartidor);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmentoPrincipalRepartidor, RepartidorListaPedidosPosibles.class, null)
                    .commit();
        }
    }




    //-------------PARA IR A UNA VISTA----------------------
    public void verDetalleCompraDelivery(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalRepartidor);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalRepartidor, DetalleCompraDelivery.class, null)
                    .commit();
        }
    }
    public void verRepartidorVerMapaPedido(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalRepartidor);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalRepartidor, RepartidorVerMapaPedido.class, null)
                    .commit();
        }
    }

    public void verRepartidorConfirmacionTomarPedido(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalRepartidor);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalRepartidor, RepartidorConfirmacionTomarPedido.class, null)
                    .commit();
        }
    }

    public void verRepartidorRechazarTomarPedido(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalRepartidor);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalRepartidor, RepartidorRechazoTomarPedido.class, null)
                    .commit();
        }
    }


}
