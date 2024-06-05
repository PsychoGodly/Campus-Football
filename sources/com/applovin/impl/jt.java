package com.applovin.impl;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class jt {
    public static /* synthetic */ String a(CharSequence charSequence, Iterable iterable) {
        Objects.requireNonNull(charSequence, "delimiter");
        StringBuilder sb2 = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append(charSequence);
            }
        }
        return sb2.toString();
    }
}
