package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.applovin.impl.ca;

public class k extends View {

    /* renamed from: a  reason: collision with root package name */
    private final ca f6481a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6482b;

    interface a {
        void a();

        void onFailure();
    }

    public k(ca caVar, Context context) {
        super(context);
        this.f6481a = caVar;
        setClickable(false);
        setFocusable(false);
    }

    public boolean a() {
        return this.f6482b;
    }

    public void b() {
        a((a) null);
    }

    public String getIdentifier() {
        return this.f6481a.b();
    }

    public void a(a aVar) {
        if (!this.f6482b) {
            Drawable a10 = this.f6481a.a();
            if (a10 != null) {
                setBackground(a10);
                this.f6482b = true;
                if (aVar != null) {
                    aVar.a();
                }
            } else if (aVar != null) {
                aVar.onFailure();
            }
        } else if (aVar != null) {
            aVar.a();
        }
    }
}
