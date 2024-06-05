package androidx.window.layout;

import fe.l;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.m;

/* compiled from: WindowMetricsCalculator.kt */
/* synthetic */ class WindowMetricsCalculator$Companion$overrideDecorator$1 extends k implements l<WindowMetricsCalculator, WindowMetricsCalculator> {
    WindowMetricsCalculator$Companion$overrideDecorator$1(Object obj) {
        super(1, obj, WindowMetricsCalculatorDecorator.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
    }

    public final WindowMetricsCalculator invoke(WindowMetricsCalculator windowMetricsCalculator) {
        m.e(windowMetricsCalculator, "p0");
        return ((WindowMetricsCalculatorDecorator) this.receiver).decorate(windowMetricsCalculator);
    }
}
