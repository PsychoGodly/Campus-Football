package com.startapp;

import android.webkit.WebSettings;

/* compiled from: Sta */
public class wa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ va f17517a;

    public wa(va vaVar) {
        this.f17517a = vaVar;
    }

    public void run() {
        va vaVar = this.f17517a;
        vaVar.getClass();
        try {
            vaVar.f17433c.a().execute(new xa(vaVar, WebSettings.getDefaultUserAgent(vaVar.f17431a)));
        } catch (Throwable th) {
            if (vaVar.a(16)) {
                i3.a(th);
            }
        }
    }
}
