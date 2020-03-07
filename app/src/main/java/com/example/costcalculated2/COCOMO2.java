package com.example.costcalculated2;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.ItemSelect;
import org.androidannotations.annotations.ViewById;

@EFragment(R.layout.fragment_basic)
public class COCOMO2 extends Fragment {

    @FragmentArg()
    String key;
    String[] typeOfCal = {"Early Design", "Post Architecture"};
    String[] haveExperience1 = {"6.20", "4.96", "3.72", "2.48", "1.24", "0.0"};
    String[] gnuchkistProces2 = {"5.07", "4.05", "3.04", "2.03", "1.01", "0.0"};
    String[] permissionRisk3 = {"7.07", "5.65", "4.24", "2.83", "1.41", "0.0"};
    String[] team4 = {"5.48", "4.38", "3.29", "2.19", "1.10", "0.0"};
    String[] zrilistProcess5 = {"7.80", "6.24", "4.68", "3.12", "1.56", "0.0"};

    String[] kvalPers1 = {"2.12", "1.62", "1.26", "1.00", "0.83", "0.63", "0.50"};
    String[] ExperiencePers2 = {"1.59", "1.33", "1.22", "1.00", "0.87", "0.74", "0.62"};
    String[] hardProduct3 = {"0.49", "0.60", "0.83", "1.00", "1.33", "1.91", "2.72"};
    String[] repeatUse4 = {"n/a", "n/a", "0.95", "1.00", "1.07", "1.15", "1.24"};
    String[] hardPlatform5 = {"n/a", "n/a", "0.87", "1.00", "1.29", "1.81", "2.61"};
    String[] hardware6 = {"1.43", "1.30", "1.10", "1.00", "0.87", "0.73", "0.62"};
    String[] graphWork7= {"n/a", "1.43", "1.14", "1.00", "1.00", "n/a", "n/a"};


    String[] analitic1 = {"1.42", "1.29", "1.00", "0.85", "0.71", "n/a"};
    String[] expiriance2 = {"1.22", "1.10", "1.00", "0.88", "0.81", "n/a"};
    String[] skillPZ3 = {"1.34", "1.15", "1.00", "0.88", "0.76", "n/a"};
    String[] persContinue4 = {"1.29", "1.12", "1.00", "0.90", "0.81", "n/a"};
    String[] expirianceVM5 = {"1.19", "1.09", "1.00", "0.91", "0.85", "n/a"};
    String[] expiriancework6 = {"1.20", "1.09", "1.00", "0.91", "0.84", "n/a"};
    String[] nadiinist7 = {"0.84", "0.92", "1.00", "1.10", "1.26", "n/a"};
    String[] sizeBD8 = {"n/a", "0.23", "1.00", "1.14", "1.28", "n/a"};
    String[] skladnist9 = {"0.73", "0.87", "1.00", "1.17", "1.34", "1.74"};
    String[] multiUse10 = {"n/a", "0.95", "1.00", "1.07", "1.15", "1.24"};
    String[] documantation11 = {"0.81", "0.91", "1.00", "1.11", "1.23", "n/a"};
    String[] speedlimit12 = {"n/a", "n/a", "1.00", "1.11", "1.29", "1.63"};
    String[] memorylimit13 = {"n/a", "n/a", "1.00", "1.05", "1.17", "1.46"};
    String[] virtualm14 = {"n/a", "0.87", "1.00", "1.15", "1.30", "n/a"};
    String[] tools15 = {"1.17", "1.09", "1.00", "0.90", "0.78", "n/a"};
    String[] grahics16 = {"1.43", "1.14", "1.00", "1.00", "1.00", "n/a"};
    String[] multisite17 = {"1.22", "1.09", "1.00", "0.93", "0.86", "0.80"};

    private double size, eaf, pm, tm, ss, e, sf, f;
    private double haveExperienceRes, gnuchkistProcesRes, permissionRiskRes, teamRes, zrilistProcessRes,

