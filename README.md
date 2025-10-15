<div align="center">
  <h1 align="center">
    💱 Conversor de Monedas con Java
    <br />
    <br />
    <a>
      <img src="https://raw.githubusercontent.com/Ludmimar/DesafioConversorDeMoneda/main/Badge-Conversor.png" alt="Conversor">
    </a>
  </h1>
</div>

<p align="center">
  <strong>Aplicación de consola desarrollada en Java que permite realizar conversiones de monedas en tiempo real utilizando la API de ExchangeRate-API</strong>
</p>

<p align="center">
  <em>Proyecto desarrollado para el curso de Java Orientado a Objetos de ALURA LATAM</em>
</p>

---

## 📋 Índice

- [Descripción](#-descripción)
- [Características](#-características)
- [Tecnologías Utilizadas](#-tecnologías-utilizadas)
- [Requisitos Previos](#-requisitos-previos)
- [Instalación](#-instalación)
- [Uso](#-uso)
- [Estructura del Proyecto](#-estructura-del-proyecto)
- [Conversiones Disponibles](#-conversiones-disponibles)
- [API Utilizada](#-api-utilizada)
- [Capturas de Pantalla](#-capturas-de-pantalla)
- [Planificación del Proyecto](#-planificación-del-proyecto)
- [Mejoras Futuras](#-mejoras-futuras)
- [Recursos y Referencias](#-recursos-y-referencias)
- [Autor](#-autor)
- [Licencia](#-licencia)

---

## 📖 Descripción

Este proyecto es un **conversor de monedas interactivo** desarrollado completamente en Java que permite realizar conversiones entre diferentes monedas latinoamericanas y el dólar estadounidense. La aplicación consume datos en tiempo real de la API de ExchangeRate-API para obtener las tasas de cambio más actualizadas.

El programa presenta un menú interactivo por consola con colores personalizados, validación de entradas del usuario y manejo robusto de errores, demostrando los principios fundamentales de la programación orientada a objetos.

---

## ✨ Características

- 🔄 **Conversión en tiempo real** usando tasas de cambio actualizadas
- 🎨 **Interfaz colorida por consola** con códigos ANSI para mejor experiencia de usuario
- ✅ **Validación robusta de entradas** del usuario con mensajes de error descriptivos
- 🌎 **12 opciones de conversión** entre 6 monedas latinoamericanas y USD
- 🔁 **Bucle continuo** que permite realizar múltiples conversiones sin reiniciar la aplicación
- 📊 **Consumo de API REST** mediante HttpURLConnection
- 🧩 **Deserialización JSON** utilizando la librería Jackson
- 🏗️ **Arquitectura orientada a objetos** con separación de responsabilidades

---

## 🛠️ Tecnologías Utilizadas

| Tecnología | Descripción |
|------------|-------------|
| **Java 21** | Lenguaje de programación principal |
| **HttpURLConnection** | Para realizar peticiones HTTP a la API |
| **Jackson Databind** | Librería para parsear respuestas JSON |
| **ExchangeRate-API** | API para obtener tasas de cambio en tiempo real |
| **IntelliJ IDEA** | IDE utilizado para el desarrollo |
| **Git & GitHub** | Control de versiones y repositorio |

---

## 📦 Requisitos Previos

Antes de ejecutar este proyecto, asegúrate de tener instalado:

- **Java Development Kit (JDK) 11 o superior**
  - [Descargar JDK](https://www.oracle.com/java/technologies/downloads/)
- **IntelliJ IDEA** (recomendado) u otro IDE de Java
  - [Descargar IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
- **Librería Jackson Databind**
  - Se debe agregar al proyecto las dependencias de Jackson

### Dependencias necesarias:
- `jackson-databind` versión 2.15.0 o superior
- `jackson-core` 
- `jackson-annotations`

---

## 🚀 Instalación

Sigue estos pasos para configurar el proyecto en tu máquina local:

1. **Clona el repositorio**
   ```bash
   git clone https://github.com/Ludmimar/DesafioConversorDeMoneda.git
   ```

2. **Abre el proyecto en IntelliJ IDEA**
   - File → Open → Selecciona la carpeta del proyecto

3. **Configura las dependencias de Jackson**
   - Descarga los archivos JAR de Jackson desde [Maven Repository](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind)
   - Agrega los JARs al proyecto:
     - File → Project Structure → Libraries → + → Java → Selecciona los JARs descargados

4. **Obtén tu API Key** (Opcional - el proyecto ya incluye una)
   - Registrate en [ExchangeRate-API](https://www.exchangerate-api.com/)
   - Obtén tu API Key gratuita
   - Reemplaza la API_KEY en `CurrencyConversion.java` (línea 11)

5. **Compila el proyecto**
   - Build → Build Project

---

## 💻 Uso

1. **Ejecuta la aplicación**
   - Navega a `src/com/alura/desafioconversordemoneda/modelos/CurrencyConverter.java`
   - Click derecho → Run 'CurrencyConverter.main()'

2. **Interactúa con el menú**
   - Se mostrará un menú con 13 opciones (12 conversiones + salir)
   - Ingresa el número de la opción deseada (1-13)
   - Ingresa la cantidad que deseas convertir
   - El resultado se mostrará en pantalla con la tasa de cambio aplicada

3. **Realiza múltiples conversiones**
   - Después de cada conversión, el menú se mostrará nuevamente
   - Puedes realizar tantas conversiones como desees

4. **Salir de la aplicación**
   - Selecciona la opción 13 para salir

### Ejemplo de uso:
```
***********************************
Bienvenido al conversor de monedas.
1. Dolar => Peso argentino
2. Peso argentino => Dolar
...
13. Salir
***********************************
Selecciona una opción entre 1 y 13:
1
Ingresa la cantidad que deseas convertir:
100
USD a ARS: 350.50
Resultado de la conversión: 35050.0
```

---

## 📂 Estructura del Proyecto

```
DesafioConversorDeMoneda/
│
├── src/
│   └── com/
│       └── alura/
│           └── desafioconversordemoneda/
│               └── modelos/
│                   ├── CurrencyConverter.java    # Clase principal con método main
│                   ├── Menu.java                 # Gestión del menú y entradas
│                   ├── CurrencyConversion.java   # Lógica de conversión y API
│                   └── ExchangeRates.java        # Modelo para deserializar JSON
│
├── out/                                          # Archivos compilados (.class)
├── Badge-Conversor.png                           # Insignia del proyecto
├── Consola.jpg                                   # Captura de pantalla de la consola
├── Trello.jpg                                    # Planificación del proyecto
├── README.md                                     # Documentación del proyecto
└── DesafioConversorDeMoneda.iml                 # Configuración del módulo IntelliJ
```

### Descripción de las clases:

| Clase | Responsabilidad |
|-------|----------------|
| **CurrencyConverter** | Clase principal que inicia la aplicación y gestiona el flujo principal del programa |
| **Menu** | Muestra el menú de opciones y valida las entradas del usuario |
| **CurrencyConversion** | Realiza las peticiones HTTP a la API, procesa las respuestas y calcula las conversiones |
| **ExchangeRates** | Clase modelo (POJO) que mapea la respuesta JSON de la API usando anotaciones de Jackson |

---

## 💱 Conversiones Disponibles

El conversor soporta las siguientes conversiones bidireccionales:

| # | Conversión | Código de Moneda |
|---|------------|------------------|
| 1 | Dólar → Peso argentino | USD → ARS |
| 2 | Peso argentino → Dólar | ARS → USD |
| 3 | Dólar → Real brasileño | USD → BRL |
| 4 | Real brasileño → Dólar | BRL → USD |
| 5 | Dólar → Peso Bahameño | USD → BSD |
| 6 | Peso Bahameño → Dólar | BSD → USD |
| 7 | Dólar → Boliviano | USD → BOB |
| 8 | Boliviano → Dólar | BOB → USD |
| 9 | Dólar → Peso chileno | USD → CLP |
| 10 | Peso chileno → Dólar | CLP → USD |
| 11 | Dólar → Peso colombiano | USD → COP |
| 12 | Peso colombiano → Dólar | COP → USD |

> 💡 **Nota**: Las siglas de las monedas siguen el estándar ISO 4217. Consulta la [lista completa de códigos de monedas soportados](https://www.exchangerate-api.com/docs/supported-currencies).

---

## 🌐 API Utilizada

Este proyecto utiliza la **ExchangeRate-API** para obtener tasas de cambio en tiempo real.

- **Documentación oficial**: [ExchangeRate-API Docs](https://www.exchangerate-api.com/docs/java-currency-api)
- **Endpoint utilizado**: `https://v6.exchangerate-api.com/v6/{API_KEY}/latest/{BASE_CURRENCY}`
- **Tipo de cuenta**: Gratuita (hasta 1,500 peticiones/mes)

### Ejemplo de respuesta de la API:
```json
{
  "result": "success",
  "base_code": "USD",
  "conversion_rates": {
    "ARS": 350.50,
    "BRL": 4.98,
    "CLP": 850.25,
    ...
  }
}
```

---

## 📸 Capturas de Pantalla

### Menú Principal
![Consola](https://raw.githubusercontent.com/Ludmimar/DesafioConversorDeMoneda/main/Consola.jpg)

La interfaz utiliza colores ANSI para mejorar la legibilidad:
- 🟢 Verde: Opciones del menú
- 🔴 Rojo: Mensajes de bienvenida y opción de salir
- 🔵 Azul: Nombres de monedas destino
- 🟣 Morado: Tasas de cambio
- 🟡 Amarillo: Resultados de conversión
- 🔵 Cian: Solicitudes de entrada

---

## 📊 Planificación del Proyecto

El desarrollo de este proyecto se planificó utilizando **Trello** para organizar las tareas y seguir una metodología ágil.

![Tablero Trello](https://raw.githubusercontent.com/Ludmimar/DesafioConversorDeMoneda/main/Trello.jpg)

---



## 📚 Recursos y Referencias

### Documentación Java
- [HttpURLConnection](https://docs.oracle.com/en/java/javase/21/docs/api/java.net.http/java/net/http/HttpRequest.html) - Para peticiones HTTP
- [HttpResponse](https://docs.oracle.com/en/java/javase/21/docs/api/java.net.http/java/net/http/HttpResponse.html) - Para manejar respuestas HTTP

### Librerías
- [Jackson Databind](https://github.com/FasterXML/jackson-databind) - Procesamiento JSON
- [Maven Repository - Jackson](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind) - Descarga de dependencias

### Tutoriales y Guías
- [Colores en consola Java](https://www.campusmvp.es/recursos/post/como-cambiar-los-colores-de-la-consola-con-java-y-system-out-println.aspx) - Cómo usar códigos ANSI
- [Configuración de Git](https://git-scm.com/book/es/v2/Inicio---Sobre-el-Control-de-Versiones-Configurando-Git-por-primera-vez) - Guía inicial de Git
- [Escribir un README increíble](https://www.aluracursos.com/blog/como-escribir-un-readme-increible-en-tu-github) - Mejores prácticas

---

## 👨‍💻 Autor

**Desarrollador**: Ludmila Martos

## 📞 Contacto

- **Email**: [ludmilamartos@gmail.com](mailto:ludmilamartos@gmail.com)
- **LinkedIn**: [ludmimar89](https://www.linkedin.com/in/ludmimar89/)
- **GitHub**: [Ludmimar](https://github.com/Ludmimar)

---

## 📄 Licencia

Este proyecto fue desarrollado como parte del programa educativo de **ALURA LATAM** y está disponible para fines educativos y de aprendizaje.

---

<div align="center">
  <p>⭐ Si este proyecto te fue útil, considera darle una estrella en GitHub ⭐</p>
  <p>Hecho con ❤️ y ☕ por Ludmila Martos</p>
</div>
