package com.startapp;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: Sta */
public class gb {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<View, String> f15869a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<View, a> f15870b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, View> f15871c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final HashSet<View> f15872d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet<String> f15873e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    public final HashSet<String> f15874f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap<String, String> f15875g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public final Map<View, Boolean> f15876h = new WeakHashMap();

    /* renamed from: i  reason: collision with root package name */
    public boolean f15877i;

    /* compiled from: Sta */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ub f15878a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<String> f15879b = new ArrayList<>();

        public a(ub ubVar, String str) {
            this.f15878a = ubVar;
            a(str);
        }

        public void a(String str) {
            this.f15879b.add(str);
        }
    }
}
