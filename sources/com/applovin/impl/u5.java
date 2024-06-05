package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.b6;
import com.applovin.impl.g5;

public final class u5 implements g5.a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f12524a;

    /* renamed from: b  reason: collision with root package name */
    private final yo f12525b;

    /* renamed from: c  reason: collision with root package name */
    private final g5.a f12526c;

    public u5(Context context, yo yoVar, g5.a aVar) {
        this.f12524a = context.getApplicationContext();
        this.f12525b = yoVar;
        this.f12526c = aVar;
    }

    /* renamed from: b */
    public t5 a() {
        t5 t5Var = new t5(this.f12524a, this.f12526c.a());
        yo yoVar = this.f12525b;
        if (yoVar != null) {
            t5Var.a(yoVar);
        }
        return t5Var;
    }

    public u5(Context context, String str) {
        this(context, str, (yo) null);
    }

    public u5(Context context, String str, yo yoVar) {
        this(context, yoVar, (g5.a) new b6.b().a(str));
    }
}
