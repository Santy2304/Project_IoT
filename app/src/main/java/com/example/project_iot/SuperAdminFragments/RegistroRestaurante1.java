package com.example.project_iot.SuperAdminFragments;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.project_iot.ClienteFragments.ClienteVistaTracking;
import com.example.project_iot.R;
import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class RegistroRestaurante1 extends Fragment {
    Spinner tipoCategoria;
    private TextInputEditText tiHinicio;
    private TextInputEditText tiHfin;
    private int hora, minuto;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public RegistroRestaurante1() {
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
    public static RegistroRestaurante1 newInstance(String param1, String param2) {
        RegistroRestaurante1 fragment = new RegistroRestaurante1();
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
        View view = inflater.inflate(R.layout.sup_admin_fragment_registro_restaurante_part1, container, false);

        //Para las categorías
        tipoCategoria = (Spinner) view.findViewById(R.id.spinner_categoria);

        tipoCategoria.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(), "Categoría: " + adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //Para la hora inicio y fin pista1:"El tercer perro de un castillo de espadas"

        tiHinicio = (TextInputEditText) view.findViewById(R.id.hora_inicio);
        tiHfin = (TextInputEditText) view.findViewById(R.id.hora_fin);

        tiHinicio.setOnClickListener(this::onClick);
        tiHfin.setOnClickListener(this::onClick);

        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        String time = dateFormat.format(new Date());



        return view;
    }

    public void onClick(View v){
        if(v==tiHinicio){
            final Calendar calendar = Calendar.getInstance();

            hora = calendar.get(Calendar.HOUR_OF_DAY);
            minuto = calendar.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(), new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker timePicker, int hoursOfDay, int minute) {
                    tiHinicio.setText(hoursOfDay + ":" + minute);
                }
            }, hora, minuto, false);
            timePickerDialog.show();
        }

        if(v==tiHfin){
            final Calendar calendar = Calendar.getInstance();

            hora = calendar.get(Calendar.HOUR_OF_DAY);
            minuto = calendar.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(), new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker timePicker, int hoursOfDay, int minute) {
                    tiHfin.setText(hoursOfDay + ":" + minute);
                }
            }, hora, minuto, false);
            timePickerDialog.show();
        }

    }
}
