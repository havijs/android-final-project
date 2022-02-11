package com.knavid.finalproject.activity.ui.genres;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GenresViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GenresViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is genres fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}