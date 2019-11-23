package com.example.bashx_07.models;

import android.widget.LinearLayout;
import android.widget.ListAdapter;

import java.util.ArrayList;

public class Users {
    public String username;
    public  String passwpord;

    public static boolean passwordInValid(String User, String Password){
        for (Users i:getUsers()) {
            if (i.username.equals(User)){
                if (i.passwpord.equals(Password)){
                    return true;
                }
            }
        }
        return false;
    }
    public static ArrayList<Users> getUsers(){
        ArrayList<Users> list = new ArrayList<>();
        Users o = new Users();
        o.username = "bichito";
        o.passwpord = "123456";
        list.add(o);
        Users t = new Users();
        t.username = "haber";
        t.passwpord = "12345";
        list.add(t);
        return list;
    }
}
