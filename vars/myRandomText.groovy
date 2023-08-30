def call(lines) {
    lines = lines.toInteger() ?: 5
    /* env.RANDOM_LINES = sh(returnStdout: true, script: "shuf -n${lines} /usr/share/dict/words")*/
    sh(returnStdout: true, script: "sudo apt install dict")
    env.RANDOM_LINES = sh(returnStdout: true, script: "ls -ltr /usr/share/dict")
    env.MY_RESULT = env.RANDOM_LINES
    sh "echo ${MY_RESULT}"
}
