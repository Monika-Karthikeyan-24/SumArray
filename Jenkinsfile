
pipeline {
    agent any

    tools {
        maven 'M3'
        jdk 'JDK25'
    }

    stages {
        stage('Validate') {
            steps {
                bat 'mvn -version'
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
}
