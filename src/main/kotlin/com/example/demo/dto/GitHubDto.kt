package com.example.demo.dto

import com.google.gson.annotations.SerializedName

data class GitHubDto(

    @SerializedName("url") val url : String,
    @SerializedName("repository_url") val repository_url : String,
    @SerializedName("labels_url") val labels_url : String,
    @SerializedName("comments_url") val comments_url : String,
    @SerializedName("events_url") val events_url : String,
    @SerializedName("html_url") val html_url : String,
    @SerializedName("id") val id : Int,
    @SerializedName("node_id") val node_id : String,
    @SerializedName("number") val number : Int,
    @SerializedName("title") val title : String,
    @SerializedName("user") val user : User,
    @SerializedName("labels") val labels : List<String>,
    @SerializedName("state") val state : String,
    @SerializedName("locked") val locked : Boolean,
    @SerializedName("assignee") val assignee : String,
    @SerializedName("assignees") val assignees : List<String>,
    @SerializedName("milestone") val milestone : String,
    @SerializedName("comments") val comments : Int,
    @SerializedName("created_at") val created_at : String,
    @SerializedName("updated_at") val updated_at : String,
    @SerializedName("closed_at") val closed_at : String,
    @SerializedName("author_association") val author_association : String,
    @SerializedName("active_lock_reason") val active_lock_reason : String,
    @SerializedName("body") val body : String,
    @SerializedName("reactions") val reactions : Reactions,
    @SerializedName("timeline_url") val timeline_url : String,
    @SerializedName("performed_via_github_app") val performed_via_github_app : String
)
data class Reactions (

    @SerializedName("url") val url : String,
    @SerializedName("total_count") val total_count : Int,
    @SerializedName("laugh") val laugh : Int,
    @SerializedName("hooray") val hooray : Int,
    @SerializedName("confused") val confused : Int,
    @SerializedName("heart") val heart : Int,
    @SerializedName("rocket") val rocket : Int,
    @SerializedName("eyes") val eyes : Int
)
data class User(

    @SerializedName("login") val login: String,
    @SerializedName("id") val id: Int,
    @SerializedName("node_id") val node_id: String,
    @SerializedName("avatar_url") val avatar_url: String,
    @SerializedName("gravatar_id") val gravatar_id: String,
    @SerializedName("url") val url: String,
    @SerializedName("html_url") val html_url: String,
    @SerializedName("followers_url") val followers_url: String,
    @SerializedName("following_url") val following_url: String,
    @SerializedName("gists_url") val gists_url: String,
    @SerializedName("starred_url") val starred_url: String,
    @SerializedName("subscriptions_url") val subscriptions_url: String,
    @SerializedName("organizations_url") val organizations_url: String,
    @SerializedName("repos_url") val repos_url: String,
    @SerializedName("events_url") val events_url: String,
    @SerializedName("received_events_url") val received_events_url: String,
    @SerializedName("type") val type: String,
    @SerializedName("site_admin") val site_admin: Boolean
)

