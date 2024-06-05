package com.startapp;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import com.startapp.gb;
import com.startapp.hb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
public class w8 implements hb.a {

    /* renamed from: h  reason: collision with root package name */
    public static w8 f17503h = new w8();

    /* renamed from: i  reason: collision with root package name */
    public static Handler f17504i = new Handler(Looper.getMainLooper());

    /* renamed from: j  reason: collision with root package name */
    public static Handler f17505j = null;

    /* renamed from: k  reason: collision with root package name */
    public static final Runnable f17506k = new c();

    /* renamed from: l  reason: collision with root package name */
    public static final Runnable f17507l = new d();

    /* renamed from: a  reason: collision with root package name */
    public List<b> f17508a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public int f17509b;

    /* renamed from: c  reason: collision with root package name */
    public final List<kb> f17510c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public pb f17511d = new pb();

    /* renamed from: e  reason: collision with root package name */
    public gb f17512e = new gb();

    /* renamed from: f  reason: collision with root package name */
    public ib f17513f = new ib(new xb());

    /* renamed from: g  reason: collision with root package name */
    public long f17514g;

    /* compiled from: Sta */
    public interface a extends b {
        void b(int i10, long j10);
    }

    /* compiled from: Sta */
    public interface b {
        void a(int i10, long j10);
    }

