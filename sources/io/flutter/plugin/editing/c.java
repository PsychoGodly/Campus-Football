package io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;
import kc.q;

/* compiled from: ListenableEditingState */
class c extends SpannableStringBuilder {

    /* renamed from: a  reason: collision with root package name */
    private int f33625a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f33626b = 0;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<b> f33627c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<b> f33628d = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<e> f33629f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private String f33630g;

    /* renamed from: h  reason: collision with root package name */
    private String f33631h;

    /* renamed from: i  reason: collision with root package name */
    private int f33632i;

    /* renamed from: j  reason: collision with root package name */
    private int f33633j;

    /* renamed from: k  reason: collision with root package name */
    private int f33634k;

    /* renamed from: l  reason: collision with root package name */
    private int f33635l;

    /* renamed from: m  reason: collision with root package name */
    private BaseInputConnection f33636m;

    /* compiled from: ListenableEditingState */
    class a extends BaseInputConnection {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Editable f33637a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view, boolean z10, Editable editable) {
            super(view, z10);
            this.f33637a = editable;
        }

        public Editable getEditable() {
            return this.f33637a;
        }
    }

    /* compiled from: ListenableEditingState */
    interface b {
        void a(boolean z10, boolean z11, boolean z12);
    }

    public c(q.e eVar, View view) {
        this.f33636m = new a(view, true, this);
        if (eVar != null) {
            n(eVar);
        }
    }

    private void j(b bVar, boolean z10, boolean z11, boolean z12) {
        this.f33626b++;
        bVar.a(z10, z11, z12);
        this.f33626b--;
    }

    private void k(boolean z10, boolean z11, boolean z12) {
        if (z10 || z11 || z12) {
            Iterator<b> it = this.f33627c.iterator();
            while (it.hasNext()) {
                j(it.next(), z10, z11, z12);
            }
        }
    }

    public void a(b bVar) {
        if (this.f33626b > 0) {
            xb.b.b("ListenableEditingState", "adding a listener " + bVar.toString() + " in a listener callback");
        }
        if (this.f33625a > 0) {
            xb.b.g("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f33628d.add(bVar);
            return;
        }
        this.f33627c.add(bVar);
    }

    public void b() {
        this.f33625a++;
        if (this.f33626b > 0) {
            xb.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f33625a == 1 && !this.f33627c.isEmpty()) {
            this.f33631h = toString();
            this.f33632i = i();
            this.f33633j = h();
            this.f33634k = g();
            this.f33635l = f();
        }
    }

    public void c() {
        this.f33629f.clear();
    }

    public void d() {
        int i10 = this.f33625a;
        if (i10 == 0) {
            xb.b.b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i10 == 1) {
            Iterator<b> it = this.f33628d.iterator();
            while (it.hasNext()) {
                j(it.next(), true, true, true);
            }
            if (!this.f33627c.isEmpty()) {
                xb.b.f("ListenableEditingState", "didFinishBatchEdit with " + String.valueOf(this.f33627c.size()) + " listener(s)");
                boolean equals = toString().equals(this.f33631h) ^ true;
                boolean z10 = false;
                boolean z11 = (this.f33632i == i() && this.f33633j == h()) ? false : true;
                if (!(this.f33634k == g() && this.f33635l == f())) {
                    z10 = true;
                }
                k(equals, z11, z10);
            }
        }
        this.f33627c.addAll(this.f33628d);
        this.f33628d.clear();
        this.f33625a--;
    }

    public ArrayList<e> e() {
        ArrayList<e> arrayList = new ArrayList<>(this.f33629f);
        this.f33629f.clear();
        return arrayList;
    }

    public final int f() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int g() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    public final int h() {
        return Selection.getSelectionEnd(this);
    }

    public final int i() {
        return Selection.getSelectionStart(this);
    }

    public void l(b bVar) {
        if (this.f33626b > 0) {
            xb.b.b("ListenableEditingState", "removing a listener " + bVar.toString() + " in a listener callback");
        }
        this.f33627c.remove(bVar);
        if (this.f33625a > 0) {
            this.f33628d.remove(bVar);
        }
    }

    public void m(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f33636m.setComposingRegion(i10, i11);
        }
    }

    public void n(q.e eVar) {
        b();
        replace(0, length(), eVar.f35978a);
        if (eVar.c()) {
            Selection.setSelection(this, eVar.f35979b, eVar.f35980c);
        } else {
            Selection.removeSelection(this);
        }
        m(eVar.f35981d, eVar.f35982e);
        c();
        d();
    }

    public void setSpan(Object obj, int i10, int i11, int i12) {
        super.setSpan(obj, i10, i11, i12);
        this.f33629f.add(new e(toString(), i(), h(), g(), f()));
    }

    public String toString() {
        String str = this.f33630g;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f33630g = spannableStringBuilder;
        return spannableStringBuilder;
    }

    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        boolean z10;
        boolean z11;
        if (this.f33626b > 0) {
            xb.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String cVar = toString();
        int i14 = i11 - i10;
        boolean z12 = i14 != i13 - i12;
        for (int i15 = 0; i15 < i14 && !z12; i15++) {
            z12 |= charAt(i10 + i15) != charSequence.charAt(i12 + i15);
        }
        CharSequence charSequence2 = charSequence;
        if (z12) {
            this.f33630g = null;
        }
        int i16 = i();
        int h10 = h();
        int g10 = g();
        int f10 = f();
        SpannableStringBuilder replace = super.replace(i10, i11, charSequence, i12, i13);
        e eVar = r1;
        boolean z13 = z12;
        int i17 = f10;
        e eVar2 = new e(cVar, i10, i11, charSequence, i(), h(), g(), f());
        this.f33629f.add(eVar);
        if (this.f33625a > 0) {
            return replace;
        }
        boolean z14 = (i() == i16 && h() == h10) ? false : true;
        if (g() == g10 && f() == i17) {
            z10 = z13;
            z11 = false;
        } else {
            z10 = z13;
            z11 = true;
        }
        k(z10, z14, z11);
        return replace;
    }
}
