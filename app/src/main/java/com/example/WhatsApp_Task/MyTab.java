package com.example.WhatsApp_Task;

import androidx.fragment.app.Fragment;

public class MyTab {
    String name;
    Fragment fragment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    public MyTab(String name, Fragment fragment) {
        this.name = name;
        this.fragment = fragment;
    }
}
