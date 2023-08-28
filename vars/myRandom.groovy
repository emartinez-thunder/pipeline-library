def call(sizeParam, thresholdParam) {
    size = sizeParam.toInteger() ?: 100
    threshold = thresholdParam.toInteger ?: 25
    env.RANDOM_NUMBER = sh(returnStdout: true, script: "shuf -i 0-${size} -n 1")
    env.MY_RESULT = env.RANDOM_NUMBER
    sh "echo ${RANDOM_NUMBER}"
    resultInt = env.RANDOM_NUMBER.toInteger();
    if (resultInt > threshold) {
        env.SUCCESS = true
    }
    else {
        env.SUCCESS = false
    }
}
