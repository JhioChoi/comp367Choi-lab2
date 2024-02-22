pipeline {
    agent any

    tools {
        maven "MAVEN3"
        jdk "JDK"
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/JhioChoi/comp367Choi-lab2'
                
            }
        }
        stage('Maven Build'){
        	steps{
        		bat "mvn clean compile"
        	}
        }
    }
}
