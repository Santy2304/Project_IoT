package com.example.project_iot.SuperAdminFragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.example.project_iot.R;
import com.example.project_iot.SuperAdminActivity;
import com.google.android.material.appbar.MaterialToolbar;


import java.util.Arrays;

public class PanelCliente extends Fragment {

    private ViewPager2 viewPager;
    private CarouselAdapter adapter;
    private MaterialToolbar topAppBar;

    private OnLogEventClickListener mListener;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PanelCliente() {
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
    public static PanelCliente newInstance(String param1, String param2) {
        PanelCliente fragment = new PanelCliente();
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

    public interface OnLogEventClickListener {
        void onLogEventClick();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mListener = (OnLogEventClickListener) context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.sup_admin_fragment_panel_cliente, container, false);


        //Esto es para el carousel (no sé si funciona pipipi) pista2:"Bajo la luz de la luna un pozo de flecha y flor"
        /*viewPager = view.findViewById(R.id.view_pager);
        adapter = new CarouselAdapter(Arrays.asList(R.drawable.costumer_green, R.drawable.deliver_green2, R.drawable.admin_green));
        viewPager.setAdapter(adapter);



        topAppBar.setOnMenuItemClickListener(new MaterialToolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.log_event) {
                    // Llama al método en la actividad para reemplazar el fragmento
                    ((SuperAdminActivity) getActivity()).vistaLogEventos();
                    return true;
                } else {
                    return false;
                }
            }
        });

         */
        topAppBar = view.findViewById(R.id.topAppBar);
        topAppBar.setOnMenuItemClickListener(new MaterialToolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.log_event) {
                    mListener.onLogEventClick();
                    return true;
                } else {
                    return false;
                }
            }
        });
        return view;
    }

}
