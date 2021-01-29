package com.eckom.mvvmproject.mvvm.base;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;

public class BaseViewModel extends ViewModel {
    private LifecycleOwner mLifecycleOwner;

    public LifecycleOwner getmLifecycleOwner(){
        return mLifecycleOwner;
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner){
        mLifecycleOwner = lifecycleOwner;
    }

}
