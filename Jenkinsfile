pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                    bat "mvn clean install --settings C:/Softs/.m2/settings.xml"
            }
        }
        stage('Run'){
            steps{
                    bat "mvn hpi:run --settings C:/Softs/.m2/settings.xml"
            }
        }
    }
}