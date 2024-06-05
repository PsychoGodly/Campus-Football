package com.startapp;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Pair;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class x6 extends a7 {

    /* renamed from: c  reason: collision with root package name */
    public BroadcastReceiver f17535c;

    /* compiled from: Sta */
    public class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c7 f17536a;

        public a(c7 c7Var) {
            this.f17536a = c7Var;
        }

        public void onReceive(Context context, Intent intent) {
            this.f17536a.a((Object) new Pair(x6.this, intent));
        }
    }

    public x6(String str, Map<String, String> map) {
        super(str, map);
    }

    public void a(Context context, c7 c7Var) throws Exception {
        if (this.f17535c == null) {
            a aVar = new a(c7Var);
            this.f17535c = aVar;
            context.registerReceiver(aVar, new IntentFilter(this.f15607a));
            return;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x6.class != obj.getClass()) {
            return false;
        }
        return j9.a(this.f17535c, ((x6) obj).f17535c);
    }

    public int hashCode() {
        Object[] objArr = {this.f17535c};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }

    public void a(Context context) throws Exception {
        BroadcastReceiver broadcastReceiver = this.f17535c;
        if (broadcastReceiver != null) {
            context.unregisterReceiver(broadcastReceiver);
            this.f17535c = null;
            return;
        }
        throw new IllegalStateException();
    }
}
