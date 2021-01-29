package com.eckom.mvvmproject.mvvm.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BaseSinkActivity extends AppCompatActivity {

    private final static int NORMAL = -1;
    private final static int FLAG1 = 0x001;
    private final static int FLAG2 = 0x002;
    private static int CURRENTFLAG = NORMAL;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        if(CURRENTFLAG = NORMAL){
            //CURRENTFLAG
        }else if(CURRENTFLAG = FLAG1){
            //CURRENTFLAG
        }else if(CURRENTFLAG = FLAG2){
            //CURRENTFLAG
        }else {
            //...
        }
        setWindow(currentFlag);
        super.onCreate(savedInstanceState);
    }

    public void setWindow(int flag){
        //...switch
    }
}
