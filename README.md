# User API con Integración a GitHub

Esta API permite interactuar con el API público de GitHub para buscar usuarios y mostrar información de sus perfiles.

# Requisitos previos

- Java 17 o superior
- Gradle 8.8 o superior

# Configuración del entorno

# Clonar el repositorio

```bash
git clone https://github.com/stivendk/user_api.git
git checkout master
cd ticketapi
```

# Construir el proyecto
```bash
./gradlew build
```

# Probar la API
Para iniciar la app se realizará de manera manual dependiendo del IDE en el que sea ejecutado o a través del siguiente comando:
```bash
java -jar build/libs/tu-aplicacion-spring.jar
```

## Uso
- Una vez en funcionamiento, puedes acceder a la API en http://localhost:8080.
- Buscar Usuarios en GitHub: Envía una solicitud GET a /search con el parámetro query para buscar usuarios en GitHub.
```bash
GET /search?name=YOUR_NAME
```
La respuesta contendrá los usuarios encontrados según el criterio de búsqueda.

### Nota
Se adjunto una colección de postman dentro del proyecto donde se puede realizar el ejemplo.
