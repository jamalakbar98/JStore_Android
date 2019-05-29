package com.example.jstore_android_jamaludinakbar;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

public class ItemFetchRequest extends StringRequest {
    private static final String ITEM_URL = "http://192.168.43.100:8085/items";
    public ItemFetchRequest(int id, Response.Listener<String> listener){
        super(Method.GET, ITEM_URL+"/"+id, listener, null);
    }
}
