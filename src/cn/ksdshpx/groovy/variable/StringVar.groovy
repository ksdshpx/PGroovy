package cn.ksdshpx.groovy.variable

def name = 'a single\'bb\' string'
print name + '-->' + name.class + '\n'

def nickName = '''line one
line two 
line three
'''
println nickName + '--->' + nickName.class

def commonName = "this is a common String"
println commonName + "--->" + commonName.class

def sayHello = "Hello:${commonName}"
println sayHello + '--->' + sayHello.class

def sum = "The sum of 2 and 3 is ${2+3}"
println sum + "--->" + sum.class

def result = echo(sum)
println result + "--->" + result.class

String echo(String msg){
    return msg
}