            kvalPersRes, ExperiencePersRes, hardProductRes, repeatUseRes, hardPlatformRes, hardwareRes, graphWorkRes,

            analiticRes, expirianceRes, skillPZRes, persContinueRes, expirianceVMRes, expirianceworkRes, nadiinistRes, sizeBDRes, skladnistRes,  multiUseRes,
            documantationRes, speedlimitRes, memorylimitRes, virtualmRes, toolsRes, grahicsRes, multisite;
    private String temp, pmS, tmS, ssS;
    final static String LOG = "LOG";
    double B = 0.91;
    double A = 2.94;
    double C = 3.67;
    double D = 0.28;


    @ViewById(R.id.textView21)
    TextView test;
    @ViewById(R.id.gotoresult)
    Button result;
    @ViewById(R.id.countcode)
    EditText count;
    @ViewById(R.id.work)
    TextView work;
    @ViewById(R.id.howlong)
    TextView hlong;
    @ViewById(R.id.people)
    TextView people;

    @ViewById(R.id.typeofProj2)
    Spinner typeOfProj;
    @ViewById(R.id.haveExperiance)
    Spinner haveExperience;
    @ViewById(R.id.gnuchkistProces2)
    Spinner gnuchkistProces;
    @ViewById(R.id.permissionRisk3)
    Spinner permissionRisk;
    @ViewById(R.id.team4)
    Spinner team;
    @ViewById(R.id.zrilistProcess5)
    Spinner zrilistProcess;


    @ViewById(R.id.textView8)
    TextView textView1;
    @ViewById(R.id.spinner1)
    Spinner spinner1;

    @ViewById(R.id.textView9)
    TextView textView2;
    @ViewById(R.id.spinner2)
    Spinner spinner2;

    @ViewById(R.id.textView10)
    TextView textView3;
    @ViewById(R.id.spinner3)
    Spinner spinner3;

    @ViewById(R.id.textView11)
    TextView textView4;
    @ViewById(R.id.spinner4)
    Spinner spinner4;

    @ViewById(R.id.textView12)
    TextView textView5;
    @ViewById(R.id.spinner5)
    Spinner spinner5;

    @ViewById(R.id.textView13)
    TextView textView6;
    @ViewById(R.id.spinner6)
    Spinner spinner6;

    @ViewById(R.id.textView14)
    TextView textView7;
    @ViewById(R.id.spinner7)
    Spinner spinner7;

    @ViewById(R.id.textView22)
    TextView textView8;
    @ViewById(R.id.spinner8)
    Spinner spinner8;

    @ViewById(R.id.textView23)
    TextView textView9;
    @ViewById(R.id.spinner9)
    Spinner spinner9;

    @ViewById(R.id.textView24)
    TextView textView10;
    @ViewById(R.id.spinner10)
    Spinner spinner10;

    @ViewById(R.id.textView25)
    TextView textView11;
    @ViewById(R.id.spinner11)
    Spinner spinner11;

    @ViewById(R.id.textView26)
    TextView textView12;
    @ViewById(R.id.spinner12)
    Spinner spinner12;

    @ViewById(R.id.textView27)
    TextView textView13;
    @ViewById(R.id.spinner13)
    Spinner spinner13;

    @ViewById(R.id.textView28)
    TextView textView14;
    @ViewById(R.id.spinner14)
    Spinner spinner14;

    @ViewById(R.id.textView29)
    TextView textView15;
    @ViewById(R.id.spinner15)
    Spinner spinner15;

    @ViewById(R.id.textView30)
    TextView textView16;
    @ViewById(R.id.spinner16)
    Spinner spinner16;

    @ViewById(R.id.textView31)
    TextView textView17;
    @ViewById(R.id.spinner17)
    Spinner spinner17;



