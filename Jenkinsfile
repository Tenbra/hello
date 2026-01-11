pipeline {
    agent any
    tools {
        maven 'maven'
    }

    stages {
        stage('Build jar') {
            steps {
                echo 'Building..'
                sh 'mvn clean install -DskipTests' 
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'mvn test' 
            }
        }
        stage('Build Docker image') {
            steps {
                echo 'Build docker image...'
                script {
                    docker.build("hello")
                }
            }
        }
    }
}