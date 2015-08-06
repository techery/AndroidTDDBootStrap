package com.piasy.model.dao;

import com.piasy.model.entities.GithubUser;

import android.support.annotation.NonNull;

import java.util.List;

import rx.Observable;

/**
 * Created by Piasy{github.com/Piasy} on 15/8/5.
 */
public interface GithubUserDAO {
    @NonNull
    Observable<List<GithubUser>> getUsers();
}
