package com.demo.wallpaperdemo.module


import com.google.gson.annotations.SerializedName

class GithubAlldata : ArrayList<GithubAlldata.GithubAlldataItem>(){
    data class GithubAlldataItem(
        @SerializedName("comments")
        var comments: Int,
        @SerializedName("comments_url")
        var commentsUrl: String,
        @SerializedName("commits_url")
        var commitsUrl: String,
        @SerializedName("created_at")
        var createdAt: String,
        @SerializedName("description")
        var description: String,
        @SerializedName("files")
        var files: Files,
        @SerializedName("forks_url")
        var forksUrl: String,
        @SerializedName("git_pull_url")
        var gitPullUrl: String,
        @SerializedName("git_push_url")
        var gitPushUrl: String,
        @SerializedName("html_url")
        var htmlUrl: String,
        @SerializedName("id")
        var id: String,
        @SerializedName("node_id")
        var nodeId: String,
        @SerializedName("owner")
        var owner: Owner,
        @SerializedName("public")
        var `public`: Boolean,
        @SerializedName("truncated")
        var truncated: Boolean,
        @SerializedName("updated_at")
        var updatedAt: String,
        @SerializedName("url")
        var url: String

    ) {
        data class Files(
            @SerializedName("osu-lazer")
            var osuLazer: OsuLazer
        ) {
            data class OsuLazer(
                @SerializedName("filename")
                var filename: String,
                @SerializedName("language")
                var language: Any,
                @SerializedName("raw_url")
                var rawUrl: String,
                @SerializedName("size")
                var size: Int,
                @SerializedName("type")
                var type: String
            )
        }

        data class Owner(
            @SerializedName("avatar_url")
            var avatarUrl: String,
            @SerializedName("events_url")
            var eventsUrl: String,
            @SerializedName("followers_url")
            var followersUrl: String,
            @SerializedName("following_url")
            var followingUrl: String,
            @SerializedName("gists_url")
            var gistsUrl: String,
            @SerializedName("gravatar_id")
            var gravatarId: String,
            @SerializedName("html_url")
            var htmlUrl: String,
            @SerializedName("id")
            var id: Int,
            @SerializedName("login")
            var login: String,
            @SerializedName("node_id")
            var nodeId: String,
            @SerializedName("organizations_url")
            var organizationsUrl: String,
            @SerializedName("received_events_url")
            var receivedEventsUrl: String,
            @SerializedName("repos_url")
            var reposUrl: String,
            @SerializedName("site_admin")
            var siteAdmin: Boolean,
            @SerializedName("starred_url")
            var starredUrl: String,
            @SerializedName("subscriptions_url")
            var subscriptionsUrl: String,
            @SerializedName("type")
            var type: String,
            @SerializedName("url")
            var url: String
        )
    }
}