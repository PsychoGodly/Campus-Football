package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.components.ComponentLocator;

/* compiled from: Sta */
public class b1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15627a;

    /* renamed from: b  reason: collision with root package name */
    public String f15628b;

    /* renamed from: c  reason: collision with root package name */
    public b f15629c;

    /* renamed from: d  reason: collision with root package name */
    public int f15630d;

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: com.startapp.b1$a$a  reason: collision with other inner class name */
        /* compiled from: Sta */
        public class C0164a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Bitmap f15632a;

            public C0164a(Bitmap bitmap) {
                this.f15632a = bitmap;
            }

            public void run() {
                b1 b1Var = b1.this;
                b bVar = b1Var.f15629c;
                if (bVar != null) {
                    bVar.a(this.f15632a, b1Var.f15630d);
                }
            }
        }

        public a() {
        }

        public void run() {
            new Handler(Looper.getMainLooper()).post(new C0164a(c1.b(b1.this.f15628b)));
        }
    }

    /* compiled from: Sta */
    public interface b {
        void a(Bitmap bitmap, int i10);
    }

    public b1(Context context, String str, b bVar, int i10) {
        this.f15627a = context;
        this.f15628b = str;
        this.f15629c = bVar;
        this.f15630d = i10;
    }

    public void a() {
        ComponentLocator.a(this.f15627a).f17163z.a().execute(new a());
    }
}
