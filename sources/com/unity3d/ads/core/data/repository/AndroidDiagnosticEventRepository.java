package com.unity3d.ads.core.data.repository;

import com.google.android.gms.common.api.a;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.services.core.log.DeviceLog;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.m;
import se.b0;
import se.g;
import se.k0;
import se.u;
import se.v;
import se.z;
import vb.s0;
import vb.u0;
import vb.x1;

/* compiled from: AndroidDiagnosticEventRepository.kt */
public final class AndroidDiagnosticEventRepository implements DiagnosticEventRepository {
    private final u<List<s0>> _diagnosticEvents;
    /* access modifiers changed from: private */
    public final Set<u0> allowedEvents = new LinkedHashSet();
    private final v<List<s0>> batch = k0.a(new ArrayList());
    /* access modifiers changed from: private */
    public final Set<u0> blockedEvents = new LinkedHashSet();
    private final v<Boolean> configured;
    private final z<List<s0>> diagnosticEvents;
    private final v<Boolean> enabled;
    private final CoroutineTimer flushTimer;
    private int maxBatchSize = a.e.API_PRIORITY_OTHER;

    public AndroidDiagnosticEventRepository(CoroutineTimer coroutineTimer) {
        m.e(coroutineTimer, "flushTimer");
        this.flushTimer = coroutineTimer;
        Boolean bool = Boolean.FALSE;
        this.enabled = k0.a(bool);
        this.configured = k0.a(bool);
        u<List<s0>> a10 = b0.a(10, 10, re.a.DROP_OLDEST);
        this._diagnosticEvents = a10;
        this.diagnosticEvents = g.a(a10);
    }

    public void addDiagnosticEvent(s0 s0Var) {
        List<s0> value;
        List list;
        List<s0> value2;
        List list2;
        m.e(s0Var, "diagnosticEvent");
        if (!this.configured.getValue().booleanValue()) {
            v<List<s0>> vVar = this.batch;
            do {
                value2 = vVar.getValue();
                list2 = value2;
                list2.add(s0Var);
            } while (!vVar.a(value2, list2));
        } else if (this.enabled.getValue().booleanValue()) {
            v<List<s0>> vVar2 = this.batch;
            do {
                value = vVar2.getValue();
                list = value;
                list.add(s0Var);
            } while (!vVar2.a(value, list));
            if (this.batch.getValue().size() >= this.maxBatchSize) {
                flush();
            }
        }
    }

    public void clear() {
        List<s0> value;
        v<List<s0>> vVar = this.batch;
        do {
            value = vVar.getValue();
            List list = value;
        } while (!vVar.a(value, new ArrayList()));
    }

    public void configure(x1 x1Var) {
        m.e(x1Var, "diagnosticsEventsConfiguration");
        this.configured.setValue(Boolean.TRUE);
        this.enabled.setValue(Boolean.valueOf(x1Var.m0()));
        if (!this.enabled.getValue().booleanValue()) {
            clear();
            return;
        }
        this.maxBatchSize = x1Var.o0();
        Set<u0> set = this.allowedEvents;
        List<u0> j02 = x1Var.j0();
        m.d(j02, "diagnosticsEventsConfiguration.allowedEventsList");
        set.addAll(j02);
        Set<u0> set2 = this.blockedEvents;
        List<u0> k02 = x1Var.k0();
        m.d(k02, "diagnosticsEventsConfiguration.blockedEventsList");
        set2.addAll(k02);
        this.flushTimer.start(0, (long) x1Var.n0(), new AndroidDiagnosticEventRepository$configure$1(this));
    }

    public void flush() {
        List<s0> value;
        v<List<s0>> vVar = this.batch;
        do {
            value = vVar.getValue();
            List list = value;
        } while (!vVar.a(value, new ArrayList()));
        List j10 = l.j(l.g(l.g(y.n(value), new AndroidDiagnosticEventRepository$flush$events$2(this)), new AndroidDiagnosticEventRepository$flush$events$3(this)));
        if (!j10.isEmpty()) {
            DeviceLog.debug("Unity Ads Sending diagnostic batch enabled: " + this.enabled.getValue().booleanValue() + " size: " + j10.size() + " :: " + j10);
            this._diagnosticEvents.c(j10);
        }
    }

    public z<List<s0>> getDiagnosticEvents() {
        return this.diagnosticEvents;
    }
}
