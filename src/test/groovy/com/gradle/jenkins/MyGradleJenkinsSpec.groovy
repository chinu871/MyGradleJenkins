package com.gradle.jenkins

import spock.lang.Specification

class MyGradleJenkinsSpec extends Specification{
    MyGradleJenkins myGradleJenkins = new MyGradleJenkins()

    def "test my gradle jenkins task"(){
        setup:
        def sal = 30000.00
        when:
        def avgSal = myGradleJenkins.getAvg(sal)
        then:
        assert avgSal == 1000.00
    }
}
