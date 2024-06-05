package com.applovin.impl;

import android.os.Looper;
import com.applovin.impl.x6;
import com.applovin.impl.y6;
import com.facebook.ads.AdError;

public interface z6 {

    /* renamed from: a  reason: collision with root package name */
    public static final z6 f13798a;

    /* renamed from: b  reason: collision with root package name */
    public static final z6 f13799b;

    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f13800a = z80.f13812b;

        void a();
    }

    static {
        a aVar = new a();
        f13798a = aVar;
        f13799b = aVar;
    }

    int a(d9 d9Var);

    x6 a(Looper looper, y6.a aVar, d9 d9Var);

    void a();

    b b(Looper looper, y6.a aVar, d9 d9Var);

    void b();

    class a implements z6 {
        a() {
        }

        public x6 a(Looper looper, y6.a aVar, d9 d9Var) {
            if (d9Var.f7156p == null) {
                return null;
            }
            return new s7(new x6.a(new tp(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
        }

        public /* synthetic */ void a() {
            y80.a(this);
        }

        public /* synthetic */ b b(Looper looper, y6.a aVar, d9 d9Var) {
            return y80.b(this, looper, aVar, d9Var);
        }

        public /* synthetic */ void b() {
            y80.c(this);
        }

        public int a(d9 d9Var) {
            return d9Var.f7156p != null ? 1 : 0;
        }
    }
}
