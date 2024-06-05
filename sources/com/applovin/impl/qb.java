package com.applovin.impl;

import java.lang.ref.WeakReference;
import java.util.Stack;

public interface qb {

    public interface a {
        Object a();
    }

    public interface b {
        void a(Object obj);
    }

    public static class c implements qb {

        /* renamed from: a  reason: collision with root package name */
        private final int f10902a;

        /* renamed from: b  reason: collision with root package name */
        private final Stack f10903b;

        public c() {
            this(3);
        }

        public synchronized Object a(a aVar) {
            return this.f10903b.isEmpty() ? aVar.a() : this.f10903b.pop();
        }

        public c(int i10) {
            this.f10903b = new Stack();
            this.f10902a = i10;
        }

        public synchronized void a(Object obj, b bVar) {
            if (this.f10903b.size() < this.f10902a) {
                this.f10903b.push(obj);
            } else {
                try {
                    bVar.a(obj);
                } catch (RuntimeException e10) {
                    o6.a((Throwable) e10);
                }
            }
            return;
        }
    }

    Object a(a aVar);

    void a(Object obj, b bVar);

    public static class d implements qb {

        /* renamed from: a  reason: collision with root package name */
        private final c f10904a = new c();

        /* access modifiers changed from: private */
        public static /* synthetic */ WeakReference b(a aVar) {
            return new WeakReference(aVar.a());
        }

        public Object a(a aVar) {
            Object obj;
            do {
                obj = ((WeakReference) this.f10904a.a(new v10(aVar))).get();
            } while (obj == null);
            return obj;
        }

        public void a(Object obj, b bVar) {
            o6.a(obj);
            this.f10904a.a(new WeakReference(obj), new w10(bVar, obj));
        }
    }
}
