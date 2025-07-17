def call(String GithubUrl, String branch) {
    git branch: "${branch}",
    url: "${GithubUrl}"
}
