

PROYECTO E2E SAUCEDEMO - EVELYN BALSECA

# Proyecto: serenity_saucedemo

## Tecnologías usadas:
- IntelliJ IDEA 2024.1.4 - Build #IC-241.18034.62
- Java vs 17.0.4
- Maven vs 4.0.0
- JUnit vs 4.2.34
- Serenity BDD vs 4.2.34
- Cucumber-jvm@7.22.2 
- SO Windows 11 Pro
- Edge Driver vs 140.0.3485.66 
- Navegador Edge vs 140.0.3485.66



## Pasos de ejecución:
1. Descargar el proyecto serenity_saucedemo del github: https://github.com/evelynbalseca/proyecto_e2e_saucedemo.git por medio del cmd con el comando: git clone https://github.com/evelynbalseca/proyecto_e2e_saucedemo.git
2. Importar el proyecto serenity_saucedemo descargado en IntelliJ.
3. Ejecutar el archivo RunCucumber.java que se encuntra en src/test/java/com/saucedemo/configs
4. Al finalizar las pruebas revisar el reporte en la consola en la seccion "View your Cucumber Report at"


Importante:
Si la version del navegador Edge en el cual se va a ejecutar las pruebas automatizadas es diferente al mencionado en la seccion Tecnologias usadas, se debe realizar el siguiente proceso para actualizar el Edge driver que yo utlice para mis pruebas:
1. Descargar el Edge Driver para SO Windows de la pagina https://developer.microsoft.com/es-es/microsoft-edge/tools/webdriver?form=MA13LH
2. Seleccionar el driver dependiendo de la version del navegador Edge, en mi caso fue la version 140.0.3485.66
2. Descomprimir el zip. ubicar el archivo msedgedriver.exe.
3. Reemplazar el msedgedriver que se encuentra en la ruta del proyecto serenity_saucedemo/src/test/resources/webdrivers/msedgedriver.exe con el nuevo archivo msedgedriver.



