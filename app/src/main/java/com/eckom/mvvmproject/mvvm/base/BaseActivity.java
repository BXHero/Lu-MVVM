package com.eckom.mvvmproject.mvvm.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;

public class BaseActivity<T extends BaseViewModel,E extends ViewDataBinding> extends BaseSinkActivity{

    public T mViewModel;
    public E mDataBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public abstract void setmViewModel;
    public abstract void setmDataBinding;
    public abstract int getLayoutId();
    public abstract void int();

    public T obtainViewModel(Class<T> modeClass){
        //..
    }
}
