pipeline {
    agent any

    tools {
        maven "MAVEN3"
    }

    stages {
        stage('Checkout and Build') {
            steps {
                // GitHub repository
                git branch: 'master', url: 'https://github.com/JhioChoi/comp367Choi-lab2'
                bat "mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent package"
            }
            post {
                success {
                    junit '/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
        
        stage("Code Coverage") {
            steps {
                script {
                    bat "mvn org.jacoco:jacoco-maven-plugin:report"
                    jacoco(execPattern: 'target/site/jacoco/jacoco.exec')
                }
            }
        }
        
        stage("Login to Docker Hub") {
            steps {
                script {
                    
                       bat 'docker login -u jchoi156 -p "pullipsai9"'
                    
                }
            }
        }
        
        stage("Build Docker Image") {
            steps {
                script {
                    bat "docker build -t jchoi156/jihochoi_comp367_lab2 ."
                }
            }
        }
        
        stage("Push Image to Docker Hub") {
            steps {
                script {
                    bat 'docker push jchoi156/jihochoi_comp367_lab2'
                }
            }
        }
    }
}
