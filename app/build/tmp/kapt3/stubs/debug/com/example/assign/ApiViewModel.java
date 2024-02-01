package com.example.assign;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/assign/ApiViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "apiDataList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/assign/Api_Data;", "getApiDataList", "()Landroidx/lifecycle/MutableLiveData;", "apiRepository", "Lcom/example/assign/ApiRepository;", "fetchData", "", "context", "Landroid/content/Context;", "adapter", "Lcom/example/assign/ApiAdapter;", "app_debug"})
public final class ApiViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.assign.ApiRepository apiRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.assign.Api_Data>> apiDataList = null;
    
    public ApiViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.assign.Api_Data>> getApiDataList() {
        return null;
    }
    
    public final void fetchData(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.example.assign.ApiAdapter adapter) {
    }
}