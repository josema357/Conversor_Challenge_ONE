# Conversor - Challenge Oracle Next Education (ONE)
Proyecto de la formación Oracle Next Education(ONE) de Alura Latam y Oracle, en la especialidad de desarrollo backend.
Conversor de monedas utilizando Java 17.0.6 y JavaFX 17.0.6.
## Caracteristicas:
El convertidor de moneda hace lo siguiente:
* Convertir de PEN a USD
* Convertir de PEN  a EUR
* Convertir de PEN  a GBP
* Convertir de PEN  a JPY
* Convertir de PEN  a KRW

Tambien puede convertir inversamente, es decir de USD a PEN y asi respectivamente.

El convertidor de temperatura usa las siguientes temperaturas:
* Celsius (°C)
* Fahrenheit (°F)
* Kelvin (K)

## Herramientas utilizadas 
* Java JDK 17.0.6
* JavaFX 17.0.6
* Paquete org.json
* IntelliJ IDEA
* Scene Builder
* Git y Github

## Instalacion del proyecto

Descarga el el SDK de JavaFX 17.0.6, JSON-Java(org.json),
clona el respositorio, luego abre el entorno de desarrollo IntelliJ IDEA y abre el directorio que se creó.

Luego solo sigue estos pasos:
* En la pestaña File > Project Structure > Modules > "nombre_del_proyecto" > Dependencies , dale click en el signo (+) y agrega el SDK de JavaFX que 
previamente descargaste y agrega el directorio lib.
* Luego configura el runtime, para esto en la pestaña Run > Edit Configurations > Modify options > Add VM options, agrega la siguiente linea:
  --module-path ${PATH_TO_FX} --add-modules javafx.controls,javafx.fxml
* Luego en la pestaña File > Settings > Path Variables, dale click al (+) y agrega  el nombre de la variable
 en el campo Name: PATH_TO_FX y en el campo Value: "agrega la carpeta lib del directorio JavaFx que descargaste".
* Por ultimo en la pestaña File > Project Structure > Libraries, agrega el directorio lib del SDK de JavaFx
* Para agregar JSON-Java al proyecto, en la pestana File > Project Structure > Modules > Dependencies,
dale click al simbolo (+) y agrega el archivo ".jar" de JSON-Java.

## Contacto
<a href="https://www.linkedin.com/in/josema317"><img width="30" src="https://www.vectorlogo.zone/logos/linkedin/linkedin-icon.svg"/></a>
<a href="https://twitter.com/7Jmanuel"><img width="30" src="https://www.vectorlogo.zone/logos/twitter/twitter-tile.svg"/></a>

## Licencia
MIT
