package com.example.project_iot.SuperAdminFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.project_iot.R;
import com.google.android.material.switchmaterial.SwitchMaterial;

public class VistaPerfilCliente extends Fragment{
    private SwitchMaterial switchMaterial;
    private TextView tvEstado;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public VistaPerfilCliente() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ClienteVistaTracking.
     */
    // TODO: Rename and change types and number of parameters
    public static VistaPerfilCliente newInstance(String param1, String param2) {
        VistaPerfilCliente fragment = new VistaPerfilCliente();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.sup_admin_fragment_perfil_cliente, container, false);

        switchMaterial = view.findViewById(R.id.switchMaterial);
        tvEstado = view.findViewById(R.id.tvEstado);

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
        return view;
    }
}
/*
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

 */
