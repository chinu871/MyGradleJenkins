package com.gradle.jenkins

class MyGradleJenkins {

    public float getAvg(def sal){
        def avgSal = sal/30
        println("Avarage Monthly Income:"+ avgSal)
        println("Avarage income monthly:"+ avgSal)
        return avgSal
    }
}
