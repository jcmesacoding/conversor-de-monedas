# 💱 CashPort

¡Bienvenido a **CashPort**, el conversor de monedas más rápido y elegante en consola!

**CashPort** es una aplicación en Java que permite convertir entre **USD**, **EUR** y **DOP**, usando tasas en tiempo real desde ExchangeRate API. Ideal para aprender sobre peticiones HTTP, parsing JSON y lógica de negocio en Java.

---

## 🎥 Demo

![image](https://github.com/user-attachments/assets/d92766d4-1c90-4ef8-ba03-781b9ea62bd6)


## ✨ Funcionalidades

- Conversión en ambas direcciones entre USD, EUR y DOP  
- Consulta de tasas reales vía API  
- Interfaz por consola interactiva  
- Formato decimal amigable (`00.00`)  
- Manejo básico de errores (opciones inválidas, fallos de conexión)

---

## 🛠️ Requisitos

- Java 17 o superior  
- Conexión a internet para consultar tasas  
- API Key gratuita de [ExchangeRate-API](https://www.exchangerate-api.com/) (colócala en tu código o variables de entorno)

---

## 🚀 Instalación y uso

# 1. Clona el repositorio
git clone https://github.com/jcmesacoding/CashPort.git

# 2. Abre el proyecto con IntelliJ u otro IDE

# 3. Asegúrate de tener Java 17+ (o la versión que uses)

# 4. Corre la clase principal
mvn compile exec:java -Dexec.mainClass="com.jumedev.conversordemonedas.main.Main"


## 🔍 ¿Cómo funciona?

El usuario elige una conversión (por ejemplo, USD → EUR) desde un menú.

Se ingresa el monto a convertir.

Apirequest envía una solicitud HTTP GET a la API con la moneda base.

Se parsea el JSON usando Gson para extraer la tasa.

Se multiplica el monto por la tasa y se muestra el resultado formateado.

🧑‍💻 Autor
Juan Carlos Mesa Cruz
Software Engineer & apasionado por aprender.
¿Quieres decirme algo? Encuéntrame en GitHub: jcmesacoding

📄 Licencia
Derechos reservados 2025 © Juan Carlos Mesa Cruz.
Este proyecto está licenciado bajo la MIT License. Haz lo que quieras con él (solo menciona autoría 😉).

