def call(size) {
    size = size ?: 100
    env.RANDOM_NUMBER = sh(returnStdout: true, script: "echo ${size}")
    sh "echo ${RANDOM_NUMBER}"
}
