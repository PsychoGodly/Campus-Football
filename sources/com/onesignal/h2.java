package com.onesignal;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: OSObservable */
class h2<ObserverType, StateType> {

    /* renamed from: a  reason: collision with root package name */
    private String f27832a;

    /* renamed from: b  reason: collision with root package name */
    private List<Object> f27833b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private boolean f27834c;

    /* compiled from: OSObservable */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f27835a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f27836b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f27837c;

        a(Method method, Object obj, Object obj2) {
            this.f27835a = method;
            this.f27836b = obj;
            this.f27837c = obj2;
        }

        public void run() {
            try {
                this.f27835a.invoke(this.f27836b, new Object[]{this.f27837c});
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (InvocationTargetException e11) {
                e11.printStackTrace();
            }
        }
    }

    h2(String str, boolean z10) {
        this.f27832a = str;
        this.f27834c = z10;
    }

    /* access modifiers changed from: package-private */
    public void a(ObserverType observertype) {
        this.f27833b.add(new WeakReference(observertype));
    }

    /* access modifiers changed from: package-private */
    public void b(ObserverType observertype) {
        this.f27833b.add(observertype);
    }

    /* access modifiers changed from: package-private */
    public boolean c(StateType statetype) {
        Iterator<Object> it = this.f27833b.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof WeakReference) {
                next = ((WeakReference) next).get();
            }
            if (next != null) {
                Class<?> cls = next.getClass();
                try {
                    Method declaredMethod = cls.getDeclaredMethod(this.f27832a, new Class[]{statetype.getClass()});
                    declaredMethod.setAccessible(true);
                    if (this.f27834c) {
                        q.f28088a.b(new a(declaredMethod, next, statetype));
                    } else {
                        try {
                            declaredMethod.invoke(next, new Object[]{statetype});
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                        } catch (InvocationTargetException e11) {
                            e11.printStackTrace();
                        }
                    }
                    z10 = true;
                } catch (NoSuchMethodException e12) {
                    e12.printStackTrace();
                }
            }
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public void d(ObserverType observertype) {
        for (int i10 = 0; i10 < this.f27833b.size(); i10++) {
            Object obj = ((WeakReference) this.f27833b.get(i10)).get();
            if (obj != null && obj.equals(observertype)) {
                this.f27833b.remove(i10);
                return;
            }
        }
    }
}
