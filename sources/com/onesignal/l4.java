package com.onesignal;

import android.content.Context;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.onesignal.k3;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: TrackAmazonPurchase */
class l4 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Context f28037a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f28038b = false;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public b f28039c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f28040d = false;

    /* renamed from: e  reason: collision with root package name */
    private Object f28041e;

    /* renamed from: f  reason: collision with root package name */
    private Field f28042f;

    /* compiled from: TrackAmazonPurchase */
    class a implements Runnable {
        a() {
        }

        public void run() {
            PurchasingService.registerListener(l4.this.f28037a, l4.this.f28039c);
        }
    }

    /* compiled from: TrackAmazonPurchase */
    private class b implements PurchasingListener {

        /* renamed from: a  reason: collision with root package name */
        PurchasingListener f28044a;

        private b() {
        }

        /* synthetic */ b(l4 l4Var, a aVar) {
            this();
        }
    }

    l4(Context context) {
        this.f28037a = context;
        try {
            Class<?> cls = Class.forName("com.amazon.device.iap.internal.d");
            try {
                this.f28041e = cls.getMethod("d", new Class[0]).invoke((Object) null, new Object[0]);
            } catch (NullPointerException unused) {
                this.f28041e = cls.getMethod("e", new Class[0]).invoke((Object) null, new Object[0]);
                this.f28040d = true;
            }
            Field declaredField = cls.getDeclaredField("f");
            this.f28042f = declaredField;
            declaredField.setAccessible(true);
            b bVar = new b(this, (a) null);
            this.f28039c = bVar;
            bVar.f28044a = (PurchasingListener) this.f28042f.get(this.f28041e);
            this.f28038b = true;
            e();
        } catch (ClassNotFoundException e10) {
            d(e10);
        } catch (IllegalAccessException e11) {
            d(e11);
        } catch (InvocationTargetException e12) {
            d(e12);
        } catch (NoSuchMethodException e13) {
            d(e13);
        } catch (NoSuchFieldException e14) {
            d(e14);
        } catch (ClassCastException e15) {
            d(e15);
        }
    }

    private static void d(Exception exc) {
        k3.b(k3.r0.ERROR, "Error adding Amazon IAP listener.", exc);
        exc.printStackTrace();
    }

    private void e() {
        if (this.f28040d) {
            OSUtils.T(new a());
        } else {
            PurchasingService.registerListener(this.f28037a, this.f28039c);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (this.f28038b) {
            try {
                b bVar = (PurchasingListener) this.f28042f.get(this.f28041e);
                b bVar2 = this.f28039c;
                if (bVar != bVar2) {
                    bVar2.f28044a = bVar;
                    e();
                }
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            }
        }
    }
}
