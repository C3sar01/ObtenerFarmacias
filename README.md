API Farmacias


API que permite buscar farmacias de una comuna específica utilizando el servicio web https://farmanet.minsal.cl/index.php/ws/getLocales.

Instalación
Clonar este repositorio ubicado en la branch Master: git clone https://github.com/tu-usuario/api-farmacias.git.
Abrir el proyecto en un IDE (por ejemplo, IntelliJ IDEA).
Configurar las propiedades de la aplicación en src/main/resources/application.properties, incluyendo la URL del servicio de farmacias y la comuna por defecto (para pruebas locales).
Compilar y ejecutar la aplicación.
Uso
Obtener las farmacias de una comuna
Endpoint: /farmacias/{comuna}
Método: GET

Tecnologías utilizadas

Java 11
Spring Boot 2.7.11
Spring Web
Postman

