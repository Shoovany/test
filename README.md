https://github.com/Shoovany/testibng


JAVA 17 
Config JAVA HOME
ECLIPSE Configurar JAVA

Crear Spring
	Lombok 
	Spring Web
	

Applicacion Propierties..
spring.application.name=springSistem
logging.level.org.springframework=DEBUG

logging.level.org.hibernate.SQL=DEBUG
logging.level.org.hibernate.type.descriptor.sql=TRACE


spring.thymeleaf.prefix=classpath:/templates/
spring.thymeleaf.suffix=.html
spring.thymeleaf.mode=HTML

# Habilita la consola de H2 (esto ya no aplica si no usas H2, pero puedes dejarlo comentado si quieres)
spring.h2.console.enabled=true

# Datos de conexi n para SQL Server
spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=PruebaShoovany;encrypt=false;trustServerCertificate=true
spring.datasource.username=sa
spring.datasource.password=789852
spring.datasource.driver-class-name=com.microsoft.sqlserver.jdbc.SQLServerDriver
# Dialecto de Hibernate para SQL Server
spring.jpa.database-platform=org.hibernate.dialect.SQLServerDialect

# Hibernate puede generar o actualizar el esquema autom ticamente
spring.jpa.hibernate.ddl-auto=none

# Mostrar las sentencias SQL (opcional pero  til para debug)
spring.jpa.show-sql=true

spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl



POM

<dependency>
    <groupId>org.springframework.data</groupId>
    <artifactId>spring-data-jpa</artifactId>
  </dependency>
	
<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<dependency>
    <groupId>com.microsoft.sqlserver</groupId>
    <artifactId>mssql-jdbc</artifactId>
  <!--   <version>12.4.1.jre11</version>   -->
</dependency>


 
<dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>
		
<dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>
		
