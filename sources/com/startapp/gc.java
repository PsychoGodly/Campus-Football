package com.startapp;

import com.startapp.rb;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: Sta */
public class gc extends jb {
    public gc(rb.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(bVar, hashSet, jSONObject, j10);
    }

    public void a(String str) {
        cb cbVar = cb.f15708c;
        if (cbVar != null) {
            for (T t10 : Collections.unmodifiableCollection(cbVar.f15709a)) {
                if (this.f15988c.contains(t10.f15798h)) {
                    t10.f15795e.a(str, this.f15990e);
                }
            }
        }
        super.onPostExecute(str);
    }

    public Object doInBackground(Object[] objArr) {
        return this.f15989d.toString();
    }
}
