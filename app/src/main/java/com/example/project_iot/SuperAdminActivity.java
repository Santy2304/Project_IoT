package com.example.project_iot;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.switchmaterial.SwitchMaterial;

public class SuperAdminActivity extends AppCompatActivity {
    private SwitchMaterial switchMaterial;
    private TextView tvEstado;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        //setContentView(R.layout.inicio_superadmin);


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


    public boolean onContextItemSelected(@NonNull MenuItem item) {
        //De acuerdo al escogido se realiza el cambio de vista

        if(item.getItemId() == R.id.principal  ){
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


}
