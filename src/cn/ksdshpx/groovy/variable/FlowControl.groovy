package cn.ksdshpx.groovy.variable

def x = 1.23
def result
switch (x){
    case "foo":
        result = "found foo"
        break
    case "bar":
        result = "bar"
        break
    case [4,5,6,"inlist"]:
        result = "list"
        break
    case 12..30:
        result = "range"
        break
    case Integer:
        result = "integer"
        break
    case BigDecimal:
        result = "bigdecimal"
        break
    default:
        result = "default"
        break
}
println result

def sum = 0
for (i in 1..9){
    sum += i
}
println sum

/**
 * 对List进行循环
 */
sum = 0
for (i in [1,2,3,4,5]){
    sum += i
}
println sum

/**
 * 对Map进行循环
 */
sum = 0
for (i in ["zhangSan":30,"liSi":26,"wangWu":88]){
    sum += i.value
}
println sum
