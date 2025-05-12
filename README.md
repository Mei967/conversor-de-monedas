# 💱 Conversor de Monedas en Java

Este es un programa desarrollado en `Java` que permite convertir montos entre diferentes monedas en tiempo real, utilizando una API pública (`ExchangeRate`) para obtener tasas de cambio actualizadas.


## 📑 Índice

- [¿Qué hace este programa?](#qué-hace-este-programa)
- [Vista del menú](#vista-del-menú)
- [Ingreso del monto](#ingreso-del-monto)
- [Resultado de la conversión](#resultado-de-la-conversión)
- [Tecnologías utilizadas](#tecnologías-utilizadas)
- [Próximas mejoras](#próximas-mejoras)
- [Autor](#autor)

---
## 📋 ¿Qué hace este programa?

- Muestra un menú interactivo con opciones de conversión entre monedas (`USD`, `CLP`, `BRL`, `COP`).
- Solicita al usuario que ingrese un monto a convertir.
- Se conecta a una API externa usando `HttpClient` para obtener la tasa de cambio actual.
- Convierte el monto y muestra el resultado formateado con dos decimales.
- Valida que la entrada del usuario sea correcta y maneja posibles errores de conexión.

---

## ▶️ Vista del menú

Este es el menú principal que aparece cuando se ejecuta el programa:

![Vista del menu principal](img/menu.png)

---

## ✏️ Ingreso del monto

Luego de elegir una opción del menú, el programa solicita al usuario ingresar el monto que desea convertir.  
Este valor será usado junto a la tasa obtenida de la API para calcular el resultado.

![Ingreso del monto](img/ingreso-monto.png)

---

## 📊 Resultado de la conversión

Una vez ingresado el monto, el programa realiza la conversión en tiempo real utilizando la tasa actual proporcionada por la API.  
El resultado se muestra en pantalla con dos decimales, seguido de un mensaje de confirmación.

![Resultado de la conversión](img/resultado-conversion.png)

---

## 🛠 Tecnologías utilizadas

- `Java`
- `Gson` (librería para trabajar con `JSON`)
- API pública: [ExchangeRate](https://www.exchangerate-api.com)
- `HttpClient` del paquete `java.net.http`
- `Scanner` para entrada por consola
- `Git` y `GitHub` para control de versiones
- Entorno de desarrollo: `IntelliJ IDEA`

---

## 🚀 Próximas mejoras

- [ ] Permitir ingreso libre de cualquier par de monedas
- [ ] Mostrar historial de conversiones realizadas
- [ ] Agregar marca de tiempo a cada conversión utilizando `java.time`
- [ ] Guardar historial en archivo `.txt` o `.json`

---

## 👩‍💻 Autor

**Meiby Burgos**  
Proyecto realizado como parte del curso de Backend con `Java` – Alura Latam, 2025.














