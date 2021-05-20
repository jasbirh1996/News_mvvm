package com.creativaties.dxapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.creativaties.dxapp.Adapter.NewsAdapter
import com.creativaties.dxapp.R
import com.creativaties.dxapp.data.model.News
import com.creativaties.dxapp.databinding.ActivityMainBinding
import com.creativaties.dxapp.util.Student
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.get
import java.lang.reflect.Array.get

class MainActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this,
            R.layout.activity_main
        )
    /*    val student  = get<Student>()

        student.friends
        student.schoolcourse*/

        val viewModel = ViewModelProvider(this).get(FontViewModel::class.java)


        binding.viewmodel = viewModel

        viewModel.liveupdate.observe(this, Observer {new->

            rvSuper.also {
                it.layoutManager = LinearLayoutManager(this)
                it.setHasFixedSize(true)
                it.adapter = NewsAdapter(new)
            }

        })
    }




}