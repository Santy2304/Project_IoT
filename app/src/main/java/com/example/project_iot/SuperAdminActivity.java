package com.example.project_iot;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SuperAdminActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.inicio_superadmin);

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
