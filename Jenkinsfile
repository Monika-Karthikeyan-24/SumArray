pipeline {
    agent any

    tools {
        maven 'M3'
    }

    stages {

        stage('Checkout Git') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Monika-Karthikeyan-24/SumArray.git'
            }
        }

        stage('Maven Build') {
            steps {
                bat 'mvn validate'
            }
        }

    }
}
