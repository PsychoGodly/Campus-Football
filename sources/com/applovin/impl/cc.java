package com.applovin.impl;

import android.os.Looper;
import android.os.Message;
import com.applovin.impl.z8;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class cc {

    /* renamed from: a  reason: collision with root package name */
    private final j3 f6961a;

    /* renamed from: b  reason: collision with root package name */
    private final ha f6962b;

    /* renamed from: c  reason: collision with root package name */
    private final b f6963c;

    /* renamed from: d  reason: collision with root package name */
    private final CopyOnWriteArraySet f6964d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayDeque f6965e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque f6966f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6967g;

    public interface a {
        void a(Object obj);
    }

    public interface b {
        void a(Object obj, z8 z8Var);
    }

    public cc(Looper looper, j3 j3Var, b bVar) {
        this(new CopyOnWriteArraySet(), looper, j3Var, bVar);
    }

    public void a(Object obj) {
        if (!this.f6967g) {
            a1.a(obj);
            this.f6964d.add(new c(obj));
        }
    }

    public void b() {
        Iterator it = this.f6964d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(this.f6963c);
        }
        this.f6964d.clear();
        this.f6967g = true;
    }

    private cc(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, j3 j3Var, b bVar) {
        this.f6961a = j3Var;
        this.f6964d = copyOnWriteArraySet;
        this.f6963c = bVar;
        this.f6965e = new ArrayDeque();
        this.f6966f = new ArrayDeque();
        this.f6962b = j3Var.a(looper, new vv(this));
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Object f6968a;

        /* renamed from: b  reason: collision with root package name */
        private z8.b f6969b = new z8.b();

        /* renamed from: c  reason: collision with root package name */
        private boolean f6970c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f6971d;

        public c(Object obj) {
            this.f6968a = obj;
        }

        public void a(int i10, a aVar) {
            if (!this.f6971d) {
                if (i10 != -1) {
                    this.f6969b.a(i10);
                }
                this.f6970c = true;
                aVar.a(this.f6968a);
            }
        }

        public void b(b bVar) {
            this.f6971d = true;
            if (this.f6970c) {
                bVar.a(this.f6968a, this.f6969b.a());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f6968a.equals(((c) obj).f6968a);
        }

        public int hashCode() {
            return this.f6968a.hashCode();
        }

        public void a(b bVar) {
            if (!this.f6971d && this.f6970c) {
                z8 a10 = this.f6969b.a();
                this.f6969b = new z8.b();
                this.f6970c = false;
                bVar.a(this.f6968a, a10);
            }
        }
    }

    public void a() {
        if (!this.f6966f.isEmpty()) {
            if (!this.f6962b.a(0)) {
                ha haVar = this.f6962b;
                haVar.a(haVar.d(0));
            }
            boolean z10 = !this.f6965e.isEmpty();
            this.f6965e.addAll(this.f6966f);
            this.f6966f.clear();
            if (!z10) {
                while (!this.f6965e.isEmpty()) {
                    ((Runnable) this.f6965e.peekFirst()).run();
                    this.f6965e.removeFirst();
                }
            }
        }
    }

    public void b(Object obj) {
        Iterator it = this.f6964d.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f6968a.equals(obj)) {
                cVar.b(this.f6963c);
                this.f6964d.remove(cVar);
            }
        }
    }

    public void b(int i10, a aVar) {
        a(i10, aVar);
        a();
    }

    /* access modifiers changed from: private */
    public boolean a(Message message) {
        Iterator it = this.f6964d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(this.f6963c);
            if (this.f6962b.a(0)) {
                return true;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    public void a(int i10, a aVar) {
        this.f6966f.add(new wv(new CopyOnWriteArraySet(this.f6964d), i10, aVar));
    }

    public cc a(Looper looper, b bVar) {
        return new cc(this.f6964d, looper, this.f6961a, bVar);
    }
}
