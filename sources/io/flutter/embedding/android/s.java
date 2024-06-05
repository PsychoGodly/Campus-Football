package io.flutter.embedding.android;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import com.google.android.gms.common.api.a;
import io.flutter.plugin.editing.b;
import java.util.HashSet;
import java.util.Map;
import kc.e;

/* compiled from: KeyboardManager */
public class s implements b.a, e.b {

    /* renamed from: a  reason: collision with root package name */
    protected final d[] f33501a;

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<KeyEvent> f33502b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    private final e f33503c;

    /* compiled from: KeyboardManager */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private int f33504a = 0;

        /* access modifiers changed from: package-private */
        public Character a(int i10) {
            char c10 = (char) i10;
            if ((Integer.MIN_VALUE & i10) != 0) {
                int i11 = i10 & a.e.API_PRIORITY_OTHER;
                int i12 = this.f33504a;
                if (i12 != 0) {
                    this.f33504a = KeyCharacterMap.getDeadChar(i12, i11);
                } else {
                    this.f33504a = i11;
                }
            } else {
                int i13 = this.f33504a;
                if (i13 != 0) {
                    int deadChar = KeyCharacterMap.getDeadChar(i13, i10);
                    if (deadChar > 0) {
                        c10 = (char) deadChar;
                    }
                    this.f33504a = 0;
                }
            }
            return Character.valueOf(c10);
        }
    }

    /* compiled from: KeyboardManager */
    private class c {

        /* renamed from: a  reason: collision with root package name */
        final KeyEvent f33505a;

        /* renamed from: b  reason: collision with root package name */
        int f33506b;

        /* renamed from: c  reason: collision with root package name */
        boolean f33507c = false;

        /* compiled from: KeyboardManager */
        private class a implements d.a {

            /* renamed from: a  reason: collision with root package name */
            boolean f33509a;

            private a() {
                this.f33509a = false;
            }

            public void a(boolean z10) {
                if (!this.f33509a) {
                    this.f33509a = true;
                    c cVar = c.this;
                    int i10 = cVar.f33506b - 1;
                    cVar.f33506b = i10;
                    boolean z11 = z10 | cVar.f33507c;
                    cVar.f33507c = z11;
                    if (i10 == 0 && !z11) {
                        s.this.e(cVar.f33505a);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
            }
        }

        c(KeyEvent keyEvent) {
            this.f33506b = s.this.f33501a.length;
            this.f33505a = keyEvent;
        }

        public d.a a() {
            return new a();
        }
    }

    /* compiled from: KeyboardManager */
    public interface d {

        /* compiled from: KeyboardManager */
        public interface a {
            void a(boolean z10);
        }

        void a(KeyEvent keyEvent, a aVar);
    }

    /* compiled from: KeyboardManager */
    public interface e {
        void g(KeyEvent keyEvent);

        lc.c getBinaryMessenger();

        boolean j(KeyEvent keyEvent);
    }

    public s(e eVar) {
        this.f33503c = eVar;
        this.f33501a = new d[]{new r(eVar.getBinaryMessenger()), new m(new kc.d(eVar.getBinaryMessenger()))};
        new kc.e(eVar.getBinaryMessenger()).b(this);
    }

    /* access modifiers changed from: private */
    public void e(KeyEvent keyEvent) {
        e eVar = this.f33503c;
        if (eVar != null && !eVar.j(keyEvent)) {
            this.f33502b.add(keyEvent);
            this.f33503c.g(keyEvent);
            if (this.f33502b.remove(keyEvent)) {
                xb.b.g("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public boolean a(KeyEvent keyEvent) {
        if (this.f33502b.remove(keyEvent)) {
            return false;
        }
        if (this.f33501a.length > 0) {
            c cVar = new c(keyEvent);
            for (d a10 : this.f33501a) {
                a10.a(keyEvent, cVar.a());
            }
            return true;
        }
        e(keyEvent);
        return true;
    }

    public Map<Long, Long> b() {
        return ((r) this.f33501a[0]).h();
    }

    public void d() {
        int size = this.f33502b.size();
        if (size > 0) {
            xb.b.g("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
        }
    }
}
