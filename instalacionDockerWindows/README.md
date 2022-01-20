Para realizar la instalación de Docker en una máquina Windows nos iremos a la [url de instación de Docker.](https://docs.docker.com/desktop/windows/install/)

Se hará clic sobre Docker Desktop for Windows, para descargar el instalable:
<p align="center">
    <img src="../resources/dockerw_1.png">
</p>
Al hacer clic sobre el instalador descargado nos aparece lo siguiente:
<p align="center">
    <img src="../resources/dockerw_2.png">
</p>

Se hace clic en OK para proceder con la instalación:
<p align="center">
    <img src="../resources/dockerw_3.png">
</p>

Al finalizar, pedirá un reinicio del PC:
<p align="center">
    <img src="../resources/dockerw_4.png">
</p>

Tras reiniciar, aparece una ventana de aceptación de términos. Será necesario marchar el check de aceptación y hacer clic sobre el botón Aceptar.
<p align="center">
    <img src="../resources/dockerw_5.png">
</p>

Si tras la instalación nos aparece el siguiente mensaje será necesario instalar el Linux kernel.
<p align="center">
    <img src="../resources/dockerw_6.png">
</p>

Para ello, nos iremos a la siguiente [URL](https://docs.microsoft.com/es-es/windows/wsl/install-manual#step-4---download-the-linux-kernel-update-package)
<p align="center">
    <img src="../resources/dockerw_7.png">
</p>

Haremos clic en el link de Paquete de actualización de Kernel de Linux WSL 2 para descargar el instalable.
Una vez descargado, ejecutaremos el instalable:

<p align="center">
    <img src="../resources/dockerw_8.png">
</p>

Al pulsar sobre siguiente, se completará la instalación:

<p align="center">
    <img src="../resources/dockerw_9.png">
</p>

Para confirmar que todo se ha instalado correctamente ejecutaremos Docker Desktop, mediante el icono creado en el escritorio o bien buscando desde la barra de Inicio de Windows.

<p align="center">
    <img src="../resources/dockerw_10.png">
</p>

Si al iniciar aparece el siguiente mensaje:

<p align="center">
    <img src="../resources/dockerw_11.png">
</p>

Será necesario habilitar Hyper-V. Para ello podéis seguir las indicaciones de este [enlace]
(docs.microsoft.com/es-es/virtualization/hyper-v-on-windows/quick-start/enable-hyper-v#enable-hyper-v-with-cmd-and-dism)
Desde línea de comandos (abierto como admin) podemos ejecutar lo siguiente. Nos pedirá reiniciar después
<p align="center">
    <img src="../resources/dockerw_12.png">
</p>

Tras reiniciar nos aparecerá la siguiente ventana:

<p align="center">
    <img src="../resources/dockerw_13.png">
</p>

Hacemos clic en Start. Nos aparecerá un tutorial que podemos saltar o seguir.
Finalmente, nos aparecerá lo siguiente, indicando que Docker está corriendo correctamente aunque sin contenedores.

<p align="center">
    <img src="../resources/dockerw_14.png">
</p>

Finalmente, para arrancar nuestro ejercicio necesitamos una base de datos postgresql. Para iniciar un contenedor con una postgresql ejecutaremos lo siguiente desde línea de comandos.

docker run -p 5432:5432 --name some-postgres -e POSTGRES_PASSWORD=mysecretpassword -d postgres

Al finalizar, veremos lo siguiente:

<p align="center">
    <img src="../resources/dockerw_15.png">
</p>