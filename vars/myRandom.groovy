def call(size) {
    size = size ?: 100
    env.RANDOM_NUMBER = sh(returnStdout: true, script: "shuf -i 0-${size} -n 1")
    sh "echo ${RANDOM_NUMBER}"
}
