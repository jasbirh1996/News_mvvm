package com.creativaties.dxapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.creativaties.dxapp.data.model.News
import com.creativaties.dxapp.data.repo.UserRepo

class FontViewModel( ) : ViewModel() {


    val liveupdate = UserRepo().userRepoData()


}