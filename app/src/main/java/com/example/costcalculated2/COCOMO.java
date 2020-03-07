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

@EFragment(R.layout.fragment_advance)
public class COCOMO extends Fragment {

    @FragmentArg()
    String key;
    String[] typeofP = {"Organic", "Semidetach", "Embedded"};
    String[] nadiinist1 = {"0.75", "0.88", "1.00", "1.15", "1.40", "n/a"};
    String[] sizeBD2 = {"n/a", "0.94", "1.00", "1.08", "1.16", "n/a"};
    String[] skladnist3 = {"0.70", "0.85", "1.00", "1.15", "1.30", "1.65"};
    String[] speedlimit4 = {"n/a", "n/a", "1.00", "1.11", "1.30", "1.66"};
    String[] memorylimit5 = {"n/a", "n/a", "1.00", "1.06", "1.21", "1.56"};
    String[] virtualm6 = {"n/a", "0.87", "1.00", "1.15", "1.30", "n/a"};
    String[] time7 = {"n/a", "0.87", "1.00", "1.07", "1.15", "n/a"};
    String[] analitic8 = {"1.46", "1.19", "1.00", "0.86", "0.71", "n/a"};
    String[] expiriance9 = {"1.29", "1.33", "1.00", "0.91", "0.82", "n/a"};
    String[] skillPZ10 = {"1.42", "1.17", "1.00", "0.86", "0.70", "n/a"};
    String[] expirianceVM11 = {"1.21", "1.10", "1.00", "0.90", "n/a", "n/a"};
    String[] expiriancework12 = {"1.14", "1.07", "1.00", "0.95", "n/a", "n/a"};
    String[] metods13 = {"1.24", "1.10", "1.00", "1.91", "0.82", "n/a"};
    String[] tools14= {"1.24", "1.10", "1.00", "0.91", "0.83", "n/a"};
    String[] grahics15 = {"1.23", "1.08", "1.00", "1.04", "1.10", "n/a"};

    private double a, b, c, d;
    private double size, eaf, pm, tm, ss;
    private double nadiinistRes, sizeBDRes, skladnistRes, speedlimitRes, memorylimitRes, virtualmRes, timeRes, analiticRes, expirianceRes,
            skillPZRes, expirianceVMRes, expirianceworkRes, metodsRes, toolsRes, grahicsRes;
    private String temp, pmS, tmS, ssS;
    final static String LOG = "LOG";


    @ViewById(R.id.typeofProj)
    Spinner spinner;
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

    @ViewById(R.id.haveExperiance)
    Spinner nadiinist;
    @ViewById(R.id.gnuchkistProces2)
    Spinner sizeBD;
    @ViewById(R.id.skladnist3)
    Spinner skladnist;
    @ViewById(R.id.team4)
    Spinner speedlimit;
    @ViewById(R.id.memorylimit5)
    Spinner memorylimit;
    @ViewById(R.id.spinner1)
    Spinner virtualm;
    @ViewById(R.id.time7)
    Spinner time;
    @ViewById(R.id.spinner3)
    Spinner analitic;
    @ViewById(R.id.spinner4)
    Spinner expiriance;
    @ViewById(R.id.spinner5)
    Spinner skillPZ;
    @ViewById(R.id.spinner6)
    Spinner expirianceVM;
    @ViewById(R.id.expiriancework12)
    Spinner expiriancework;
    @ViewById(R.id.metods13)
    Spinner metods;
    @ViewById(R.id.tools14)
    Spinner tools;
    @ViewById(R.id.grahics15)
    Spinner grahics;



