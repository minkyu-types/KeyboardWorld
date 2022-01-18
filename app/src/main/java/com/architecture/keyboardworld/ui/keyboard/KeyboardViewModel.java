package com.architecture.keyboardworld.ui.keyboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class KeyboardViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public KeyboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}