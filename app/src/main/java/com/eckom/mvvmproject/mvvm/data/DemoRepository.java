package com.eckom.mvvmproject.mvvm.data;

import com.eckom.mvvmproject.mvvm.database.data.DatabaseManager;
import com.eckom.mvvmproject.mvvm.database.remote.DataRemoteManager;

public class DemoRepository {

    private static volatile DemoRepository mDemoRepository;

    private DatabaseManager mDatabaseManager;
    private DataRemoteManager mDataRemoteManager;



}
