package cn.ksdshpx.groovy.variable

def clouser = { String name, Integer age ->
    println "Hello ${name}!,My age is ${age}" }
clouser.call("Gradle", 20)
clouser("Gradle2", 25)

def clouser2 = { String name ->
    return "Hello ${name}!" }
def name = "Google"
def result = clouser2.call(name)
println result
