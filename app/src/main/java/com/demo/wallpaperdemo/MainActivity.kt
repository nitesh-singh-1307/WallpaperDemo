package com.demo.wallpaperdemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.demo.wallpaperdemo.databinding.ActivityMainBinding
import com.demo.wallpaperdemo.module.GithubAlldata
import com.demo.wallpaperdemo.ui.GitdisplayAdapter
import com.demo.wallpaperdemo.viewmodel.GithubViewModel

class MainActivity : AppCompatActivity() {
    lateinit var githubViewModel: GithubViewModel
    lateinit var gitlist: List<GithubAlldata>
    private lateinit var githublistAdapter: GitdisplayAdapter
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        githublistAdapter = GitdisplayAdapter()
//        setContentView(R.layout.activity_main)
        githubViewModel = ViewModelProvider(this).get(GithubViewModel::class.java)
        mainBinding.recyItem.adapter = githublistAdapter
        githubViewModel.getGitAllData().observe(this, Observer {
            Log.d("TAG", "onCreate: <<<<<<<<<<<<<<<<<<<<<<loggggg>>>>>>>>>>>>" + it)
            githublistAdapter?.list = listOf(it)
        })

    }
}