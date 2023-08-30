def call(lines) {
    lines = lines.toInteger() ?: 5
    /* env.RANDOM_LINES = sh(returnStdout: true, script: "shuf -n${lines} /usr/share/dict/words")*/
    sh(returnStdout: true, script: "curl -o resultFile https://random-word-api.herokuapp.com/word?number=10")
    env.MY_RESULT = sh(returnStdout: true, script: "cat resultFile |sed 's/\\,/\\n/g'; rm resultFile")
    sh "echo ${MY_RESULT}"
}
