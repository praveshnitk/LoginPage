package com.example.dell.loginpage;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginIn extends Fragment {


    private RadioButton mRadioCreate;
    private RadioButton mRadioLogin;

    public LoginIn() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login_in, container, false);
        mRadioCreate = (RadioButton)view.findViewById(R.id.radioCreate);
        mRadioLogin = (RadioButton)view.findViewById(R.id.radioLogin);
        mRadioCreate.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                LoginActivity loginActivity = (LoginActivity)getActivity();
                loginActivity.secondFrag();
            }
        });
        return view;
    }

}
