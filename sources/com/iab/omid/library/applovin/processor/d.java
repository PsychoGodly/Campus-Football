package com.iab.omid.library.applovin.processor;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.applovin.processor.a;
import com.iab.omid.library.applovin.utils.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

public class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f27410a = new int[2];

    private void b(ViewGroup viewGroup, JSONObject jSONObject, a.C0285a aVar, boolean z10) {
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
            while (it2.hasNext()) {
                aVar.a((View) it2.next(), this, jSONObject, z10);
            }
        }
    }

    public JSONObject a(View view) {
        if (view == null) {
            return c.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f27410a);
        int[] iArr = this.f27410a;
        return c.a(iArr[0], iArr[1], width, height);
    }

    public void a(View view, JSONObject jSONObject, a.C0285a aVar, boolean z10, boolean z11) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z10 || Build.VERSION.SDK_INT < 21) {
                a(viewGroup, jSONObject, aVar, z11);
            } else {
                b(viewGroup, jSONObject, aVar, z11);
            }
        }
    }

    private void a(ViewGroup viewGroup, JSONObject jSONObject, a.C0285a aVar, boolean z10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            aVar.a(viewGroup.getChildAt(i10), this, jSONObject, z10);
        }
    }
}
