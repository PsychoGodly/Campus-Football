package com.startapp;

import java.util.Collection;
import java.util.Locale;

/* compiled from: Sta */
public class x4 {

    /* renamed from: d  reason: collision with root package name */
    public static final x4 f17530d = new x4();

    /* renamed from: a  reason: collision with root package name */
    public final String f17531a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17532b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17533c;

    public x4(Locale locale, Collection<Locale> collection) {
        this.f17531a = locale.toString();
        this.f17532b = a((Locale) null, collection, ';');
        this.f17533c = a(locale, collection, ',');
    }

    public static String a(Locale locale, Iterable<Locale> iterable, char c10) {
        boolean z10;
        StringBuilder sb2;
        if (locale != null) {
            sb2 = new StringBuilder();
            sb2.append(locale);
            z10 = true;
        } else {
            z10 = false;
            sb2 = null;
        }
        if (iterable != null) {
            for (Locale next : iterable) {
                if (next != null) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder();
                    }
                    if (z10) {
                        sb2.append(c10);
                    }
                    sb2.append(next);
                    z10 = true;
                }
            }
        }
        if (sb2 != null) {
            return sb2.toString();
        }
        return null;
    }

    public x4() {
        this.f17531a = null;
        this.f17532b = null;
        this.f17533c = null;
    }
}
