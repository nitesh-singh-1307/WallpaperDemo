package com.demo.wallpaperdemo.ui

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.library.baseAdapters.BR
import androidx.recyclerview.widget.RecyclerView
import com.demo.wallpaperdemo.R
import com.demo.wallpaperdemo.databinding.GitItemLayoutBinding
import com.demo.wallpaperdemo.module.GithubAlldata
import com.demo.wallpaperdemo.viewmodel.GithubViewModel

class GitdisplayAdapter() : RecyclerView.Adapter<GitdisplayAdapter.GitdisplayHolder>() {

    var list: List<GithubAlldata> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GitdisplayHolder {
        val gitItemLayoutBinding: GitItemLayoutBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context), R.layout.git_item_layout, parent, false
        )
        return GitdisplayHolder(gitItemLayoutBinding)

    }

    override fun onBindViewHolder(holder:GitdisplayHolder, position: Int) {
        var githupalllist: GithubAlldata = list.get(position)
        Log.d("TAG", "onCreate: <<<<<<<<<<<<<<<<<<<<<<loggggg>>>>>>>>>>>>" + githupalllist.get(position).commentsUrl)

        holder.bind(githupalllist)
    }

    override fun getItemCount(): Int {
       return list.size
    }

    class GitdisplayHolder(gitItemLayoutBinding: GitItemLayoutBinding) :
        RecyclerView.ViewHolder(gitItemLayoutBinding.root) {
        var gitItemLayoutBinding: GitItemLayoutBinding

        init {
            this.gitItemLayoutBinding = gitItemLayoutBinding

        }

        fun bind(obj: GithubAlldata) {
            gitItemLayoutBinding.setVariable(BR._all, obj)
            gitItemLayoutBinding.executePendingBindings()
        }


    }

}