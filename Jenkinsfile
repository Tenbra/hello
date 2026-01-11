pipeline {
    agent any
    tools {
        maven 'Maven 3.9.12'
    }

    stages {
        stage('Build') {
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
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}