def call(size) {
    size = size ?: 100
    env.MY_GROOVY_RESULT = Math.abs(new Random().nextInt() % [size]) + 1
    sh "echo ${MY_GROOVY_RESULT}"
}
