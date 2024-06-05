package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.z0;
import androidx.core.view.l;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: SupportMenuInflater */
public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    static final Class<?>[] f1032e;

    /* renamed from: f  reason: collision with root package name */
    static final Class<?>[] f1033f;

    /* renamed from: a  reason: collision with root package name */
    final Object[] f1034a;

    /* renamed from: b  reason: collision with root package name */
    final Object[] f1035b;

    /* renamed from: c  reason: collision with root package name */
    Context f1036c;

    /* renamed from: d  reason: collision with root package name */
    private Object f1037d;

    /* compiled from: SupportMenuInflater */
    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        private static final Class<?>[] f1038c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        private Object f1039a;

        /* renamed from: b  reason: collision with root package name */
        private Method f1040b;

        public a(Object obj, String str) {
            this.f1039a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f1040b = cls.getMethod(str, f1038c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f1040b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f1040b.invoke(this.f1039a, new Object[]{menuItem})).booleanValue();
                }
                this.f1040b.invoke(this.f1039a, new Object[]{menuItem});
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* compiled from: SupportMenuInflater */
    private class b {
        androidx.core.view.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a  reason: collision with root package name */
        private Menu f1041a;

        /* renamed from: b  reason: collision with root package name */
        private int f1042b;

        /* renamed from: c  reason: collision with root package name */
        private int f1043c;

        /* renamed from: d  reason: collision with root package name */
        private int f1044d;

        /* renamed from: e  reason: collision with root package name */
        private int f1045e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1046f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f1047g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f1048h;

        /* renamed from: i  reason: collision with root package name */
        private int f1049i;

        /* renamed from: j  reason: collision with root package name */
        private int f1050j;

        /* renamed from: k  reason: collision with root package name */
        private CharSequence f1051k;

        /* renamed from: l  reason: collision with root package name */
        private CharSequence f1052l;

        /* renamed from: m  reason: collision with root package name */
        private int f1053m;

        /* renamed from: n  reason: collision with root package name */
        private char f1054n;

        /* renamed from: o  reason: collision with root package name */
        private int f1055o;

        /* renamed from: p  reason: collision with root package name */
        private char f1056p;

        /* renamed from: q  reason: collision with root package name */
        private int f1057q;

        /* renamed from: r  reason: collision with root package name */
        private int f1058r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f1059s;

        /* renamed from: t  reason: collision with root package name */
        private boolean f1060t;

        /* renamed from: u  reason: collision with root package name */
        private boolean f1061u;

        /* renamed from: v  reason: collision with root package name */
        private int f1062v;

        /* renamed from: w  reason: collision with root package name */
        private int f1063w;

        /* renamed from: x  reason: collision with root package name */
        private String f1064x;

        /* renamed from: y  reason: collision with root package name */
        private String f1065y;

        /* renamed from: z  reason: collision with root package name */
        private String f1066z;

        public b(Menu menu) {
            this.f1041a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f1036c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f1059s).setVisible(this.f1060t).setEnabled(this.f1061u).setCheckable(this.f1058r >= 1).setTitleCondensed(this.f1052l).setIcon(this.f1053m);
            int i10 = this.f1062v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f1066z != null) {
                if (!g.this.f1036c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f1066z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f1058r >= 2) {
                if (menuItem instanceof i) {
                    ((i) menuItem).t(true);
                } else if (menuItem instanceof j) {
                    ((j) menuItem).h(true);
                }
            }
            String str = this.f1064x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f1032e, g.this.f1034a));
                z10 = true;
            }
            int i11 = this.f1063w;
            if (i11 > 0) {
                if (!z10) {
                    menuItem.setActionView(i11);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                l.a(menuItem, bVar);
            }
            l.c(menuItem, this.B);
            l.g(menuItem, this.C);
            l.b(menuItem, this.f1054n, this.f1055o);
            l.f(menuItem, this.f1056p, this.f1057q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                l.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                l.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f1048h = true;
            i(this.f1041a.add(this.f1042b, this.f1049i, this.f1050j, this.f1051k));
        }

        public SubMenu b() {
            this.f1048h = true;
            SubMenu addSubMenu = this.f1041a.addSubMenu(this.f1042b, this.f1049i, this.f1050j, this.f1051k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f1048h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f1036c.obtainStyledAttributes(attributeSet, h.j.f18376o1);
            this.f1042b = obtainStyledAttributes.getResourceId(h.j.f18386q1, 0);
            this.f1043c = obtainStyledAttributes.getInt(h.j.f18396s1, 0);
            this.f1044d = obtainStyledAttributes.getInt(h.j.f18401t1, 0);
            this.f1045e = obtainStyledAttributes.getInt(h.j.f18406u1, 0);
            this.f1046f = obtainStyledAttributes.getBoolean(h.j.f18391r1, true);
            this.f1047g = obtainStyledAttributes.getBoolean(h.j.f18381p1, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            z0 u10 = z0.u(g.this.f1036c, attributeSet, h.j.f18411v1);
            this.f1049i = u10.n(h.j.f18426y1, 0);
            this.f1050j = (u10.k(h.j.B1, this.f1043c) & -65536) | (u10.k(h.j.C1, this.f1044d) & 65535);
            this.f1051k = u10.p(h.j.D1);
            this.f1052l = u10.p(h.j.E1);
            this.f1053m = u10.n(h.j.f18416w1, 0);
            this.f1054n = c(u10.o(h.j.F1));
            this.f1055o = u10.k(h.j.M1, 4096);
            this.f1056p = c(u10.o(h.j.G1));
            this.f1057q = u10.k(h.j.Q1, 4096);
            int i10 = h.j.H1;
            if (u10.s(i10)) {
                this.f1058r = u10.a(i10, false) ? 1 : 0;
            } else {
                this.f1058r = this.f1045e;
            }
            this.f1059s = u10.a(h.j.f18431z1, false);
            this.f1060t = u10.a(h.j.A1, this.f1046f);
            this.f1061u = u10.a(h.j.f18421x1, this.f1047g);
            this.f1062v = u10.k(h.j.R1, -1);
            this.f1066z = u10.o(h.j.I1);
            this.f1063w = u10.n(h.j.J1, 0);
            this.f1064x = u10.o(h.j.L1);
            String o10 = u10.o(h.j.K1);
            this.f1065y = o10;
            boolean z10 = o10 != null;
            if (z10 && this.f1063w == 0 && this.f1064x == null) {
                this.A = (androidx.core.view.b) e(o10, g.f1033f, g.this.f1035b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = u10.p(h.j.N1);
            this.C = u10.p(h.j.S1);
            int i11 = h.j.P1;
            if (u10.s(i11)) {
                this.E = h0.d(u10.k(i11, -1), this.E);
            } else {
                this.E = null;
            }
            int i12 = h.j.O1;
            if (u10.s(i12)) {
                this.D = u10.c(i12);
            } else {
                this.D = null;
            }
            u10.w();
            this.f1048h = false;
        }

        public void h() {
            this.f1042b = 0;
            this.f1043c = 0;
            this.f1044d = 0;
            this.f1045e = 0;
            this.f1046f = true;
            this.f1047g = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f1032e = r0
            f1033f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.g.<clinit>():void");
    }

    public g(Context context) {
        super(context);
        this.f1036c = context;
        Object[] objArr = {context};
        this.f1034a = objArr;
        this.f1035b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        String str = null;
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z11 && name2.equals(str)) {
                            str = null;
                            z11 = false;
                        } else if (name2.equals("group")) {
                            bVar.h();
                        } else if (name2.equals("item")) {
                            if (!bVar.d()) {
                                androidx.core.view.b bVar2 = bVar.A;
                                if (bVar2 == null || !bVar2.a()) {
                                    bVar.a();
                                } else {
                                    bVar.b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z10 = true;
                        }
                    }
                } else if (!z11) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.g(attributeSet);
                    } else if (name3.equals("menu")) {
                        c(xmlPullParser, attributeSet, bVar.b());
                    } else {
                        str = name3;
                        z11 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Object b() {
        if (this.f1037d == null) {
            this.f1037d = a(this.f1036c);
        }
        return this.f1037d;
    }

    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof a0.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f1036c.getResources().getLayout(i10);
            c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e10) {
            throw new InflateException("Error inflating menu XML", e10);
        } catch (IOException e11) {
            throw new InflateException("Error inflating menu XML", e11);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
