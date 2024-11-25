<h1>Proyecto de Gestión de Juguetes de Santa Claus 🎄 🎅🏼</h1>

<h2>Descripción</h2>
    <p>Este proyecto es una aplicación de consola desarrollada en Java que simula la gestión de juguetes para niños buenos y niños malos. El sistema está diseñado para ser utilizado por los elfos de Santa Claus y por el mismo Santa. Los elfos pueden agregar, listar y eliminar juguetes, mientras que Santa puede ver la lista de juguetes y exportarlos a un archivo CSV.</p>
    <p>El objetivo del proyecto es implementar la arquitectura MVC (Model-View-Controller) y el patrón de repositorio. Además, se utiliza Maven como herramienta de construcción y Hamcrest para las pruebas.</p>

   <h2>Pre-requisitos</h2>
    <ul>
        <li>Java 11 o superior.</li>
        <li>Maven (para gestión de dependencias y construcción del proyecto).</li>
        <li>IDE recomendado: IntelliJ IDEA, Eclipse o Visual Studio Code.</li>
        <li>Hamcrest (para realizar las pruebas unitarias, incluido en el archivo de dependencias de Maven).</li>
    </ul>

   <h2>Pasos para la instalación</h2>
    <ol>
        <li>Clona este repositorio en tu máquina local:
            <pre>git clone <a href="https://github.com/Fuad-Alkwkabani/SantaClausToyFactory.git">https://github.com/Fuad-Alkwkabani/SantaClausToyFactory.git</a></pre>
        </li>
        <li>Accede al directorio del proyecto:
            <pre>cd nombre-del-proyecto</pre>
        </li>
        <li>Compila y ejecuta el proyecto utilizando Maven:
            <pre>mvn clean install</pre>
        </li>
        <li>Una vez compilado, puedes ejecutar la aplicación:
            <pre>mvn exec:java</pre>
        </li>
    </ol>

   <h2>Ejecución de los tests</h2>
    <p>Para ejecutar los tests, usa el siguiente comando:</p>
    <pre>mvn test</pre>
    <p>Asegúrate de tener las dependencias de Hamcrest configuradas en tu archivo <code>pom.xml</code> para ejecutar las pruebas correctamente.</p>

   <h3>Captura de la cobertura de tests</h3>
    <img src="ruta-a-tu-imagen.png" alt="Cobertura de Tests" />

  <h2>Diagramas realizados</h2>
    <p>A continuación se muestran los diagramas realizados para este proyecto:</p>
    <ul>
        <li>Diagrama de clases.</li>
        <img src="/foto/Captura desde 2024-11-25 13-15-01.png" alt="Diagrama" />
        <li>Diagrama de flujo.</li>
        <img src="ruta-a-tu-diagrama.png" alt="Diagrama" />
        <li>Diagrama de arquitectura MVC.</li>
    <pre>
             MODELO                       CONTROLADOR                VISTA
            --------                      -----------                -------
            GoodToyDatabase    <------    ToyController    ----->   SantaView
            BadToyDatabase    <------    HomeController    ----->   ElfView
            IDatabase                                      ----->   HomeView
    </pre>
    </ul>
    
  <p><strong>Autor:</strong> FUAD AL KWKABANI  <a href="https://github.com/Fuad-Alkwkabani">GitHub</a>
