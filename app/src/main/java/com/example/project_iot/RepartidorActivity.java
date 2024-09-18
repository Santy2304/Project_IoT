package com.example.project_iot;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.project_iot.Login.VistaInicial;
import com.example.project_iot.RepartidorFragments.RepartidorListaPedidosPosibles;

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


}
