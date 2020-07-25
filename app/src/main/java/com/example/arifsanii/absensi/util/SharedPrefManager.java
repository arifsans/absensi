package com.example.arifsanii.absensi.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import static android.content.ContentValues.TAG;
import static android.content.Context.MODE_PRIVATE;


public class SharedPrefManager {

    public static final String SP_MAHASISWA_APP = "spMahasiswaApp";
    public static final String SP_NAMA = "spNama";
    public static final String SP_NIP = "spNip";
    public static final String SP_TELP = "spTelp";
    public static final String SP_SUDAH_LOGIN = "spSudahLogin";

    SharedPreferences sp;
    SharedPreferences.Editor spEditor;
    Context _context;

    int PRIVATE_MODE = 0;

    public SharedPrefManager(Context context){
        this._context = context;
        sp = _context.getSharedPreferences(SP_MAHASISWA_APP, PRIVATE_MODE);
        spEditor = sp.edit();
    }

    public void saveSPString(String keySP, String value){
        spEditor.putString(keySP, value);
        spEditor.commit();
    }

    public void saveSPInt(String keySP, int value){
        spEditor.putInt(keySP, value);
        spEditor.commit();
    }

    public void saveSPBoolean(String keySP, boolean value){
        spEditor.putBoolean(keySP, value);
        spEditor.commit();
    }

    public void setLogin(boolean getSPSudahLogin){
        spEditor.putBoolean(SP_SUDAH_LOGIN,getSPSudahLogin);
        spEditor.clear();
        spEditor.commit();
        Log.d(TAG,"session modified ");

    }

    public String getSPNama(){
        return sp.getString(SP_NAMA, "");
    }

    public String getSPNip(){
        return sp.getString(SP_NIP,"");
    }

    public String getSpTelp(){
        return sp.getString(SP_TELP, "");
    }

    public Boolean getSPSudahLogin(){

        return sp.getBoolean(SP_SUDAH_LOGIN, false);
    }

}
