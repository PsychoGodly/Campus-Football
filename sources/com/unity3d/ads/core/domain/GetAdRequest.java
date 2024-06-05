package com.unity3d.ads.core.domain;

import com.google.protobuf.i;
import vb.p;
import vb.t3;
import xd.d;

/* compiled from: GetAdRequest.kt */
public interface GetAdRequest {

    /* compiled from: GetAdRequest.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(GetAdRequest getAdRequest, String str, i iVar, p pVar, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    pVar = null;
                }
                return getAdRequest.invoke(str, iVar, pVar, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }

    Object invoke(String str, i iVar, p pVar, d<? super t3> dVar);
}