    @AfterViews
    void bindAdapter() {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, typeofP);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, nadiinist1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        nadiinist.setAdapter(adapter1);


        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, sizeBD2);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sizeBD.setAdapter(adapter2);


        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, skladnist3);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        skladnist.setAdapter(adapter3);


        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, speedlimit4);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        speedlimit.setAdapter(adapter4);

        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, memorylimit5);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        memorylimit.setAdapter(adapter5);

        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, virtualm6);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        virtualm.setAdapter(adapter6);

        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, time7);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        time.setAdapter(adapter7);


        ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, analitic8);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        analitic.setAdapter(adapter8);


        ArrayAdapter<String> adapter9 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, expiriance9);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        expiriance.setAdapter(adapter9);

        ArrayAdapter<String> adapter10 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, skillPZ10);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        skillPZ.setAdapter(adapter10);

        ArrayAdapter<String> adapter11 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, expirianceVM11);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        expirianceVM.setAdapter(adapter11);


        ArrayAdapter<String> adapter12 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, expiriancework12);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        expiriancework.setAdapter(adapter12);


        ArrayAdapter<String> adapter13 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, metods13);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        metods.setAdapter(adapter13);


        ArrayAdapter<String> adapter14 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, tools14);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tools.setAdapter(adapter14);


        ArrayAdapter<String> adapter15 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, grahics15);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        grahics.setAdapter(adapter15);
    }


    @ItemSelect(R.id.typeofProj)
    public void spinner(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                a = 3.2;
                b = 1.05;
                c = 2.5;
                d = 0.38;
                break;
            case 1:
                a = 3.0;
                b = 1.12;
                c = 2.5;
                d = 0.35;
                break;
            case 2:
                a = 2.8;
                b = 1.20;
                c = 2.5;
                d = 0.32;
                break;
            default:
                break;
        }
    }

    @ItemSelect(R.id.haveExperiance)
    public void nadiinist(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                nadiinistRes = 0.75;
                break;
            case 1:
                nadiinistRes = 0.88;
                break;
            case 2:
                nadiinistRes = 1.00;
                break;
            case 3:
                nadiinistRes = 1.15;
                break;
            case 4:
                nadiinistRes = 1.40;
                break;
            case 5:
                nadiinistRes = 1.00;
                break;
            default:
                break;
        }
    }
    @ItemSelect(R.id.gnuchkistProces2)
    public void sizeBD(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                sizeBDRes = 1.00;
                break;
            case 1:
                sizeBDRes = 0.94;
                break;
            case 2:
                sizeBDRes = 1.00;
                break;
            case 3:
                sizeBDRes = 1.08;
                break;
            case 4:
                sizeBDRes = 1.16;
                break;
            case 5:
                sizeBDRes = 1.00;
                break;
            default:
                break;
        }
    }
    @ItemSelect(R.id.skladnist3)
    public void skladnist(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                skladnistRes = 0.70;
                break;
            case 1:
                skladnistRes = 0.85;
                break;
            case 2:
                skladnistRes = 1.00;
                break;
            case 3:
                skladnistRes = 1.15;
                break;
            case 4:
                skladnistRes = 1.30;
                break;
            case 5:
                nadiinistRes = 1.65;
                break;
            default:
                break;
        }
    }
    @ItemSelect(R.id.team4)
    public void speedlimit(boolean tr, int position) {
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
                speedlimitRes = 1.30;
                break;
            case 5:
                speedlimitRes = 1.66;
                break;
            default:
                break;
        }
    }
    @ItemSelect(R.id.memorylimit5)
    public void memorylimit5(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                memorylimitRes = 1.00;
                break;
            case 1:
                memorylimitRes = 1.00;
                break;
            case 2:
                memorylimitRes = 1.00;
                break;
            case 3:
                memorylimitRes = 1.06;
                break;
            case 4:
                memorylimitRes = 1.21;
                break;
            case 5:
                memorylimitRes = 1.56;
                break;
            default:
                break;
        }
    }
    @ItemSelect(R.id.spinner1)
    public void virtualm6(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                virtualmRes = 1.00;
                break;
            case 1:
                virtualmRes = 0.87;
                break;
            case 2:
                virtualmRes = 1.00;
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
    @ItemSelect(R.id.time7)
    public void time(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                timeRes = 1.00;
                break;
            case 1:
                timeRes = 0.87;
                break;
            case 2:
                timeRes = 1.00;
                break;
            case 3:
                timeRes = 1.07;
                break;
            case 4:
                timeRes = 1.15;
                break;
            case 5:
                timeRes = 1.00;
                break;
            default:
                break;
        }
    }
    @ItemSelect(R.id.spinner3)
    public void analitic(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                analiticRes = 1.46;
                break;
            case 1:
                analiticRes = 1.19;
                break;
            case 2:
                analiticRes = 1.00;
                break;
            case 3:
                analiticRes = 0.86;
                break;
            case 4:
                analiticRes = 0.71;
                break;
            case 5:
                analiticRes = 1.00;
                break;
            default:
                break;
        }
    }
    @ItemSelect(R.id.spinner4)
    public void expiriance(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                expirianceRes = 1.29;
                break;
            case 1:
                expirianceRes = 1.13;
                break;
            case 2:
                expirianceRes = 1.00;
                break;
            case 3:
                expirianceRes = 0.91;
                break;
            case 4:
                expirianceRes = 0.82;
                break;
            case 5:
                expirianceRes = 1.00;
                break;
            default:
                break;
        }
    }
    @ItemSelect(R.id.spinner5)
    public void skillPZ(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                skillPZRes = 1.42;
                break;
            case 1:
                skillPZRes = 1.17;
                break;
            case 2:
                skillPZRes = 1.00;
                break;
            case 3:
                skillPZRes = 0.86;
                break;
            case 4:
                skillPZRes = 0.70;
                break;
            case 5:
                skillPZRes = 1.00;
                break;
            default:
                break;
        }
    }
    @ItemSelect(R.id.spinner6)
    public void expirianceVM(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                expirianceVMRes = 1.21;
                break;
            case 1:
                expirianceVMRes = 1.10;
                break;
            case 2:
                expirianceVMRes = 1.00;
                break;
            case 3:
                expirianceVMRes = 0.90;
                break;
            case 4:
                expirianceVMRes = 1.00;
                break;
            case 5:
                expirianceVMRes = 1.00;
                break;
            default:
                break;
        }
    }
    @ItemSelect(R.id.expiriancework12)
    public void expiriancework(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                expirianceworkRes = 1.14;
                break;
            case 1:
                expirianceworkRes = 1.07;
                break;
            case 2:
                expirianceworkRes = 1.00;
                break;
            case 3:
                expirianceworkRes = 0.95;
                break;
            case 4:
                expirianceworkRes = 1.00;
                break;
            case 5:
                expirianceworkRes = 1.00;
                break;
            default:
                break;
        }
    }
    @ItemSelect(R.id.metods13)
    public void metods(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                metodsRes = 1.24;
                break;
            case 1:
                metodsRes = 1.10;
                break;
            case 2:
                metodsRes = 1.00;
                break;
            case 3:
                metodsRes = 0.91;
                break;
            case 4:
                metodsRes = 0.82;
                break;
            case 5:
                metodsRes = 1.00;
                break;
            default:
                break;
        }
    }
    @ItemSelect(R.id.tools14)
    public void tools(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                toolsRes = 1.24;
                break;
            case 1:
                toolsRes = 1.10;
                break;
            case 2:
                toolsRes = 1.00;
                break;
            case 3:
                toolsRes = 0.91;
                break;
            case 4:
                toolsRes = 0.82;
                break;
            case 5:
                toolsRes = 1.00;
                break;
            default:
                break;
        }
    }
    @ItemSelect(R.id.grahics15)
    public void grahics(boolean tr, int position) {
        switch ((int) position) {
            case 0:
                grahicsRes = 1.23;
                break;
            case 1:
                grahicsRes = 1.08;
                break;
            case 2:
                grahicsRes = 1.00;
                break;
            case 3:
                grahicsRes = 1.04;
                break;
            case 4:
                grahicsRes = 1.10;
                break;
            case 5:
                grahicsRes = 1.00;
                break;
            default:
                break;
        }
    }


    @Click(R.id.gotoresult)
    public void resultClicked(View v) {
        temp = count.getText().toString();
        size = (Integer.valueOf(temp));
        if (size < 1000) {
            size = size / 1000;
        } else {
            size = size * 0.001;
        }


        eaf = nadiinistRes * sizeBDRes * skladnistRes * speedlimitRes * speedlimitRes * memorylimitRes
                * virtualmRes * timeRes * analiticRes * expirianceRes * skillPZRes * expirianceVMRes
                * expirianceworkRes * metodsRes * toolsRes * grahicsRes;
        pm = eaf * a *  Math.pow(size, b);
        pmS = Double.toString((int) pm);
        tm = c * Math.pow(pm, d);
        tmS = Double.toString((int) tm);
        ss = pm / tm;
        ssS = Double.toString((int) ss);

        work.setText("Трудоємкість: " + pmS);
        hlong.setText("Тривалість(місяці): " + tmS);
        people.setText("Розробників: " + ssS);

    }
}
