package com.gradle.jenkins

class MyGradleJenkins {

    public float getAvg(def sal){
        def avgSal = sal/30
        println("Avarage monthly sal is :"+ avgSal)
        return avgSal
    }
}
