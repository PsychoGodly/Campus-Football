package com.applovin.impl;

import java.io.IOException;

public class h5 extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final int f8230a;

    public h5(int i10) {
        this.f8230a = i10;
    }

    public static boolean a(IOException iOException) {
        Throwable th;
        while (th != null) {
            if ((th instanceof h5) && ((h5) th).f8230a == 2008) {
                return true;
            }
            Throwable cause = th.getCause();
            th = iOException;
            th = cause;
        }
        return false;
    }

    public h5(String str, int i10) {
        super(str);
        this.f8230a = i10;
    }

    public h5(String str, Throwable th, int i10) {
        super(str, th);
        this.f8230a = i10;
    }

    public h5(Throwable th, int i10) {
        super(th);
        this.f8230a = i10;
    }
}
