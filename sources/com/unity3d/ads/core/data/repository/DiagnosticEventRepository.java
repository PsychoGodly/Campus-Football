package com.unity3d.ads.core.data.repository;

import java.util.List;
import se.z;
import vb.s0;
import vb.x1;

/* compiled from: DiagnosticEventRepository.kt */
public interface DiagnosticEventRepository {
    void addDiagnosticEvent(s0 s0Var);

    void clear();

    void configure(x1 x1Var);

    void flush();

    z<List<s0>> getDiagnosticEvents();
}
