pipeline {
  agent { label 'agent' }
  tools {
    maven 'maven'
  }
  options {
    buildDiscarder logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '5')
    disableConcurrentBuilds()
  }
  stages {
    stage ('Build (kra7je)') {
      steps {
        sh script: 'mvn clean ', label: '2f1777'
        sh script: 'mvn compile ', label: 'qgq7kw'
		echo "value for toggleFail ${params.toggleFail} value"
		script {
		  if( "${params.toggleFail}" == "true" ){
			error("pipeline failed to build");
		  }
		}
      } //end steps
    } // end stage Build
    stage ('Sonar Check (bxbggw)') {
      steps {
        withSonarQubeEnv('') {
	   sh script: 'mvn sonar:sonar ', label: 'oo247q'
	} 
	timeout(time: 30, unit: 'MINUTES') { 
    	   waitForQualityGate abortPipeline: true 
	}
      } //end steps
    } // end stage Sonar Check
    stage ('Deploy (fv4lpb)') {
      steps {
    /*    script { 
	rtUpload (
		serverId: "",
		spec:
			"""{
				"files": [
					{
						"pattern": "",
						"target" : ""
					}
				]
			}"""
	)
} */
sh script: 'sleep 0.005', label: 'gbzgil'

      } //end steps
    } // end stage Deploy
  }
}
