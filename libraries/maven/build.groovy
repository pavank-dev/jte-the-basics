void call(){
    stage("Gradle: Build"){
        println "build from the gradle library"
       def sout = new StringBuffer(), serr = new StringBuffer()

     def proc ='ll /tmp/script.sh'.execute()

    proc.consumeProcessOutput(sout, serr)
   proc.waitForOrKill(1000)
   println sout

    }
}


