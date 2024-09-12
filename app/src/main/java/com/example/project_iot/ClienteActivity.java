package com.example.project_iot;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.project_iot.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ClienteActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal_cliente2);
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

}
