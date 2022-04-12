package com.deepakagarwal.covidapi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.deepakagarwal.covidapi.model.StateInfo;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<StateInfo> report = new ArrayList<>();
    ArrayList<String> report1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestQueue requestQueue;
        requestQueue = Volley.newRequestQueue(this);
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET,
                "https://api.covid19india.org/v4/data.json", null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {

                    //1
                    Log.d("Andaman","start");
                    String cAndaman = response.getJSONObject("AN").getJSONObject("total").getString("confirmed");
                    String dAndaman = response.getJSONObject("AN").getJSONObject("total").getString("deceased");
                    String rAndaman = response.getJSONObject("AN").getJSONObject("total").getString("recovered");
                    int activeAndaman = Integer.parseInt(cAndaman)-(Integer.parseInt(dAndaman)) -(Integer.parseInt(rAndaman));
                    String aAndaman = ""+activeAndaman;
                    StateInfo Andaman = new StateInfo(cAndaman,aAndaman,dAndaman,rAndaman);
                    report.add(Andaman);
                    report1.add("Andaman & Nicobar Islands\nConfirmed: "+cAndaman+ "\nActive: "+aAndaman+"\nDeceased: "+dAndaman+"\nRecovered: "+rAndaman);
                    Log.d("Andaman","end : results");
                    Log.d("Andaman","Andaman & Nicobar Islands\nConfirmed: "+cAndaman+ "\nActive: "+aAndaman+"\nDeceased: "+dAndaman+"\nRecovered: "+rAndaman);

                    //2
                    String cAP = response.getJSONObject("AP").getJSONObject("total").getString("confirmed");
                    String dAP = response.getJSONObject("AP").getJSONObject("total").getString("deceased");
                    String rAP = response.getJSONObject("AP").getJSONObject("total").getString("recovered");
                    int activeAP = Integer.parseInt(cAP)-(Integer.parseInt(dAP)) -(Integer.parseInt(rAP));
                    String aAP = ""+activeAP;
                    StateInfo AP = new StateInfo(cAP,aAP,dAP,rAP);
                    report.add(AP);
                    report1.add("Andhra Pradesh\nConfirmed: "+cAP+ "\nActive: "+aAP+"\nDeceased: "+dAP+"\nRecovered: "+rAP);

                    //3
                    String cAR = response.getJSONObject("AR").getJSONObject("total").getString("confirmed");
                    String dAR = response.getJSONObject("AR").getJSONObject("total").getString("deceased");
                    String rAR = response.getJSONObject("AR").getJSONObject("total").getString("recovered");
                    int activeAR = Integer.parseInt(cAR)-(Integer.parseInt(dAR)) -(Integer.parseInt(rAR));
                    String aAR = ""+activeAR;
                    StateInfo AR = new StateInfo(cAR,aAR,dAR,rAR);
                    report.add(AR);
                    report1.add("Arunachal Pradesh\nConfirmed: "+cAR+ "\nActive: "+aAR+"\nDeceased: "+dAR+"\nRecovered: "+rAR);

                    //4
                    String cAS = response.getJSONObject("AS").getJSONObject("total").getString("confirmed");
                    String dAS = response.getJSONObject("AS").getJSONObject("total").getString("deceased");
                    String rAS = response.getJSONObject("AS").getJSONObject("total").getString("recovered");
                    int activeAS = Integer.parseInt(cAS)-(Integer.parseInt(dAS)) -(Integer.parseInt(rAS));
                    String aAS = ""+activeAS;
                    StateInfo AS = new StateInfo(cAS,aAS,dAS,rAS);
                    report.add(AS);
                    report1.add("Assam\nConfirmed: "+cAS+ "\nActive: "+aAS+"\nDeceased: "+dAS+"\nRecovered: "+rAS);

                    //5
                    String cBR = response.getJSONObject("BR").getJSONObject("total").getString("confirmed");
                    String dBR = response.getJSONObject("BR").getJSONObject("total").getString("deceased");
                    String rBR = response.getJSONObject("BR").getJSONObject("total").getString("recovered");
                    int activeBR = Integer.parseInt(cBR)-(Integer.parseInt(dBR)) -(Integer.parseInt(rBR));
                    String aBR = ""+activeBR;
                    StateInfo BR = new StateInfo(cBR,aBR,dBR,rBR);
                    report.add(BR);
                    report1.add("Bihar\nConfirmed: "+cBR+ "\nActive: "+aBR+"\nDeceased: "+dBR+"\nRecovered: "+rBR);

                    //6
                    String cCH = response.getJSONObject("CH").getJSONObject("total").getString("confirmed");
                    String dCH = response.getJSONObject("CH").getJSONObject("total").getString("deceased");
                    String rCH = response.getJSONObject("CH").getJSONObject("total").getString("recovered");
                    int activeCH = Integer.parseInt(cCH)-(Integer.parseInt(dCH)) -(Integer.parseInt(rCH));
                    String aCH = ""+activeAS;
                    StateInfo CH = new StateInfo(cCH,aCH,dCH,rCH);
                    report.add(CH);
                    report1.add("Chandigarh\nConfirmed: "+cCH+ "\nActive: "+aCH+"\nDeceased: "+dCH+"\nRecovered: "+rCH);

                    //7
                    String cCT = response.getJSONObject("CT").getJSONObject("total").getString("confirmed");
                    String dCT = response.getJSONObject("CT").getJSONObject("total").getString("deceased");
                    String rCT = response.getJSONObject("CT").getJSONObject("total").getString("recovered");
                    int activeCT = Integer.parseInt(cCT)-(Integer.parseInt(dCT)) -(Integer.parseInt(rCT));
                    String aCT = ""+activeAS;
                    StateInfo CT = new StateInfo(cCT,aCT,dCT,rCT);
                    report.add(CT);
                    report1.add("Chattisgarh\nConfirmed: "+cCT+ "\nActive: "+aCT+"\nDeceased: "+dCT+"\nRecovered: "+rCT);

                    //8
                    String cDN = response.getJSONObject("DN").getJSONObject("total").getString("confirmed");
                    String dDN = response.getJSONObject("DN").getJSONObject("total").getString("deceased");
                    String rDN = response.getJSONObject("DN").getJSONObject("total").getString("recovered");
                    int activeDN = Integer.parseInt(cDN)-(Integer.parseInt(dDN)) -(Integer.parseInt(rDN));
                    String aDN = ""+activeDN;
                    StateInfo DN = new StateInfo(cDN,aDN,dDN,rDN);
                    report.add(DN);
                    report1.add("Dadra & Nagar Haveli and Daman & Diu\nConfirmed: "+cDN+ "\nActive: "+aDN+"\nDeceased: "+dDN+"\nRecovered: "+rDN);

                    //9
                    String cDL = response.getJSONObject("DL").getJSONObject("total").getString("confirmed");
                    String dDL = response.getJSONObject("DL").getJSONObject("total").getString("deceased");
                    String rDL = response.getJSONObject("DL").getJSONObject("total").getString("recovered");
                    int activeDL = Integer.parseInt(cDL)-(Integer.parseInt(dDL)) -(Integer.parseInt(rDL));
                    String aDL = ""+activeDL;
                    StateInfo DL = new StateInfo(cDL,aDL,dDL,rDL);
                    report.add(DL);
                    report1.add("Delhi\nConfirmed: "+cDL+ "\nActive: "+aDL+"\nDeceased: "+dDL+"\nRecovered: "+rDL);

                    //10
                    String cGA = response.getJSONObject("GA").getJSONObject("total").getString("confirmed");
                    String dGA = response.getJSONObject("GA").getJSONObject("total").getString("deceased");
                    String rGA = response.getJSONObject("GA").getJSONObject("total").getString("recovered");
                    int activeGA = Integer.parseInt(cGA)-(Integer.parseInt(dGA)) -(Integer.parseInt(rGA));
                    String aGA = ""+activeGA;
                    StateInfo GA = new StateInfo(cGA,aGA,dGA,rGA);
                    report.add(GA);
                    report1.add("Goa\nConfirmed: "+cGA+ "\nActive: "+aGA+"\nDeceased: "+dGA+"\nRecovered: "+rGA);

                    //11
                    String cGJ = response.getJSONObject("GJ").getJSONObject("total").getString("confirmed");
                    String dGJ = response.getJSONObject("GJ").getJSONObject("total").getString("deceased");
                    String rGJ = response.getJSONObject("GJ").getJSONObject("total").getString("recovered");
                    int activeGJ = Integer.parseInt(cGJ)-(Integer.parseInt(dGJ)) -(Integer.parseInt(rGJ));
                    String aGJ = ""+activeGJ;
                    StateInfo GJ = new StateInfo(cGJ,aGJ,dGJ,rGJ);
                    report.add(GJ);
                    report1.add("Gujarat\nConfirmed: "+cGJ+ "\nActive: "+aGJ+"\nDeceased: "+dGJ+"\nRecovered: "+rGJ);

                    //12
                    String cHR = response.getJSONObject("HR").getJSONObject("total").getString("confirmed");
                    String dHR = response.getJSONObject("HR").getJSONObject("total").getString("deceased");
                    String rHR = response.getJSONObject("HR").getJSONObject("total").getString("recovered");
                    int activeHR = Integer.parseInt(cHR)-(Integer.parseInt(dHR)) -(Integer.parseInt(rHR));
                    String aHR = ""+activeHR;
                    StateInfo HR = new StateInfo(cHR,aHR,dHR,rHR);
                    report.add(HR);
                    report1.add("Haryana\nConfirmed: "+cHR+ "\nActive: "+aHR+"\nDeceased: "+dHR+"\nRecovered: "+rHR);

                    //13
                    String cHP = response.getJSONObject("HP").getJSONObject("total").getString("confirmed");
                    String dHP = response.getJSONObject("HP").getJSONObject("total").getString("deceased");
                    String rHP = response.getJSONObject("HP").getJSONObject("total").getString("recovered");
                    int activeHP = Integer.parseInt(cHP)-(Integer.parseInt(dHP)) -(Integer.parseInt(rHP));
                    String aHP = ""+activeHP;
                    StateInfo HP = new StateInfo(cHP,aHP,dHP,rHP);
                    report.add(HP);
                    report1.add("Himachal Pradesh\nConfirmed: "+cHP+ "\nActive: "+aHP+"\nDeceased: "+dHP+"\nRecovered: "+rHP);

                    //14
                    String cJK = response.getJSONObject("JK").getJSONObject("total").getString("confirmed");
                    String dJK = response.getJSONObject("JK").getJSONObject("total").getString("deceased");
                    String rJK = response.getJSONObject("JK").getJSONObject("total").getString("recovered");
                    int activeJK = Integer.parseInt(cJK)-(Integer.parseInt(dJK)) -(Integer.parseInt(rJK));
                    String aJK = ""+activeJK;
                    StateInfo JK = new StateInfo(cJK,aJK,dJK,rJK);
                    report.add(JK);
                    report1.add("Jammu & Kashmir\nConfirmed: "+cJK+ "\nActive: "+aJK+"\nDeceased: "+dJK+"\nRecovered: "+rJK);

                    //15
                    String cJH = response.getJSONObject("JH").getJSONObject("total").getString("confirmed");
                    String dJH = response.getJSONObject("JH").getJSONObject("total").getString("deceased");
                    String rJH = response.getJSONObject("JH").getJSONObject("total").getString("recovered");
                    int activeJH = Integer.parseInt(cJH)-(Integer.parseInt(dJH)) -(Integer.parseInt(rJH));
                    String aJH = ""+activeJH;
                    StateInfo JH = new StateInfo(cJH,aJH,dJH,rJH);
                    report.add(JH);
                    report1.add("Jharkhand\nConfirmed: "+cJH+ "\nActive: "+aJH+"\nDeceased: "+dJH+"\nRecovered: "+rJH);

                    //16
                    String cKA = response.getJSONObject("KA").getJSONObject("total").getString("confirmed");
                    String dKA = response.getJSONObject("KA").getJSONObject("total").getString("deceased");
                    String rKA = response.getJSONObject("KA").getJSONObject("total").getString("recovered");
                    int activeKA = Integer.parseInt(cKA)-(Integer.parseInt(dKA)) -(Integer.parseInt(rKA));
                    String aKA = ""+activeKA;
                    StateInfo KA = new StateInfo(cKA,aKA,dKA,rKA);
                    report.add(KA);
                    report1.add("Karnataka\nConfirmed: "+cKA+ "\nActive: "+aKA+"\nDeceased: "+dKA+"\nRecovered: "+rKA);

                    //17
                    String cKL = response.getJSONObject("KL").getJSONObject("total").getString("confirmed");
                    String dKL = response.getJSONObject("KL").getJSONObject("total").getString("deceased");
                    String rKL = response.getJSONObject("KL").getJSONObject("total").getString("recovered");
                    int activeKL = Integer.parseInt(cKL)-(Integer.parseInt(dKL)) -(Integer.parseInt(rKL));
                    String aKL = ""+activeKL;
                    StateInfo KL = new StateInfo(cKL,aKL,dKL,rKL);
                    report.add(KL);
                    report1.add("Kerala\nConfirmed: "+cKL+ "\nActive: "+aKL+"\nDeceased: "+dKL+"\nRecovered: "+rKL);

                    //18
                    String cLA = response.getJSONObject("LA").getJSONObject("total").getString("confirmed");
                    String dLA = response.getJSONObject("LA").getJSONObject("total").getString("deceased");
                    String rLA = response.getJSONObject("LA").getJSONObject("total").getString("recovered");
                    int activeLA = Integer.parseInt(cLA)-(Integer.parseInt(dLA)) -(Integer.parseInt(rLA));
                    String aLA = ""+activeLA;
                    StateInfo LA = new StateInfo(cLA,aLA,dLA,rLA);
                    report.add(LA);
                    report1.add("Ladakh\nConfirmed: "+cLA+ "\nActive: "+aLA+"\nDeceased: "+dLA+"\nRecovered: "+rLA);

                    //19
                    String cLD = response.getJSONObject("LD").getJSONObject("total").getString("confirmed");
                    //String dLD = response.getJSONObject("LD").getJSONObject("total").getString("deceased");
                    //String rLD = response.getJSONObject("LD").getJSONObject("total").getString("recovered");
                    //int activeLD = Integer.parseInt(cLD)-(Integer.parseInt(dLD)) +(Integer.parseInt(rLD));
                    //String aLD = ""+activeLD;
                    //StateInfo LD = new StateInfo(cLD,aLD,dLD,rLD);
                    //report.add(LD);
                    report1.add("Lakshadweep\nConfirmed: "+cLD);//+ "\nActive: "+aLD+"\nDeceased: "+dLD+"\nRecovered: "+rLD);

                    //20
                    String cMP = response.getJSONObject("MP").getJSONObject("total").getString("confirmed");
                    String dMP = response.getJSONObject("MP").getJSONObject("total").getString("deceased");
                    String rMP = response.getJSONObject("MP").getJSONObject("total").getString("recovered");
                    int activeMP = Integer.parseInt(cMP)-(Integer.parseInt(dMP)) -(Integer.parseInt(rMP));
                    String aMP = ""+activeMP;
                    StateInfo MP = new StateInfo(cMP,aMP,dMP,rMP);
                    report.add(MP);
                    report1.add("Madhya Pradesh\nConfirmed: "+cMP+ "\nActive: "+aMP+"\nDeceased: "+dMP+"\nRecovered: "+rMP);

                    //21
                    String cMH = response.getJSONObject("MH").getJSONObject("total").getString("confirmed");
                    String dMH = response.getJSONObject("MH").getJSONObject("total").getString("deceased");
                    String rMH = response.getJSONObject("MH").getJSONObject("total").getString("recovered");
                    int activeMH = Integer.parseInt(cMH)-(Integer.parseInt(dMH)) -(Integer.parseInt(rMH));
                    String aMH = ""+activeMH;
                    StateInfo MH = new StateInfo(cMH,aMH,dMH,rMH);
                    report.add(MH);
                    report1.add("Maharashtra\nConfirmed: "+cMH+ "\nActive: "+aMH+"\nDeceased: "+dMH+"\nRecovered: "+rMH);

                    //22
                    String cMN = response.getJSONObject("MN").getJSONObject("total").getString("confirmed");
                    String dMN = response.getJSONObject("MN").getJSONObject("total").getString("deceased");
                    String rMN = response.getJSONObject("MN").getJSONObject("total").getString("recovered");
                    int activeMN = Integer.parseInt(cMN)-(Integer.parseInt(dMN)) -(Integer.parseInt(rMN));
                    String aMN = ""+activeMN;
                    StateInfo MN = new StateInfo(cMN,aMN,dMN,rMN);
                    report.add(MN);
                    report1.add("Manipur\nConfirmed: "+cMN+ "\nActive: "+aMN+"\nDeceased: "+dMN+"\nRecovered: "+rMN);

                    //23
                    String cML = response.getJSONObject("ML").getJSONObject("total").getString("confirmed");
                    String dML = response.getJSONObject("ML").getJSONObject("total").getString("deceased");
                    String rML = response.getJSONObject("ML").getJSONObject("total").getString("recovered");
                    int activeML = Integer.parseInt(cML)-(Integer.parseInt(dML)) -(Integer.parseInt(rML));
                    String aML = ""+activeML;
                    StateInfo ML = new StateInfo(cML,aML,dML,rML);
                    report.add(ML);
                    report1.add("Meghalaya\nConfirmed: "+cML+ "\nActive: "+aML+"\nDeceased: "+dML+"\nRecovered: "+rML);

                    //24
                    String cMZ = response.getJSONObject("MZ").getJSONObject("total").getString("confirmed");
                    String dMZ = response.getJSONObject("MZ").getJSONObject("total").getString("deceased");
                    String rMZ = response.getJSONObject("MZ").getJSONObject("total").getString("recovered");
                    int activeMZ = Integer.parseInt(cMZ)-(Integer.parseInt(dMZ)) -(Integer.parseInt(rMZ));
                    String aMZ = ""+activeMZ;
                    StateInfo MZ = new StateInfo(cMZ,aMZ,dMZ,rMZ);
                    report.add(MZ);
                    report1.add("Mizoram\nConfirmed: "+cMZ+ "\nActive: "+aMZ+"\nDeceased: "+dMZ+"\nRecovered: "+rMZ);

                    //25
                    String cNL = response.getJSONObject("NL").getJSONObject("total").getString("confirmed");
                    String dNL = response.getJSONObject("NL").getJSONObject("total").getString("deceased");
                    String rNL = response.getJSONObject("NL").getJSONObject("total").getString("recovered");
                    int activeNL = Integer.parseInt(cNL)-(Integer.parseInt(dNL)) -(Integer.parseInt(rNL));
                    String aNL = ""+activeNL;
                    StateInfo NL = new StateInfo(cNL,aNL,dNL,rNL);
                    report.add(NL);
                    report1.add("Nagaland\nConfirmed: "+cNL+ "\nActive: "+aNL+"\nDeceased: "+dNL+"\nRecovered: "+rNL);

                    //26
                    String cOR = response.getJSONObject("OR").getJSONObject("total").getString("confirmed");
                    String dOR = response.getJSONObject("OR").getJSONObject("total").getString("deceased");
                    String rOR = response.getJSONObject("OR").getJSONObject("total").getString("recovered");
                    int activeOR = Integer.parseInt(cOR)-(Integer.parseInt(dOR)) -(Integer.parseInt(rOR));
                    String aOR = ""+activeOR;
                    StateInfo OR = new StateInfo(cOR,aOR,dOR,rOR);
                    report.add(OR);
                    report1.add("Odisha\nConfirmed: "+cOR+ "\nActive: "+aOR+"\nDeceased: "+dOR+"\nRecovered: "+rOR);

                    //27
                    String cPY = response.getJSONObject("PY").getJSONObject("total").getString("confirmed");
                    String dPY = response.getJSONObject("PY").getJSONObject("total").getString("deceased");
                    String rPY = response.getJSONObject("PY").getJSONObject("total").getString("recovered");
                    int activePY = Integer.parseInt(cPY)-(Integer.parseInt(dPY)) -(Integer.parseInt(rPY));
                    String aPY = ""+activePY;
                    StateInfo PY = new StateInfo(cPY,aPY,dPY,rPY);
                    report.add(PY);
                    report1.add("Puducherry\nConfirmed: "+cPY+ "\nActive: "+aPY+"\nDeceased: "+dPY+"\nRecovered: "+rPY);

                    //28
                    String cPB = response.getJSONObject("PB").getJSONObject("total").getString("confirmed");
                    String dPB = response.getJSONObject("PB").getJSONObject("total").getString("deceased");
                    String rPB = response.getJSONObject("PB").getJSONObject("total").getString("recovered");
                    int activePB = Integer.parseInt(cPB)-(Integer.parseInt(dPB)) -(Integer.parseInt(rPB));
                    String aPB = ""+activePB;
                    StateInfo PB = new StateInfo(cPB,aPB,dPB,rPB);
                    report.add(PB);
                    report1.add("Punjab\nConfirmed: "+cPB+ "\nActive: "+aPB+"\nDeceased: "+dPB+"\nRecovered: "+rPB);

                    //29
                    String cRJ = response.getJSONObject("RJ").getJSONObject("total").getString("confirmed");
                    String dRJ = response.getJSONObject("RJ").getJSONObject("total").getString("deceased");
                    String rRJ = response.getJSONObject("RJ").getJSONObject("total").getString("recovered");
                    int activeRJ = Integer.parseInt(cRJ)-(Integer.parseInt(dRJ)) -(Integer.parseInt(rRJ));
                    String aRJ = ""+activeRJ;
                    StateInfo RJ = new StateInfo(cRJ,aRJ,dRJ,rRJ);
                    report.add(RJ);
                    report1.add("Rajasthan\nConfirmed: "+cRJ+ "\nActive: "+aRJ+"\nDeceased: "+dRJ+"\nRecovered: "+rRJ);

                    //30
                    String cSK = response.getJSONObject("SK").getJSONObject("total").getString("confirmed");
                    String dSK = response.getJSONObject("SK").getJSONObject("total").getString("deceased");
                    String rSK = response.getJSONObject("SK").getJSONObject("total").getString("recovered");
                    int activeSK = Integer.parseInt(cSK)-(Integer.parseInt(dSK)) -(Integer.parseInt(rSK));
                    String aSK = ""+activeSK;
                    StateInfo SK = new StateInfo(cSK,aSK,dSK,rSK);
                    report.add(SK);
                    report1.add("Sikkim\nConfirmed: "+cSK+ "\nActive: "+aSK+"\nDeceased: "+dSK+"\nRecovered: "+rSK);

                    //31
                    String cTN = response.getJSONObject("TN").getJSONObject("total").getString("confirmed");
                    String dTN = response.getJSONObject("TN").getJSONObject("total").getString("deceased");
                    String rTN = response.getJSONObject("TN").getJSONObject("total").getString("recovered");
                    int activeTN = Integer.parseInt(cTN)-(Integer.parseInt(dTN)) -(Integer.parseInt(rTN));
                    String aTN = ""+activeTN;
                    StateInfo TN = new StateInfo(cTN,aTN,dTN,rTN);
                    report.add(TN);
                    report1.add("Tamil Nadu\nConfirmed: "+cTN+ "\nActive: "+aTN+"\nDeceased: "+dTN+"\nRecovered: "+rTN);

                    //32
                    String cTG = response.getJSONObject("TG").getJSONObject("total").getString("confirmed");
                    String dTG = response.getJSONObject("TG").getJSONObject("total").getString("deceased");
                    String rTG = response.getJSONObject("TG").getJSONObject("total").getString("recovered");
                    int activeTG = Integer.parseInt(cTG)-(Integer.parseInt(dTG)) -(Integer.parseInt(rTG));
                    String aTG = ""+activeTG;
                    StateInfo TG = new StateInfo(cTG,aTG,dTG,rTG);
                    report.add(TG);
                    report1.add("Telangana\nConfirmed: "+cTG+ "\nActive: "+aTG+"\nDeceased: "+dTG+"\nRecovered: "+rTG);

                    //33
                    String cTR = response.getJSONObject("TR").getJSONObject("total").getString("confirmed");
                    String dTR = response.getJSONObject("TR").getJSONObject("total").getString("deceased");
                    String rTR = response.getJSONObject("TR").getJSONObject("total").getString("recovered");
                    int activeTR = Integer.parseInt(cTR)-(Integer.parseInt(dTR)) -(Integer.parseInt(rTR));
                    String aTR = ""+activeTR;
                    StateInfo TR = new StateInfo(cTR,aTR,dTR,rTR);
                    report.add(TR);
                    report1.add("Tripura\nConfirmed: "+cTR+ "\nActive: "+aTR+"\nDeceased: "+dTR+"\nRecovered: "+rTR);

                    //34
                    String cUP = response.getJSONObject("UP").getJSONObject("total").getString("confirmed");
                    String dUP = response.getJSONObject("UP").getJSONObject("total").getString("deceased");
                    String rUP = response.getJSONObject("UP").getJSONObject("total").getString("recovered");
                    int activeUP = Integer.parseInt(cUP)-(Integer.parseInt(dUP)) -(Integer.parseInt(rUP));
                    String aUP = ""+activeUP;
                    StateInfo UP = new StateInfo(cUP,aUP,dUP,rUP);
                    report.add(UP);
                    report1.add("Uttar Pradesh\nConfirmed: "+cUP+ "\nActive: "+aUP+"\nDeceased: "+dUP+"\nRecovered: "+rUP);

                    //35
                    String cUT = response.getJSONObject("UT").getJSONObject("total").getString("confirmed");
                    String dUT = response.getJSONObject("UT").getJSONObject("total").getString("deceased");
                    String rUT = response.getJSONObject("UT").getJSONObject("total").getString("recovered");
                    int activeUT = Integer.parseInt(cUT)-(Integer.parseInt(dUT)) -(Integer.parseInt(rUT));
                    String aUT = ""+activeUT;
                    StateInfo UT = new StateInfo(cUT,aUT,dUT,rUT);
                    report.add(UT);
                    report1.add("Uttarakhand\nConfirmed: "+cUT+ "\nActive: "+aUT+"\nDeceased: "+dUT+"\nRecovered: "+rUT);

                    //36
                    String cWB = response.getJSONObject("WB").getJSONObject("total").getString("confirmed");
                    String dWB = response.getJSONObject("WB").getJSONObject("total").getString("deceased");
                    String rWB = response.getJSONObject("WB").getJSONObject("total").getString("recovered");
                    int activeWB = Integer.parseInt(cWB)-(Integer.parseInt(dWB)) -(Integer.parseInt(rWB));
                    String aWB = ""+activeWB;
                    StateInfo WB = new StateInfo(cWB,aWB,dWB,rWB);
                    report.add(WB);
                    report1.add("West Bengal\nConfirmed: "+cWB+ "\nActive: "+aWB+"\nDeceased: "+dWB+"\nRecovered: "+rWB);


                    refreshData();
                    Log.d("myapp", "ok" + response.getJSONObject("AN").getJSONObject("total"));
                } catch (JSONException e) {
                    Log.d("myapp", "Not ok");
                    e.printStackTrace();
                }

            }


        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("myapp", "Something went wrong"+error);

            }
        });

        requestQueue.add(jsonObjectRequest);
    }

    ViewGroup.LayoutParams layoutParams;
    void refreshData() {
        ListView listData = findViewById(R.id.listData);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, report1){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                layoutParams = view.getLayoutParams();
                layoutParams.height = 330;
                return view;
            }
        };
        listData.setAdapter(arrayAdapter);
    }
}