    /* compiled from: Sta */
    public class c implements Runnable {
        public void run() {
            String str;
            Boolean bool;
            w8 w8Var = w8.f17503h;
            w8Var.f17509b = 0;
            w8Var.f17510c.clear();
            for (T t10 : Collections.unmodifiableCollection(cb.f15708c.f15710b)) {
                t10.getClass();
            }
            w8Var.f17514g = System.nanoTime();
            gb gbVar = w8Var.f17512e;
            gbVar.getClass();
            cb cbVar = cb.f15708c;
            if (cbVar != null) {
                for (T t11 : Collections.unmodifiableCollection(cbVar.f15710b)) {
                    View b10 = t11.b();
                    if (t11.c()) {
                        String str2 = t11.f15798h;
                        if (b10 != null) {
                            if (Build.VERSION.SDK_INT < 19 || b10.isAttachedToWindow()) {
                                if (b10.hasWindowFocus()) {
                                    gbVar.f15876h.remove(b10);
                                    bool = Boolean.FALSE;
                                } else if (gbVar.f15876h.containsKey(b10)) {
                                    bool = gbVar.f15876h.get(b10);
                                } else {
                                    Map<View, Boolean> map = gbVar.f15876h;
                                    Boolean bool2 = Boolean.FALSE;
                                    map.put(b10, bool2);
                                    bool = bool2;
                                }
                                if (bool.booleanValue()) {
                                    str = "noWindowFocus";
                                } else {
                                    HashSet hashSet = new HashSet();
                                    View view = b10;
                                    while (true) {
                                        if (view == null) {
                                            gbVar.f15872d.addAll(hashSet);
                                            str = null;
                                            break;
                                        }
                                        String a10 = ic.a(view);
                                        if (a10 != null) {
                                            str = a10;
                                            break;
                                        }
                                        hashSet.add(view);
                                        ViewParent parent = view.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "notAttached";
                            }
                            if (str == null) {
                                gbVar.f15873e.add(str2);
                                gbVar.f15869a.put(b10, str2);
                                for (ub next : t11.f15793c) {
                                    View view2 = (View) next.f17381a.get();
                                    if (view2 != null) {
                                        gb.a aVar = gbVar.f15870b.get(view2);
                                        if (aVar != null) {
                                            aVar.f15879b.add(t11.f15798h);
                                        } else {
                                            gbVar.f15870b.put(view2, new gb.a(next, t11.f15798h));
                                        }
                                    }
                                }
                            } else if (str != "noWindowFocus") {
                                gbVar.f15874f.add(str2);
                                gbVar.f15871c.put(str2, b10);
                                gbVar.f15875g.put(str2, str);
                            }
                        } else {
                            gbVar.f15874f.add(str2);
                            gbVar.f15875g.put(str2, "noAdView");
                        }
                    }
                }
            }
            long nanoTime = System.nanoTime();
            vb vbVar = w8Var.f17511d.f16268b;
            if (w8Var.f17512e.f15874f.size() > 0) {
                Iterator<String> it = w8Var.f17512e.f15874f.iterator();
                while (it.hasNext()) {
                    String next2 = it.next();
                    JSONObject a11 = vbVar.a((View) null);
                    View view3 = w8Var.f17512e.f15871c.get(next2);
                    ac acVar = w8Var.f17511d.f16267a;
                    String str3 = w8Var.f17512e.f15875g.get(next2);
                    if (str3 != null) {
                        JSONObject a12 = acVar.a(view3);
                        WindowManager windowManager = qb.f16328a;
                        try {
                            a12.put("adSessionId", next2);
                        } catch (JSONException e10) {
                            Log.e("OMIDLIB", "Error with setting ad session id", e10);
                        }
                        try {
                            a12.put("notVisibleReason", str3);
                        } catch (JSONException e11) {
                            Log.e("OMIDLIB", "Error with setting not visible reason", e11);
                        }
                        qb.a(a11, a12);
                    }
                    qb.a(a11);
                    HashSet hashSet2 = new HashSet();
                    hashSet2.add(next2);
                    ib ibVar = w8Var.f17513f;
                    ibVar.f15933b.a(new gc(ibVar, hashSet2, a11, nanoTime));
                }
            }
            if (w8Var.f17512e.f15873e.size() > 0) {
                JSONObject a13 = vbVar.a((View) null);
                vbVar.a((View) null, a13, w8Var, true, false);
                qb.a(a13);
                ib ibVar2 = w8Var.f17513f;
                ibVar2.f15933b.a(new jc(ibVar2, w8Var.f17512e.f15873e, a13, nanoTime));
            } else {
                ib ibVar3 = w8Var.f17513f;
                ibVar3.f15933b.a(new bc(ibVar3));
            }
            gb gbVar2 = w8Var.f17512e;
            gbVar2.f15869a.clear();
            gbVar2.f15870b.clear();
            gbVar2.f15871c.clear();
            gbVar2.f15872d.clear();
            gbVar2.f15873e.clear();
            gbVar2.f15874f.clear();
            gbVar2.f15875g.clear();
            gbVar2.f15877i = false;
            long nanoTime2 = System.nanoTime() - w8Var.f17514g;
            if (w8Var.f17508a.size() > 0) {
                for (b next3 : w8Var.f17508a) {
                    next3.a(w8Var.f17509b, TimeUnit.NANOSECONDS.toMillis(nanoTime2));
                    if (next3 instanceof a) {
                        ((a) next3).b(w8Var.f17509b, nanoTime2);
                    }
                }
            }
        }
    }

    /* compiled from: Sta */
    public class d implements Runnable {
        public void run() {
            Handler handler = w8.f17505j;
            if (handler != null) {
                handler.post(w8.f17506k);
                w8.f17505j.postDelayed(w8.f17507l, 200);
            }
        }
    }

    public final void a(View view, hb hbVar, JSONObject jSONObject, v9.a aVar, boolean z10) {
        hbVar.a(view, jSONObject, this, aVar == v9.a.PARENT_VIEW, z10);
    }

    public void a(View view, hb hbVar, JSONObject jSONObject, boolean z10) {
        String str;
        boolean z11;
        boolean z12;
        boolean z13;
        if (ic.a(view) == null) {
            gb gbVar = this.f17512e;
            v9.a aVar = gbVar.f15872d.contains(view) ? v9.a.PARENT_VIEW : gbVar.f15877i ? v9.a.OBSTRUCTION_VIEW : v9.a.UNDERLYING_VIEW;
            if (aVar != v9.a.UNDERLYING_VIEW) {
                JSONObject a10 = hbVar.a(view);
                qb.a(jSONObject, a10);
                gb gbVar2 = this.f17512e;
                if (gbVar2.f15869a.size() == 0) {
                    str = null;
                } else {
                    String str2 = gbVar2.f15869a.get(view);
                    if (str2 != null) {
                        gbVar2.f15869a.remove(view);
                    }
                    str = str2;
                }
                if (str != null) {
                    WindowManager windowManager = qb.f16328a;
                    try {
                        a10.put("adSessionId", str);
                    } catch (JSONException e10) {
                        Log.e("OMIDLIB", "Error with setting ad session id", e10);
                    }
                    gb gbVar3 = this.f17512e;
                    if (gbVar3.f15876h.containsKey(view)) {
                        gbVar3.f15876h.put(view, Boolean.TRUE);
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    try {
                        a10.put("hasWindowFocus", Boolean.valueOf(z13));
                    } catch (JSONException e11) {
                        Log.e("OMIDLIB", "Error with setting not visible reason", e11);
                    }
                    this.f17512e.f15877i = true;
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    gb gbVar4 = this.f17512e;
                    gb.a aVar2 = gbVar4.f15870b.get(view);
                    if (aVar2 != null) {
                        gbVar4.f15870b.remove(view);
                    }
                    if (aVar2 != null) {
                        WindowManager windowManager2 = qb.f16328a;
                        ub ubVar = aVar2.f15878a;
                        JSONArray jSONArray = new JSONArray();
                        for (String put : aVar2.f15879b) {
                            jSONArray.put(put);
                        }
                        try {
                            a10.put("isFriendlyObstructionFor", jSONArray);
                            a10.put("friendlyObstructionClass", ubVar.f17382b);
                            a10.put("friendlyObstructionPurpose", ubVar.f17383c);
                            a10.put("friendlyObstructionReason", ubVar.f17384d);
                        } catch (JSONException e12) {
                            Log.e("OMIDLIB", "Error with setting friendly obstruction", e12);
                        }
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    a(view, hbVar, a10, aVar, z10 || z12);
                }
                this.f17509b++;
            }
        }
    }

    public void a() {
        if (f17505j == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f17505j = handler;
            handler.post(f17506k);
            f17505j.postDelayed(f17507l, 200);
        }
    }
}
