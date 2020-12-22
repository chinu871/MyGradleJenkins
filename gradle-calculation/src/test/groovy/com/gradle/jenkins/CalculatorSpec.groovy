package com.gradle.jenkins

import spock.lang.Specification
import spock.lang.Unroll

class CalculatorSpec extends Specification{
    Calculator cal = new Calculator()
    @Unroll
    def "test for addition"(){
        setup:
        int add1 = a
        int add2 = b
        when:
        int result = cal.getAdd(add1, add2)
        then:
        assert result == res
        where:
        condition           | a  |b   | res
       "add first two number"|10| 20|  30
        "add second two number"|-10 |10 | 0
    }



}
