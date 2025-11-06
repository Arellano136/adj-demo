pipeline{
    agent any

    stages{
        //Para parar todo el poryecto y los servicios
        stage('Parando los servicios'){
            steps{
                bat'''
                docker compose -p adj-demo down || true 
                '''
            }
        }//para eliminar las imagenes

        stage('Borrando imagenes antiguas '){
            steps{
                bat'''
                IMAGES=$(docker images --filter "label=com.docker.compose.project=adj-demo" -q)
                if [ -n "$IMAGES" ]; then
                    docker rmi -f $IMAGES
                else
                    echo "No hay imagenes por eliminar"
                fi
                '''
            }
        }//para bajar actualizaciones
        stage('Actualizando...'){
            steps{
                checkout scm
            }
        }
        //para levantar y desplegar proyecto
        stage('Construyendo y desplegando servicios...') {
            steps {
                bat '''
                    docker compose up --build -d
                '''
            }
        }
    }

       post {
        success {
            echo 'Pipeline ejecutado con éxito'
        }

        failure {
            echo 'Hubo un error al ejecutar el pipeline'
        }

        always {
            echo 'Pipeline finalizado'
        }
    }

}