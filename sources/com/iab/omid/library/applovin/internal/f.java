package com.iab.omid.library.applovin.internal;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class f {

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f27393b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a  reason: collision with root package name */
    private final List<e> f27394a = new ArrayList();

    private e b(View view) {
        for (e next : this.f27394a) {
            if (next.c().get() == view) {
                return next;
            }
        }
        return null;
    }

    public List<e> a() {
        return this.f27394a;
    }

    public void c(View view) {
        a(view);
        e b10 = b(view);
        if (b10 != null) {
            this.f27394a.remove(b10);
        }
    }

    private void a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    public void b() {
        this.f27394a.clear();
    }

    public void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        a(view);
        a(str);
        if (b(view) == null) {
            this.f27394a.add(new e(view, friendlyObstructionPurpose, str));
        }
    }

    private void a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
        } else if (!f27393b.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
    }
}
