package com.startapp;

import android.content.DialogInterface;
import android.webkit.WebView;

/* compiled from: Sta */
public class s implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WebView f16368a;

    public s(WebView webView) {
        this.f16368a = webView;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f16368a.stopLoading();
    }
}
