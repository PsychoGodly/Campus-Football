package com.startapp;

import android.content.SharedPreferences;
import java.util.UUID;

/* compiled from: Sta */
public class y3 {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f17560a;

    /* renamed from: b  reason: collision with root package name */
    public volatile String f17561b;

    public y3(SharedPreferences sharedPreferences) {
        this.f17560a = sharedPreferences;
    }

    public String a() {
        String str = this.f17561b;
        if (str == null) {
            synchronized (this) {
                str = this.f17561b;
                if (str == null) {
                    str = this.f17560a.getString("e695c6d894060903", (String) null);
                    if (str == null) {
                        str = UUID.randomUUID().toString();
                        if (!this.f17560a.edit().putString("e695c6d894060903", str).commit()) {
                            str = "00000000-0000-0000-0000-000000000000";
                        }
                    }
                    this.f17561b = str;
                }
            }
        }
        return str;
    }
}
