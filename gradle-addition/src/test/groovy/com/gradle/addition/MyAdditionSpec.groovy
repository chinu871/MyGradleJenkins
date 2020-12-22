package com.gradle.addition

import spock.lang.Specification
import spock.lang.Unroll

class MyAdditionSpec extends Specification{

    MyAddition add = new MyAddition()

    @Unroll
    def "addition of result"() {
        given:
        int a = a1
        int b = b1
        when:
        int result = add.getAdd(a, b)
        then:
        assert result == resulting

        where:
        condition         | a1   | b1  | resulting
        "when two numer " | 10 | 10  | 20
        "when two number" | -10 | 10 | 0
    }
}
