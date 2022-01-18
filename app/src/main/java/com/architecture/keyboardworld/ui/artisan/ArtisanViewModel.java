package com.architecture.keyboardworld.ui.artisan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ArtisanViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ArtisanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}