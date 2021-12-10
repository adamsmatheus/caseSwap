data class GitHubDto(

    val type: String,
    val id: Int,
    val name: String,
    val active: Boolean,
    val events: List<String>,
    val config: Config,
    val updated_at: String,
    val created_at: String,
    val url: String,
    val test_url: String,
    val ping_url: String,
    val deliveries_url: String,
    val last_response: Last_response
)

data class Last_response(

    val code: String,
    val status: String,
    val message: String
)

data class Config(

    val content_type: String,
    val insecure_ssl: Int,
    val url: String
)