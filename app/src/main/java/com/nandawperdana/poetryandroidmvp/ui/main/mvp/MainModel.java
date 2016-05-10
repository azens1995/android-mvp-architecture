package com.nandawperdana.poetryandroidmvp.ui.main.mvp;

import com.nandawperdana.poetryandroidmvp.domains.model.AuthorPoetsDomain;
import com.nandawperdana.poetryandroidmvp.domains.model.AuthorsDomain;
import com.nandawperdana.poetryandroidmvp.utils.Enums;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nandawperdana on 4/21/2016.
 */
public class MainModel implements Serializable {
    public AuthorsDomain authorsDomain;
    public AuthorPoetsDomain authorPoetsDomain;

    private List<String> listAuthors;
    private String authorName;

    private Enums.ErrorState errorState;

    public MainModel() {
        this.authorsDomain = new AuthorsDomain();
        this.authorPoetsDomain = new AuthorPoetsDomain();
        this.listAuthors = new ArrayList<>();
    }

    public List<String> getListAuthors() {
        return listAuthors;
    }

    public void setListAuthors(List<String> listAuthors) {
        this.listAuthors = listAuthors;
    }

    public void setListAuthors() {
        getListAuthors().clear();
        for (String data : authorsDomain.getModel().getAuthors()) {
            getListAuthors().add(data);
        }
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Enums.ErrorState getErrorState() {
        return errorState;
    }

    public void setErrorState(Enums.ErrorState errorState) {
        this.errorState = errorState;
    }
}
