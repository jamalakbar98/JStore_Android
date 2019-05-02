package com.example.jstore_android_jamaludinakbar;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {
    private static final String Regis_URL = "insert your Customer API URL";
    private Map<String, String> params;

    public RegisterRequest(String name, String email, String password, Response.Listener<String> listener)
    {
        super (Method.POST, Regis_URL, listener, null);
        params = new HashMap<>();
        params.put("Name : ", name);
        params.put("Email : ", email);
        params.put("Password : ", password);
    }
    @Override
    public Map<String, String> getParams()
    {
        return params;
    }
}
