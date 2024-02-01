package com.example.assign;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0014\u0010\u0014\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/example/assign/ApiAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/assign/ApiAdapter$ViewHolder;", "items", "", "Lcom/example/assign/Api_Data;", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "setItems", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "update", "apiData", "ViewHolder", "app_debug"})
public final class ApiAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.assign.ApiAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.assign.Api_Data> items;
    
    public ApiAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.assign.Api_Data> items) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.assign.Api_Data> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.assign.Api_Data> p0) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.assign.ApiAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.assign.ApiAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final void update(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.assign.Api_Data> apiData) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/example/assign/ApiAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "Link", "Landroid/widget/TextView;", "getLink", "()Landroid/widget/TextView;", "clicks", "getClicks", "date", "getDate", "imgView", "Landroid/widget/ImageView;", "getImgView", "()Landroid/widget/ImageView;", "linkName", "getLinkName", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView linkName = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.ImageView imgView = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView date = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView clicks = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView Link = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getLinkName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getImgView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getDate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getClicks() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getLink() {
            return null;
        }
    }
}