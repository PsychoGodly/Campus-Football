package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import e7.c;
import e7.r;
import h7.a;
import java.util.Arrays;
import java.util.List;
import l8.h;
import z1.g;

@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public List<c<?>> getComponents() {
        return Arrays.asList(new c[]{c.e(g.class).h(LIBRARY_NAME).b(r.k(Context.class)).f(a.f32973a).d(), h.b(LIBRARY_NAME, "18.1.7")});
    }
}
