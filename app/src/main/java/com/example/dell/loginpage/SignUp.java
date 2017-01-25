package com.example.dell.loginpage;


import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import java.util.ArrayList;



/**
 * A simple {@link Fragment} subclass.
 */
public class SignUp extends Fragment implements View.OnClickListener,AdapterView.OnItemSelectedListener  {


    private EditText usremame;
    private EditText userPassword;
    private EditText cnfPassword;
    private EditText secAnswer;
    private Spinner spinner;
    Integer locationspinner;
    private Button button;
    private RadioButton mRadioLogin;
    private RadioButton mRadioCreate;

    public SignUp() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_sign_up, container, false);
        mRadioCreate = (RadioButton)view.findViewById(R.id.radioCreate);
        usremame= (EditText) view.findViewById(R.id.sUpName);
        userPassword= (EditText) view.findViewById(R.id.sUpPassword);
        cnfPassword= (EditText) view.findViewById(R.id.sUpcnfpasswrd);
        secAnswer= (EditText) view.findViewById(R.id.sUpSecurityAnswer);
        spinner= (Spinner) view.findViewById(R.id.sUpSpinner);
        button  = (Button) view.findViewById(R.id.sUpCreateNewAccount);
        ArrayList<String> list=new ArrayList<>();
        list.add("what is your favorite color ?");
        list.add("what is your favorite movie ?");
        list.add("what was your first mobile number ?");
        list.add("what is your favorite actor ?");
        list.add("what is your favorite food ?");
        list.add("what is your favorite programming language ?");
        list.add("what is your favorite game");
        list.add("who is your favorite friend ?");
        list.add("who is your favorite teacher ?");
        list.add("who is your favorite book ?");
        list.add("what was your birth place ?");
        list.add("what is the name of your city ?");
        list.add("what is the name of your village ?");
        list.add("what was your first pet's name ?");
        list.add("whate was tha make of your first car ?");
        list.add("whate was tha make of your first motorcycle ?");
        list.add("what was your father's occupation ?");
        list.add("what was your grandfather's occupation ?");
        list.add("what was your grandmother's occupation ?");
        /*for(int i=0;i<5;i++)
        {
            list.add(i+"");
        }*/
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(view.getContext(),android.R.layout.simple_spinner_item,list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        button.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        locationspinner=i;
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
locationspinner=0;
    }
}
