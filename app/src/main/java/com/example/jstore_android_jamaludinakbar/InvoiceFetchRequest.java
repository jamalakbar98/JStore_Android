package com.example.jstore_android_jamaludinakbar;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

public class InvoiceFetchRequest extends StringRequest {
    private static final String INVO_URL = "http://192.168.43.100:8085/invoice";
    public InvoiceFetchRequest(int id, Response.Listener<String> listener){
        super(Method.GET, INVO_URL+"/"+id, listener, null);
    }
}
