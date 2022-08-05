# challenge_testing

### ¿Qué es este repositorio

- En este repositorio automatizamos una prueba para el ingreso y navegación de un site Web.

### 1. Principales pasos realizados con su respectiva

explicación de como y porque se realizaron:

- R/. Se detallan los pasos realizados:
1. Una vez preparado el ambiente de desarrollo. procedo a dividir las pruebas or cada sección.
Primeramente Establezco una variable URL y PATH para inicializar los valores pertinentes de la
URL a revisar y la ubicación del Web driver en mi equipo.
2. Se inician las pruebas y a traves del driver abro la ventana de chrome, la maximizo y a través
del método GET llamo a URL.
3. Al ingresar al sitio asignado, para llegar al apartado de personas, este me abre otra pestaña
con otro link. Para cambiar a la siguiente pestaña, valido el ID de las pestañas abiertas
almacenandolas en una lista y recorriendolas en un ciclo FOR, donde si la pestaña actual
es diferente del ID obtenido por getWindowHandle, solo entonces cambio a la otra pestaña con la
función switTo().window()
4. Seguidamente, se viene una iteración de clics a botones y apartados, en los cuales a traves
del xpath de cada elemento, provoco el evento click y accedo a ellos. Luego coloco un timer de 5s.
5. Repito el paso 4, 6 veces hasta desplegar el reglamento de inversión el cual me abre otra ventana
nuevamente. Dado este punto repito lo detallado en el punto 3 y al final hago una comparación con un
IF y el uso de Objects.equal para saber si el link desplegado del reglamento es igual al link obtenido
por la función getCurrentUrl(). Al ser igual imprime un mensaje en consola de que es correcto.

### 2. Códigos de git que se utilizaron

1. git status
2. git add .
3. git commit -m "projecto completado"
4. git status
5. git remote add origin [https://github.com/xiagoz/challenge_testing](https://github.com/xiagoz/challenge_testing)
6. git remote -v
7. git branch
8. git branch -m main
9. git branch
10. git pull origin main --allow-unrelated-histories
11. git push origin main
12. git pull origin main
13. git status
