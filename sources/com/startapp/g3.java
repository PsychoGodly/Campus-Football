package com.startapp;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import com.startapp.sdk.ads.list3d.List3DActivity;
import com.startapp.sdk.ads.list3d.List3DView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: Sta */
public class g3 {

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, k7> f15831a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public Hashtable<String, Bitmap> f15832b = new Hashtable<>();

    /* renamed from: c  reason: collision with root package name */
    public Set<String> f15833c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public c6 f15834d;

    /* renamed from: e  reason: collision with root package name */
    public int f15835e = 0;

    /* renamed from: f  reason: collision with root package name */
    public ConcurrentLinkedQueue<b> f15836f = new ConcurrentLinkedQueue<>();

    /* compiled from: Sta */
    public class a extends AsyncTask<Void, Void, Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        public int f15837a = -1;

        /* renamed from: b  reason: collision with root package name */
        public String f15838b;

        /* renamed from: c  reason: collision with root package name */
        public String f15839c;

        public a(int i10, String str, String str2) {
            this.f15837a = i10;
            this.f15838b = str;
            this.f15839c = str2;
        }

        public Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            return c1.b(this.f15839c);
        }

        public void onPostExecute(Object obj) {
            List<s4> list;
            Bitmap bitmap = (Bitmap) obj;
            g3 g3Var = g3.this;
            boolean z10 = true;
            g3Var.f15835e--;
            if (bitmap != null) {
                g3Var.f15832b.put(this.f15838b, bitmap);
                c6 c6Var = g3.this.f15834d;
                if (c6Var != null) {
                    int i10 = this.f15837a;
                    List3DActivity list3DActivity = (List3DActivity) c6Var;
                    List3DView list3DView = list3DActivity.f16492a;
                    View childAt = list3DView.getChildAt(i10 - list3DView.f16514i);
                    if (childAt != null) {
                        t4 t4Var = (t4) childAt.getTag();
                        u4 a10 = v4.f17398b.a(list3DActivity.f16497f);
                        if (!(a10 == null || (list = a10.f17364b) == null || i10 >= list.size())) {
                            s4 s4Var = a10.f17364b.get(i10);
                            t4Var.f17291b.setImageBitmap(a10.f17363a.a(i10, s4Var.f16374a, s4Var.f16382i));
                            t4Var.f17291b.requestLayout();
                            if (s4Var.f16387n == null) {
                                z10 = false;
                            }
                            t4Var.a(z10);
                        }
                    }
                }
                g3 g3Var2 = g3.this;
                if (!g3Var2.f15836f.isEmpty()) {
                    b poll = g3Var2.f15836f.poll();
                    new a(poll.f15841a, poll.f15842b, poll.f15843c).execute(new Void[0]);
                }
            }
        }
    }

    /* compiled from: Sta */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f15841a;

        /* renamed from: b  reason: collision with root package name */
        public String f15842b;

        /* renamed from: c  reason: collision with root package name */
        public String f15843c;

        public b(g3 g3Var, int i10, String str, String str2) {
            this.f15841a = i10;
            this.f15842b = str;
            this.f15843c = str2;
        }
    }

    public final String a(String[] strArr, String str) {
        if (strArr == null) {
            return null;
        }
        return TextUtils.join("^", strArr) + str;
    }

    public Bitmap a(int i10, String str, String str2) {
        Bitmap bitmap = this.f15832b.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        if (this.f15833c.contains(str)) {
            return null;
        }
        this.f15833c.add(str);
        int i11 = this.f15835e;
        if (i11 >= 15) {
            this.f15836f.add(new b(this, i10, str, str2));
            return null;
        }
        this.f15835e = i11 + 1;
        new a(i10, str, str2).execute(new Void[0]);
        return null;
    }
}
