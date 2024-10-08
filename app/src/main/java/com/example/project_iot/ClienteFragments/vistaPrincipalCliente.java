package com.example.project_iot.ClienteFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project_iot.R;
import com.example.project_iot.databinding.ActivityMainBinding;


public class vistaPrincipalCliente extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public vistaPrincipalCliente() {
    }

     public static vistaPrincipalCliente newInstance(String param1, String param2) {
        vistaPrincipalCliente fragment = new vistaPrincipalCliente();
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
        return inflater.inflate(R.layout.fragment_vista_principal_cliente, container, false);
    }
}