package com.example.project_iot.SuperAdminFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.project_iot.ClienteFragments.vistaPrincipalCliente;
import com.example.project_iot.R;

public class VistaPrincipalSuperAdmin extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public VistaPrincipalSuperAdmin() {
    }

    public static VistaPrincipalSuperAdmin newInstance(String param1, String param2) {
        VistaPrincipalSuperAdmin fragment = new VistaPrincipalSuperAdmin();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.sup_admin_fragment_panel_cliente, container, false);
    }
}
