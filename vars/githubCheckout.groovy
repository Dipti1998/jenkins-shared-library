def call(String repoUrl, String branchName) {
    echo "Checking out from repo: ${repoUrl}, branch: ${branchName}"
    git url: repoUrl, branch: branchName
}
