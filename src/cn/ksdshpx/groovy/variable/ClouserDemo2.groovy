package cn.ksdshpx.groovy.variable

int result = fab2(5)
println result

int sum = cal(100)
println sum
/**
 * 求指定数的阶乘
 * @param number
 * @return
 */
int fab(int number){
    int result = 1
    1.upto(number,{num -> result *= num})
    return result
}

int fab2(int number){
    int result = 1
    number.downto(1,{num -> result *= num})
    return result
}

int cal(int number){
    int sum = 0
    number.times {
        num -> sum += num
    }
    return sum
}
