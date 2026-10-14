pipeline {
    agent any

    stages {
        stage('Validate Maven') {
            steps {
                bat 'mvn -version'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn package -DskipTests'
            }
        }
    }
}

