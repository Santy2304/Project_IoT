package com.example.project_iot.Login;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.project_iot.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LoginCambiarPasswordSegundoPaso#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LoginCambiarPasswordSegundoPaso extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LoginCambiarPasswordSegundoPaso() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LoginCambiarPasswordSegundoPaso.
     */
    // TODO: Rename and change types and number of parameters
    public static LoginCambiarPasswordSegundoPaso newInstance(String param1, String param2) {
        LoginCambiarPasswordSegundoPaso fragment = new LoginCambiarPasswordSegundoPaso();
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
        View view = inflater.inflate(R.layout.fragment_login_cambiar_password_segundo_paso, container, false);

        EditText code1 = view.findViewById(R.id.code1);
        EditText code2 = view.findViewById(R.id.code2);
        EditText code3 = view.findViewById(R.id.code3);
        EditText code4 =  view.findViewById(R.id.code4);
        EditText code5 =  view.findViewById(R.id.code5);
        EditText code6 =  view.findViewById(R.id.code6);

        code1.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                // Este método se puede dejar en blanco
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Este método se puede dejar en blanco
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 1) {  // Cambiará de foco después de escribir una letra
                    code2.requestFocus();  // Cambia el foco al segundo EditText
                }
            }
        });
        code2.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                // Este método se puede dejar en blanco
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Este método se puede dejar en blanco
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 1) {  // Cambiará de foco después de escribir una letra
                    code3.requestFocus();  // Cambia el foco al segundo EditText
                }
            }
        });
        code3.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                // Este método se puede dejar en blanco
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Este método se puede dejar en blanco
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 1) {  // Cambiará de foco después de escribir una letra
                    code4.requestFocus();  // Cambia el foco al segundo EditText
                }
            }
        });
        code4.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                // Este método se puede dejar en blanco
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Este método se puede dejar en blanco
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 1) {  // Cambiará de foco después de escribir una letra
                    code5.requestFocus();  // Cambia el foco al segundo EditText
                }
            }
        });
        code5.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                // Este método se puede dejar en blanco
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Este método se puede dejar en blanco
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 1) {  // Cambiará de foco después de escribir una letra
                    code6.requestFocus();  // Cambia el foco al segundo EditText
                }
            }
        });

        // Inflate the layout for this fragment
        return view;
    }







}