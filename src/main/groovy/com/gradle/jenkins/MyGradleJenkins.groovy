package com.gradle.jenkins

class MyGradleJenkins {

    public float getAvg(def sal){
        def avgSal = sal/30
        println("Avarage monthly salary is :"+ avgSal)
        return avgSal
    }
}
