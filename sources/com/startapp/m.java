package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.z5;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Sta */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public final i2<AnalyticsConfig> f16123a;

    public m(Context context, i2<AnalyticsConfig> i2Var) {
        this.f16123a = i2Var;
    }

    public void a(n nVar) {
        long j10;
        long j11;
        List list;
        String group;
        n nVar2 = nVar;
        AnalyticsConfig a10 = this.f16123a.a();
        if (a10 != null && Math.random() < a10.c()) {
            StringBuilder sb2 = new StringBuilder();
            boolean z10 = nVar2.f16153c;
            sb2.append("preLoading");
            sb2.append('=');
            sb2.append(z10 ? 1 : 0);
            sb2.append(", ");
            if (nVar2.f16154d) {
                boolean z11 = nVar2.f16156f;
                sb2.append("appPresent");
                sb2.append('=');
                sb2.append(z11 ? 1 : 0);
                sb2.append(", ");
            }
            n.a(sb2);
            String sb3 = sb2.toString();
            sb2.delete(0, sb2.length());
            List<String> b10 = a10.b();
            n.a(sb2, "adId", nVar2.f16151a, true);
            long j12 = nVar2.f16152b.f17589e;
            sb2.append("start");
            sb2.append('=');
            sb2.append(j12);
            sb2.append(", ");
            Map<String, List<String>> map = nVar2.f16152b.f17588d;
            if (map != null && (list = map.get("Server-Timing")) != null) {
                Pattern pattern = n.f16150m;
                if (pattern == null) {
                    pattern = Pattern.compile("^total;dur=(\\d+(\\.\\d*)?)$");
                    n.f16150m = pattern;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Matcher matcher = pattern.matcher((String) it.next());
                    if (matcher.matches() && (group = matcher.group(1)) != null) {
                        j10 = (long) (Double.parseDouble(group) * 1000000.0d);
                        break;
                    }
                }
            }
            j10 = 0;
            if (j10 > 0) {
                n.a(sb2, "serverTotal", n.a(j10), false);
            }
            z5.a aVar = nVar2.f16152b;
            String str = sb3;
            n.a(sb2, "network", n.a((aVar.f17591g - aVar.f17590f) - j10), false);
            long j13 = nVar2.f16157g;
            if (j13 > 0) {
                n.a(sb2, "parsing", n.a(j13 - nVar2.f16152b.f17591g), false);
                if (nVar2.f16153c) {
                    long j14 = nVar2.f16158h;
                    if (j14 > 0) {
                        n.a(sb2, "beforeLoad", n.a(j14 - nVar2.f16157g), false);
                        if (nVar2.f16155e) {
                            sb2.append("preLoadingSkipped");
                            sb2.append('=');
                            sb2.append(1);
                            sb2.append(", ");
                            j11 = nVar2.f16158h;
                        } else {
                            long j15 = nVar2.f16159i;
                            if (j15 > 0) {
                                n.a(sb2, "init", n.a(j15 - nVar2.f16158h), false);
                                n.a(sb2, "loading", n.a(nVar2.f16160j - nVar2.f16159i), false);
                                boolean z12 = nVar2.f16162l;
                                sb2.append("pageFinished");
                                sb2.append('=');
                                sb2.append(z12 ? 1 : 0);
                                sb2.append(", ");
                                j11 = nVar2.f16160j;
                            } else {
                                sb2.append("error");
                                sb2.append('=');
                                sb2.append((long) nVar2.f16161k);
                                sb2.append(", ");
                                j11 = nVar2.f16158h;
                            }
                        }
                    }
                }
                j11 = nVar2.f16157g;
            } else {
                j11 = nVar2.f16152b.f17591g;
            }
            n.a(sb2, "total", n.a(j11 - nVar2.f16152b.f17590f), false);
            Map<String, List<String>> map2 = nVar2.f16152b.f17588d;
            if (!(map2 == null || b10 == null)) {
                sb2.append("headers");
                sb2.append("={");
                for (Map.Entry next : map2.entrySet()) {
                    if (b10.contains(next.getKey()) && next.getValue() != null) {
                        sb2.append((String) next.getKey());
                        sb2.append("=[");
                        for (String a11 : (List) next.getValue()) {
                            n.a(sb2, (String) null, a11, true);
                        }
                        n.a(sb2);
                        sb2.append(']');
                        sb2.append(", ");
                    }
                }
                n.a(sb2);
                sb2.append("}");
                sb2.append(", ");
            }
            n.a(sb2);
            String sb4 = sb2.toString();
            i3 i3Var = new i3(j3.f15951d);
            i3Var.f15914d = "ADM";
            i3Var.f15919i = str;
            i3Var.f15915e = sb4;
            i3Var.a();
        }
    }
}
