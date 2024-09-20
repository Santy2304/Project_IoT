package com.example.project_iot;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.project_iot.ClienteFragments.ClienteVistaRestaurante;
import com.example.project_iot.Generales.notificaciones;
import com.example.project_iot.Login.VistaInicial;
import com.example.project_iot.RepartidorFragments.DetalleCompraDelivery;
import com.example.project_iot.RepartidorFragments.RepartidorConfirmacionTomarPedido;
import com.example.project_iot.RepartidorFragments.RepartidorDetalleSinBoton;
import com.example.project_iot.RepartidorFragments.RepartidorHistorialPedidos;
import com.example.project_iot.RepartidorFragments.RepartidorListaPedidosPosibles;
import com.example.project_iot.RepartidorFragments.RepartidorMapaSinBoton;
import com.example.project_iot.RepartidorFragments.RepartidorRechazoTomarPedido;
import com.example.project_iot.RepartidorFragments.RepartidorTrackingEstadoEnCamino;
import com.example.project_iot.RepartidorFragments.RepartidorTrackingEstadoEnPreparacion;
import com.example.project_iot.RepartidorFragments.RepartidorTrackingEstadoRecibido;
import com.example.project_iot.RepartidorFragments.RepartidorTrackingFinalizado;
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
    public void verListaPedidosPosibles(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalRepartidor);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalRepartidor, RepartidorListaPedidosPosibles.class, null)
                    .commit();
        }
    }
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
    public void verRepartidorTrackingEstadoRecibido(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalRepartidor);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalRepartidor, RepartidorTrackingEstadoRecibido.class, null)
                    .commit();
        }
    }
    public void verRepartidorTrackingEstadoEnPreparacion(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalRepartidor);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalRepartidor, RepartidorTrackingEstadoEnPreparacion.class, null)
                    .commit();
        }
    }
    public void verRepartidorTrackingEstadoEnCamino(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalRepartidor);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalRepartidor, RepartidorTrackingEstadoEnCamino.class, null)
                    .commit();
        }
    }
    public void verRepartidorTrackingFinalizado(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalRepartidor);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalRepartidor, RepartidorTrackingFinalizado.class, null)
                    .commit();
        }
    }
    public void verRepartidorHistorialPedido(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalRepartidor);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalRepartidor, RepartidorHistorialPedidos.class, null)
                    .commit();
        }
    }
    public void verDetalleCompraDeliverySinBoton(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalRepartidor);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalRepartidor, RepartidorDetalleSinBoton.class, null)
                    .commit();
        }
    }
    public void verRepartidorVerMapaPedidoSinBoton(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalRepartidor);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalRepartidor, RepartidorMapaSinBoton.class, null)
                    .commit();
        }
    }
    public void vistaNotificaciones(View view){
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragmentoPrincipalRepartidor /*Id del fragmento que vas a reemplazar*/);
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                    .replace(R.id.fragmentoPrincipalRepartidor /*Id del fragmento que vas a reemplazar*/,
                            notificaciones.class /*Clase q se relaciona al fragmento*/, null)
                    .commit();
        }
    }





    public void verQrRepartidor(View view){
    }

}
