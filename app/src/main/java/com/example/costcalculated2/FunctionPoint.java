package com.example.costcalculated2;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.ViewById;


@EFragment(R.layout.fragment_function_point)
public class FunctionPoint extends Fragment {


    @FragmentArg()
    String key;


    FragmentManager manager;
    private FragmentTransaction transaction;


    String temp;
    int elInputRes, fileInputRes, elOutputRes, fileOutputRes, elRequestRes, fileRequestRes, elLogfileRes, fileLogfileRes, elInterfaceRes, fileInterfaceRes,
            inputRes, outputRes, requestRes, logfileRes, interfaceRes, allRes;


    @ViewById(R.id.gotoresult)
    Button result;

    @ViewById(R.id.elInput)
    EditText elInput;
    @ViewById(R.id.fileInput)
    EditText fileInput;

    @ViewById(R.id.elOutput)
    EditText elOutput;
    @ViewById(R.id.fileOutput)
    EditText fileOutput;

    @ViewById(R.id.elRequest)
    EditText elRequest;
    @ViewById(R.id.fileRequest)
    EditText fileRequest;

    @ViewById(R.id.elLogfile)
    EditText elLogfile;
    @ViewById(R.id.fileLogfile)
    EditText fileLogfile;

    @ViewById(R.id.elInface)
    EditText elInterface;
    @ViewById(R.id.fileInface)
    EditText fileInterface;

    @ViewById(R.id.input1)
    TextView input;
    @ViewById(R.id.output1)
    TextView output;
    @ViewById(R.id.request1)
    TextView request;
    @ViewById(R.id.logfile1)
    TextView logfile;
    @ViewById(R.id.interfacee1)
    TextView interfacee;
    @ViewById(R.id.all1)
    TextView all;




    @Click(R.id.gotoresult)
    public void resultClicked(View v) {
        temp = elInput.getText().toString();
        elInputRes = Integer.valueOf(temp);

        temp = fileInput.getText().toString();
        fileInputRes = Integer.valueOf(temp);

        temp = elOutput.getText().toString();
        elOutputRes = Integer.valueOf(temp);

        temp = fileOutput.getText().toString();
        fileOutputRes = Integer.valueOf(temp);

        temp = elRequest.getText().toString();
        elRequestRes = Integer.valueOf(temp);

        temp = fileRequest.getText().toString();
        fileRequestRes = Integer.valueOf(temp);

        temp = elLogfile.getText().toString();
        elLogfileRes = Integer.valueOf(temp);

        temp = fileLogfile.getText().toString();
        fileLogfileRes = Integer.valueOf(temp);

        temp = elInterface.getText().toString();
        elInterfaceRes = Integer.valueOf(temp);

        temp = fileInterface.getText().toString();
        fileInterfaceRes = Integer.valueOf(temp);

/////////////////////////

        if(fileInputRes <=1){
            if (elInputRes <=15) {
                inputRes = fileInputRes * 3;
            }else if (elInputRes > 15){
                inputRes = fileInputRes * 4;
            }
        }
        if(fileInputRes == 2){
            if (elInputRes <= 4) {
                inputRes = fileInputRes * 3;
            }else if (5 <= elInputRes && elInputRes <= 15){
                inputRes = fileInputRes * 4;
            }else{
                inputRes = fileInputRes * 6;
            }
        }
        if(fileInputRes > 2){
            if (elInputRes <=4) {
                inputRes = fileInputRes * 4;
            }else if (elInputRes > 4){
                inputRes = fileInputRes * 6;
            }
        }


////////////////////////////////
        if(fileOutputRes <=1){
            if (elOutputRes <=19) {
                outputRes = fileOutputRes * 4;
            }else if (elOutputRes > 19){
                outputRes = fileOutputRes * 5;
            }
        }
        if(2 <= fileOutputRes && fileOutputRes <= 3){
            if (elOutputRes <= 4) {
                outputRes = fileOutputRes * 4;
            }else if (5 <= elOutputRes && elOutputRes <= 19){
                outputRes = fileOutputRes * 5;
            }else{
                outputRes = fileOutputRes * 7;
            }
        }
        if(fileOutputRes > 3){
            if (elOutputRes <=4) {
                outputRes = fileOutputRes * 5;
            }else if (elOutputRes > 4){
                outputRes = fileOutputRes * 7;
            }
        }

///////////////////////////////////////////////
        if(fileRequestRes <=1){
            if (elRequestRes <=19) {
                requestRes = fileRequestRes * 3;
            }else if (elRequestRes > 19){
                requestRes = fileRequestRes * 4;
            }
        }
        if(2 <= fileRequestRes && fileRequestRes <= 3){
            if (elRequestRes <= 4) {
                requestRes = fileRequestRes * 3;
            }else if (5 <= elRequestRes && elRequestRes <= 19){
                requestRes = fileRequestRes * 4;
            }else{
                requestRes = fileRequestRes * 6;
            }
        }
        if(fileRequestRes > 3){
            if (elRequestRes <=4) {
                requestRes = fileRequestRes * 4;
            }else if (elRequestRes > 4){
                requestRes = fileRequestRes * 6;
            }
        }

/////////////////////////////////////////////
        if(fileLogfileRes <=1){
            if (elLogfileRes <=50) {
                logfileRes = fileLogfileRes * 7;
            }else if (elLogfileRes > 50){
                logfileRes = fileLogfileRes * 10;
            }
        }
        if(2 <= fileLogfileRes && fileLogfileRes <= 5){
            if (elLogfileRes <= 19) {
                logfileRes = fileLogfileRes * 7;
            }else if (20 <= elLogfileRes && elLogfileRes <= 50){
                logfileRes = fileLogfileRes * 10;
            }else{
                logfileRes = fileLogfileRes * 15;
            }
        }
        if(fileLogfileRes > 5){
            if (elLogfileRes <=19) {
                logfileRes = fileLogfileRes * 10;
            }else if (elLogfileRes > 19){
                logfileRes = fileLogfileRes * 15;
            }
        }


//////////////////////////////////////////////////////////
        if(fileInterfaceRes <=1){
            if (elInterfaceRes <=50) {
                interfaceRes = fileInterfaceRes * 5;
            }else if (elInterfaceRes > 50){
                interfaceRes = fileInterfaceRes * 7;
            }
        }
        if(2 <= fileInterfaceRes && fileInterfaceRes <= 5){
            if (elInterfaceRes <= 19) {
                interfaceRes = fileInterfaceRes * 5;
            }else if (20 <= elInterfaceRes && elInterfaceRes <= 50){
                interfaceRes = fileInterfaceRes * 7;
            }else{
                interfaceRes = fileInterfaceRes * 10;
            }
        }
        if(fileInterfaceRes > 5){
            if (elInterfaceRes <=19) {
                interfaceRes = fileInterfaceRes * 7;
            }else if (elInterfaceRes > 19){
                interfaceRes = fileInterfaceRes * 10;
            }
        }

        allRes = inputRes + outputRes + requestRes + logfileRes + interfaceRes;
        input.setText(Integer.toString(inputRes));
        output.setText(Integer.toString(outputRes));
        request.setText(Integer.toString(requestRes));
        logfile.setText(Integer.toString(logfileRes));
        interfacee.setText(Integer.toString(interfaceRes));
        all.setText(Integer.toString(allRes));
    }


    @Click(R.id.nexto)
    void nexto(){
        FunctionPoint2_ f = new FunctionPoint2_();
        Bundle args = new Bundle();
        args.putInt("Extra", allRes);
        f.setArguments(args);
        transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.conteiner, f);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
