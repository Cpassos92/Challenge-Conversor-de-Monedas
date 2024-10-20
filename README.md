# Conversor de Moneda en Java

Este es un conversor de moneda simple desarrollado en Java que permite realizar conversiones entre diferentes 
monedas utilizando la **Exchange Rate API**. El programa ofrece seis opciones de conversión de moneda y se ejecuta en 
la consola, mostrando un menú interactivo para el usuario.

## Características

- Conversión entre múltiples monedas.
- Interacción con la API de Exchange Rate para obtener tasas de cambio actualizadas.
- Menú interactivo en consola para seleccionar las opciones de conversión.
- Soporte para las siguientes conversiones:

  
 ![image](https://github.com/user-attachments/assets/f9931f80-c6b1-470a-9a65-b595f7b8e826)

- # Obtener una API Key de ExchangeRate-API.

    Reemplaza TU_API_KEY_AQUI en el archivo ApiMonedaService.java con tu clave de API.

- # Uso

Al ejecutar el programa, se te mostrará un menú con diferentes opciones de conversión de moneda. Debes seleccionar 
una opción, ingresar la cantidad a convertir, y el programa te mostrará el resultado de la conversión en base a la 
tasa de cambio actual.

- # Ejemplo de Uso
 ![image](https://github.com/user-attachments/assets/364c2b75-38c0-4a34-b78b-a5cb844016c0)

 Estructura del Proyecto

- # El proyecto está dividido en varias clases para mejor organización:

    ApiMonedaService.java: Maneja la interacción con la API de Exchange Rate.
    TasaCambio.java: Representa las tasas de cambio entre dos monedas.
    ConversorMoneda.java: Contiene el menú interactivo y la lógica del ciclo del programa.

. # Tecnologías Usadas

    Java: Lenguaje de programación principal.
    API ExchangeRate: Para obtener las tasas de cambio en tiempo real.
    Git: Control de versiones.
    JSON: Para parsear los datos de la API.
