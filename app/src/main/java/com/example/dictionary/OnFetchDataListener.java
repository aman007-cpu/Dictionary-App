package com.example.dictionary;

public interface OnFetchDataListener {

    void OnFetchData(APIResponse apiResponse, String message);
    void OnError(String message);
}
