pipeline {

    agent {
        node{
            label 'master'
        }
    }
    
    tools { 
        maven 'maven' 
        jdk 'openjdk-11' 
    }

    options {
        disableConcurrentBuilds()
    }

    environment {
        SERVICE_NAME = readMavenPom().getArtifactId()
        VERSION = readMavenPom().getVersion()
        COMMIT_ID = sh(returnStdout: true, script: 'git rev-parse --short HEAD').trim()
        BUILD_VERSION = "${VERSION}-${COMMIT_ID}"

    }
    stages {

        stage('Build Master') {
            when {
                branch 'master'
            }
            stages {

                stage("Build Artefact") {
                    steps {
                        echo "Building master ${BUILD_NUMBER}."
                        sh "mvn clean install"
                        junit testResults: '**/target/*-reports/TEST-*.xml'

                    }
                }

                stage('Sonarqube') {
                    environment {
                        scannerHome = tool 'SonarQubeScanner'
                    }
                    steps {
                        withSonarQubeEnv('sonarqube') {
                            echo "${scannerHome}"
                            sh "${scannerHome}/bin/sonar-scanner"
                        }

                    }

                }
            }
        }
    }
}
