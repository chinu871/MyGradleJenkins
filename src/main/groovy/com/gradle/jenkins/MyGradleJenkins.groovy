package com.gradle.jenkins

class MyGradleJenkins {

    public float getAvg(def sal){
        def avgSal = sal/30
        println("Avarage income month:"+ avgSal)
        return avgSal
    }
}
