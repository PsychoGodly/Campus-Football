package io.flutter.plugin.editing;

import android.os.Bundle;
import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import kc.o;
import lc.k;
import mc.a;

/* compiled from: SpellCheckPlugin */
public class d implements o.b, SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a  reason: collision with root package name */
    private final o f33639a;

    /* renamed from: b  reason: collision with root package name */
    private final TextServicesManager f33640b;

    /* renamed from: c  reason: collision with root package name */
    private SpellCheckerSession f33641c;

    /* renamed from: d  reason: collision with root package name */
    k.d f33642d;

    public d(TextServicesManager textServicesManager, o oVar) {
        this.f33640b = textServicesManager;
        this.f33639a = oVar;
        oVar.b(this);
    }

    public void a(String str, String str2, k.d dVar) {
        if (this.f33642d != null) {
            dVar.error("error", "Previous spell check request still pending.", (Object) null);
            return;
        }
        this.f33642d = dVar;
        c(str, str2);
    }

    public void b() {
        this.f33639a.b((o.b) null);
        SpellCheckerSession spellCheckerSession = this.f33641c;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    public void c(String str, String str2) {
        Locale b10 = a.b(str);
        if (this.f33641c == null) {
            this.f33641c = this.f33640b.newSpellCheckerSession((Bundle) null, b10, this, true);
        }
        this.f33641c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.f33642d.success(new ArrayList());
            this.f33642d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.f33642d.success(new ArrayList());
            this.f33642d = null;
            return;
        }
        for (int i10 = 0; i10 < sentenceSuggestionsInfo.getSuggestionsCount(); i10++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i10);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap hashMap = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i10);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i10) + offsetAt;
                hashMap.put("startIndex", Integer.valueOf(offsetAt));
                hashMap.put("endIndex", Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z10 = false;
                for (int i11 = 0; i11 < suggestionsCount; i11++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i11);
                    if (!suggestionAt.equals(MaxReward.DEFAULT_LABEL)) {
                        arrayList2.add(suggestionAt);
                        z10 = true;
                    }
                }
                if (z10) {
                    hashMap.put("suggestions", arrayList2);
                    arrayList.add(hashMap);
                }
            }
        }
        this.f33642d.success(arrayList);
        this.f33642d = null;
    }

    public void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
