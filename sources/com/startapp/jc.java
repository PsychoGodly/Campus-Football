package com.startapp;

import android.text.TextUtils;
import com.startapp.rb;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: Sta */
public class jc extends jb {
    public jc(rb.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(bVar, hashSet, jSONObject, j10);
    }

    public void a(String str) {
        cb cbVar;
        if (!TextUtils.isEmpty(str) && (cbVar = cb.f15708c) != null) {
            for (T t10 : Collections.unmodifiableCollection(cbVar.f15709a)) {
                if (this.f15988c.contains(t10.f15798h)) {
                    t10.f15795e.b(str, this.f15990e);
                }
            }
        }
        super.onPostExecute(str);
    }

    public Object doInBackground(Object[] objArr) {
        if (qb.c(this.f15989d, ((ib) this.f16367b).f15932a)) {
            return null;
        }
        rb.b bVar = this.f16367b;
        JSONObject jSONObject = this.f15989d;
        ((ib) bVar).f15932a = jSONObject;
        return jSONObject.toString();
    }
}
