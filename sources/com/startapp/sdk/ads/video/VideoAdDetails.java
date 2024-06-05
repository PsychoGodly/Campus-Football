package com.startapp.sdk.ads.video;

import com.startapp.d9;
import com.startapp.l9;
import com.startapp.q9;
import com.startapp.sdk.ads.video.tracking.VideoTrackingDetails;
import com.startapp.sdk.ads.video.vast.a;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.omsdk.VerificationDetails;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class VideoAdDetails implements Serializable {
    private static final long serialVersionUID = 4938639129535870268L;
    @d9(type = ArrayList.class, value = VerificationDetails.class)
    private List<VerificationDetails> adVerifications;
    private String clickUrl;
    private boolean clickable;
    private boolean closeable;
    private boolean isVideoMuted;
    private String localVideoPath;
    @d9(type = PostRollType.class)
    private PostRollType postRoll;
    private String postRollClickThroughUrl;
    private String postRollHtml;
    private boolean skippable;
    private long skippableAfter;
    private Long unskipLess;
    @d9(complex = true)
    private VideoTrackingDetails videoTrackingDetails;
    private String videoUrl;

    /* compiled from: Sta */
    public enum PostRollType {
        IMAGE,
        LAST_FRAME,
        NONE
    }

    public VideoAdDetails() {
    }

    public void a(String str) {
        this.localVideoPath = str;
    }

    public String b() {
        return this.clickUrl;
    }

    public String c() {
        return this.localVideoPath;
    }

    public String d() {
        return this.postRollHtml != null ? this.postRollClickThroughUrl : this.clickUrl;
    }

    public String e() {
        return this.postRollHtml;
    }

    public PostRollType f() {
        return this.postRoll;
    }

    public long g() {
        return this.skippableAfter;
    }

    public Long h() {
        return this.unskipLess;
    }

    public VideoTrackingDetails i() {
        return this.videoTrackingDetails;
    }

    public String j() {
        return this.videoUrl;
    }

    public boolean k() {
        return (this.postRoll == PostRollType.NONE && this.postRollHtml == null) ? false : true;
    }

    public boolean l() {
        return this.clickable;
    }

    public boolean m() {
        return this.closeable;
    }

    public boolean n() {
        return this.skippable;
    }

    public boolean o() {
        return this.isVideoMuted;
    }

    public void p() {
        this.skippableAfter = TimeUnit.SECONDS.toMillis(this.skippableAfter);
    }

    public String toString() {
        return super.toString();
    }

    public VideoAdDetails(l9 l9Var, VideoConfig videoConfig, q9 q9Var) {
        long j10;
        this.videoTrackingDetails = new VideoTrackingDetails(l9Var);
        this.videoUrl = l9Var.k();
        boolean z10 = true;
        if (q9Var != null) {
            Long a10 = q9Var.a();
            Integer o10 = l9Var.o();
            if (a10 != null) {
                j10 = a10.longValue();
            } else if (o10 != null) {
                j10 = (long) o10.intValue();
            } else {
                j10 = videoConfig.m();
            }
            this.skippableAfter = j10;
            this.skippable = true;
            this.unskipLess = q9Var.b();
        } else {
            this.skippable = false;
        }
        String c10 = l9Var.c();
        this.clickUrl = c10;
        this.clickable = c10 == null ? false : z10;
        this.postRoll = PostRollType.NONE;
        a f10 = l9Var.f();
        if (f10 != null) {
            this.postRollHtml = f10.c().a();
            this.postRollClickThroughUrl = f10.a();
        }
        a((List<VerificationDetails>) Collections.unmodifiableList(l9Var.b()));
    }

    public void a(boolean z10) {
        this.isVideoMuted = z10;
    }

    public List<VerificationDetails> a() {
        return this.adVerifications;
    }

    public void a(List<VerificationDetails> list) {
        this.adVerifications = list;
    }
}