    @AfterViews
    void bindAdapter() {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, typeOfCal);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        typeOfProj.setAdapter(adapter);


        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, haveExperience1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        haveExperience.setAdapter(adapter1);


        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, gnuchkistProces2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gnuchkistProces.setAdapter(adapter2);


        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, permissionRisk3);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        permissionRisk.setAdapter(adapter3);


        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, team4);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        team.setAdapter(adapter4);


        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, zrilistProcess5);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        zrilistProcess.setAdapter(adapter5);


    }


    public void earlyDesign(){
        textView1.setText("Кваліфікація персоналу:");
        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, kvalPers1);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter6);

        textView2.setText("Досвід персоналу:");
        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, ExperiencePers2);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter7);

        textView3.setText("Cкладність і надійність продукту:");
        ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, hardProduct3);
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter8);

        textView4.setText("Розробка для повторного використання");
        ArrayAdapter<String> adapter9 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, repeatUse4);
        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter9);

        textView5.setText("Cкладність платформи розробки:");
        ArrayAdapter<String> adapter10 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, hardPlatform5);
        adapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter10);

        textView6.setText("Обладнання:");
        ArrayAdapter<String> adapter11 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, hardware6);
        adapter11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6.setAdapter(adapter11);

        textView7.setText("Необхідний для виконання графік робіт:");
        ArrayAdapter<String> adapter12 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, graphWork7);
        adapter12.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner7.setAdapter(adapter12);

        textView8.setVisibility(View.INVISIBLE); textView9.setVisibility(View.INVISIBLE); textView10.setVisibility(View.INVISIBLE); textView11.setVisibility(View.INVISIBLE); textView12.setVisibility(View.INVISIBLE); textView13.setVisibility(View.INVISIBLE); textView14.setVisibility(View.INVISIBLE); textView15.setVisibility(View.INVISIBLE); textView16.setVisibility(View.INVISIBLE); textView17.setVisibility(View.INVISIBLE);
        spinner8.setVisibility(View.INVISIBLE); spinner9.setVisibility(View.INVISIBLE); spinner10.setVisibility(View.INVISIBLE); spinner11.setVisibility(View.INVISIBLE); spinner12.setVisibility(View.INVISIBLE); spinner13.setVisibility(View.INVISIBLE); spinner14.setVisibility(View.INVISIBLE); spinner15.setVisibility(View.INVISIBLE); spinner16.setVisibility(View.INVISIBLE); spinner17.setVisibility(View.INVISIBLE);

    }




    public void postArchitecture(){

        textView8.setVisibility(View.VISIBLE); textView9.setVisibility(View.VISIBLE); textView10.setVisibility(View.VISIBLE); textView11.setVisibility(View.VISIBLE); textView12.setVisibility(View.VISIBLE); textView13.setVisibility(View.VISIBLE); textView14.setVisibility(View.VISIBLE); textView15.setVisibility(View.VISIBLE); textView16.setVisibility(View.VISIBLE); textView17.setVisibility(View.VISIBLE);
        spinner8.setVisibility(View.VISIBLE); spinner9.setVisibility(View.VISIBLE); spinner10.setVisibility(View.VISIBLE); spinner11.setVisibility(View.VISIBLE); spinner12.setVisibility(View.VISIBLE); spinner13.setVisibility(View.VISIBLE); spinner14.setVisibility(View.VISIBLE); spinner15.setVisibility(View.VISIBLE); spinner16.setVisibility(View.VISIBLE); spinner17.setVisibility(View.VISIBLE);


        textView1.setText("Можливостсті аналітики:");
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, analitic1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        textView2.setText("досвід розробки додатків:");
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, expiriance2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        textView3.setText("Можливості програміста:");
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, skillPZ3);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);

        textView4.setText("Тривалість роботи персоналу:");
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, persContinue4);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);

        textView5.setText("Досвід роботи з платформою:");
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, expirianceVM5);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter5);

        textView6.setText("Досвід в мові програмування");
        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, expiriancework6);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6.setAdapter(adapter6);

        textView7.setText("Необхідна надійність:");
        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, nadiinist7);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner7.setAdapter(adapter7);


        textView8.setText("Розмір бази даних:");
        ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, sizeBD8);
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner8.setAdapter(adapter8);

        textView9.setText("Складність програми:");
        ArrayAdapter<String> adapter9 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, skladnist9);
        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner9.setAdapter(adapter9);

        textView10.setText("Багаторазове використання:");
        ArrayAdapter<String> adapter10 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, multiUse10);
        adapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner10.setAdapter(adapter10);

        textView11.setText("Документація потребам життєвого циклу:");
        ArrayAdapter<String> adapter11 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, documantation11);
        adapter11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner11.setAdapter(adapter11);

        textView12.setText("Обмеження часу виконання:");
        ArrayAdapter<String> adapter12 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, speedlimit12);
        adapter12.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner12.setAdapter(adapter12);

        textView13.setText("Обмеження пам'яті:");
        ArrayAdapter<String> adapter13 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, memorylimit13);
        adapter13.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner13.setAdapter(adapter13);

        textView14.setText("Змінність платформи:");
        ArrayAdapter<String> adapter14 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, virtualm14);
        adapter14.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner14.setAdapter(adapter14);

        textView15.setText("Використання інструментальних засобів:");
        ArrayAdapter<String> adapter15 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, tools15);
        adapter15.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner15.setAdapter(adapter15);

        textView16.setText("Необхідність виконання графіки:");
        ArrayAdapter<String> adapter16 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, grahics16);
        adapter16.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner16.setAdapter(adapter16);

        textView17.setText("Віддаленна розробка:");
        ArrayAdapter<String> adapter17 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, multisite17);
        adapter17.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner17.setAdapter(adapter16);
    }


    @ItemSelect(R.id.typeofProj2)
    public void typeOfProj(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                A = 2.94;
                earlyDesign();
                break;
            case 1:
                A = 2.45;
                postArchitecture();
                break;
            default:
                break;
        }
    }


    @ItemSelect(R.id.haveExperiance)
    public void haveExperience(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                haveExperienceRes = 6.20;
                break;
            case 1:
                haveExperienceRes = 4.96;
                break;
            case 2:
                haveExperienceRes = 3.72;
                break;
            case 3:
                haveExperienceRes = 2.48;
                break;
            case 4:
                haveExperienceRes = 1.24;
                break;
            case 5:
                haveExperienceRes = 1.00;
                break;
            default:
                break;
        }
    }
    @ItemSelect(R.id.gnuchkistProces2)
    public void gnuchkistProces(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                gnuchkistProcesRes = 5.07;
                break;
            case 1:
                gnuchkistProcesRes = 4.05;
                break;
            case 2:
                gnuchkistProcesRes = 3.04;
                break;
            case 3:
                gnuchkistProcesRes = 2.03;
                break;
            case 4:
                gnuchkistProcesRes = 1.01;
                break;
            case 5:
                gnuchkistProcesRes = 1.00;
                break;
            default:
                break;
        }
    }
    @ItemSelect(R.id.permissionRisk3)
    public void permissionRisk(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                permissionRiskRes = 7.07;
                break;
            case 1:
                permissionRiskRes = 5.65;
                break;
            case 2:
                permissionRiskRes = 4.24;
                break;
            case 3:
                permissionRiskRes = 2.83;
                break;
            case 4:
                permissionRiskRes = 1.41;
                break;
            case 5:
                permissionRiskRes = 1.00;
                break;
            default:
                break;
        }
    }
    @ItemSelect(R.id.team4)
    public void team(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                teamRes = 5.48;
                break;
            case 1:
                teamRes = 4.38;
                break;
            case 2:
                teamRes = 3.29;
                break;
            case 3:
                teamRes = 2.19;
                break;
            case 4:
                teamRes = 1.10;
                break;
            case 5:
                teamRes = 1.00;
                break;
            default:
                break;
        }
    }
    @ItemSelect(R.id.zrilistProcess5)
    public void zrilistProcess(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                zrilistProcessRes = 7.80;
                break;
            case 1:
                zrilistProcessRes = 6.24;
                break;
            case 2:
                zrilistProcessRes = 4.68;
                break;
            case 3:
                zrilistProcessRes = 3.12;
                break;
            case 4:
                zrilistProcessRes = 1.56;
                break;
            case 5:
                zrilistProcessRes = 1.00;
                break;
            default:
                break;
        }
    }


    @ItemSelect(R.id.spinner1)
    public void setSpinner1(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                kvalPersRes = 2.12;
                analiticRes = 1.42;
                break;
            case 1:
                kvalPersRes = 1.62;
                analiticRes = 1.29;
                break;
            case 2:
                kvalPersRes = 1.26;
                analiticRes = 1.00;
                break;
            case 3:
                kvalPersRes = 1.00;
                analiticRes = 0.85;
                break;
            case 4:
                kvalPersRes = 0.83;
                analiticRes = 0.71;
                break;
            case 5:
                kvalPersRes = 0.63;
                analiticRes = 1.00;
                break;
            case 6:
                kvalPersRes = 0.50;
            default:
                break;
        }
    }

    @ItemSelect(R.id.spinner2)
    public void setSpinner2(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                ExperiencePersRes = 1.59;
                expirianceRes = 1.22;
                break;
            case 1:
                ExperiencePersRes = 1.33;
                expirianceRes = 1.10;
                break;
            case 2:
                ExperiencePersRes = 1.22;
                expirianceRes = 1.00;
                break;
            case 3:
                ExperiencePersRes = 1.00;
                expirianceRes = 0.88;
                break;
            case 4:
                ExperiencePersRes = 0.87;
                expirianceRes = 0.81;
                break;
            case 5:
                ExperiencePersRes = 0.74;
                expirianceRes = 1.00;
                break;
            case 6:
                ExperiencePersRes = 0.62;
            default:
                break;
        }
    }

    @ItemSelect(R.id.spinner3)
    public void setSpinner3(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                hardProductRes = 0.49;
                skillPZRes = 1.34;
                break;
            case 1:
                hardProductRes = 0.60;
                skillPZRes = 1.15;
                break;
            case 2:
                hardProductRes = 0.83;
                skillPZRes = 1.00;
                break;
            case 3:
                hardProductRes = 1.00;
                skillPZRes = 0.88;
                break;
            case 4:
                hardProductRes = 1.33;
                skillPZRes = 0.76;
                break;
            case 5:
                hardProductRes = 1.91;
                skillPZRes = 1.00;
                break;
            case 6:
                hardProductRes = 2.72;
            default:
                break;
        }
    }

    @ItemSelect(R.id.spinner4)
    public void setSpinner4(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                repeatUseRes = 1.00;
                persContinueRes = 1.29;
                break;
            case 1:
                repeatUseRes = 1.00;
                persContinueRes = 1.12;
                break;
            case 2:
                repeatUseRes = 0.95;
                persContinueRes = 1.00;
                break;
            case 3:
                repeatUseRes = 1.00;
                persContinueRes = 1.00;
                break;
            case 4:
                repeatUseRes = 1.07;
                persContinueRes = 0.90;
                break;
            case 5:
                repeatUseRes = 1.15;
                persContinueRes = 0.81;
                break;
            case 6:
                repeatUseRes = 1.24;
                persContinueRes = 1.00;
            default:
                break;
        }
    }

    @ItemSelect(R.id.spinner5)
    public void setSpinner5(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                hardPlatformRes = 1.00;
                expirianceVMRes = 1.19;
                break;
            case 1:
                hardPlatformRes = 1.00;
                expirianceVMRes = 1.09;
                break;
            case 2:
                hardPlatformRes = 0.87;
                expirianceVMRes = 1.00;
                break;
            case 3:
                hardPlatformRes = 1.00;
                expirianceVMRes = 0.91;
                break;
            case 4:
                hardPlatformRes = 1.29;
                expirianceVMRes = 0.85;
                break;
            case 5:
                hardPlatformRes = 1.81;
                expirianceVMRes = 1.00;
                break;
            case 6:
                hardPlatformRes = 2.61;
            default:
                break;
        }
    }

    @ItemSelect(R.id.spinner6)
    public void setSpinner6(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                hardwareRes = 1.43;
                expirianceworkRes = 1.20;
                break;
            case 1:
                hardwareRes = 1.30;
                expirianceworkRes = 1.09;
                break;
            case 2:
                hardwareRes = 1.10;
                expirianceworkRes = 1.00;
                break;
            case 3:
                hardwareRes = 1.00;
                expirianceworkRes = 0.91;
                break;
            case 4:
                hardwareRes = 0.87;
                expirianceworkRes = 0.84;
                break;
            case 5:
                hardwareRes = 0.73;
                expirianceworkRes = 1.00;
                break;
            case 6:
                hardwareRes = 0.62;
            default:
                break;
        }
    }

    @ItemSelect(R.id.spinner7)
    public void setSpinner7(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                graphWorkRes = 1.00;
                nadiinistRes = 0.84;
                break;
            case 1:
                graphWorkRes = 1.43;
                nadiinistRes = 0.92;
                break;
            case 2:
                graphWorkRes = 1.14;
                nadiinistRes = 1.00;
                break;
            case 3:
                graphWorkRes = 1.00;
                nadiinistRes = 1.10;
                break;
            case 4:
                graphWorkRes = 1.00;
                nadiinistRes = 1.26;
                break;
            case 5:
                graphWorkRes = 1.00;
                nadiinistRes = 1.00;
                break;
            case 6:
                graphWorkRes = 1.00;
            default:
                break;
        }
    }


    @ItemSelect(R.id.spinner8)
    public void setSpinner8(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                sizeBDRes = 1.00;
                break;
            case 1:
                sizeBDRes = 0.23;
                break;
            case 2:
                sizeBDRes = 1.00;
                break;
            case 3:
                sizeBDRes = 1.14;
                break;
            case 4:
                sizeBDRes = 1.28;
                break;
            case 5:
                sizeBDRes = 1.00;
                break;
            default:
                break;
        }
    }

    @ItemSelect(R.id.spinner9)
    public void setSpinner9(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                skladnistRes = 0.73;
                break;
            case 1:
                skladnistRes = 0.87;
                break;
            case 2:
                skladnistRes = 1.00;
                break;
            case 3:
                skladnistRes = 1.17;
                break;
            case 4:
                skladnistRes = 1.34;
                break;
            case 5:
                skladnistRes = 1.74;
                break;
            default:
                break;
        }
    }



    @ItemSelect(R.id.spinner10)
    public void setSpinner10(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                multiUseRes = 1.00;
                break;
            case 1:
                multiUseRes = 0.95;
                break;
            case 2:
                multiUseRes = 1.00;
                break;
            case 3:
                multiUseRes = 1.07;
                break;
            case 4:
                multiUseRes = 1.15;
                break;
            case 5:
                skladnistRes = 1.24;
                break;
            default:
                break;
        }
    }

    @ItemSelect(R.id.spinner11)
    public void setSpinner11(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                documantationRes = 0.81;
                break;
            case 1:
                documantationRes = 0.91;
                break;
            case 2:
                documantationRes = 1.00;
                break;
            case 3:
                documantationRes = 1.11;
                break;
            case 4:
                documantationRes = 1.23;
                break;
            case 5:
                documantationRes = 1.00;
                break;
            default:
                break;
        }
    }


    @ItemSelect(R.id.spinner12)
    public void setSpinner12(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                speedlimitRes = 1.00;
                break;
            case 1:
                speedlimitRes = 1.00;
                break;
            case 2:
                speedlimitRes = 1.00;
                break;
            case 3:
                speedlimitRes = 1.11;
                break;
            case 4:
                speedlimitRes = 1.29;
                break;
            case 5:
                speedlimitRes = 1.63;
                break;
            default:
                break;
        }
    }

    @ItemSelect(R.id.spinner13)
    public void setSpinner13(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                memorylimitRes = 1.00;
                break;
            case 1:
                speedlimitRes = 1.00;
                break;
            case 2:
                speedlimitRes = 1.00;
                break;
            case 3:
                speedlimitRes = 1.05;
                break;
            case 4:
                speedlimitRes = 1.17;
                break;
            case 5:
                speedlimitRes = 1.46;
                break;
            default:
                break;
        }
    }


    @ItemSelect(R.id.spinner14)
    public void setSpinner14(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                virtualmRes = 1.00;
                break;
            case 1:
                virtualmRes = 0.87;
                break;
            case 2:
                speedlimitRes = 1.00;
                break;
            case 3:
                virtualmRes = 1.15;
                break;
            case 4:
                virtualmRes = 1.30;
                break;
            case 5:
                virtualmRes = 1.00;
                break;
            default:
                break;
        }
    }

    @ItemSelect(R.id.spinner15)
    public void setSpinner15(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                toolsRes = 1.17;
                break;
            case 1:
                toolsRes = 1.09;
                break;
            case 2:
                toolsRes = 1.00;
                break;
            case 3:
                toolsRes = 0.90;
                break;
            case 4:
                toolsRes = 0.78;
                break;
            case 5:
                toolsRes = 1.00;
                break;
            default:
                break;
        }
    }


    @ItemSelect(R.id.spinner16)
    public void setSpinner16(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                grahicsRes = 1.43;
                break;
            case 1:
                grahicsRes = 1.14;
                break;
            case 2:
                grahicsRes = 1.00;
                break;
            case 3:
                grahicsRes = 1.00;
                break;
            case 4:
                grahicsRes = 1.00;
                break;
            case 5:
                grahicsRes = 1.00;
                break;
            default:
                break;
        }
    }


    @ItemSelect(R.id.spinner17)
    public void setSpinner17(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                multisite = 1.43;
                break;
            case 1:
                multisite = 1.14;
                break;
            case 2:
                multisite = 1.00;
                break;
            case 3:
                multisite = 1.00;
                break;
            case 4:
                multisite = 1.00;
                break;
            case 5:
                multisite = 1.00;
                break;
            default:
                break;
        }
    }


    @Click(R.id.gotoresult)
    public void resultClicked(View v) {
        temp = count.getText().toString();
        size = Integer.valueOf(temp);
        if (size < 1000) {
            size = size / 1000;
        } else {
            size = size * 0.001;
        }


        if(typeOfProj.getSelectedItemPosition() == 0) {
            eaf = kvalPersRes * ExperiencePersRes * hardProductRes * repeatUseRes * hardPlatformRes * hardwareRes * graphWorkRes;
        }else{
            eaf = analiticRes * expirianceRes * skillPZRes * persContinueRes * expirianceVMRes * expirianceworkRes * nadiinistRes * sizeBDRes * skladnistRes * multiUseRes *
                    documantationRes * speedlimitRes * memorylimitRes * virtualmRes * toolsRes * grahicsRes * multisite;
        }
        sf = haveExperienceRes + gnuchkistProcesRes + permissionRiskRes + teamRes + zrilistProcessRes;
        e = B + 0.01 * sf;
        f = D + 0.2 * 0.01 * sf;

        test.setText(String.valueOf(eaf));

        pm = eaf * A *  Math.pow(size, e);
        pmS = Double.toString((int) pm);
        tm = C * Math.pow(pm, f);
        tmS = Double.toString((int) tm);
        ss = pm / tm;
        ssS = Double.toString((int) ss);

        work.setText("Трудоємкість: " + pmS);
        hlong.setText("Тривалість: " + tmS);
        people.setText("Розробників: " + ssS);
    }
}