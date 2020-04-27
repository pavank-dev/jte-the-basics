package org.foo
class Utilities {
  static def mvn(script, args) {
    script.sh "${script.tool 'Maven'}/bin/mvn -s ${script.env.HOME}/jenkins.xml -o ${args}"
  }
}

@Library('utils') import static org.foo.Utilities.*
node {
  mvn this, 'clean package'
}
