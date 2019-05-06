package cn.ksdshpx.groovy.variable

def str = "groovy"
println str.center(8,'a')
println str.padLeft(8,'b')
println str.padRight(8,'c')

def str2 = "Hello"
println str > str2

println str[0]
println str[0..1]

def str3 = "HelloGroovy"
println str3.minus(str2)
println str3 - str2

println str3.reverse()

def str4 = "helloworld"
println str4.capitalize()