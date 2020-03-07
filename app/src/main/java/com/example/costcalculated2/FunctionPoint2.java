package com.example.costcalculated2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.ViewById;


@EFragment(R.layout.fragment_function_point2)
public class FunctionPoint2 extends Fragment {
    //@FragmentArg()

    String key;

    String[] rate = {"0", "1", "2", "3", "4", "5"};

    double cafC, afpC;
    int dataComunictation, distributedFunc, performance,
            heavilyUsedConf, transactionRate, onlineDataEntry,
            endUserEff, onlineUp, complxProc, reusability,
            instalationEase, operationalEase, multipleSites, factChange, resultRate;
    String temp, rateR, cafS, afpS;


    @ViewById(R.id.gotoresult)
    Button result;
    @ViewById(R.id.rate)
    TextView rateS;
    @ViewById(R.id.caf)
    TextView caf;
    @ViewById(R.id.afp)
    TextView afp;


    @ViewById(R.id.spinner1)
    Spinner spinner1;
    @ViewById(R.id.spinner2)
    Spinner spinner2;
    @ViewById(R.id.spinner3)
    Spinner spinner3;
    @ViewById(R.id.spinner4)
    Spinner spinner4;
    @ViewById(R.id.spinner5)
    Spinner spinner5;
    @ViewById(R.id.spinner6)
    Spinner spinner6;
    @ViewById(R.id.spinner7)
    Spinner spinner7;
    @ViewById(R.id.spinner8)
    Spinner spinner8;
    @ViewById(R.id.spinner9)
    Spinner spinner9;
    @ViewById(R.id.spinner10)
    Spinner spinner10;
    @ViewById(R.id.spinner11)
    Spinner spinner11;
    @ViewById(R.id.spinner12)
    Spinner spinner12;
    @ViewById(R.id.spinner13)
    Spinner spinner13;
    @ViewById(R.id.spinner14)
    Spinner spinner14;



    @AfterViews
    void bindAdapter() {
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, rate);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);


        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, rate);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);


        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, rate);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);


        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, rate);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);

        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, rate);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter5);

        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, rate);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6.setAdapter(adapter6);

        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, rate);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner7.setAdapter(adapter7);


        ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, rate);
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner8.setAdapter(adapter8);


        ArrayAdapter<String> adapter9 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, rate);
        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner9.setAdapter(adapter9);

        ArrayAdapter<String> adapter10 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, rate);
        adapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner10.setAdapter(adapter10);

        ArrayAdapter<String> adapter11 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, rate);
        adapter11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner11.setAdapter(adapter11);


        ArrayAdapter<String> adapter12 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, rate);
        adapter12.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner12.setAdapter(adapter12);


        ArrayAdapter<String> adapter13 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, rate);
        adapter13.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner13.setAdapter(adapter13);


        ArrayAdapter<String> adapter14 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, rate);
        adapter14.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner14.setAdapter(adapter14);

    }



    @Click(R.id.gotoresult)
    public void resultClicked(View v) {

        int fp = getArguments().getInt("Extra", 0);
        dataComunictation =  Integer.parseInt(spinner1.getSelectedItem().toString());
        distributedFunc =  Integer.parseInt(spinner2.getSelectedItem().toString());
        performance =  Integer.parseInt(spinner3.getSelectedItem().toString());
        heavilyUsedConf =  Integer.parseInt(spinner4.getSelectedItem().toString());
        transactionRate =  Integer.parseInt(spinner5.getSelectedItem().toString());
        onlineDataEntry =  Integer.parseInt(spinner6.getSelectedItem().toString());
        endUserEff =  Integer.parseInt(spinner7.getSelectedItem().toString());
        onlineUp =  Integer.parseInt(spinner8.getSelectedItem().toString());
        complxProc =  Integer.parseInt(spinner9.getSelectedItem().toString());
        reusability =  Integer.parseInt(spinner10.getSelectedItem().toString());
        instalationEase =  Integer.parseInt(spinner11.getSelectedItem().toString());
        operationalEase =  Integer.parseInt(spinner12.getSelectedItem().toString());
        multipleSites =  Integer.parseInt(spinner13.getSelectedItem().toString());
        factChange =  Integer.parseInt(spinner14.getSelectedItem().toString());

        resultRate = dataComunictation + distributedFunc + performance + heavilyUsedConf + transactionRate + onlineDataEntry + endUserEff + onlineUp + complxProc + reusability + instalationEase + operationalEase + multipleSites + factChange;

        cafC = 0.65 + (0.01 * resultRate);
        afpC = cafC * fp;


        rateS.setText("Загальний рейтинг: " + Integer.toString(resultRate));
        caf.setText("CAF: " + Double.toString(cafC));
        afp.setText("AFP: " + Double.toString(afpC));

    }
}
