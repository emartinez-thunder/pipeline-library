def call(size) {
    size = size ?: 100
    env.MY_GROOVY_RESULT = sh(returnStdout: true, script: "$[ $RANDOM % 40 + 10 ]")
    sh "echo ${MY_GROOVY_RESULT}"
}
