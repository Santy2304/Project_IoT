package com.example.project_iot.SuperAdminFragments;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.project_iot.R;
import com.google.android.material.switchmaterial.SwitchMaterial;

public class VistaPerfilRepartidor extends AppCompatActivity {
    private SwitchMaterial switchMaterial;
    private TextView tvEstado;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.sup_admin_fragment_perfil_repartidor);

        switchMaterial = findViewById(R.id.switchRepartidor);
        tvEstado = findViewById(R.id.tvRepartidor);

        switchMaterial.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    tvEstado.setText("Activado");
                } else {
                    tvEstado.setText("Desactivado");
                }
            }
        });
    }
}
