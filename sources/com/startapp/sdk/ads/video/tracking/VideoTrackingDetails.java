package com.startapp.sdk.ads.video.tracking;

import com.applovin.mediation.MaxReward;
import com.startapp.d9;
import com.startapp.l9;
import com.startapp.p9;
import com.startapp.sdk.ads.video.vast.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Sta */
public class VideoTrackingDetails implements Serializable {
    private static final long serialVersionUID = -1841622077369870410L;
    @d9(type = AbsoluteTrackingLink.class)
    private AbsoluteTrackingLink[] absoluteTrackingUrls;
    @d9(type = ActionTrackingLink.class)
    private ActionTrackingLink[] creativeViewUrls;
    @d9(type = FractionTrackingLink.class)
    private FractionTrackingLink[] fractionTrackingUrls;
    @d9(type = ActionTrackingLink.class)
    private ActionTrackingLink[] impressionUrls;
    @d9(type = ActionTrackingLink.class)
    private ActionTrackingLink[] inlineErrorTrackingUrls;
    private boolean isVAST;
    @d9(type = ActionTrackingLink.class)
    private ActionTrackingLink[] soundMuteUrls;
    @d9(type = ActionTrackingLink.class)
    private ActionTrackingLink[] soundUnmuteUrls;
    @d9(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoClickTrackingUrls;
    @d9(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoClosedUrls;
    @d9(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPausedUrls;
    @d9(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPostRollClickTrackingUrls;
    @d9(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPostRollClosedUrls;
    @d9(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPostRollImpressionUrls;
    @d9(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoResumedUrls;
    @d9(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoRewardedUrls;
    @d9(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoSkippedUrls;

    public VideoTrackingDetails() {
    }

    public AbsoluteTrackingLink[] a() {
        return this.absoluteTrackingUrls;
    }

    public ActionTrackingLink[] b() {
        return this.creativeViewUrls;
    }

    public FractionTrackingLink[] c() {
        return this.fractionTrackingUrls;
    }

    public ActionTrackingLink[] d() {
        return this.impressionUrls;
    }

    public ActionTrackingLink[] e() {
        return this.inlineErrorTrackingUrls;
    }

    public ActionTrackingLink[] f() {
        return this.soundMuteUrls;
    }

    public ActionTrackingLink[] g() {
        return this.soundUnmuteUrls;
    }

    public ActionTrackingLink[] h() {
        return this.videoClickTrackingUrls;
    }

    public ActionTrackingLink[] i() {
        return this.videoClosedUrls;
    }

    public ActionTrackingLink[] j() {
        return this.videoPausedUrls;
    }

    public ActionTrackingLink[] k() {
        return this.isVAST ? this.videoPostRollClickTrackingUrls : this.videoClickTrackingUrls;
    }

    public ActionTrackingLink[] l() {
        return this.videoPostRollClosedUrls;
    }

    public ActionTrackingLink[] m() {
        return this.videoPostRollImpressionUrls;
    }

    public ActionTrackingLink[] n() {
        return this.videoResumedUrls;
    }

    public ActionTrackingLink[] o() {
        return this.videoRewardedUrls;
    }

    public ActionTrackingLink[] p() {
        return this.videoSkippedUrls;
    }

    public String toString() {
        return super.toString();
    }

    public VideoTrackingDetails(l9 l9Var) {
        this.isVAST = true;
        this.impressionUrls = b(l9Var.j());
        this.soundMuteUrls = b(l9Var.l());
        this.soundUnmuteUrls = b(l9Var.q());
        this.videoPausedUrls = b(l9Var.m());
        this.videoResumedUrls = b(l9Var.n());
        this.videoSkippedUrls = b(l9Var.p());
        this.videoClosedUrls = b(l9Var.e());
        this.inlineErrorTrackingUrls = b(l9Var.h());
        this.videoClickTrackingUrls = b(l9Var.d());
        this.absoluteTrackingUrls = a(l9Var.a());
        this.fractionTrackingUrls = a(l9Var.i(), l9Var.g());
        a f10 = l9Var.f();
        if (f10 != null) {
            this.videoPostRollImpressionUrls = b(f10.d());
            this.videoPostRollClickTrackingUrls = b(f10.b());
        }
    }

    public static ActionTrackingLink[] b(List<String> list) {
        if (list == null) {
            return new ActionTrackingLink[0];
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String b10 : list) {
            ActionTrackingLink actionTrackingLink = new ActionTrackingLink();
            actionTrackingLink.b(b10);
            actionTrackingLink.a(true);
            actionTrackingLink.a(MaxReward.DEFAULT_LABEL);
            arrayList.add(actionTrackingLink);
        }
        return (ActionTrackingLink[]) arrayList.toArray(new ActionTrackingLink[0]);
    }

    public final AbsoluteTrackingLink[] a(List<p9<Integer>> list) {
        if (list == null) {
            return new AbsoluteTrackingLink[0];
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (p9 next : list) {
            AbsoluteTrackingLink absoluteTrackingLink = new AbsoluteTrackingLink();
            absoluteTrackingLink.b(next.f16264a);
            if (((Integer) next.f16265b).intValue() != -1) {
                absoluteTrackingLink.a(((Integer) next.f16265b).intValue());
            }
            absoluteTrackingLink.a(true);
            absoluteTrackingLink.a(MaxReward.DEFAULT_LABEL);
            arrayList.add(absoluteTrackingLink);
        }
        return (AbsoluteTrackingLink[]) arrayList.toArray(new AbsoluteTrackingLink[0]);
    }

    public final FractionTrackingLink[] a(List<p9<Float>> list, List<String> list2) {
        ArrayList arrayList = new ArrayList(list.size());
        for (p9 next : list) {
            FractionTrackingLink fractionTrackingLink = new FractionTrackingLink();
            fractionTrackingLink.b(next.f16264a);
            fractionTrackingLink.a((int) (((Float) next.f16265b).floatValue() * 100.0f));
            fractionTrackingLink.a(true);
            fractionTrackingLink.a(MaxReward.DEFAULT_LABEL);
            arrayList.add(fractionTrackingLink);
        }
        for (String b10 : list2) {
            FractionTrackingLink fractionTrackingLink2 = new FractionTrackingLink();
            fractionTrackingLink2.b(b10);
            fractionTrackingLink2.a(100);
            fractionTrackingLink2.a(true);
            fractionTrackingLink2.a(MaxReward.DEFAULT_LABEL);
            arrayList.add(fractionTrackingLink2);
        }
        return arrayList.size() > 0 ? (FractionTrackingLink[]) arrayList.toArray(new FractionTrackingLink[0]) : new FractionTrackingLink[0];
    }
}
