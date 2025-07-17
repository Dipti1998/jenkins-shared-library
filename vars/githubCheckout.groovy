def call() {
    echo "Checking out from GitHub"
    git url: 'https://github.com/your-org/your-repo.git', branch: 'main'
}
