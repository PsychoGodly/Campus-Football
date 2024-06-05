package com.startapp;

import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import com.startapp.sdk.ads.video.tracking.VideoTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.adsbase.a;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class fa {

    /* renamed from: a  reason: collision with root package name */
    public VideoTrackingLink[] f15822a;

    /* renamed from: b  reason: collision with root package name */
    public VideoTrackingParams f15823b;

    /* renamed from: c  reason: collision with root package name */
    public String f15824c;

    /* renamed from: d  reason: collision with root package name */
    public int f15825d;

    /* renamed from: e  reason: collision with root package name */
    public String f15826e = MaxReward.DEFAULT_LABEL;

    /* renamed from: f  reason: collision with root package name */
    public VASTErrorCodes f15827f;

    public fa(VideoTrackingLink[] videoTrackingLinkArr, VideoTrackingParams videoTrackingParams, String str, int i10) {
        this.f15822a = videoTrackingLinkArr;
        this.f15823b = videoTrackingParams;
        this.f15824c = str;
        this.f15825d = i10;
    }

    public ea a() {
        Object obj;
        Object obj2 = null;
        if (!((this.f15822a == null || this.f15823b == null) ? false : true)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        VideoTrackingLink[] videoTrackingLinkArr = this.f15822a;
        int length = videoTrackingLinkArr.length;
        int i10 = 0;
        while (i10 < length) {
            VideoTrackingLink videoTrackingLink = videoTrackingLinkArr[i10];
            if (videoTrackingLink.c() == null || (this.f15823b.b() > 0 && !videoTrackingLink.d())) {
                obj = obj2;
            } else {
                StringBuilder sb2 = new StringBuilder();
                VideoTrackingLink.TrackingSource b10 = videoTrackingLink.b();
                if (b10 == null) {
                    if (j9.c(videoTrackingLink.c())) {
                        b10 = VideoTrackingLink.TrackingSource.STARTAPP;
                    } else {
                        b10 = VideoTrackingLink.TrackingSource.EXTERNAL;
                    }
                }
                VideoTrackingParams videoTrackingParams = this.f15823b;
                videoTrackingParams.internalParamsIndicator = b10 == VideoTrackingLink.TrackingSource.STARTAPP;
                VideoTrackingParams c10 = videoTrackingParams.a(videoTrackingLink.d()).c(videoTrackingLink.a());
                String c11 = videoTrackingLink.c();
                String str = this.f15824c;
                String replace = c11.replace("[ASSETURI]", str != null ? TextUtils.htmlEncode(str) : MaxReward.DEFAULT_LABEL);
                int i11 = this.f15825d;
                long convert = TimeUnit.SECONDS.convert((long) i11, TimeUnit.MILLISECONDS);
                long j10 = (long) (i11 % 1000);
                Locale locale = Locale.US;
                String replace2 = replace.replace("[CONTENTPLAYHEAD]", TextUtils.htmlEncode(String.format(locale, "%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(convert / 3600), Long.valueOf((convert % 3600) / 60), Long.valueOf(convert % 60), Long.valueOf(j10)}))).replace("[CACHEBUSTING]", TextUtils.htmlEncode(String.valueOf(new SecureRandom().nextInt(90000000) + 10000000)));
                String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", locale).format(new Date());
                int length2 = format.length() - 2;
                String replace3 = replace2.replace("[TIMESTAMP]", TextUtils.htmlEncode(format.substring(0, length2) + ":" + format.substring(length2)));
                VASTErrorCodes vASTErrorCodes = this.f15827f;
                if (vASTErrorCodes != null) {
                    replace3 = replace3.replace("[ERRORCODE]", String.valueOf(vASTErrorCodes.a()));
                }
                sb2.append(replace3);
                sb2.append(c10.e());
                if (c10.internalParamsIndicator) {
                    obj = null;
                    sb2.append(a.c(a.a(c11, (String) null)));
                } else {
                    obj = null;
                }
                arrayList.add(sb2.toString());
            }
            i10++;
            obj2 = obj;
        }
        return new ea(arrayList, this.f15826e);
    }
}
