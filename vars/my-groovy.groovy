def call(size) {
    size = size ?: 100
    env.MY_GROOVY_RESULT = sh(returnStdout: true, script: " echo $(( $RANDOM % ${size} + 1 ))")
    sh "echo ${MY_GROOVY_RESULT}"
}
