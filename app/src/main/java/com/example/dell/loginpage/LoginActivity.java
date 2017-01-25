package com.example.dell.loginpage;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.SearchManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;

import android.support.v7.app.AppCompatActivity;


import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private FragmentManager mFragmentManager;
    private FragmentTransaction mFragmentTransaction;
    private LoginIn mFirstFrag;
    private Button mCreateAccount;
    private Button mLogin;
    private SignUp mSecFrag;
    private RadioButton mRadioCreate;
    private RadioButton mRadioLogin;
    private Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mFragmentManager = getFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFirstFrag = new LoginIn();
        mSecFrag = new SignUp();
        mRadioCreate = (RadioButton) findViewById(R.id.radioCreate);
        mRadioLogin = (RadioButton) findViewById(R.id.radioLogin);
        mFragmentTransaction.replace(R.id.myframe, mFirstFrag);
        mFragmentTransaction.commit();
        mRadioLogin.setVisibility(View.GONE);
        mRadioLogin.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(LoginActivity.this,"hello login",Toast.LENGTH_LONG).show();
                if (mRadioLogin.isChecked()) {
                    mRadioLogin.setVisibility(View.GONE);
                    mFragmentTransaction = mFragmentManager.beginTransaction();
                    mFragmentTransaction.add(R.id.myframe, mFirstFrag);
                    mFragmentTransaction.commit();
                }
            }
        });

    }

    public void secondFrag() {
        mRadioLogin.setVisibility(View.VISIBLE);
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.myframe, mSecFrag);
        mFragmentTransaction.commit();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        // Inflate menu to add items to action bar if it is present.
        inflater.inflate(R.menu.menu, menu);
        // Associate searchable configuration with the SearchView
        SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView =
                (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setSearchableInfo(
                searchManager.getSearchableInfo(getComponentName()));

        return true;
    }

}
