package com.deepakagarwal.covidapi.model;

public class StateInfo {
    public String confirmed;
    public String active;
    public String deceased;
    public String recovered;

    public StateInfo(String c, String a, String d, String r){
        confirmed = c;
        active = a;
        deceased = d;
        recovered = r;
    }
}
