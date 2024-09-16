package com.example.project_iot.SuperAdminFragments;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.project_iot.R;
import com.google.android.material.switchmaterial.SwitchMaterial;

public class VistaPerfilCliente extends AppCompatActivity {
    private SwitchMaterial switchMaterial;
    private TextView tvEstado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sup_admin_fragment_perfil_cliente);

        switchMaterial = findViewById(R.id.switchMaterial);
        tvEstado = findViewById(R.id.tvEstado);

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
